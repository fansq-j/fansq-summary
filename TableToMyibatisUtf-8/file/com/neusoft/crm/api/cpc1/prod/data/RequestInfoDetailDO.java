package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录了需求申请单信息
 * @实体表  :REQUEST_INFO_DETAIL
 */
public class RequestInfoDetailDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "REQUEST_INFO_DETAIL_S";

    /**
     * 需求申请单实例标识ID，主键
     */
    public java.lang.Integer requestTemplateInstId;

    /**
     * 批次编码
     */
    public java.lang.String batchNo;

    /**
     * 申请单名称
     */
    public java.lang.String name;

    /**
     * 申请单描述
     */
    public java.lang.String desc;

    /**
     * 发起部门
     */
    public java.lang.String deptCode;

    /**
     * 联系人
     */
    public java.lang.String contName;

    /**
     * 联系电话
     */
    public java.lang.String contTele;

    /**
     * 记录生效时间。
     */
    public java.util.Date createDate;

    /**
     * 完成时间
     */
    public java.util.Date finishDate;

    /**
     * 预计完成时间
     */
    public java.util.Date expectFinishDate;

    /**
     * 需求单类型 销售品：10 产品;11 销售品；12 流量规则; 13目录
     */
    public java.lang.String requestType;

    /**
     * 操作类型，A 新增、M 变更
     */
    public java.lang.String actionType;

    /**
     * 需求来源 1 省分需求单 2 集团下发需求单
     */
    public java.lang.String requestSource;

    /**
     * 集团下发需求单Id
     */
    public java.lang.Integer grpRequestTemplateInstId;

    /**
     * 申请对象类型 销售品：10 A类 ;11 B类 ; 12 C类
     */
    public java.lang.String requestObjType;

    /**
     * 发展预测
     */
    public java.lang.String developPrediction;

    /**
     * 状态 1000 未发起 1100 进行中 1200 已完成
     */
    public java.lang.String statusCd;

    /**
     * 政企销售品 0 否 1是
     */
    public java.lang.String ifGovernment;

    /**
     * 文件名称
     */
    public java.lang.String fileName;

    /**
     * 文件路径
     */
    public java.lang.String filePath;

    /**
     * 扩展字段1
     */
    public java.lang.String exp1;

    /**
     * 扩展字段2
     */
    public java.lang.String exp2;

    /**
     * 设置 需求申请单实例标识ID，主键
     */
    public void setRequestTemplateInstId(java.lang.Integer requestTemplateInstId) {
        this.requestTemplateInstId = requestTemplateInstId;
    }

    /**
     * 获取 需求申请单实例标识ID，主键
     */
    public java.lang.Integer getRequestTemplateInstId() {
        return this.requestTemplateInstId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.requestTemplateInstId = SeqUtils.createIntegerId(ID_SEQ);
         return this.requestTemplateInstId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 批次编码
     */
    public void setBatchNo(java.lang.String batchNo) {
        this.batchNo = batchNo;
    }

    /**
     * 获取 批次编码
     */
    public java.lang.String getBatchNo() {
        return this.batchNo;
    }

    /**
     * 设置 申请单名称
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * 获取 申请单名称
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * 设置 申请单描述
     */
    public void setDesc(java.lang.String desc) {
        this.desc = desc;
    }

    /**
     * 获取 申请单描述
     */
    public java.lang.String getDesc() {
        return this.desc;
    }

    /**
     * 设置 发起部门
     */
    public void setDeptCode(java.lang.String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * 获取 发起部门
     */
    public java.lang.String getDeptCode() {
        return this.deptCode;
    }

    /**
     * 设置 联系人
     */
    public void setContName(java.lang.String contName) {
        this.contName = contName;
    }

    /**
     * 获取 联系人
     */
    public java.lang.String getContName() {
        return this.contName;
    }

    /**
     * 设置 联系电话
     */
    public void setContTele(java.lang.String contTele) {
        this.contTele = contTele;
    }

    /**
     * 获取 联系电话
     */
    public java.lang.String getContTele() {
        return this.contTele;
    }

    /**
     * 设置 记录生效时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录生效时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 完成时间
     */
    public void setFinishDate(java.util.Date finishDate) {
        this.finishDate = finishDate;
    }

    /**
     * 获取 完成时间
     */
    public java.util.Date getFinishDate() {
        return this.finishDate;
    }

    /**
     * 设置 预计完成时间
     */
    public void setExpectFinishDate(java.util.Date expectFinishDate) {
        this.expectFinishDate = expectFinishDate;
    }

    /**
     * 获取 预计完成时间
     */
    public java.util.Date getExpectFinishDate() {
        return this.expectFinishDate;
    }

    /**
     * 设置 需求单类型 销售品：10 产品;11 销售品；12 流量规则; 13目录
     */
    public void setRequestType(java.lang.String requestType) {
        this.requestType = requestType;
    }

    /**
     * 获取 需求单类型 销售品：10 产品;11 销售品；12 流量规则; 13目录
     */
    public java.lang.String getRequestType() {
        return this.requestType;
    }

    /**
     * 设置 操作类型，A 新增、M 变更
     */
    public void setActionType(java.lang.String actionType) {
        this.actionType = actionType;
    }

    /**
     * 获取 操作类型，A 新增、M 变更
     */
    public java.lang.String getActionType() {
        return this.actionType;
    }

    /**
     * 设置 需求来源 1 省分需求单 2 集团下发需求单
     */
    public void setRequestSource(java.lang.String requestSource) {
        this.requestSource = requestSource;
    }

    /**
     * 获取 需求来源 1 省分需求单 2 集团下发需求单
     */
    public java.lang.String getRequestSource() {
        return this.requestSource;
    }

    /**
     * 设置 集团下发需求单Id
     */
    public void setGrpRequestTemplateInstId(java.lang.Integer grpRequestTemplateInstId) {
        this.grpRequestTemplateInstId = grpRequestTemplateInstId;
    }

    /**
     * 获取 集团下发需求单Id
     */
    public java.lang.Integer getGrpRequestTemplateInstId() {
        return this.grpRequestTemplateInstId;
    }

    /**
     * 设置 申请对象类型 销售品：10 A类 ;11 B类 ; 12 C类
     */
    public void setRequestObjType(java.lang.String requestObjType) {
        this.requestObjType = requestObjType;
    }

    /**
     * 获取 申请对象类型 销售品：10 A类 ;11 B类 ; 12 C类
     */
    public java.lang.String getRequestObjType() {
        return this.requestObjType;
    }

    /**
     * 设置 发展预测
     */
    public void setDevelopPrediction(java.lang.String developPrediction) {
        this.developPrediction = developPrediction;
    }

    /**
     * 获取 发展预测
     */
    public java.lang.String getDevelopPrediction() {
        return this.developPrediction;
    }

    /**
     * 设置 状态 1000 未发起 1100 进行中 1200 已完成
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态 1000 未发起 1100 进行中 1200 已完成
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 政企销售品 0 否 1是
     */
    public void setIfGovernment(java.lang.String ifGovernment) {
        this.ifGovernment = ifGovernment;
    }

    /**
     * 获取 政企销售品 0 否 1是
     */
    public java.lang.String getIfGovernment() {
        return this.ifGovernment;
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
     * 设置 扩展字段1
     */
    public void setExp1(java.lang.String exp1) {
        this.exp1 = exp1;
    }

    /**
     * 获取 扩展字段1
     */
    public java.lang.String getExp1() {
        return this.exp1;
    }

    /**
     * 设置 扩展字段2
     */
    public void setExp2(java.lang.String exp2) {
        this.exp2 = exp2;
    }

    /**
     * 获取 扩展字段2
     */
    public java.lang.String getExp2() {
        return this.exp2;
    }

}
