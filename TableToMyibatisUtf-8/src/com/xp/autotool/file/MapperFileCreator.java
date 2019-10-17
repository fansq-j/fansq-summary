package com.xp.autotool.file;

import java.io.File;

import com.xp.autotool.utils.FileOperation;
import com.xp.autotool.vo.TableToMyibatisVO;
import com.xp.autotool.vo.TableVO;

public class MapperFileCreator {
	public static void createFile(TableToMyibatisVO tableToMyibatisVO){
		String packageName = tableToMyibatisVO.getMapperPackageName();
		TableVO tableVO = tableToMyibatisVO.getTableVO();
		
		String mapperClassName = tableVO.getMapperName();
		String doClassName = tableVO.getDoName();
		
		//文件内容
		StringBuffer fileData = new StringBuffer();
		
		// 包引用声明
		fileData.append("package " + packageName + ";\n\n");
		
		fileData.append("import com.neusoft.crm.common.persistence.CrudDao;\n");
		fileData.append("import com.neusoft.crm.common.persistence.MyBatisDao;\n");
		fileData.append("import "+tableToMyibatisVO.getDoFullClassName()+";\n\n");
		
		//注解
		fileData.append("@MyBatisDao\n");
		//类名
		fileData.append("public interface " + mapperClassName + " extends CrudDao<"+doClassName+"> { \n\n}\n");
		
		//生成文件目录
		String fileDir = "./file/"+packageName.replaceAll("\\.","/");
		
		
		
		FileOperation.deleteFile(fileDir);
		new File(fileDir).mkdirs();
		
		//写入文件
		String fileName = fileDir + "/" + mapperClassName + ".java";
		FileOperation.method(fileName, fileData.toString());
		
	}
}
