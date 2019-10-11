package com.github.hollykunge.security.elasticsearch.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.Operator;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.hollykunge.security.elasticsearch.msg.BaseResponse;
import com.github.hollykunge.security.elasticsearch.msg.ObjectRestResponse;
import com.github.hollykunge.security.elasticsearch.service.ElasticSearchService;
import com.google.gson.JsonObject;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.core.Bulk;
import io.searchbox.core.Delete;
import io.searchbox.core.DocumentResult;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.indices.CreateIndex;
import io.searchbox.indices.DeleteIndex;
import io.searchbox.indices.IndicesExists;
import io.searchbox.indices.aliases.AddAliasMapping;
import io.searchbox.indices.aliases.ModifyAliases;
import io.searchbox.indices.mapping.GetMapping;
import io.searchbox.params.SearchType;

@Service
public class ElasticSearchServiceImpl<T> implements ElasticSearchService<T>{

	@Autowired
	private JestClient client;
	
	@Override
	public void receiverMessage(T t) {
		
	}
 
	@Override
	public BaseResponse getIndexMapping(String indexName, String typeName) throws IOException {
		BaseResponse baseRe = new BaseResponse();
        GetMapping.Builder builder = new GetMapping.Builder();
        builder.addIndex(indexName).addType(typeName);
        String res = null;
            JestResult result = client.execute(builder.build());
            if (result != null && result.isSucceeded()) {
                res = result.getSourceAsObject(JsonObject.class).toString();
                baseRe.setMessage(res);
                baseRe.setStatus(200);
                return baseRe;
            }else {
            	baseRe.setMessage(result.getErrorMessage());
            	baseRe.setStatus(500);
            	return baseRe;
            }
	}

	/**
	 *  直接调用接口插入数据 批量新增 单条新增
	 * @throws IOException 
	 */
	@Override
	public BaseResponse insertOrUpdateDoc(T t, String indexName, String typeName) throws IOException {
		BaseResponse br = new BaseResponse();
		List<Object> list = (List<Object>) t;
		Bulk.Builder bulk = new Bulk.Builder().defaultIndex(indexName).defaultType(typeName); 
		for(Object obj :list) {
			LinkedHashMap<String,Object> lhm = (LinkedHashMap<String, Object>) obj;
			Index.Builder builder = new Index.Builder(obj);
			builder.id(getHead(lhm).getValue().toString());
			builder.refresh(true);
			Index indexDoc = builder.index(indexName).type(typeName).build();
			bulk.addAction(indexDoc);
		}
		JestResult result;
          result = client.execute(bulk.build());
          if (result != null && result.isSucceeded()) {
        	  br.setMessage("插入成功");
        	  br.setStatus(200);
        	  return br;
          }else {
        	  br.setMessage(result.getErrorMessage());
        	  br.setStatus(result.getResponseCode());
        	  return br;
          }
	}
	/**
	 * fansq 批量新增数据
	 */
	@Override
	public boolean insertOrUpdateDocList(List<Object> messageList, String indexName, String typeName) {
		return false;
	}

	/**
	 * fansq 通过rabbitmq插入数据
	 * @throws IOException 
	 */
	@Override
	public boolean insertOrUpdateDocRabbitmq(List<LinkedHashMap<String, Object>> list) throws IOException {
		LinkedHashMap<String, Object> indexType = list.get(0);
		String indexName = indexType.get("index").toString();
		String typeName = indexType.get("type").toString();
		Bulk.Builder bulk = new Bulk.Builder().defaultIndex(indexName).defaultType(typeName);
		for(int i =1;i<list.size();i++) {
			LinkedHashMap<String, Object> message = list.get(i);
			Index.Builder builder = new Index.Builder(message);
			builder.id(getHead(message).getValue().toString());
			builder.refresh(true);
			Index indexDoc = builder.index(indexName).type(typeName).build();
			bulk.addAction(indexDoc);
		}
        JestResult result;
            result = client.execute(bulk.build());
            if (result != null && result.isSucceeded()) {
            	return true;
            }else {
            	return false;
            }
	}

