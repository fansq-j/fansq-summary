package com.xp.autotool.vo;

/**
 * 表对应的列对象VO
 */
public class ColumnVO {
	/**
	 *数据库-列名称
	 */
	public String COLUMN_NAME;
	
	/**
	 *数据库-列数据类型
	 */
	public String DATA_TYPE;

	/**
	 * 数据库-列数据精度
	 */
	public String DATA_PRECISION;
	
	/**
	 * 数据库-列scale
	 */
	public String DATA_SCALE;
	
	/**
	 * 是否可以为空
	 */
	public String NULLABLE;
	
	/**
	 * 列注释
	 */
	public String COLUMN_COMMENT;
	
	/**
	 * 是否索引
	 */
	public String COLUMN_KEY;
	
	/**
	 * 对应java的VO字段名
	 */
	public String columnName;
	
	/**
	 * 对应java的数据类型
	 */
	public String javaType;
	
	/**
	 * 对应jdbc的数据类型
	 */
	public String jdbcType;

	public String getCOLUMN_NAME() {
		return COLUMN_NAME;
	}

	public void setCOLUMN_NAME(String column_name) {
		COLUMN_NAME = column_name;
	}

	public String getDATA_TYPE() {
		return DATA_TYPE;
	}

	public void setDATA_TYPE(String data_type) {
		DATA_TYPE = data_type;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getNULLABLE() {
		return NULLABLE;
	}

	public void setNULLABLE(String nullable) {
		NULLABLE = nullable;
	}

	public String getJavaType() {
		return javaType;
	}

	public void setJavaType(String javaType) {
		this.javaType = javaType;
	}

	public String getJdbcType() {
		return jdbcType;
	}

	public void setJdbcType(String jdbcType) {
		this.jdbcType = jdbcType;
	}

	public String getDATA_PRECISION() {
		return DATA_PRECISION;
	}

	public void setDATA_PRECISION(String data_precision) {
		DATA_PRECISION = data_precision;
	}

	public String getDATA_SCALE() {
		return DATA_SCALE;
	}

	public void setDATA_SCALE(String data_scale) {
		DATA_SCALE = data_scale;
	}

	public String getCOLUMN_COMMENT() {
		return COLUMN_COMMENT;
	}

	public void setCOLUMN_COMMENT(String column_comment) {
		COLUMN_COMMENT = column_comment;
	}

	public String getCOLUMN_KEY() {
		return COLUMN_KEY;
	}

	public void setCOLUMN_KEY(String column_key) {
		COLUMN_KEY = column_key;
	}
}
