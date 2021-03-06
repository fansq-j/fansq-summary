package com.fansq.github.fastDfs.service.impl;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fansq.github.fastDfs.service.FastDfsService;
import com.github.tobato.fastdfs.conn.FdfsWebServer;
import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.exception.FdfsUnsupportStorePathException;
import com.github.tobato.fastdfs.proto.storage.DownloadByteArray;
import com.github.tobato.fastdfs.proto.storage.DownloadCallback;
import com.github.tobato.fastdfs.service.FastFileStorageClient;

/**
 * 
 * @author fansq
 *
 */
@Service
public class FastDfsServiceImpl implements FastDfsService{

	   private final Logger logger = LoggerFactory.getLogger(FastDfsServiceImpl.class);

	    @Autowired
	    private FastFileStorageClient storageClient;

	    @Autowired
	    private FdfsWebServer fdfsWebServer;

	    /**
	     * 上传文件
	     * @param file 文件对象
	     * @return 文件访问地址
	     * @throws IOException
	     */
	    public String uploadFile(MultipartFile file) throws IOException {
	        StorePath storePath = storageClient.uploadFile(file.getInputStream(),file.getSize(), FilenameUtils.getExtension(file.getOriginalFilename()),null);
	        return getResAccessUrl(storePath);
	    }

	    /**
	     * 上传文件
	     * @param file 文件对象
	     * @return 文件访问地址
	     * @throws IOException
	     */
	    public String uploadFile(File file) throws IOException {
	        FileInputStream inputStream = new FileInputStream (file);
	        StorePath storePath = storageClient.uploadFile(inputStream,file.length(), FilenameUtils.getExtension(file.getName()),null);
	        return getResAccessUrl(storePath);
	    }

	    /**
	     * 将一段字符串生成一个文件上传
	     * @param content 文件内容
	     * @param fileExtension
	     * @return
	     */
	    public String uploadFile(String content, String fileExtension) {
	        byte[] buff = content.getBytes(Charset.forName("UTF-8"));
	        ByteArrayInputStream stream = new ByteArrayInputStream(buff);
	        StorePath storePath = storageClient.uploadFile(stream,buff.length, fileExtension,null);
	        return getResAccessUrl(storePath);
	    }

	    // 封装图片完整URL地址
	    private String getResAccessUrl(StorePath storePath) {
	        String fileUrl = fdfsWebServer.getWebServerUrl() + storePath.getFullPath();
	        return fileUrl;
	    }
	    
	    /**
	     * 下载文件
	     * @param fileUrl 文件url
	     * @return
	     */
	    public byte[]  download(String fileUrl) {
	         String group = fileUrl.substring(0, fileUrl.indexOf("/"));
	         String path = fileUrl.substring(fileUrl.indexOf("/") + 1);
	         System.out.println(group);
	         System.out.println(path);
	         byte[] bytes = storageClient.downloadFile(group, path, new DownloadByteArray());
	         return bytes;
	    }
	    public byte[] downFile(String filePath) throws IOException {
			StorePath storePath = StorePath.praseFromUrl(filePath);
			return storageClient.downloadFile(storePath.getGroup(), storePath.getPath(), new DownloadCallback<byte[]>() {
				@Override
				public byte[] recv(InputStream ins) throws IOException {
					return org.apache.commons.io.IOUtils.toByteArray(ins);
				}
			});
	    }
	    
	    /**
	     * 删除文件
	     * @param fileUrl 文件访问地址
	     * @return
	     */
	    public void deleteFile(String fileUrl) {
	        if (StringUtils.isEmpty(fileUrl)) {
	            return;
	        }
	        try {
	            StorePath storePath = StorePath.praseFromUrl(fileUrl);
	            storageClient.deleteFile(storePath.getGroup(), storePath.getPath());
	        } catch (FdfsUnsupportStorePathException e) {
	            logger.warn(e.getMessage());
	        }
	    }


}