	/**
	 * 创建索引
	 * @throws IOException 
	 */
	@Override
	public BaseResponse createIndex(String indexName) throws IOException {
		BaseResponse br = new BaseResponse();
				boolean indexExists = client.execute(new IndicesExists.Builder(indexName).build()).isSucceeded();
		            if (indexExists) {
		                //删除操作可添加索引类型 .type(indexType)
		               // client.execute(new DeleteIndex.Builder(indexName).build());
		            	br.setMessage("索引已存在，请重新创建索引");
		            	br.setStatus(200);
		            	return br;
		            }
		            JestResult jestResult = client.execute(new CreateIndex.Builder(indexName ).build());
				if (jestResult != null && jestResult.isSucceeded()) {
					br.setMessage("索引创建成功");
					br.setStatus(200);
					return br;
				}else {
					br.setMessage(jestResult.getErrorMessage());
					br.setStatus(jestResult.getResponseCode());
					return br;
				}
	}
	
	/**
	 * fansq 删除索引
	 * @throws IOException 
	 */
	@Override
	public BaseResponse deleteIndex(String indexName) throws IOException {
		JestResult jr = null;
		BaseResponse br = new BaseResponse();
            jr = client.execute(new DeleteIndex.Builder(indexName).build());
            if(jr!=null && jr.isSucceeded()) {
            	br.setMessage("索引删除成功");
            	br.setStatus(200);
            	return br;
            }else {
            	br.setMessage("索引不存在");
            	br.setStatus(200);
            	return br;
            }
	}
	/**
	 * fansq 根据文档id 删除文档数据
	 * @throws IOException 
	 */
	@Override
	public BaseResponse deleteDoc(String indexName, String typeName, String docID) throws IOException {
		BaseResponse br = new BaseResponse();
			DocumentResult dr = client.execute(new Delete.Builder(docID).index(indexName).type(typeName).build());
			if(dr !=null && dr.isSucceeded()) {
				br.setMessage("数据删除成功");
				br.setStatus(200);
				return br;
			}else {
				br.setMessage("文档数据不存在");
            	br.setStatus(200);
            	return br;
			}
	}
	/**
	 *fansq 通过检索指定数据，删除文档数据
	 * @throws IOException 
	 */
	@Override
	public BaseResponse deleteDocSearch(String indexName, String typeName, String docMessage) throws IOException {
		  BaseResponse br = new BaseResponse();
	        	//elasticsearch 查询语法 详见 elasticsearch官方文档 ,也可以直接调用查询api
	        	String sourceBuilder = "{\r\n" + 
	        			"  \"query\" : {\r\n" + 
	        			"    \"query_string\" : {\r\n" + 
	        			"      \"query\" : \""+docMessage+"\",\r\n" + 
	        			"      \"fields\" : [ ],\r\n" + 
	        			"      \"tie_breaker\" : 0.0,\r\n" + 
	        			"      \"default_operator\" : \"and\",\r\n" + 
	        			"      \"max_determinized_states\" : 10000,\r\n" + 
	        			"      \"enable_position_increments\" : true,\r\n" + 
	        			"      \"fuzziness\" : \"AUTO\",\r\n" + 
	        			"      \"fuzzy_prefix_length\" : 0,\r\n" + 
	        			"      \"fuzzy_max_expansions\" : 50,\r\n" + 
	        			"      \"phrase_slop\" : 0,\r\n" + 
	        			"      \"escape\" : false,\r\n"  + 
	        			"      \"boost\" : 1.0\r\n" + 
	        			"    }\r\n" + 
	        			"  }\r\n" + 
	        			"}";
	        	Search sb = new Search.Builder(sourceBuilder.toString()).addIndex(indexName).addType(typeName).build();
	            JestResult jr = client.execute(sb);
	            String json= jr.getJsonString();
	            JSONObject jsonObject = JSON.parseObject(json);
	            JSONObject hitsJson = jsonObject.getJSONObject("hits");
	            JSONArray hitsJsonArray = hitsJson.getJSONArray("hits");
	            if(hitsJsonArray.size()>0) {
	            	hitsJsonArray.forEach(message->{
	 		            try {
	 		            	String _id = ((JSONObject) message).getString("_id");
	 		            	DocumentResult	dr = client.execute(new Delete.Builder(_id).index(indexName).type(typeName).build());
	 		            } catch (IOException e) {
							e.printStackTrace();
						}
	            	});
		            		br.setMessage("删除成功");
		            		br.setStatus(200);
		            		return br;
	            }else {
	            	br.setMessage("文档数据匹配为空");
	    	        br.setStatus(200);
	    			return br;
	            }
	}
	
