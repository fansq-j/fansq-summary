package com.neusoft.crm.common.persistence;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * DAO支持类实现
 */
public interface CrudDao<T> extends BaseDao {
	  /**
     * 根据主键查询单个DO
     */
    public int count(T t);
    
    /**
     * 根据主键查询单个DO
     */
    public T queryById(Serializable id);
    
    /**
     *根据传入的T对象查询DO列表
     */
    public List<T> queryList(T t);
    
    /**
     *新增记录
     */
    public int insert(T t);
   
    /**
     *批量新增记录
     */
    public int[][] batchInsert(List<T> t);
    
    /**
     *新增记录(为空的字段,不写入)
     */
    public int insertSelective(T t);
    
    /**
     *根据主键删除记录
     */
    public int deleteById(Serializable id);
    
    /**
     *删除记录
     */
    public int delete(T t);

    /**
     *根据主键更新记录
     */
    public int updateById(T t);
    
    /**
     *根据condition条件查询记录,将其更新为record中的具体值
     */
    public int updateBySelective(@Param("record") T record,@Param("condition") T condition);
  
    //将某个字段更新为null
}