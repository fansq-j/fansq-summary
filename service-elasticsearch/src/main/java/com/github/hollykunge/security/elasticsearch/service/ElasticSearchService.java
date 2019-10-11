package com.github.hollykunge.security.elasticsearch.service;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import com.github.hollykunge.security.elasticsearch.msg.BaseResponse;
import com.github.hollykunge.security.elasticsearch.msg.ObjectRestResponse;



public interface ElasticSearchService<T>{


	
    public void receiverMessage(T t);
    /**
     * 
     * fansq 获取指定索引信息
     * @param indexName
     * @param typeName
     * @return
     * @throws IOException 
     */
    public BaseResponse getIndexMapping(String indexName, String typeName) throws IOException;
    /**
     * fansq 添加数据
     * @param t
     * @param indexName
     * @param typeName
     * @return
     * @throws IOException 
     */
    public BaseResponse insertOrUpdateDoc(T t,String indexName,String typeName) throws IOException;
    
    /**
     * fansq 批量新增数据   接口已合并
     * @param messageList
     * @param indexName
     * @param typeName
     * @return
     */
    public boolean insertOrUpdateDocList(List<Object> messageList,String indexName,String typeName);
    
    /**
     * fansq 通过rabbitmq插入数据
     * @param objectList
     * @param indexName
     * @param typeName
     * @return
     * @throws IOException 
     */
    public boolean insertOrUpdateDocRabbitmq(List<LinkedHashMap<String, Object>> list) throws IOException;
    /**
     * fansq 添加索引
     * @param indexName
     * @return
     * @throws IOException 
     */
    public BaseResponse createIndex(String indexName) throws IOException;
    /**
     * fansq 删除索引
     * @param indexName
     * @return
     * @throws IOException 
     */
    public BaseResponse deleteIndex(String indexName) throws IOException;
    /**
     * fansq 删除文档 根据文档id
     * @param indexName 索引名称
     * @param typeName 索引类型
     * @param docID 文档id
     * @return
     * @throws IOException 
     */
    public BaseResponse deleteDoc(String indexName,String typeName,String docID) throws IOException;
    /**
     * fansq 通过检索数据删除指定文档数据
     * @param indexName 索引名称
     * @param typeName 索引类型
     * @param docMessage 检索数据
     * @return
     * @throws IOException 
     */
    public BaseResponse deleteDocSearch(String indexName,String typeName,String docMessage) throws IOException;
    
    /**
     * fansq 设置索引别名
     * @param indexName 索引名称
     * @param alias 索引别名
     * @return
     * @throws Exception 
     */
    public BaseResponse addIndexAlias(String indexName,String alias) throws Exception;
    
    /**
     * fansq  模糊全文检索返回检索内容 json格式
     * @param indexName
     * @param typeName
     * @param docMeassge
     * @return
     * @throws Exception 
     */
    public ObjectRestResponse<String> getDocSearch(String indexName ,String typeName,String docMeassge,String from,String size) throws Exception;
    
    /**
     * fansq 
     * 精确分词多条件搜索                                ---已完成   
    	     接口具体使用介绍：
          1.如果为条件按照分词结果精确匹配，例如搜索测试两个字，会将检索测+试的文档内容全部返回,注意 测和试可能并不连着
          2.如果为多条件搜索，和单条件雷同，不过的时候必须满足所有条件才可以
          3.如果查询结果中没有所需内容，原因可能为：取出的条数不足，结果在剩余结果中  
     * @param indexName
     * @param typeName
     * @param docMeassge
     * @return
     * @throws Exception 
     */
    public ObjectRestResponse<String> getPreciseDocSearch(String indexName ,String typeName,T t,Integer from,Integer size) throws Exception;
    
    /**
     * fansq 
     * 精准不分词多条件搜索                             ---已完成   
     	    接口具体使用介绍:
           1.所有条件必须全部匹配，请使用不分词字段，否则查询结果为空
           2.一般情况下 elasticsearch会将 中英文字段全部分词，请在安装elasticsearch时配置分词字段或者指定具体哪些字段不分词
     * @param indexName
     * @param typeName
     * @param t
     * @return
     * @throws Exception 
     */
    public ObjectRestResponse<String> getPreciseAllDocSearch(String indexName ,String typeName,T t,Integer from,Integer size) throws Exception;
    
    /**
     * fansq 精确不分词多条件多值搜索
     * @param indexName
     * @param typeName
     * @param t
     * @param from
     * @param size
     * @return
     * @throws Exception 
     */
    public ObjectRestResponse<String> getNonParticipleMultivaluedDocSearch(String indexName,String typeName,T t,Integer from,Integer size) throws Exception;
    
    /**
     * fansq 模糊不分词多条件搜索
     * @param indexName
     * @param typeName
     * @param t
     * @return
     * @throws Exception 
     */
    public ObjectRestResponse<String> getVagueDocSearch(String indexName,String typeName,T t,Integer from,Integer size) throws Exception;
    //public ObjectRestResponse<String> getSectionDocSearch(String indexName,String typeName,);
		//jr.isSucceeded();  判断是否成功
		//jr.getErrorMessage(); 获取错误内容
}
