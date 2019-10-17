package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.xp.autotool.utils.FileOperation;

public class ConverXML {

	private final static String  path = "D:\\SVN\\HBDX_CRM3.0\\trunk\\code\\service\\crm-service-cust-order\\src\\main\\resources\\sqlmapper";
	
	public static void main(String[] args){
		try {
			traverseFolder(path);
			//replaceAll("ORDER_HANDLER_ID     numeric(16,0) not null comment '订单经办人信息标识',");

			
		} catch (Exception e) {
			e.printStackTrace();
			
			e.getMessage();
		}
		
		
	}
	
	public static void traverseFolder(String path)  throws Exception{

        File file = new File(path);
        //判断文件或者文件夹是否存在
        if (file.exists()) {

        	//如果该路径是文件夹
        	if(file.isDirectory()){
        		File[] files = file.listFiles();
        	    //文件夹内文件数量
        		if (files.length == 0) {
        			 System.out.println("文件夹是空的!");
                     return;
        		}else{
        		    for (File file2 : files) {
                    	//判断是否是还是一个文件夹
                        if (file2.isDirectory()) {
                            traverseFolder(file2.getAbsolutePath());
                        } else {
                        	autoReplace(file2);
                        }
                    }
        		}
        		
        	}else{
        		autoReplace(file);
        	}
        	
        }else{
     	   System.out.println("文件不存在!");
    	}
	
	}
	
	
	private static void  autoReplace (File file) throws Exception{

		   System.out.println("文件名："+file.getPath());
		   InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8");  
		   InputStreamReader isr2 = new InputStreamReader(new FileInputStream(file), "UTF-8");  
		   StringBuffer sbread = new StringBuffer();  
		   while (isr2.ready()) {  
		     sbread.append((char) isr2.read());  
		   }  
		   isr2.close(); 

		   String str=sbread.toString();
		   
		   SAXReader reader = new SAXReader();  
		   reader.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
		   Document document; 
		   document = reader.read(isr);
		   
		   Element mapper = document.getRootElement();  
		   
		   Element resultMap = mapper.element("resultMap");
		   if(resultMap==null){
			   return;
		   }
		   List<Element> resultList=resultMap.elements();
		   if(resultList==null){
			   return;
		   }
		   for(Element result:resultList){
			  if(result.attribute("jdbcType").getValue().equals("TIMESTAMP")||
					  result.attribute("jdbcType").getValue().equals("BIGINT")||
					  result.attribute("jdbcType").getValue().equals("INTEGER")){
				  String javaAttrName = result.attribute("property").getValue();
				  
				  str=str.replaceAll(javaAttrName + " != null and " + javaAttrName + " != ''", javaAttrName + " != null ");
				 
				  String conditionStr="condition." + javaAttrName + " != null and condition."+ javaAttrName + " != ''";
				  str=str.replaceAll(conditionStr,"condition." + javaAttrName + " != null ");
			  }
		   }
		  

//		   outXML= outXML.replaceAll("\n", "");
		   System.out.println(str);
		   FileOperation.method(file,str);
		
	}
	private static String getMapperXML(String writer) {
		String begin = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>  \n"
				+ "<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">";
		;

		return begin + " \n " + writer;
	}
}
