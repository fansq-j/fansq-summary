package com.xp.autotool.file;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import com.xp.autotool.utils.FileOperation;
import com.xp.autotool.utils.OutputFormatDom4J;
import com.xp.autotool.vo.ColumnVO;
import com.xp.autotool.vo.TableToMyibatisVO;
import com.xp.autotool.vo.TableVO;

public class SqlMapCreator {

	private final static String IntegerType = "java.lang.Integer";
	private final static String LongType = "java.lang.Long";

	private final static String baseResultMap = "BaseResultMap";

	private final static Map<String, String> jdbcMap = new HashMap<String, String>();

	static {
		jdbcMap.put("varchar", "VARCHAR");
		jdbcMap.put("int", "INTEGER");
		jdbcMap.put("bigint", "BIGINT");
		jdbcMap.put("datetime", "TIMESTAMP");
		jdbcMap.put("date", "TIMESTAMP");
		jdbcMap.put("double", "DOUBLE");
		jdbcMap.put("text", "CLOB");
		jdbcMap.put("decimal", "INTEGER");
	}
	
	
	
	private final static List<String> notGenerageType = new ArrayList<String>();

	static {
		
		notGenerageType.add("INTEGER");
		notGenerageType.add("TIMESTAMP");
		notGenerageType.add("BIGINT");
		notGenerageType.add("DOUBLE");
	
	}
	

	/* 公共模块sql 方法名字 */

	// 查询的所有列
	private final static String CommonColumns = "CommonColumns";
	
	// 所有列 除了主键
	private final static String CommonColumnsKey = "CommonColumnsKey";

	// where and条件查询
	private final static String dynamicAndCondition = "dynamicAndCondition";

