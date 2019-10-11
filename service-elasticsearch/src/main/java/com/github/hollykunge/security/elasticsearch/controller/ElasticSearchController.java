package com.github.hollykunge.security.elasticsearch.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.github.hollykunge.security.elasticsearch.config.RabbitConfig;
import com.github.hollykunge.security.elasticsearch.msg.BaseResponse;
import com.github.hollykunge.security.elasticsearch.msg.ObjectRestResponse;
import com.github.hollykunge.security.elasticsearch.service.ElasticSearchService;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.indices.mapping.GetMapping;


@RestController
@RequestMapping("/esController")
public class ElasticSearchController<T> {

	@Autowired
	private ElasticSearchService<T> esService;
	
	@Autowired
	private JestClient client;
	
	
	/**
	 * fansq 新增数据
	 * @param t  泛型t
	 * @param index 索引名称
	 * @param type  索引类型
	 * @RequestBody T t, @RequestParam(name="index") String index,
			@RequestParam(name="type") String type
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public BaseResponse insertOrUpdateDoc(@RequestBody T t, @RequestParam(name="index") String index,
			@RequestParam(name="type") String type) throws IOException {
		return esService.insertOrUpdateDoc(t, index, type);
    }
	
	 /**
     * fansq 创建索引
     * @param index 索引名称
	 * @throws IOException 
     */
	@RequestMapping(value="/createIndex",method=RequestMethod.POST)
    public BaseResponse createIndex(@RequestParam(name="index") String index) throws IOException {
		return esService.createIndex(index);
	}
	
	/**
	 * fansq 删除索引
	 * @param index 索引名称 
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value="/deleteIndex",method=RequestMethod.DELETE)
	public BaseResponse deleteIndex(@RequestParam(name="index") String index) throws IOException {
		return esService.deleteIndex(index);
	}
	
	/**
	 * fansq 删除文档数据根据文档id
	 * @param index 索引名称
	 * @param type  索引类型
	 * @param docID 文档id
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value="/deleteDoc",method=RequestMethod.DELETE)
	public BaseResponse deleteDoc(@RequestParam(name="index") String index,
			@RequestParam(name="type") String type,
			@RequestParam(name="docID") String docID) throws IOException {
		return esService.deleteDoc(index, type, docID);
	}
	/**
	 * fansq 更加检索数据删除文档数据
	 * 
	 * 该接口有一些小小的问题需要改，但不影响具体使用
	 * 
	 * @param index 索引名称
	 * @param type  索引类型
	 * @param docMessage 文档数据
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value="/deleteDocSearch",method=RequestMethod.POST)
	public BaseResponse deleteDocSearch(@RequestParam(name="index") String index,
			@RequestParam(name="type") String type,
			@RequestParam(name="docMessage") String docMessage) throws IOException {
		return esService.deleteDocSearch(index, type, docMessage);
	}
	
	/**
	 * fansq 设置索引别名
	 * @param index 索引名称
	 * @param alias 索引别名
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/addIndexAlias",method=RequestMethod.PUT)
	public BaseResponse addIndexAlias(@RequestParam(name="index") String index,
			@RequestParam(name="alias") String alias) throws Exception {
		return esService.addIndexAlias(index, alias);
	}
	
	/**
	 * fansq 全文模糊检索
	 * @param index
	 * @param type
	 * @param docMessage
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/getDocSearch",method=RequestMethod.POST)
	public ObjectRestResponse<String> getDocSearch(@RequestParam(name="index") String index,
			@RequestParam(name="type") String type,
			@RequestParam(name="docMessage") String docMessage,
			@RequestParam(name="from") String from,
			@RequestParam(name="size") String size
			) throws Exception{
		return esService.getDocSearch(index, type, docMessage,from,size);
	}
	
	/**
	 * fansq  通过rabbitmq插入数据
	 * TOPIC_QUEUE1  暂时定义，整合项目后修改
	 * @param lhm
	 * 
	 * 17732878723
	 * 15931163090
	 * @throws IOException 
	 */
	@RabbitListener(queues = RabbitConfig.TOPIC_QUEUE1)
	public void insertOrUpdateDoc(List<LinkedHashMap<String, Object>> list) throws IOException {
		esService.insertOrUpdateDocRabbitmq(list);
    }
	
	
    /**
     * fansq  获取指定索引的信息
     * @param indexName
     * @param typeName
     * @return
     * @throws IOException 
     */
	@RequestMapping(value="/getIndexMapping",method=RequestMethod.POST)
    public BaseResponse getIndexMapping(@RequestParam(name="indexName") String indexName,@RequestParam(name="typeName") String typeName) throws IOException {
    	return esService.getIndexMapping(indexName, typeName);
    }
	
