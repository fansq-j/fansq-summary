package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:审批处理历史记录表
 * @实体表  :APPROVE_DEAL_HIS
 */
public class ApproveDealHisDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "APPROVE_DEAL_HIS_S";

    /**
     * 序列值，主键
     */
    public java.lang.Long dealHisId;

    /**
     * 对象标识,关联表主键
     */
    public java.lang.Long objId;

    /**
     * 对象类型 记录关联表的标识
     */
    public java.lang.String objType;

    /**
     * 处理人
     */
    public java.lang.Long dealStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 处理时间
     */
    public java.util.Date dealDate;

    /**
     * 处理结果 1通过0不通过
     */
    public java.lang.String dealResult;

    /**
     * 处理意见
     */
    public java.lang.String dealAdvice;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 序列值，主键
     */
    public void setDealHisId(java.lang.Long dealHisId) {
        this.dealHisId = dealHisId;
    }

    /**
     * 获取 序列值，主键
     */
    public java.lang.Long getDealHisId() {
        return this.dealHisId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.dealHisId = SeqUtils.createLongId(ID_SEQ);
         return this.dealHisId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 对象标识,关联表主键
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 对象标识,关联表主键
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 对象类型 记录关联表的标识
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 对象类型 记录关联表的标识
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 处理人
     */
    public void setDealStaff(java.lang.Long dealStaff) {
        this.dealStaff = dealStaff;
    }

    /**
     * 获取 处理人
     */
    public java.lang.Long getDealStaff() {
        return this.dealStaff;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 处理时间
     */
    public void setDealDate(java.util.Date dealDate) {
        this.dealDate = dealDate;
    }

    /**
     * 获取 处理时间
     */
    public java.util.Date getDealDate() {
        return this.dealDate;
    }

    /**
     * 设置 处理结果 1通过0不通过
     */
    public void setDealResult(java.lang.String dealResult) {
        this.dealResult = dealResult;
    }

    /**
     * 获取 处理结果 1通过0不通过
     */
    public java.lang.String getDealResult() {
        return this.dealResult;
    }

    /**
     * 设置 处理意见
     */
    public void setDealAdvice(java.lang.String dealAdvice) {
        this.dealAdvice = dealAdvice;
    }

    /**
     * 获取 处理意见
     */
    public java.lang.String getDealAdvice() {
        return this.dealAdvice;
    }

    /**
     * 设置 备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
