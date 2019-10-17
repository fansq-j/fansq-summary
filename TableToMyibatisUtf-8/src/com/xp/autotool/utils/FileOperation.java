package com.xp.autotool.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件操作公共方法类
 * 
 * @author Lifuyou
 * 
 */
public class FileOperation {

	/**
	 * 追加文件：使用RandomAccessFile
	 * 
	 * @param fileName
	 *            文件名
	 * @param content
	 *            追加的内容
	 */
	public static void method(String fileName, String content) {
		try {
			File file = new File(fileName);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
			writer.write(content);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 追加文件：使用RandomAccessFile
	 * 
	 * @param fileName
	 *            文件名
	 * @param content
	 *            追加的内容
	 */
	public static void method(File file, String content) {
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
			writer.write(content);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void method1(String file, String conent) {
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "utf-8"));
			out.write(conent);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 删除单个文件
	 * 
	 * @param filePath
	 * @return
	 */
	public static boolean deleteFile(String filePath) {
		boolean flag = false;
		File file = new File(filePath);
		if (file.isFile() && file.exists()) {// 路径为文件且不为空则进行删除
			file.delete();// 文件删除
			flag = true;
		}
		return flag;
	}

	/**
	 * 将信息放入XML文件中
	 * 
	 * @param fileName
	 * @param fileData
	 */
	public static void callDomWriter(String fileName, String fileData) {
		try {
			FileOutputStream fo = new FileOutputStream(fileName);
			@SuppressWarnings("resource")
			PrintStream so = new PrintStream(fo, true, "utf-8");
			so.print(fileData);
		} catch (FileNotFoundException e) {
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 一行一行读取文件，解决读取中文字符时出现乱码
	 * 
	 * 流的关闭顺序：先打开的后关，后打开的先关， 否则有可能出现java.io.IOException: Stream closed异常
	 * 
	 * @throws IOException
	 */
	public static List<String> readFile(String fileUrl) throws IOException {
		// 获取文件
		FileInputStream fis = new FileInputStream(fileUrl);
		// 定义读文件流
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		// 生成文件流
		BufferedReader br = new BufferedReader(isr);
		// 文件中每行信息
		String line = "";
		// 文件全部信息
		List<String> userInfoList = new ArrayList<String>();
		// 将文件读取的信息存入变量中
		while ((line = br.readLine()) != null) {
			userInfoList.add(line);
		}
		br.close();
		isr.close();
		fis.close();
		return userInfoList;
	}
}
