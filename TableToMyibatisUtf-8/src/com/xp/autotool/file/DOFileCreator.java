package com.xp.autotool.file;

import java.io.File;

import com.xp.autotool.utils.FileOperation;
import com.xp.autotool.utils.StringUtils;
import com.xp.autotool.vo.ColumnVO;
import com.xp.autotool.vo.TableToMyibatisVO;
import com.xp.autotool.vo.TableVO;

/**
 * 生成VO对应的java文件
 */
public class DOFileCreator {
	public static void createFile(TableToMyibatisVO tableToMyibatisVO){
		String packageName = tableToMyibatisVO.getDoPackageName();
		TableVO tableVO = tableToMyibatisVO.getTableVO();
		String doClassName = tableVO.getDoName();
		
		//文件内容
		StringBuffer fileData = new StringBuffer();
		/********************* 生成文件头信息 **************************/
		
		// 包引用声明
		fileData.append("package " + packageName + ";\n\n");
		
		//BaseDO类引用
		fileData.append("import com.neusoft.crm.common.persistence.BaseDO;\n\n");
		fileData.append("import com.neusoft.crm.common.utils.SeqUtils;\n\n");

		//类注释信息
		fileData.append("/**" + "\n")
		        .append(" * @实体描述:" + tableVO.getTABLE_COMMENT() + "\n")
				.append(" * @实体表  :" + tableVO.getTABLE_NAME()+"\n")
		        .append(" */\n");
		
		//类名
		fileData.append("public class " + doClassName + " extends BaseDO{ " + "\n\n");
		
		//主键对应的序列
		fileData.append("   /**" + "\n")
		        .append("    *主键对应的序列名称\n")
		        .append("    */\n");
		fileData.append("    public static final String ID_SEQ = \"" + tableVO.getTABLE_NAME() + "_S\";\n\n");

		/********************* 处理表中字段信息 **************************/
		for (ColumnVO columnVO : tableVO.getColumnList()) {
			// 获取列名
			String columnName = columnVO.getColumnName();
			// 获取列类型
			String columnType = columnVO.getJavaType();
			// 获取列备注(还需要获取)
			String columnComment = columnVO.getCOLUMN_COMMENT();

			//字段注释
			if(columnComment != null){
				fileData.append("    /**" + "\n     * " + columnComment + "\n     */\n");
			}
			
			//字段定义
			fileData.append("    public " + columnType + " " + columnName + ";\n\n");
		}
		
		for (ColumnVO columnVO : tableVO.getColumnList()) {
			// 获取列名
			String bColumnName = StringUtils.capitalize(columnVO.getColumnName());
			String sColumnName = columnVO.getColumnName();
			String columnComment = columnVO.getCOLUMN_COMMENT();
			
			// 获取列类型
			String columnType = columnVO.getJavaType();
			
			//Set方法
			fileData.append("    /**" + "\n     * 设置 " + columnComment + "\n     */\n");
			fileData.append("    public void set" + bColumnName + "(" + columnType + " " + sColumnName + ") {\n")
			        .append("        this." + sColumnName + " = " + sColumnName + ";\n")
			        .append("    }\n\n");
			        
			//Get方法
			fileData.append("    /**" + "\n     * 获取 " + columnComment + "\n     */\n");
			fileData.append("    public " + columnType + " get" + bColumnName + "() {\n")
			        .append("        return this." + sColumnName + ";\n")
			        .append("    }\n\n");
			
			if("PRI".equals(columnVO.getCOLUMN_KEY())){
				//设置实例方法主键
				fileData.append("    /**" + "\n     * 设置主键,并返回主键ID\n     */\n");
				fileData.append("    public "+columnType+" doCreateId(){\n");
				String seqMethod = null;
				
				if("java.lang.Long".equals(columnType)){
					seqMethod = "SeqUtils.createLongId(ID_SEQ)";
				}else if("java.lang.Integer".equals(columnType)){
					seqMethod = "SeqUtils.createIntegerId(ID_SEQ)";
				}else if("java.lang.String".equals(columnType)){
					seqMethod = "SeqUtils.createStrId(ID_SEQ)";
				}
				
				fileData.append("         this."+sColumnName+" = "+seqMethod+";\n");
				fileData.append("         return this."+sColumnName +";\n");
				fileData.append("    }\n\n");
				
				//设置静态方法属性
				fileData.append("    /**" + "\n     * 静态方法-生成主键ID\n     */\n");
				fileData.append("    public static final "+ columnType + " createId(){\n");
				fileData.append("    	  return "+seqMethod+";\n");
				fileData.append("    }\n\n");
			}
		}
				
	
		
		fileData.append("}\n");

		//生成文件目录
		String fileDir = "./file/"+packageName.replaceAll("\\.","/");
		FileOperation.deleteFile(fileDir);
		new File(fileDir).mkdirs();
		
		//写入文件
		String fileName = fileDir + "/" + doClassName + ".java";
		
		System.out.println(fileData.toString());
		FileOperation.method(fileName, fileData.toString());
	}
}