	public static void createFile(TableToMyibatisVO tableToMyibatisVO) {
		// 根节点
		Element mapper = DocumentHelper.createElement("mapper");
		mapper.addText(getSpace(0));
		mapper.addAttribute("namespace", tableToMyibatisVO.getMapperFullClassName());

		// resultMap节点
		Element resultMap = DocumentHelper.createElement("resultMap");
		resultMap.addAttribute("id", baseResultMap).addAttribute("type", tableToMyibatisVO.getDoFullClassName());
		mapper.add(resultMap);

		// java属性和数据库字段映射节点
		Element result = null;
		TableVO tableVO = tableToMyibatisVO.getTableVO();
		for (ColumnVO columnVO : tableVO.getColumnList()) {

			if ("PRI".equals(columnVO.getCOLUMN_KEY())) {
				// 主键Id
				result = DocumentHelper.createElement("id");
			} else {
				// 其他字段
				result = DocumentHelper.createElement("result");
			}
			result.addAttribute("column", columnVO.getCOLUMN_NAME());
			result.addAttribute("jdbcType", getJdbcType(columnVO.getDATA_TYPE()));
			result.addAttribute("property", columnVO.getColumnName());

			resultMap.add(result);
		}

		// 公共sql
		// 该表所有的列名字，以“,”分割，给查询使用
		mapper.addText(getSpace(0));
		Element columnSql = createcolumnSql(tableToMyibatisVO);
		mapper.add(columnSql);
		
		// 公共sql
		// 该表所有的列名字，以“,”分割，给查询使用
		mapper.addText(getSpace(0));
		Element columnKeySql = createColumnKeySql(tableToMyibatisVO);
		mapper.add(columnKeySql);

		// where and 查询条件
		mapper.addText(getSpace(0));
		mapper.add(createWhereSql(tableToMyibatisVO));

		// count sql
		mapper.addText(getSpace(0));
		mapper.add(getCountSql(tableToMyibatisVO));

		// queryById sql
		mapper.addText(getSpace(0));
		if (getKeyColumnVO(tableToMyibatisVO) != null) {
			mapper.add(getQueryByIdSql(tableToMyibatisVO));
		}
		// queryList sql
		mapper.addText(getSpace(0));
		mapper.add(getQueryListSql(tableToMyibatisVO));
		
		
		// insertKey sql
		Element insertKey=	getInsertKeySql(tableToMyibatisVO);
		if(insertKey!=null){
			mapper.addText(getSpace(0));
			mapper.add(insertKey);
		}
		
		// insert sql
		mapper.addText(getSpace(0));
		mapper.add(getInsertSql(tableToMyibatisVO));

		// deleteById sql
		mapper.addText(getSpace(0));
		if (getKeyColumnVO(tableToMyibatisVO) != null) {
			mapper.add(getDeleteByIdSql(tableToMyibatisVO));
		}

		// delete sql
		mapper.addText(getSpace(0));
		mapper.add(getDeleteSql(tableToMyibatisVO));

		// updateById sql
		mapper.addText(getSpace(0));
		if (getKeyColumnVO(tableToMyibatisVO) != null) {
			mapper.add(getUpdateByIdSql(tableToMyibatisVO));
		}
		// updateBySelective sql
		mapper.addText(getSpace(0));
		mapper.add(getUpdateBySelectiveSql(tableToMyibatisVO));

		OutputFormat format = OutputFormatDom4J.createPrettyPrint();
		StringWriter writer = new StringWriter();
		XMLWriter output = new XMLWriter(writer, format);
		output.setEscapeText(false);
		try {
			output.write(mapper);

			writer.close();
			output.close();
			// 生成文件目录
			String fileDir = "./file/" + tableToMyibatisVO.getSqlMapperFileName().replaceAll("\\.", "/");
			FileOperation.deleteFile(fileDir);
			new File(fileDir).mkdirs();

			// 写入文件

			String fileName = fileDir + "/" + tableToMyibatisVO.getTableVO().getSqlMapName() + ".xml";

			System.out.println(fileName);

			FileOperation.method(fileName, getMapperXML(writer.toString().replaceAll("&apos;", "'")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String getMapperXML(String writer) {
		String begin = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>  \n"
				+ "<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">";
		;

		return begin + " \n " + writer;
	}

	private static String getJdbcType(String str) {

		if (jdbcMap.containsKey(str)) {
			return jdbcMap.get(str);
		} else {
			return str;
		}
	}

	/**
	 * 公共sql 表中所有的列
	 */
	public static Element createcolumnSql(TableToMyibatisVO tableToMyibatisVO) {
		Element columnSql = DocumentHelper.createElement("sql");
		columnSql.addAttribute("id", CommonColumns);
		TableVO tableVO = tableToMyibatisVO.getTableVO();
		StringBuffer columnStr = new StringBuffer();
		for (int i = 0; i < tableVO.getColumnList().size(); i++) {
			if (i == (tableVO.getColumnList().size() - 1)) {
				columnStr.append(getSpace(10) + tableVO.getColumnList().get(i).getCOLUMN_NAME());
			} else {
				columnStr.append(getSpace(10) + tableVO.getColumnList().get(i).getCOLUMN_NAME() + ", ");

			}
		}

		columnSql.addText(columnStr.toString());

		columnSql.addText(getSpace(2));
		return columnSql;
	}
	
	/**
	 * 公共sql 表中所有的列 除主键
	 */
	public static Element createColumnKeySql(TableToMyibatisVO tableToMyibatisVO) {
		Element columnSql = DocumentHelper.createElement("sql");
		columnSql.addAttribute("id", CommonColumnsKey);
		TableVO tableVO = tableToMyibatisVO.getTableVO();
		StringBuffer columnStr = new StringBuffer();
		for (int i = 0; i < tableVO.getColumnList().size(); i++) {
			
			if ("PRI".equals(tableVO.getColumnList().get(i).getCOLUMN_KEY())) {
				continue;
			}
			
			if (i == (tableVO.getColumnList().size() - 1)) {
				columnStr.append(getSpace(10) + tableVO.getColumnList().get(i).getCOLUMN_NAME());
			} else {
				columnStr.append(getSpace(10) + tableVO.getColumnList().get(i).getCOLUMN_NAME() + ", ");

			}
		}

		columnSql.addText(columnStr.toString());

		columnSql.addText(getSpace(2));
		return columnSql;
	}

	/**
	 * 公共sql，where 条件
	 */

	public static Element createWhereSql(TableToMyibatisVO tableToMyibatisVO) {
		Element whereSql = DocumentHelper.createElement("sql");
		whereSql.addAttribute("id", dynamicAndCondition);
		Element ifElement = null;

		Element where = DocumentHelper.createElement("where");
		whereSql.add(where);

		boolean flag = true;
		for (ColumnVO columnVO : tableToMyibatisVO.getTableVO().getColumnList()) {
			ifElement = DocumentHelper.createElement("if");
			if(notGenerateStr(getJdbcType(columnVO.getDATA_TYPE()))){
				ifElement.addAttribute("test",
						columnVO.getColumnName() + " != null ");
			}else{
				ifElement.addAttribute("test",
						columnVO.getColumnName() + " != null and " + columnVO.getColumnName() + " != ''");
			}
			
			if (flag) {
				ifElement.addText(getSpace(8) + columnVO.getCOLUMN_NAME() + " = #{" + columnVO.getColumnName()
						+ ", jdbcType=" + getJdbcType(columnVO.getDATA_TYPE()) + " }");
				ifElement.addText(getSpace(6));
			} else {
				ifElement.addText(getSpace(8) + "and " + columnVO.getCOLUMN_NAME() + " = #{" + columnVO.getColumnName()
						+ ", jdbcType=" + getJdbcType(columnVO.getDATA_TYPE()) + " }");
				ifElement.addText(getSpace(6));
			}
			where.add(ifElement);
			flag = false;
		}

		return whereSql;
	}

	/**
	 * sql语句，对应java CrudDao类中count方法
	 */
	private static Element getCountSql(TableToMyibatisVO tableToMyibatisVO) {

		Element selectCount = DocumentHelper.createElement("select");
		selectCount.addAttribute("id", "count");
		selectCount.addAttribute("parameterType", tableToMyibatisVO.getDoFullClassName());
		selectCount.addAttribute("resultType", IntegerType);

		String sql = getSpace(6) + "select count(*) from " + tableToMyibatisVO.getTableVO().getTABLE_NAME();
		selectCount.addText(sql);

		Element ifElement = DocumentHelper.createElement("if");
		ifElement.addAttribute("test", "_parameter != null");
		Element include = DocumentHelper.createElement("include");
		include.addAttribute("refid", dynamicAndCondition);

		selectCount.add(ifElement);
		ifElement.add(include);
		return selectCount;
	}

	/**
	 * sql语句，对应java CrudDao类中queryById方法 根据主键查询单个DO
	 * 
	 * @param tableToMyibatisVO
	 * @return
	 */
	private static Element getQueryByIdSql(TableToMyibatisVO tableToMyibatisVO) {
		ColumnVO columnVO = getKeyColumnVO(tableToMyibatisVO);
		Element selectById = getElementSql("select", "queryById", getJdbcType(columnVO.getDATA_TYPE()), baseResultMap);

		selectById.addText(getSpace(6) + "select");
		Element include = getElementInclude(CommonColumns);
		selectById.add(include);
		selectById.addText(
				getSpace(8) + "from " + tableToMyibatisVO.getTableVO().getTABLE_NAME() + getSpace(8) + "where ");

		selectById.addText(getSpace(10) + getValueByColumnVO(columnVO));

		return selectById;
	}

	/**
	 * sql语句，对应java CrudDao类中queryList方法
	 * 
	 * 根据传入的do对象查询DO列表
	 */

	private static Element getQueryListSql(TableToMyibatisVO tableToMyibatisVO) {
		Element selectListSql = getElementSql("select", "queryList", tableToMyibatisVO.getDoFullClassName(),
				baseResultMap);
		selectListSql.addText(getSpace(6) + "select ");
		Element include = getElementInclude(CommonColumns);
		selectListSql.add(include);
		selectListSql.addText(getSpace(8) + "from  " + tableToMyibatisVO.getTableVO().getTABLE_NAME() + " ");
		Element include2 = getElementInclude(dynamicAndCondition);
		selectListSql.add(include2);

		Element choose = DocumentHelper.createElement("choose");

		Element when = DocumentHelper.createElement("when");
		when.addAttribute("test", "pageInfo != null and pageInfo.orderBy != null and pageInfo.orderBy != ''");
		when.addText(getSpace(10) + "ORDER BY ${pageInfo.orderBy} " + getSpace(6));
		choose.add(when);
		selectListSql.add(choose);
		return selectListSql;
	}

	/**
	 * sql语句，对应java CrudDao类中updateBySelective方法
	 */

	private static Element getUpdateBySelectiveSql(TableToMyibatisVO tableToMyibatisVO) {
		Element updateBySelectiveSql = getElementSql("update", "updateBySelective", "map", IntegerType);
		updateBySelectiveSql.addText(getSpace(6) + "update " + tableToMyibatisVO.getTableVO().getTABLE_NAME());
		/*alert by shenby for set 中间增加逗号 start*/
		Element set = DocumentHelper.createElement("trim");
		set.addAttribute("prefix", "set");
		set.addAttribute("suffixOverrides", ",");
		/*alert by shenby for set 中间增加逗号 end*/
		updateBySelectiveSql.add(set);
		Element ifElement = null;

		for (ColumnVO columnVO : tableToMyibatisVO.getTableVO().getColumnList()) {
			ifElement = DocumentHelper.createElement("if");
			ifElement.addAttribute("test", "record." + columnVO.getColumnName() + " != null");
			/*alert by shenby for set 中间增加逗号 start*/
			ifElement.addText(
					getSpace(8) + columnVO.getCOLUMN_NAME() + " = " + "#{" + "record." + columnVO.getColumnName()
							+ ",jdbcType=" + getJdbcType(columnVO.getDATA_TYPE()) + "}" +","+ getSpace(6));
			/*alert by shenby for set 中间增加逗号 end*/
			set.add(ifElement);
		}

		Element where = DocumentHelper.createElement("where");
		updateBySelectiveSql.add(where);

		boolean flag = true;
		for (ColumnVO columnVO : tableToMyibatisVO.getTableVO().getColumnList()) {
			ifElement = DocumentHelper.createElement("if");
			
			if(notGenerateStr(getJdbcType(columnVO.getDATA_TYPE()))){
				ifElement.addAttribute("test", "condition." + columnVO.getColumnName() + " != null ");
			}else{
				ifElement.addAttribute("test", "condition." + columnVO.getColumnName() + " != null and condition."
						+ columnVO.getColumnName() + " != ''");
			}
			
			if (flag) {
				ifElement.addText(
						getSpace(8) + columnVO.getCOLUMN_NAME() + " = #{" + "condition." + columnVO.getColumnName()
								+ ", jdbcType=" + getJdbcType(columnVO.getDATA_TYPE()) + " }" + getSpace(6));
			} else {
				ifElement.addText(getSpace(8) + "and " + columnVO.getCOLUMN_NAME() + " = #{" + "condition."
						+ columnVO.getColumnName() + ", jdbcType=" + getJdbcType(columnVO.getDATA_TYPE()) + " }"
						+ getSpace(6));
			}
			where.add(ifElement);
			flag = false;
		}

		return updateBySelectiveSql;
	}
	
	private static boolean notGenerateStr(String jdbcType){
		if(notGenerageType.contains(jdbcType)){
			return true;
		}
			return false;
	}


	/**
	 * sql语句，对应java CrudDao类中updateById方法 根据主键更新记录
	 */
	private static Element getUpdateByIdSql(TableToMyibatisVO tableToMyibatisVO) {
		Element updateByid = getElementSql("update", "updateById", tableToMyibatisVO.getDoFullClassName(), IntegerType);
		updateByid.addText(getSpace(6) + "update  " + tableToMyibatisVO.getTableVO().getTABLE_NAME() + "");
		/*alert by shenby for set 中间增加逗号 start*/
		Element set = DocumentHelper.createElement("trim");
		set.addAttribute("prefix", "set");
		set.addAttribute("suffixOverrides", ",");
		/*alert by shenby for set 中间增加逗号 end*/
		updateByid.add(set);
		Element ifElement = null;

		for (ColumnVO columnVO : tableToMyibatisVO.getTableVO().getColumnList()) {
			if ("PRI".equals(columnVO.getCOLUMN_KEY())) {
				continue;
			}
			ifElement = DocumentHelper.createElement("if");
			ifElement.addAttribute("test", columnVO.getColumnName() + " != null");
			/*alert by shenby for set 中间增加逗号 start*/
			ifElement.addText(getSpace(8) + getValueByColumnVO(columnVO) + "," + getSpace(6));
			/*alert by shenby for set 中间增加逗号 end*/
			set.add(ifElement);
		}

		StringBuffer sb = new StringBuffer();
		sb.append(getSpace(8) + "where " + getSpace(10) + getValueByColumnVO(getKeyColumnVO(tableToMyibatisVO)));

		updateByid.addText(sb.toString());

		return updateByid;

	}

	/**
	 * sql语句，对应java CrudDao类中delete方法 根据条件删除数据
	 */

	private static Element getDeleteSql(TableToMyibatisVO tableToMyibatisVO) {
		Element deleteById = getElementSql("delete", "delete", tableToMyibatisVO.getDoFullClassName(), IntegerType);

		deleteById.addText(getSpace(6) + "delete from " + tableToMyibatisVO.getTableVO().getTABLE_NAME());

		Element ifElement = DocumentHelper.createElement("if");
		ifElement.addAttribute("test", "_parameter != null");
		Element include = DocumentHelper.createElement("include");
		include.addAttribute("refid", dynamicAndCondition);
		ifElement.add(include);
		deleteById.add(ifElement);
		return deleteById;
	}

	/**
	 * sql语句，对应java CrudDao类中deleteById方法 根据主键删除记录
	 */
	private static Element getDeleteByIdSql(TableToMyibatisVO tableToMyibatisVO) {
		Element deleteById = getElementSql("delete", "deleteById", LongType, IntegerType);
		deleteById.addText(
				getSpace(6) + "delete from " + tableToMyibatisVO.getTableVO().getTABLE_NAME() + "  " + getSpace(8)
						+ "where" + getSpace(10) + getValueByColumnVO(getKeyColumnVO(tableToMyibatisVO)) + getSpace(2));

		return deleteById;
	}
	
	/**
	 * sql语句，对应java CrudDao类中insert方法 新增1条记录
	 * 
	 * @param tableToMyibatisVO
	 * @return
	 */
	private static Element getInsertKeySql(TableToMyibatisVO tableToMyibatisVO) {
		ColumnVO keyColumnVO=getKeyColumnVO(tableToMyibatisVO);
		if(keyColumnVO==null){
			return null;
		}
		Element insert = getElementSql("insert", "insertKey", tableToMyibatisVO.getDoFullClassName(), IntegerType);
		insert.addAttribute("useGeneratedKeys", "true");
		insert.addAttribute("keyProperty", keyColumnVO.getColumnName());
		
		insert.addText(getSpace(6) + "insert into  " + tableToMyibatisVO.getTableVO().getTABLE_NAME() + " ( ");
		Element include = getElementInclude(CommonColumnsKey);
		insert.add(include);
		insert.addText(getSpace(6) + " ) values ( ");

		for (int i = 0; i < tableToMyibatisVO.getTableVO().getColumnList().size(); i++) {
			ColumnVO columnVO = tableToMyibatisVO.getTableVO().getColumnList().get(i);

			if ("PRI".equals(columnVO.getCOLUMN_KEY())) {
				continue;
			}
			if (i == tableToMyibatisVO.getTableVO().getColumnList().size() - 1) {
				insert.addText(getSpace(8) + getColumnNameAndType(columnVO) + getSpace(8));
			} else {
				insert.addText(getSpace(8) + getColumnNameAndType(columnVO) + ", ");
			}
		}

		insert.addText(" )");
		return insert;
	}


	/**
	 * sql语句，对应java CrudDao类中insert方法 新增1条记录
	 * 
	 * @param tableToMyibatisVO
	 * @return
	 */
	private static Element getInsertSql(TableToMyibatisVO tableToMyibatisVO) {
		Element insert = getElementSql("insert", "insert", tableToMyibatisVO.getDoFullClassName(), IntegerType);
		insert.addText(getSpace(6) + "insert into  " + tableToMyibatisVO.getTableVO().getTABLE_NAME() + " ( ");
		Element include = getElementInclude(CommonColumns);
		insert.add(include);
		insert.addText(getSpace(6) + " ) values ( ");

		for (int i = 0; i < tableToMyibatisVO.getTableVO().getColumnList().size(); i++) {
			ColumnVO columnVO = tableToMyibatisVO.getTableVO().getColumnList().get(i);

			if (i == tableToMyibatisVO.getTableVO().getColumnList().size() - 1) {
				insert.addText(getSpace(8) + getColumnNameAndType(columnVO) + getSpace(8));
			} else {
				insert.addText(getSpace(8) + getColumnNameAndType(columnVO) + ", ");
			}
		}

		insert.addText(" )");

		return insert;
	}

	/**
	 * 获取数据库sql中 数据库列取值
	 * 
	 * @return
	 */
	private static String getValueByColumnVO(ColumnVO columnVO) {

		return " " + columnVO.getCOLUMN_NAME() + " = " + getColumnNameAndType(columnVO);

	}

	private static String getColumnNameAndType(ColumnVO columnVO) {

		return "#{" + columnVO.getColumnName() + ",jdbcType=" + getJdbcType(columnVO.getDATA_TYPE()) + "}";
	}

	/**
	 * 获取主键列信息
	 * 
	 * @param tableToMyibatisVO
	 * @return
	 */
	private static ColumnVO getKeyColumnVO(TableToMyibatisVO tableToMyibatisVO) {

		for (ColumnVO columnVO : tableToMyibatisVO.getTableVO().getColumnList()) {
			if ("PRI".equals(columnVO.getCOLUMN_KEY())) {
				return columnVO;
			}
		}

		return null;
	}

	/**
	 * 获取include节点
	 * 
	 * @param refid
	 *            调用的公共sql名字
	 * @return
	 */
	private static Element getElementInclude(String refid) {
		Element include = DocumentHelper.createElement("include");
		include.addAttribute("refid", refid);

		return include;

	}

	/**
	 * 获取一个sql节点的公共方法
	 * 
	 * @param type
	 *            sql的操作类型： select,update,insert,delete
	 * @param methodName
	 *            对应CrudDao类中的方法名字
	 * @param parameterType
	 *            sql请求的参数类型
	 * @param resultType
	 *            sql返回的参数类型
	 * @return
	 */
	private static Element getElementSql(String type, String methodName, String parameterType, String resultMap) {

		Element elementSql = DocumentHelper.createElement(type);

		elementSql.addAttribute("id", methodName);
		if (parameterType.equals(LongType)) {
			elementSql.addAttribute("parameterType", parameterType);
		}

		if (!IntegerType.equals(resultMap)) {
			elementSql.addAttribute("resultMap", resultMap);
		}

		return elementSql;
	}

	private static String getSpace(int number) {

		StringBuffer str = new StringBuffer("\n");

		for (int i = 0; i < number; i++) {
			str.append(" ");
		}
		return str.toString();
	}

}