	/**
	 *fansq 给指定索引添加索引别名
	 * @throws Exception 
	 */
	@Override
	public BaseResponse addIndexAlias(String indexName, String alias) throws Exception {
		BaseResponse br = new BaseResponse();
	        AddAliasMapping build = new AddAliasMapping.Builder(indexName, alias).build();
	        JestResult jestResult = client.execute(new ModifyAliases.Builder(build).build());
	        if(jestResult!=null && jestResult.isSucceeded()) {
	        	br.setMessage("别名设置成功");
	        	br.setStatus(200);
	        	return br;
	        }else {
	        	br.setMessage(jestResult.getErrorMessage());
	        	br.setStatus(jestResult.getResponseCode());
	        	return br;
	        }
	}
	
	/**
	 * fansq 检索文档，返回检索内容 json格式
	 * @throws Exception 
	 */
	@Override
	public ObjectRestResponse<String> getDocSearch(String indexName, String typeName, String docMessage,String from,String size) throws Exception {
		ObjectRestResponse<String> or =new ObjectRestResponse<>();
	        	//elasticsearch 查询语法 详见 elasticsearch官方文档 ,也可以直接调用查询api
	        	String sourceBuilder = "{\r\n" + 
	        			"  \"query\" : {\r\n" + 
	        			"    \"query_string\" : {\r\n" + 
	        			"      \"query\" : \""+docMessage+"\",\r\n" + 
	        			"      \"fields\" : [ ],\r\n" + 
	        			"      \"tie_breaker\" : 0.0,\r\n" + 
	        			"      \"default_operator\" : \"and\",\r\n" + 
	        			"      \"max_determinized_states\" : 10000,\r\n" + 
	        			"      \"enable_position_increments\" : true,\r\n" + 
	        			"      \"fuzziness\" : \"AUTO\",\r\n" + 
	        			"      \"fuzzy_prefix_length\" : 0,\r\n" + 
	        			"      \"fuzzy_max_expansions\" : 50,\r\n" + 
	        			"      \"phrase_slop\" : 0,\r\n" + 
	        			"      \"escape\" : false,\r\n"  + 
	        			"      \"boost\" : 1.0\r\n" + 
	        			"    }\r\n" + 
	        			"  },\r\n" + 
	        			"\"from\":\""+from+"\",\r\n" + 
	        			"\"size\":\""+size+"\"\r\n" + 
	        			"}";
	        	Search sb = new Search.Builder(sourceBuilder.toString()).addIndex(indexName).addType(typeName).build();
	            JestResult jr = client.execute(sb);
	            if(jr != null && jr.isSucceeded()) {
	            	or.setMessage("查询成功");
	            	or.setStatus(200);
	            	or.data(jr.getJsonString());
	            	return or;
	            }else {
	            	or.setMessage(jr.getErrorMessage());
	            	or.setStatus(jr.getResponseCode());
	            	return or;
	            }
	}
	
	/**
	 * fansq 
	 * 精确分词多条件搜索                                ---已完成   
                         接口具体使用介绍：
          1.如果为条件按照分词结果精确匹配，例如搜索测试两个字，会将检索测+试的文档内容全部返回,注意 测和试可能并不连着
          2.如果为多条件搜索，和单条件雷同，不过的时候必须满足所有条件才可以
          3.如果查询结果中没有所需内容，原因可能为：取出的条数不足，结果在剩余结果中
	 */
	@Override
	public ObjectRestResponse<String> getPreciseDocSearch(String indexName, String typeName, T t,Integer from,Integer size) throws Exception{
		ObjectRestResponse<String> or = new ObjectRestResponse<>();
		LinkedHashMap<String,Object> lhm = (LinkedHashMap<String, Object>) t;
		Set<String> keySet = lhm. keySet();
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
		for(String key :keySet) {
			 Object value = lhm.get(key.toString());
			 queryBuilder.must(QueryBuilders.matchQuery(key,value).operator(Operator.AND));
		}
        searchSourceBuilder.query(queryBuilder).from(from).size(size);
        Search search = 
        		new Search.Builder(searchSourceBuilder.toString())
        		.addIndex(indexName).addType(typeName).build();
        
			JestResult jestResult = client.execute(search);
			if(jestResult!=null && jestResult.isSucceeded()) {
				or.data(jestResult.getJsonString());
				or.setMessage("查询成功");
				or.setStatus(200);
				return or;
			}else {
				or.setMessage(jestResult.getErrorMessage());
				or.setStatus(jestResult.getResponseCode());
				return or;
			}
	}

