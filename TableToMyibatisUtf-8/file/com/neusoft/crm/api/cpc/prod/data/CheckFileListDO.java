package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:采集的对帐文件列表
 * @实体表  :CHECK_FILE_LIST
 */
public class CheckFileListDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CHECK_FILE_LIST_S";

    /**
     * 文件标识主键
     */
    public java.lang.Integer fileId;

    /**
     * 对应对帐文件路径主键
     */
    public java.lang.Integer pathId;

    /**
     * 记录采集or推送的方向，PAY-C-0003
     */
    public java.lang.Integer direction;

    /**
     * 文件存放路径
     */
    public java.lang.String filePath;

    /**
     * 文件名称
     */
    public java.lang.String fileName;

    /**
     * 文件处理日期
     */
    public java.util.Date dealDate;

    /**
     * 状态变更日期
     */
    public java.util.Date statusDate;

    /**
     * 处理状态，PAY-C-0005
     */
    public java.lang.Integer statusCd;

    /**
     * 设置 文件标识主键
     */
    public void setFileId(java.lang.Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * 获取 文件标识主键
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
     * 设置 对应对帐文件路径主键
     */
    public void setPathId(java.lang.Integer pathId) {
        this.pathId = pathId;
    }

    /**
     * 获取 对应对帐文件路径主键
     */
    public java.lang.Integer getPathId() {
        return this.pathId;
    }

    /**
     * 设置 记录采集or推送的方向，PAY-C-0003
     */
    public void setDirection(java.lang.Integer direction) {
        this.direction = direction;
    }

    /**
     * 获取 记录采集or推送的方向，PAY-C-0003
     */
    public java.lang.Integer getDirection() {
        return this.direction;
    }

    /**
     * 设置 文件存放路径
     */
    public void setFilePath(java.lang.String filePath) {
        this.filePath = filePath;
    }

    /**
     * 获取 文件存放路径
     */
    public java.lang.String getFilePath() {
        return this.filePath;
    }

    /**
     * 设置 文件名称
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }

    /**
     * 获取 文件名称
     */
    public java.lang.String getFileName() {
        return this.fileName;
    }

    /**
     * 设置 文件处理日期
     */
    public void setDealDate(java.util.Date dealDate) {
        this.dealDate = dealDate;
    }

    /**
     * 获取 文件处理日期
     */
    public java.util.Date getDealDate() {
        return this.dealDate;
    }

    /**
     * 设置 状态变更日期
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更日期
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 处理状态，PAY-C-0005
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 处理状态，PAY-C-0005
     */
    public java.lang.Integer getStatusCd() {
        return this.statusCd;
    }

}
