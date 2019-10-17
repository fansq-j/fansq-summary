package com.xp.autotool.adapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.xp.autotool.file.DTOFileCreator;
import com.xp.autotool.file.MapperFileCreator;
import com.xp.autotool.file.SqlMapCreator;
import com.xp.autotool.file.DOFileCreator;
import com.xp.autotool.utils.StringUtils;
import com.xp.autotool.vo.ColumnVO;
import com.xp.autotool.vo.TableToMyibatisVO;
import com.xp.autotool.vo.TableVO;

public abstract class DataBaseAdapter  {	
	public abstract String getDBUrl();
	public abstract String getDriverName();
//	public String userName = "root";
//	public String password = "123456";
//	public Connection connection;
//	
//	/**
//	 * 数据库URL
//	 */
//	public String dbURL = "10.4.121.180";
//	
//	/**
//	 * 要连接的数据库名称
//	 */
//	public String dbName = "prodtest";
//----------------------------------------------------------------------------------
	public String userName = "root";
	public String password = "root";
	public Connection connection;
	
	/**
	 * 数据库URL
	 */
	public String dbURL = "10.4.127.199";
	//public String dbURL = "localhost";
	//public String dbURL = "136.142.34.71";
	/**
	 * 要连接的数据库名称
	 */
	public String dbName = "test";
	
	/**
	 * 建立连接
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	private void createConnection() throws ClassNotFoundException, SQLException {
		// 加载Oracle驱动程序
		Class.forName(this.getDriverName());
		//创建连接
		this.connection = DriverManager.getConnection(this.getDBUrl(),userName,password);
	}
	
	/**
	 * 单表文件生成
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public void createFile(TableToMyibatisVO tableToMyibatisVO) throws Exception{
		//建立连接
		this.createConnection();	
		
		TableVO tableVO = this.createTableVO(tableToMyibatisVO.getTableVO().getTABLE_NAME());
		tableToMyibatisVO.setTableVO(tableVO);
		
		//生成DO文件
		DOFileCreator.createFile(tableToMyibatisVO);
		//生成DTO文件
		DTOFileCreator.createFile(tableToMyibatisVO);
		//生成DAO文件
		MapperFileCreator.createFile(tableToMyibatisVO);
	    //生成SqlMap文件
		SqlMapCreator.createFile(tableToMyibatisVO);
		
		//关闭连接
		//this.connection.close();
	}
	
	protected TableVO createTableVO(String tableName) throws Exception{
		TableVO tableVO = new TableVO(tableName);
		
		//获取表注释
		tableVO.setTABLE_COMMENT(this.getTableComment(tableName));
		
		//获取列信息
		List<ColumnVO> columnList = this.getColumnList(tableName);
		tableVO.setColumnList(columnList);
		//处理和java相关的信息
		for(ColumnVO columnVO : columnList){
			//转换为驼峰标识
			columnVO.setColumnName(StringUtils.columnToHumpFormatL(columnVO.getCOLUMN_NAME()));
			//根据数据库字段类型转换为java数据类
			this.doDealColumnType(columnVO);
		}
	
		return tableVO;
	}
	
	public  void doDealColumnType(ColumnVO columnVO) throws Exception{
		//处理number字段
		if("NUMBER".equals(columnVO.getDATA_TYPE())){
			int DATA_PRECISION = Integer.parseInt(columnVO.getDATA_PRECISION());
			String DATA_SCALE = columnVO.getDATA_SCALE();
			if(DATA_SCALE == null || "0".equals(DATA_SCALE)){
				if(DATA_PRECISION <= 9){
					columnVO.setJavaType("java.lang.Integer");
					columnVO.setJdbcType("INTEGER");
				}else{
					columnVO.setJavaType("java.lang.Long");
					columnVO.setJdbcType("BIGINT");
				}	
			}else{
				columnVO.setJavaType("java.lang.Double");
				columnVO.setJdbcType("Double");
			}
		//处理个性化部分
		}else{
			this.dealColumnType(columnVO);
		}
	}
	
	public abstract void dealColumnType(ColumnVO columnVO) throws Exception;
	
	public abstract List<ColumnVO> getColumnList(String tableName) throws SQLException;
	
	public abstract String getTableComment(String tableName) throws SQLException;
	
	/**
	 * 数据库多表文件生成
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public void createBatchFile(TableToMyibatisVO vo) throws Exception{
		//建立连接
		this.createConnection();
		
		//查询获取表名
		List<String> tableNameList = this.getTableNameList();
		
		//生成文件
		for(String tableName : tableNameList){
			TableVO tableVO = this.createTableVO(tableName);
			vo.setTableVO(tableVO);
			
			vo.setTableVOByName(tableName);
			this.createFile(vo);
		}
		
		//关闭连接
		this.connection.close();
	}
	
	public abstract List<String> getTableNameList() throws Exception;
}
