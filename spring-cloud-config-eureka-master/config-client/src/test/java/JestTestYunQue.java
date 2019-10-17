

import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.JestResult;
import io.searchbox.client.config.HttpClientConfig;
import io.searchbox.core.*;
import io.searchbox.indices.CreateIndex;
import io.searchbox.indices.DeleteIndex;
import io.searchbox.indices.mapping.GetMapping;
import io.searchbox.indices.mapping.PutMapping;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JestTestYunQue {
	    private static JestClient jestClient;  
	    private static String indexName = "zz_group_msg_index";
	    private static String typeName = "_doc";
	    private static String elasticIps="http://10.11.24.42:9300";

	    
	    @Test
	    public void testJest() throws Exception {
	    	jestClient = getJestClient();  
	    	//insertBatch();
	    	serach1();
	    	//serach2();
	    	//serach3();
	    	jestClient.close();  
	    }
	    private static  JestClient getJestClient() {  
	    	JestClientFactory factory = new JestClientFactory();  
			factory.setHttpClientConfig(new HttpClientConfig.Builder(elasticIps).connTimeout(60000).readTimeout(60000).multiThreaded(true).build());  
	        return factory.getObject();  
	    }  
	    
	    /**
	     * 全文搜索
	     */
	    public static void serach1() {
			String query ="testID1212";
			try {
				SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder(); 
		    	 searchSourceBuilder.query(QueryBuilders.queryStringQuery(query)); 
		    	 //分页设置
		    	 searchSourceBuilder.from(0).size(2); 
		        //System.out.println("全文搜索查询语句:"+searchSourceBuilder.toString());
				System.out.println("全文搜索返回结果:"+search(jestClient,indexName, typeName, searchSourceBuilder.toString()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	    public static String search(JestClient jestClient,String indexName, String typeName, String query) throws Exception {
			Search search = new Search.Builder(query)
					.addIndex(indexName)
					.addType(typeName)
					.build();
			JestResult jr = jestClient.execute(search);
		        System.out.println("--"+jr.getJsonString());
		        System.out.println("--"+jr.getSourceAsObject(User.class));
		        System.out.println("--"+jr.getSourceAsObjectList(User.class));
			return jr.getSourceAsString();
		}
	    
	    /**
	     * 精确搜索
	     */
	    public static void serach2() {
			try {
				SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder(); 
		    	searchSourceBuilder.query(QueryBuilders.termQuery("age", 24)); 
		    	//System.out.println("精确搜索查询语句:"+searchSourceBuilder.toString());
				System.out.println("精确搜索返回结果:"+search(jestClient,indexName, typeName, searchSourceBuilder.toString()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	    
	    
	    /**
	     * 区间搜索
	     */
	    public static void serach3() {
			String createtm="createtm";
			String from="2016-8-21 06:11:32";
			String to="2018-8-21 06:11:32";
			
			try {
				SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder(); 
		    	searchSourceBuilder.query(QueryBuilders.rangeQuery(createtm).gte(from).lte(to)); 
		    	//System.out.println("区间搜索语句:"+searchSourceBuilder.toString());
				System.out.println("区间搜索返回结果:"+search(jestClient,indexName, typeName, searchSourceBuilder.toString()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	/**
	 * 全文搜索
	 * @param indexName
	 * @param typeName
	 * @param query
	 * @return
	 * @throws Exception
	 */
	
	    
	    /**
	     * 创建索引
	     * @param indexName
	     * @return
	     * @throws Exception
	     */
	    public boolean createIndex(JestClient jestClient,String indexName) throws Exception {  
	        JestResult jr = jestClient.execute(new CreateIndex.Builder(indexName).build());  
	        return jr.isSucceeded();  
	    }  
	      
	    /**
	     * 新增数据
	     * @param indexName
	     * @param typeName
	     * @param source
	     * @return
	     * @throws Exception
	     */
	    public boolean insert(JestClient jestClient,String indexName, String typeName, String source) throws Exception {  
	        PutMapping putMapping = new PutMapping.Builder(indexName, typeName, source).build();  
	        JestResult jr = jestClient.execute(putMapping);  
	        return jr.isSucceeded();  
	    }  
	      
	    
	     /**
	      * 查询数据
	      * @param indexName
	      * @param typeName
	      * @return
	      * @throws Exception
	      */
	    public static String getIndexMapping(JestClient jestClient,String indexName, String typeName) throws Exception {  
	        GetMapping getMapping = new GetMapping.Builder().addIndex(indexName).addType(typeName).build();  
	        JestResult jr =jestClient.execute(getMapping);  
	        return jr.getJsonString();  
	     }  
	      
	    
	    
	   /**
	    * 批量新增数据
	    * @param indexName
	    * @param typeName
	    * @param objs
	    * @return
	    * @throws Exception
	    */
	    public static boolean insertBatch(JestClient jestClient,String indexName, String typeName, List<Object> objs) throws Exception {  
	        Bulk.Builder bulk = new Bulk.Builder().defaultIndex(indexName).defaultType(typeName);  
	        for (Object obj : objs) {  
	            Index index = new Index.Builder(obj).build();  
	             bulk.addAction(index);  
	        }  
	        BulkResult br = jestClient.execute(bulk.build());  
	        return br.isSucceeded();  
	       }  
	      

	      
	      
	    
	   
	      
	   /**
	    * 删除索引
	    * @param indexName
	    * @return
	    * @throws Exception
	    */
	    public boolean delete(JestClient jestClient,String indexName) throws Exception {  
	        JestResult jr = jestClient.execute(new DeleteIndex.Builder(indexName).build());  
	        return jr.isSucceeded();  
	    }  
	      
	   /**
	    * 删除数据
	    * @param indexName
	    * @param typeName
	    * @param id
	    * @return
	    * @throws Exception
	    */
	    public boolean delete(JestClient jestClient,String indexName, String typeName, String id) throws Exception {  
	        DocumentResult dr = jestClient.execute(new Delete.Builder(id).index(indexName).type(typeName).build());  
	        return dr.isSucceeded();  
	    }  
	      
	    
}