	/**
	 * fansq 
	 * 精确分词多条件搜索                                ---已完成   
                         接口具体使用介绍：
          1.如果为条件按照分词结果精确匹配，例如搜索测试两个字，会将检索测+试的文档内容全部返回,注意 测和试可能并不连着
          2.如果为多条件搜索，和单条件雷同，不过的时候必须满足所有条件才可以
          3.如果查询结果中没有所需内容，原因可能为：取出的条数不足，结果在剩余结果中
	 * @param t
	 * @param index
	 * @param type
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/getPreciseDocSearch",method=RequestMethod.POST)
	public ObjectRestResponse<String> getPreciseDocSearch(
			@RequestBody T t, 
			@RequestParam(name="index") String index,
			@RequestParam(name="type") String type,
			@RequestParam(name="from") Integer from,
			@RequestParam(name="size") Integer size
			) throws Exception{
		return esService.getPreciseDocSearch(index, type, t,from,size);
	}
	
	/**
	 * fansq  
	 * 精准不分词多条件搜索                             ---已完成   
                          接口具体使用介绍:
           1.所有条件必须全部匹配，请使用不分词字段，否则查询结果为空
           2.一般情况下 elasticsearch会将 中英文字段全部分词，请在安装elasticsearch时配置分词字段或者指定具体哪些字段不分词
	 * @param t
	 * @param index
	 * @param type
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/getPreciseAllDocSearch",method=RequestMethod.POST)
	public ObjectRestResponse<String> getPreciseAllDocSearch(@RequestBody T t, @RequestParam(name="index") String index,
			@RequestParam(name="type") String type,
			@RequestParam(name="from") Integer from,
			@RequestParam(name="size") Integer size) throws Exception{
		return esService.getPreciseAllDocSearch(index, type, t,from,size);
	}
	
	/**
	 * fansq 精确不分词多条件多值搜索
	 * @param t
	 * @param index
	 * @param type
	 * @param from
	 * @param size
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/getNonParticipleMultivaluedDocSearch",method=RequestMethod.POST)
	public ObjectRestResponse<String> getNonParticipleMultivaluedDocSearch(@RequestBody T t, @RequestParam(name="index") String index,
			@RequestParam(name="type") String type,
			@RequestParam(name="from") Integer from,
			@RequestParam(name="size") Integer size) throws Exception{
		return esService.getNonParticipleMultivaluedDocSearch(index, type, t,from,size);
	}
	
	/**
	 * fansq 模糊不分词，多条件搜索
	 * 接口具体使用介绍:
           1.elasticsearch 规定 模糊查询字段不能为全文检索字段，否则查询结果为空
           2.只能对关键字和文本字段使用通配符查询
           3.# 代表匹配多个字符 包括空格，？表示匹配单个字符，需要随着参数传递 例如 测试#
           4.尽量避免在搜索的时候 直接使用 # ？ 开头，因为会减慢检索速度  例如  #测试  ？测试
	 * @param t
	 * @param index
	 * @param type
	 * @param from
	 * @param size
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/getVagueDocSearch",method=RequestMethod.POST)
	public ObjectRestResponse<String> getVagueDocSearch(@RequestBody T t, @RequestParam(name="index") String index,
			@RequestParam(name="type") String type,
			@RequestParam(name="from") Integer from,
			@RequestParam(name="size") Integer size) throws Exception{
		return esService.getVagueDocSearch(index, type, t, from, size);
	}
	
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
    public String test(@RequestParam(name="indexName") String indexName,@RequestParam(name="typeName") String typeName) {
    	GetMapping getMapping = new GetMapping.Builder().addIndex(indexName).addType(typeName).build();
		  JestResult jr;
		try {
			jr = client.execute(getMapping);
			String s = jr.getJsonString();
			System.out.println(jr.getErrorMessage());
			System.out.println(jr.isSucceeded());
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
    }
}
