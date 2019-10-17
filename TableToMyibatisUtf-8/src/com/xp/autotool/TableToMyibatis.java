package com.xp.autotool;

import com.xp.autotool.adapter.DataBaseAdapter;
import com.xp.autotool.adapter.MySqlAdapter;
import com.xp.autotool.adapter.OracleAdapter;
import com.xp.autotool.vo.TableToMyibatisVO;

public class TableToMyibatis {
	/**
	 * 处理要点如下:
	 * 1.参数1:数据库类型(支持多种数据库)
	 * 
	 * 2.参数2:(可选)包名
	 *   包名之间以逗号相隔,生成的vo、dao、sqlmap分别放在test.vo,test.dao,test.sqlmap子包下。
	 *   
	 * 3.参数3:(可选)表名
	 *   如果不传表名,则对数据库中的所有表进行操作。
	 *   
	 * 4.数据库url以及数据库名称,暂时先配置在DataBaseAdapter类中.
	 */
	public static void main(String[] args) throws Exception{
		if(args.length < 2){
			throw new Exception("请传入数据库类型和包名");
		}else if(args.length > 3){
			throw new Exception("你传入的参数超过系统定义的参数,请你仔细阅读说明文档啊!");
		}
		String dbType = args[0].toLowerCase();
		String packageName = args[1];
		if(!packageName.contains("com.neusoft.crm")){
			throw new Exception("包名必须以com.neusoft.crm开头");
		}
		String tableName = null;
		if(args.length == 3){
			tableName = args[2];
		}
		
		//根据数据库类型选择不同的适配器
		DataBaseAdapter dbAdapter = null;
		if("oracle".equals(dbType)){
			dbAdapter = new OracleAdapter();
		}else if("mysql".equals(dbType)){
			dbAdapter = new MySqlAdapter();
		}

		TableToMyibatisVO tableToMyibatisVO = new TableToMyibatisVO(packageName,tableName);
		
		//单表生成
		if(args.length == 3){
			dbAdapter.createFile(tableToMyibatisVO);
		//数据库多表生成
		}else if(args.length == 2){
			dbAdapter.createBatchFile(tableToMyibatisVO);
		}
	}
}
