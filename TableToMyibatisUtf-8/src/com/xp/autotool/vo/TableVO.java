package com.xp.autotool.vo;

import java.util.List;
import com.xp.autotool.utils.StringUtils;

public class TableVO {
	/**
	 * 表名称
	 */
	public String TABLE_NAME;
	
	/**
	 * 表名称(驼峰标识)
	 */
	public String humpTableName;
	
	/**
	 * 表名称(驼峰标识+首字母大写)
	 */
	public String capitalHumpTableName;
	
	/**
	 * 表注释
	 */
	public String TABLE_COMMENT;
	
	/**
	 * DO名称
	 */
	public String doName;
	
	/**
	 * DTO名称
	 */
	public String dtoName;
	
    /**
     * Mapper名称
     */
	public String mapperName;
	
	/**
	 * sqlMap名字
	 */
	public String sqlMapName;
	
	public String getSqlMapName() {
		return sqlMapName;
	}

	public void setSqlMapName(String sqlMapName) {
		this.sqlMapName = sqlMapName;
	}

	/**
	 * 列信息
	 */
	public List<ColumnVO> columnList;
	
	public TableVO(){
		
	}
	
	public TableVO(String tableName){
		//表名全部转换为大小
		this.TABLE_NAME = tableName.toUpperCase();
		this.humpTableName = StringUtils.columnToHumpFormatL(TABLE_NAME);
		this.capitalHumpTableName = StringUtils.capitalize(this.humpTableName);
		this.doName = this.capitalHumpTableName + "DO";
		this.dtoName = this.capitalHumpTableName + "DTO";
		this.mapperName = this.capitalHumpTableName + "Mapper";
		this.sqlMapName = this.capitalHumpTableName + "Mapper";
	}

	public String getDoName() {
		return doName;
	}

	public void setDoName(String doName) {
		this.doName = doName;
	}

	public String getDtoName() {
		return dtoName;
	}

	public void setDtoName(String dtoName) {
		this.dtoName = dtoName;
	}

	public String getMapperName() {
		return mapperName;
	}

	public void setMapperName(String mapperName) {
		this.mapperName = mapperName;
	}

	public String getTABLE_NAME() {
		return TABLE_NAME;
	}

	public void setTABLE_NAME(String table_name) {
		TABLE_NAME = table_name;
	}

	public String getTABLE_COMMENT() {
		return TABLE_COMMENT;
	}

	public void setTABLE_COMMENT(String table_comment) {
		TABLE_COMMENT = table_comment;
	}

	public List<ColumnVO> getColumnList() {
		return columnList;
	}

	public void setColumnList(List<ColumnVO> columnList) {
		this.columnList = columnList;
	}

	public String getHumpTableName() {
		return humpTableName;
	}

	public void setHumpTableName(String humpTableName) {
		this.humpTableName = humpTableName;
	}

	public String getCapitalHumpTableName() {
		return capitalHumpTableName;
	}

	public void setCapitalHumpTableName(String capitalHumpTableName) {
		this.capitalHumpTableName = capitalHumpTableName;
	}
}
