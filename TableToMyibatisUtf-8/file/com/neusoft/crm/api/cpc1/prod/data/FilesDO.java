package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:文件存储
 * @实体表  :FILES
 */
public class FilesDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "FILES_S";

    /**
     * 主键
     */
    public java.lang.Integer fileId;

    /**
     * 文件名
     */
    public java.lang.String fileName;

    /**
     * 文件路径
     */
    public java.lang.String filePath;

    /**
     * 备用1
     */
    public java.lang.String exp1;

    /**
     * 备用2
     */
    public java.lang.String exp2;

    /**
     * 设置 主键
     */
    public void setFileId(java.lang.Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Integer getFileId() {
        return this.fileId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.fileId = SeqUtils.createIntegerId(ID_SEQ);
         return this.fileId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 文件名
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }

    /**
     * 获取 文件名
     */
    public java.lang.String getFileName() {
        return this.fileName;
    }

    /**
     * 设置 文件路径
     */
    public void setFilePath(java.lang.String filePath) {
        this.filePath = filePath;
    }

    /**
     * 获取 文件路径
     */
    public java.lang.String getFilePath() {
        return this.filePath;
    }

    /**
     * 设置 备用1
     */
    public void setExp1(java.lang.String exp1) {
        this.exp1 = exp1;
    }

    /**
     * 获取 备用1
     */
    public java.lang.String getExp1() {
        return this.exp1;
    }

    /**
     * 设置 备用2
     */
    public void setExp2(java.lang.String exp2) {
        this.exp2 = exp2;
    }

    /**
     * 获取 备用2
     */
    public java.lang.String getExp2() {
        return this.exp2;
    }

}
