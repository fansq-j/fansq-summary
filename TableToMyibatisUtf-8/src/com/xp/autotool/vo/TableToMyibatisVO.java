package com.xp.autotool.vo;

public class TableToMyibatisVO {
	/**
	 * do对应的包名
	 */
	public String doPackageName;
	
	/**
	 * do对应的完整路径名
	 */
	public String doFullClassName;
	
	/**
	 * dto对应的包名
	 */
	public String dtoPackageName;
	
	/**
	 * dto对应的完整路径名
	 */
	public String dtoFullClassName;
	
	/**
	 * mapper对应的包名
	 */
	public String mapperPackageName;
	
	/**
	 * mapper对应的完整路径名
	 */
	public String mapperFullClassName;
	
	/**
	 * sqlMapper对应的路径
	 */
	public String sqlMapperFileName;
	
	/**
	 * sqlMap 完整的路径加文件名字
	 * @return
	 */
	public String sqlMapperFullFileName;
	
	public String getSqlMapperFullFileName() {
		return sqlMapperFullFileName;
	}

	public void setSqlMapperFullFileName(String sqlMapperFullFileName) {
		this.sqlMapperFullFileName = sqlMapperFullFileName;
	}

	public String getSqlMapperFileName() {
		return sqlMapperFileName;
	}

	public void setSqlMapperFileName(String sqlMapperFileName) {
		this.sqlMapperFileName = sqlMapperFileName;
	}

	public TableVO tableVO;
	
	public TableToMyibatisVO(String packageName, String tableName) {
		int length = "com.neusoft.crm".length();

		String prefix = packageName.substring(0,length);
		String afterfix = packageName.substring(length);
		
		//do所在包名
		this.doPackageName = prefix+".api"+afterfix+".data";
		//do所在类完整路径
		
		this.dtoPackageName = prefix+".api"+packageName.substring(length)+".dto";
		this.mapperPackageName = packageName+".mapper";
		
		//sqlMap所在完成路径
		this.sqlMapperFileName=afterfix.substring(1, afterfix.length());
		
	
		this.setTableVOByName(tableName);
		
	}

	public String getDoPackageName() {
		return doPackageName;
	}

	public void setDoPackageName(String doPackageName) {
		this.doPackageName = doPackageName;
	}

	public String getDtoPackageName() {
		return dtoPackageName;
	}

	public void setDtoPackageName(String dtoPackageName) {
		this.dtoPackageName = dtoPackageName;
	}

	public String getMapperPackageName() {
		return mapperPackageName;
	}

	public void setMapperPackageName(String mapperPackageName) {
		this.mapperPackageName = mapperPackageName;
	}

	public TableVO getTableVO() {
		return tableVO;
	}

	public void setTableVO(TableVO tableVO) {
		this.tableVO = tableVO;
	}

	public String getDoFullClassName() {
		return doFullClassName;
	}

	public void setDoFullClassName(String doFullClassName) {
		this.doFullClassName = doFullClassName;
	}

	public String getDtoFullClassName() {
		return dtoFullClassName;
	}

	public void setDtoFullClassName(String dtoFullClassName) {
		this.dtoFullClassName = dtoFullClassName;
	}

	public String getMapperFullClassName() {
		return mapperFullClassName;
	}

	public void setMapperFullClassName(String mapperFullClassName) {
		this.mapperFullClassName = mapperFullClassName;
	}
	
	public void setTableVOByName(String tableName){
		if(tableName != null){
			if(this.tableVO == null){
				this.tableVO = new TableVO(tableName);
			}
			
			this.doFullClassName = this.doPackageName+"."+tableVO.getDoName();
			this.dtoFullClassName = this.dtoPackageName+"."+ tableVO.getDtoName();
			this.mapperFullClassName = this.mapperPackageName+"."+tableVO.getMapperName();
		}
	}
	
}
