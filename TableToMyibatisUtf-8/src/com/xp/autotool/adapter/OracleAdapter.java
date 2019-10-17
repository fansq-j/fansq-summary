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

public class OracleAdapter extends DataBaseAdapter {
	public static final Map<String,String> columnToJavaMap;
	public static final Map<String,String> columnToJdbcMap;
	static{
		columnToJavaMap = new HashMap<String,String>();
		columnToJdbcMap = new HashMap<String,String>();
	    //CHAR
		columnToJavaMap.put("CHAR","java.lang.String");
		columnToJdbcMap.put("CHAR","CHAR");
		
		//VARCHAR2
		columnToJavaMap.put("VARCHAR2","java.lang.String");
		columnToJdbcMap.put("VARCHAR2","VARCHAR");
		
		//LONG
		columnToJavaMap.put("LONG","java.lang.String");
		columnToJdbcMap.put("LONG","LONGVARCHAR");
		
	    //BLOB
		columnToJavaMap.put("BLOB","java.lang.String");
		columnToJdbcMap.put("BLOB","BLOB");
		
		//CLOB
		columnToJavaMap.put("CLOB","java.lang.String");
		columnToJdbcMap.put("CLOB","CLOB");
		
		//columnToJavaMap.put("CLOB","java.lang.String");
		//columnToJdbcMap.put("CLOB","CLOB");
		
		//NUMBER(特殊处理)---程序特殊处理【】
		//长度<=9,全用java.lang.Integer,对应的jdbcType:INTEGER
		//长度在10和18之间,全用java.lang.Long,对应的jdbcType:BIGINT
		//凡是包含小数的,全部用java.lang.Double,对应的jdbcType:DOUBLE
		///NUMERIC,--->(java.lang.Integer,java.lang.Long)
	}
	
    public int dbPort = 1521;
	
	@Override
	public String getDBUrl() {
		return "jdbc:oracle:thin:@"+this.dbURL+":"+dbPort+":"+this.dbName;
	}

	@Override
	public String getDriverName() {
		return "oracle.jdbc.driver.OracleDriver";
	}

	@Override
	public List<ColumnVO> getColumnList(String tableName) throws SQLException {
		List<ColumnVO> columnList = new ArrayList<ColumnVO>();
		
		String sql = "SELECT T.COLUMN_NAME     AS COLUMN_NAME,";
		sql = sql + "       T.DATA_TYPE       AS DATA_TYPE,";
		sql = sql + "       T.DATA_PRECISION  AS DATA_PRECISION,";
		sql = sql + "       T.DATA_SCALE      AS DATA_SCALE,";
		sql = sql + "       T.NULLABLE        AS NULLABLE";
		sql = sql + "       C.COMMENTS        AS COMMENTS";
		sql = sql + "  FROM USER_TAB_COLUMNS T, USER_COL_COMMENTS C";
		sql = sql + " WHERE T.TABLE_NAME = C.TABLE_NAME";
		sql = sql + "   AND T.COLUMN_NAME = C.COLUMN_NAME";
		sql = sql + "   AND T.TABLE_NAME = ?";
		sql = sql + " ORDER BY T.COLUMN_ID";
		
	    PreparedStatement pst = this.connection.prepareStatement(sql);
        pst.setString(1,tableName);
        
        ResultSet rst = pst.executeQuery();
        Field[] fieldList = ColumnVO.class.getDeclaredFields();
        while(rst.next()){
        	ColumnVO columnVO = new ColumnVO();
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
        PreparedStatement pst = this.connection.prepareStatement("SELECT * FROM USER_TAB_COMMENTS WHERE TABLE_NAME = ? ");
        pst.setString(1,tableName);
        
        ResultSet rst = pst.executeQuery();
        while(rst.next()){
        	tableComment = rst.getString("COMMENTS");
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
				throw new Exception("数据类型【"+DATA_TYPE+"未配置,请核查!");
			}
			columnVO.setJavaType(javaType);
			columnVO.setJdbcType(columnToJdbcMap.get(DATA_TYPE));
		}
	}

	@Override
	public List<String> getTableNameList() {
		// TODO Auto-generated method stub
		return null;
	}
}
