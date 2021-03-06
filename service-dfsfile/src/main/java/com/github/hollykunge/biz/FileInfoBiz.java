package com.github.hollykunge.biz;

import com.ace.cache.annotation.Cache;
import com.alibaba.fastjson.JSON;
import com.github.hollykunge.comtants.FileComtants;
import com.github.hollykunge.entity.FileInfoEntity;
import com.github.hollykunge.entity.FileServerPathEntity;
import com.github.hollykunge.mapper.FileInfoMapper;
import com.github.hollykunge.security.common.biz.BaseBiz;
import com.github.hollykunge.security.common.exception.BaseException;
import com.github.hollykunge.security.common.util.EntityUtils;
import com.github.hollykunge.security.common.vo.FileInfoVO;
import com.github.hollykunge.util.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * 文件基础数据业务处理层
 *
 * @author zhhongyu
 * @since 2019-07-29
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class FileInfoBiz extends BaseBiz<FileInfoMapper, FileInfoEntity> {
    @Autowired
    private FastDFSClientWrapper dfsClient;
    @Autowired
    private FileServerPathBiz fileServerPathBiz;


    @Override
    protected String getPageName() {
        return null;
    }

    /**
     * 上传非加密文件业务处理
     *
     * @param file
     * @return
     * @throws Exception
     */
    public FileInfoVO uploadFile(MultipartFile file) throws Exception {
        String md5Key = MD5Util.MD5(file.getBytes());
        String fileServerPathId = "";
        //先从缓存中获取文件
        fileServerPathId = ((FileInfoBiz) AopContext.currentProxy()).uploadFileCache(md5Key, null);
        FileInfoEntity fileInforEntity = new FileInfoEntity();
        FileServerPathEntity fileServerPathEntity = new FileServerPathEntity();
        //如果缓存中没有该文件
        if (StringUtils.isEmpty(fileServerPathId)) {
            String path = dfsClient.uploadFile(file);
            fileServerPathEntity.setPath(path);
            fileServerPathEntity.setFileEncrype(FileComtants.NO_SENSITIVE_TYPE);
            this.fileToEntity(file, fileInforEntity, fileServerPathEntity);
            this.insertEntityAce(fileInforEntity, fileServerPathEntity, md5Key);
        }
        //如果缓存中有该文件，则进行插入数据库表到文件基本信息表，然后直接返回成功上传到服务器
        // 从而实现秒传效果
        if (!StringUtils.isEmpty(fileServerPathId)) {
            this.fileToEntity(file, fileInforEntity, null);
            fileInforEntity.setFilePathId(fileServerPathId);
            mapper.insertSelective(fileInforEntity);
        }
        FileInfoVO fileInforVO = this.transferEntityToVo(fileInforEntity);
        return fileInforVO;
    }

    /**
     * 上传加密文件（采用base64加密方式）
     *
     * @param file          文件
     * @param sensitiveType 加密类型（1为base64加密，2为位移加密法，3为文件流加密）
     * @return
     * @throws Exception
     */
    public FileInfoVO uploadSensitiveFile(MultipartFile file, String sensitiveType) throws Exception {
        String md5Key = MD5Util.MD5(file.getBytes());
        String fileServerPathId = "";
        //先从缓存中获取文件
        fileServerPathId = ((FileInfoBiz) AopContext.currentProxy()).uploadFileCache(md5Key, null);
        FileInfoEntity fileInforEntity = new FileInfoEntity();
        FileServerPathEntity fileServerPathEntity = new FileServerPathEntity();
        //如果缓存中没有该文件
        if (StringUtils.isEmpty(fileServerPathId)) {
            String path = "";
            //采用文件流加密
            if (FileComtants.SENSITIVE_BASE64_TYPE.equals(sensitiveType)) {
                path = dfsClient.uploadbase64SensitiveFile(file);
                fileServerPathEntity.setFileEncrype(FileComtants.SENSITIVE_BASE64_TYPE);
            }
            //采用文件流加密
            if (FileComtants.SENSITIVE_CIPHER_TYPE.equals(sensitiveType)) {
                path = dfsClient.uploadCipherSensitiveFile(file);
                fileServerPathEntity.setFileEncrype(FileComtants.SENSITIVE_CIPHER_TYPE);
            }
            //采用位移加密
            if (FileComtants.SENSITIVE_BYTEMOVE_TYPE.equals(sensitiveType)) {
                path = dfsClient.uploadByteMoveSensitiveFile(file);
                fileServerPathEntity.setFileEncrype(FileComtants.SENSITIVE_BYTEMOVE_TYPE);
            }
            fileServerPathEntity.setPath(path);
            this.fileToEntity(file, fileInforEntity, fileServerPathEntity);
            this.insertEntityAce(fileInforEntity, fileServerPathEntity, md5Key);
        }
        //如果缓存中有该文件，则进行插入数据库表到文件基本信息表，然后直接返回成功上传到服务器
        // 从而实现秒传效果
        if (!StringUtils.isEmpty(fileServerPathId)) {
            this.fileToEntity(file, fileInforEntity, null);
            fileInforEntity.setFilePathId(fileServerPathId);
            mapper.insertSelective(fileInforEntity);
        }
        FileInfoVO fileInforVO = this.transferEntityToVo(fileInforEntity);
        return fileInforVO;
    }

    /**
     * 删除文件业务处理
     *
     * @param fileId 文件id
     */
    public void deleteFile(String fileId) {
        if (StringUtils.isEmpty(fileId)) {
            throw new BaseException("fileId is null...");
        }
        FileInfoEntity fileInfoEntity = new FileInfoEntity();
        fileInfoEntity.setId(fileId);
        fileInfoEntity = mapper.selectByPrimaryKey(fileInfoEntity);
        if (fileInfoEntity == null) {
            throw new BaseException("没有改文件...");
        }
        //保留文件历史，只是将数据库中文件信息设置为无效状态
        fileInfoEntity.setStatus(FileComtants.INVALID_FILE);
        mapper.updateByPrimaryKeySelective(fileInfoEntity);
    }

    /**
     * 文件下载业务处理
     *
     * @param fileId
     * @param sensitiveType
     * @return
     */
    public Map<String, Object> downLoadFile(String fileId, String sensitiveType) throws IOException {
        if (StringUtils.isEmpty(fileId)) {
            throw new BaseException("fileId is null ... ");
        }
        FileInfoEntity fileInfoEntity = new FileInfoEntity();
        fileInfoEntity.setId(fileId);
        fileInfoEntity = mapper.selectByPrimaryKey(fileInfoEntity);
        if (fileInfoEntity == null) {
            throw new BaseException("没有该文件...");
        }
        if (StringUtils.isEmpty(fileInfoEntity.getFilePathId())) {
            throw new BaseException("该文件没有对应的服务器路径...");
        }
        FileServerPathEntity fileServerPathEntity = fileServerPathBiz.selectById(fileInfoEntity.getFilePathId());
        if (fileServerPathEntity == null || StringUtils.isEmpty(fileServerPathEntity.getPath())) {
            throw new BaseException("文件没有存在在服务器中...");
        }
        String path = fileServerPathEntity.getPath();
        //文件名称
        String fileName = fileInfoEntity.getFileName();
        //文件后缀
        String fileExt = fileInfoEntity.getFileExt();
        if (StringUtils.isEmpty(fileName)) {
            fileName = FileComtants.DOWNLOAD_FILE_NAME;
        }
        if (StringUtils.isEmpty(fileExt)) {
            fileExt = FileComtants.DOWNLOAD_FILE_EXT;
        }
        fileName = fileName + FileComtants.FILE_REGIX_VALUE + fileExt;
        byte[] fileIO = null;
        //非涉密文件下载
        if (FileComtants.NO_SENSITIVE_TYPE.equals(sensitiveType)) {
            fileIO = dfsClient.download(path);
        }
        if (FileComtants.SENSITIVE_BASE64_TYPE.equals(sensitiveType)) {
            fileIO = dfsClient.downloadBase64SensitiveFile(path);
        }
        if (FileComtants.SENSITIVE_CIPHER_TYPE.equals(sensitiveType)) {
            fileIO = dfsClient.downloadCipherSensitiveFile(path);
        }
        if (FileComtants.SENSITIVE_BYTEMOVE_TYPE.equals(sensitiveType)) {
            fileIO = dfsClient.downloadByteMoveSensitiveFile(path);
        }
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("fileName", fileName);
        result.put("fileByte", fileIO);
        return result;
    }

    /**
     * 获取图片，并响应给客户端
     *
     * @param fileId
     * @param response
     * @param sensitiveType
     * @throws IOException
     */
    public void getImg(String fileId, HttpServletResponse response, String sensitiveType) throws IOException {
        if (StringUtils.isEmpty(fileId)) {
            throw new BaseException("fileId is null ... ");
        }
        OutputStream outputStream = null;
        try {
            //读取路径下面的文件
            FileInfoEntity fileInfoEntity = new FileInfoEntity();
            fileInfoEntity.setId(fileId);
            fileInfoEntity = mapper.selectByPrimaryKey(fileInfoEntity);
            if (fileInfoEntity == null) {
                throw new BaseException("查询不到该文件 ... ");
            }
            if (StringUtils.isEmpty(fileInfoEntity.getFilePathId())) {
                throw new BaseException("该文件没有存储文件路径 ... ");
            }
            FileServerPathEntity fileServerPathEntity = fileServerPathBiz.selectById(fileInfoEntity.getFilePathId());
            if (fileServerPathEntity == null || StringUtils.isEmpty(fileServerPathEntity.getPath())) {
                throw new BaseException("文件没有在文件服务中 ... ");
            }
            String path = fileServerPathEntity.getPath();
            byte[] data = null;
            if (FileComtants.NO_SENSITIVE_TYPE.equals(sensitiveType)) {
                data = dfsClient.download(path);
            }
            if (FileComtants.SENSITIVE_BASE64_TYPE.equals(sensitiveType)) {
                data = dfsClient.downloadBase64SensitiveFile(path);
            }
            if (FileComtants.SENSITIVE_BYTEMOVE_TYPE.equals(sensitiveType)) {
                data = dfsClient.downloadByteMoveSensitiveFile(path);
            }
            if (FileComtants.SENSITIVE_CIPHER_TYPE.equals(sensitiveType)) {
                data = dfsClient.downloadCipherSensitiveFile(path);
            }
            //获取文件后缀名格式
            String ext = ((fileInfoEntity.getFileExt() == null) ? "" : fileInfoEntity.getFileExt());
            //判断图片格式,设置相应的输出文件格式
            if ("jpg".equals(ext) || "JPG".equals(ext)) {
                response.setContentType("image/jpeg");
            }
            if ("png".equals(ext) || "PNG".equals(ext)) {
                response.setContentType("image/png");
            }
            outputStream = new BufferedOutputStream(response.getOutputStream());
            outputStream.write(data);
            outputStream.flush();
        } catch (Exception e) {
            log.error(CommonUtil.getExceptionMessage(e));
        } finally {
            //关流
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    private String insertEntityAce(FileInfoEntity fileInforEntity, FileServerPathEntity fileServerPathEntity,
                                   String md5Key) throws Exception {
        //首先插入文件服务路径表中记录
        fileServerPathBiz.insertSelective(fileServerPathEntity);
        fileInforEntity.setFilePathId(fileServerPathEntity.getId());
        //todo:欠一个redis和数据库事务一致性,这个方法可能不需要
        mapper.insertSelective(fileInforEntity);
        //插入成功将唯一性的md5编码key缓存到缓存中
        String fileServerPathId = null;
        try {
            fileServerPathId = ((FileInfoBiz) AopContext.currentProxy()).uploadFileCache(md5Key, JSON.toJSONString(fileServerPathEntity.getId()));
        } catch (Exception e) {
            log.error(CommonUtil.getExceptionMessage(e));
            dfsClient.deleteFile(fileServerPathEntity.getPath());
            throw e;
        }
        return fileServerPathId;
    }

    /**
     * 将file文件转为数据库实体（path字段需要单独赋值）
     *
     * @param file                 文件
     * @param fileInforEntity      文件基本信息实体类
     * @param fileServerPathEntity 上传文件到服务器路径实体类
     * @return
     * @throws Exception
     */
    private void fileToEntity(MultipartFile file, FileInfoEntity fileInforEntity,
                              FileServerPathEntity fileServerPathEntity) throws Exception {
        if (file == null) {
            throw new BaseException("上传文件不能为空...");
        }
        if (fileInforEntity != null) {
            String fileName = file.getOriginalFilename();
            String suffix = "";
            String fileExt = "";
            String regixValue = FileComtants.FILE_REGIX_VALUE;
            if (fileName.indexOf(regixValue) != -1) {
                suffix = fileName.substring(fileName.lastIndexOf(regixValue));
                fileName = fileName.substring(0, fileName.lastIndexOf(regixValue));
            }
            if (!"".equals(suffix) && !regixValue.equals(suffix)) {
                fileExt = suffix.substring(suffix.indexOf(regixValue) + 1);
            }
            fileInforEntity.setFileExt(fileExt);
            fileInforEntity.setFileName(fileName);
            String fileType = "";
            FileTypeEnum fileTypeEnum = FileTypeEnum.getEnumByValue(fileExt);
            fileType = fileTypeEnum.getType();
            fileInforEntity.setFileType(fileType.toLowerCase());
            fileInforEntity.setFileSize(Double.valueOf(file.getSize()));
            fileInforEntity.setStatus(FileComtants.EFECTIVE_FILE);
            EntityUtils.setCreatAndUpdatInfo(fileInforEntity);
        }
        if (fileServerPathEntity != null) {
            fileServerPathEntity.setStatus(FileComtants.EFECTIVE_FILE);
            EntityUtils.setCreatAndUpdatInfo(fileServerPathEntity);
        }
        return;
    }

    private FileInfoVO transferEntityToVo(FileInfoEntity fileInfoEntity) {
        FileInfoVO fileInfoVO = new FileInfoVO();
        BeanUtils.copyProperties(fileInfoEntity, fileInfoVO);
        fileInfoVO.setFileId(fileInfoEntity.getId());
        return fileInfoVO;
    }

    /**
     * 文件存放redies中，时间为一年
     * @param base64FileName
     * @param fileId
     * @return
     * @throws Exception
     */
    @Cache(key = "files{1}", result = String.class,expire = 525600)
    public String uploadFileCache(String base64FileName, String fileId) throws Exception {
        return fileId;
    }


    public static void main(String[] args) {
        System.out.println(JSON.toJSONString("654sdf"));
        String s = JSON.parseObject("\"654sdf\"", String.class);
        System.out.println(s);
    }
}
