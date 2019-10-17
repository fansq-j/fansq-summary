package com.xp.autotool.file;

import java.io.File;

import com.xp.autotool.utils.FileOperation;
import com.xp.autotool.vo.ColumnVO;
import com.xp.autotool.vo.TableToMyibatisVO;
import com.xp.autotool.vo.TableVO;

public class DTOFileCreator {
	public static void createFile(TableToMyibatisVO tableToMyibatisVO){
		String packageName = tableToMyibatisVO.getDtoPackageName();
		TableVO tableVO = tableToMyibatisVO.getTableVO();
		String dtoClassName =  tableVO.getDtoName();
		String doClassName = tableVO.getDoName();
		
			
		//文件内容
		StringBuffer fileData = new StringBuffer();
		/********************* 生成文件头信息 **************************/
		
		// 包引用声明
		fileData.append("package " + packageName + ";\n\n");
		
		//BaseDO类引用
		fileData.append("import "+tableToMyibatisVO.getDoFullClassName()+";\n\n");

		//类注释信息
		fileData.append("/**" + "\n")
		        .append(" * " + tableVO.getTABLE_NAME()+"表对应的实体DTO信息\n")
		        .append(" */\n");
		
		//类名
		fileData.append("public class " + dtoClassName + " extends "+doClassName +"{ " + "\n\n");
		fileData.append("}\n");

		//生成文件目录
		File fileUrl = new File("./file/"+packageName.replaceAll("\\.","/"));
		fileUrl.mkdirs();
		
		//写入文件
		String fileName = fileUrl + "/" + dtoClassName + ".java";
		FileOperation.method(fileName, fileData.toString());
	}
}
