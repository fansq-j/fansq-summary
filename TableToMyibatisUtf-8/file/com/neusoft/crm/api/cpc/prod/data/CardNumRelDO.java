package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:只记录活卡的信息，即UIM卡实体与号码实体的关系；活卡的调拨只针对卡实例。活卡销售之后触发关系失效。
 * @实体表  :CARD_NUM_REL
 */
public class CardNumRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CARD_NUM_REL_S";

    /**
     * MIN段与号头关联标识
     */
    public java.lang.Integer cardNumRelId;

    /**
     * 营销资源卡实例的标识
     */
    public java.lang.Long mktResCardInstId;

    /**
     * 营销资源号码实例标识。
     */
    public java.lang.Long mktResNumInstId;

    /**
     * 活卡批次标识
     */
    public java.lang.Integer batchId;

    /**
     * 记录适用区域标识。
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录号码归属的本地网。
     */
    public java.lang.Long lanId;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 MIN段与号头关联标识
     */
    public void setCardNumRelId(java.lang.Integer cardNumRelId) {
        this.cardNumRelId = cardNumRelId;
    }

    /**
     * 获取 MIN段与号头关联标识
     */
    public java.lang.Integer getCardNumRelId() {
        return this.cardNumRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.cardNumRelId = SeqUtils.createIntegerId(ID_SEQ);
         return this.cardNumRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 营销资源卡实例的标识
     */
    public void setMktResCardInstId(java.lang.Long mktResCardInstId) {
        this.mktResCardInstId = mktResCardInstId;
    }

    /**
     * 获取 营销资源卡实例的标识
     */
    public java.lang.Long getMktResCardInstId() {
        return this.mktResCardInstId;
    }

    /**
     * 设置 营销资源号码实例标识。
     */
    public void setMktResNumInstId(java.lang.Long mktResNumInstId) {
        this.mktResNumInstId = mktResNumInstId;
    }

    /**
     * 获取 营销资源号码实例标识。
     */
    public java.lang.Long getMktResNumInstId() {
        return this.mktResNumInstId;
    }

    /**
     * 设置 活卡批次标识
     */
    public void setBatchId(java.lang.Integer batchId) {
        this.batchId = batchId;
    }

    /**
     * 获取 活卡批次标识
     */
    public java.lang.Integer getBatchId() {
        return this.batchId;
    }

    /**
     * 设置 记录适用区域标识。
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用区域标识。
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
    }

    /**
     * 设置 记录号码归属的本地网。
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 记录号码归属的本地网。
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

    /**
     * 设置 记录状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录首次创建的员工标识。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间。
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
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