	/**
	 * fansq 
	 * 精准不分词多条件搜索                             ---已完成   
                         接口具体使用介绍:
           1.所有条件必须全部匹配，请使用不分词字段，否则查询结果为空
           2.一般情况下 elasticsearch会将 中英文字段全部分词，请在安装elasticsearch时配置分词字段或者指定具体哪些字段不分词
	 * @throws Exception 
	 */
	@Override
	public ObjectRestResponse<String> getPreciseAllDocSearch(String indexName, String typeName, T t,Integer from,Integer size) throws Exception {
		ObjectRestResponse<String> or = new ObjectRestResponse<>();
		LinkedHashMap<String,Object> lhm = (LinkedHashMap<String, Object>) t;
		Set<String> keySet = lhm. keySet();
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
		for(String key :keySet) {
			 Object value = lhm.get(key.toString());
			 queryBuilder.must(QueryBuilders.termQuery(key,value));
		}
        searchSourceBuilder.query(queryBuilder).from(from).size(size);
        Search search = new Search.Builder(searchSourceBuilder.toString()).addIndex(indexName).addType(typeName).build();
			JestResult jestResult = client.execute(search);
			if(jestResult!=null && jestResult.isSucceeded()) {
				or.data(jestResult.getJsonString());
				or.setMessage("查询成功");
				or.setStatus(200);
				return or;
			}else {
				or.setMessage(jestResult.getErrorMessage());
				or.setStatus(jestResult.getResponseCode());
				return or;
			}
	}
	
	/**
	 * fansq 精确不分词多条件多值搜索
	 * @throws Exception 
	 */
	@Override
	public ObjectRestResponse<String> getNonParticipleMultivaluedDocSearch(String indexName, String typeName, T t,
			Integer from, Integer size) throws Exception {
		ObjectRestResponse<String> or = new ObjectRestResponse<>();
		LinkedHashMap<String,Object> lhm = (LinkedHashMap<String, Object>) t;
		Set<String> keySet = lhm. keySet();
		System.out.println(keySet);
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
		for(String key :keySet) {
			 Object value = lhm.get(key.toString());
			 List<Object> l = (List<Object>) value;
			 System.out.println(value);
			 queryBuilder.must(QueryBuilders.termsQuery(key,l));
		}
        searchSourceBuilder.query(queryBuilder).from(from).size(size);
        System.out.println(searchSourceBuilder.toString());
        Search search = new Search.Builder(searchSourceBuilder.toString()).addIndex(indexName).addType(typeName).build();
			JestResult jestResult = client.execute(search);
			if(jestResult!=null && jestResult.isSucceeded()) {
				System.out.println(jestResult.getJsonString());
				or.data(jestResult.getJsonString());
				or.setMessage("查询成功");
				or.setStatus(200);
				return or;
			}else {
				or.setMessage(jestResult.getErrorMessage());
				or.setStatus(jestResult.getResponseCode());
				return or;
			}
	}
	
	/**  
	 * fansq 模糊不分词多条件搜索
	 * 接口具体使用介绍:
           1.elasticsearch 规定 模糊查询字段不能为全文检索字段，否则查询结果为空
           2.只能对关键字和文本字段使用通配符查询
           3.# 代表匹配多个字符 包括空格，？表示匹配单个字符，需要随着参数传递 例如 测试#
           4.尽量避免在搜索的时候 直接使用 # ？ 开头，因为会减慢检索速度  例如  #测试  ？测试
	 */
	@Override
	public ObjectRestResponse<String> getVagueDocSearch(String indexName, String typeName, T t,Integer from,Integer size) throws Exception{
		ObjectRestResponse<String> or = new ObjectRestResponse<>();
		LinkedHashMap<String,Object> lhm = (LinkedHashMap<String, Object>) t;
		Set<String> keySet = lhm. keySet(); 
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
		for(String key :keySet) {
			 Object value = lhm.get(key.toString());
			 queryBuilder.must(QueryBuilders.wildcardQuery(key,value.toString()));
		}
        searchSourceBuilder.query(queryBuilder).from(from).size(size);
        Search search = new Search.Builder(searchSourceBuilder.toString()).addIndex(indexName).addType(typeName).build();
			JestResult jestResult = client.execute(search);
			if(jestResult!=null && jestResult.isSucceeded()) {
				or.data(jestResult.getJsonString());
				or.setMessage("查询成功");
				or.setStatus(200);
				return or;
			}else {
				or.setMessage(jestResult.getErrorMessage());
				or.setStatus(jestResult.getResponseCode());
				return or;
			}
	}
	/**
	 * fansq 获取id
	 */
	public <K, V> Entry<K, V> getHead(LinkedHashMap<K, V> map) {
        return map.entrySet().iterator().next();
    }
     
	
}
