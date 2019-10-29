package com.fansq.github.fastDfs.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.fansq.github.fastDfs.msg.ObjectRestResponse;

public interface FastDfsService {

	
	public String uploadFile(MultipartFile file) throws IOException;
	
	public byte[]  download(String fileUrl);

	public byte[] downFile(String fileUrl) throws IOException;
}
