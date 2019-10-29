package com.fansq.github.fastDfs.controller;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fansq.github.fastDfs.service.FastDfsService;

@RestController
@RequestMapping("/fdfs")
public class FastDfsController {
    
    @Autowired
    private FastDfsService fdfsClient;

    /**
     * 文件上传
     * @param file
     * @return
     * @throws Exception
     */
    @RequestMapping("/upload")
    public Map<String,Object> upload(MultipartFile file) throws Exception{
        
        String url = fdfsClient.uploadFile(file);
        
        Map<String,Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("msg", "上传成功");
        result.put("url", url);
        
        return result;
    }
    
    /**
     * 文件下载
     * @param fileUrl  url 开头从组名开始
     *  storage/M00/00/00/rBQKAl234EmAek9HAABlgUNPY3U857.PNG
     *  这个可以存储在数据库中，路径是服务器返回的路径，存储方便下载使用
     * @param response
     * @throws Exception
     */
    @RequestMapping("/download")
    public void  download(String fileUrl, HttpServletResponse response) throws Exception{
        System.out.println(fileUrl);
        byte[] data = fdfsClient.download(fileUrl);
        //byte[] data = fdfsClient.downFile(fileUrl);
        
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + URLEncoder.encode("test.jpg", "UTF-8"));
        
        // 写出
        ServletOutputStream outputStream = response.getOutputStream();
        IOUtils.write(data, outputStream);
    }
}