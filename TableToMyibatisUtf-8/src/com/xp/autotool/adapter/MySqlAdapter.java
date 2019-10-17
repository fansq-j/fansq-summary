package com.xp.autotool.adapter;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xp.autotool.vo.ColumnVO;

public class MySqlAdapter extends DataBaseAdapter {
	public int dbPort = 3306;
	
	public static final Map<String,String> columnToJavaMap;
	public static final Map<String,String> columnToJdbcMap;
	static{
		columnToJavaMap = new HashMap<String,String>();
		columnToJdbcMap = new HashMap<String,String>();
	    //CHAR
		columnToJavaMap.put("char","java.lang.String");
		columnToJdbcMap.put("char","CHAR");
		
		//VARCHAR
		columnToJavaMap.put("varchar","java.lang.String");
		columnToJdbcMap.put("varchar","VARCHAR");
				
	    //BLOB
		columnToJavaMap.put("blob","java.lang.String");
		columnToJdbcMap.put("blob","BLOB");
		
		//CLOB
		columnToJavaMap.put("clob","java.lang.String");
		columnToJdbcMap.put("clob","CLOB");
		
		columnToJavaMap.put("datetime","java.util.Date");
		columnToJdbcMap.put("datetime","TIMESTAMP");
		
		columnToJavaMap.put("date","java.util.Date");
		columnToJdbcMap.put("date","TIMESTAMP");
		
		//int
		columnToJavaMap.put("int","java.lang.Integer");
		columnToJdbcMap.put("int","INTEGER");
		
		//long
		columnToJavaMap.put("bigint","java.lang.Long");
		columnToJdbcMap.put("int","BIGINT");
		
		//text
		columnToJavaMap.put("text","java.lang.String");
		columnToJdbcMap.put("text","VARCHAR");
		
		columnToJavaMap.put("double","java.lang.Double");
		columnToJdbcMap.put("double","DOUBLE");
		
		columnToJavaMap.put("decimal","java.lang.Double");
		columnToJdbcMap.put("decimal","DOUBLE");
		
	}
	
	@Override
	public String getDriverName() {
		return "com.mysql.jdbc.Driver";
	}
	
	@Override
	public String getDBUrl() {
		return "jdbc:mysql://"+this.dbURL+":"+dbPort+"/"+this.dbName;
	}

	@Override
	public List<ColumnVO> getColumnList(String tableName) throws SQLException {
		List<ColumnVO> columnList = new ArrayList<ColumnVO>();
		
		String sql = "SELECT COLUMN_NAME     AS COLUMN_NAME,";
		sql = sql + "        DATA_TYPE       AS DATA_TYPE,";
		sql = sql + "        NUMERIC_PRECISION  AS DATA_PRECISION,";
		sql = sql + "        NUMERIC_SCALE      AS DATA_SCALE,";
		sql = sql + "        IS_NULLABLE        AS NULLABLE,";
		sql = sql + "        COLUMN_COMMENT     AS COLUMN_COMMENT,";
		sql = sql + "        COLUMN_KEY         AS COLUMN_KEY";
		sql = sql + "  FROM information_schema.COLUMNS";
		sql = sql + " WHERE table_schema = ? and table_name = ?";
		
	    PreparedStatement pst = this.connection.prepareStatement(sql);
        pst.setString(1,this.dbName);
        pst.setString(2,tableName);
        
        ResultSet rst = pst.executeQuery();
        Field[] fieldList = ColumnVO.class.getDeclaredFields();
        while(rst.next()){
        	ColumnVO columnVO = new ColumnVO();
        	columnList.add(columnVO);
        	for(Field field : fieldList){
        		String fieldName = field.getName();
        		if(fieldName.contains("_")){
        			Method method;
					try {
						method = ColumnVO.class.getDeclaredMethod("set"+fieldName,String.class);
						method.invoke(columnVO,rst.getString(fieldName));
					} catch (Exception e) {
						e.printStackTrace();
					}
        		}
        	}
        }
        
        pst.close();
        rst.close();
        
        return columnList;
	}

	@Override
	public String getTableComment(String tableName) throws SQLException {
		String tableComment = null;
        PreparedStatement pst = this.connection.prepareStatement("SELECT * FROM information_schema.TABLES WHERE TABLE_NAME = ? ");
        pst.setString(1,tableName);
        
        ResultSet rst = pst.executeQuery();
        while(rst.next()){
        	tableComment = rst.getString("TABLE_COMMENT");
        }
        
        pst.close();
        rst.close();
	
		return tableComment;
	}

	@Override
	public void dealColumnType(ColumnVO columnVO)throws Exception {
		String DATA_TYPE = columnVO.getDATA_TYPE();
		if(!"NUMBER".equals(DATA_TYPE)){
			String javaType = columnToJavaMap.get(DATA_TYPE);
			if(javaType == null){
				throw new Exception("数据类型【"+DATA_TYPE+"】转换关系未配置,请核查!");
			}
			columnVO.setJavaType(javaType);
			columnVO.setJdbcType(columnToJdbcMap.get(DATA_TYPE));
		}
	}

	@Override
	public List<String> getTableNameList() throws Exception{
		String tableComment = null;
        PreparedStatement pst = this.connection.prepareStatement("select * from information_schema.TABLES " +
        		"where table_schema = ?");
        pst.setString(1,this.dbName);
        
        ResultSet rst = pst.executeQuery();
        List<String> list = new ArrayList<String>();
        while(rst.next()){
        	list.add(rst.getString("TABLE_NAME"));
        }
        
        pst.close();
        rst.close();
	
		return list;
	}
}
