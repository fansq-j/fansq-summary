package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义营销资源的促销活动

促销活动类型主要有：
普适
个性
 * @实体表  :PROMOTIONAL_ACTIVITY
 */
public class PromotionalActivityDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROMOTIONAL_ACTIVITY_S";

    /**
     * 促销活动标识，主键
     */
    public java.lang.Integer promActiId;

    /**
     * 促销活动的名称
     */
    public java.lang.String promActiName;

    /**
     * 促销活动的资费说明。
     */
    public java.lang.String pricingDesc;

    /**
     * 促销活动的优先级
     */
    public java.lang.Integer priority;

    /**
     * LOVB=PRC-C-0047
     */
    public java.lang.String actiType;

    /**
     * 促销活动生效时间
     */
    public java.util.Date effDate;

    /**
     * 促销活动失效时间
     */
    public java.util.Date expDate;

    /**
     * 促销活动适用的本地网
     */
    public java.lang.Integer lanId;

    /**
     * 普通记录状态.PRC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 记录创建员工号
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改员工号
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建时间
     */
    public java.util.Date createDate;

    /**
     * 记录状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 促销活动标识，主键
     */
    public void setPromActiId(java.lang.Integer promActiId) {
        this.promActiId = promActiId;
    }

    /**
     * 获取 促销活动标识，主键
     */
    public java.lang.Integer getPromActiId() {
        return this.promActiId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.promActiId = SeqUtils.createIntegerId(ID_SEQ);
         return this.promActiId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 促销活动的名称
     */
    public void setPromActiName(java.lang.String promActiName) {
        this.promActiName = promActiName;
    }

    /**
     * 获取 促销活动的名称
     */
    public java.lang.String getPromActiName() {
        return this.promActiName;
    }

    /**
     * 设置 促销活动的资费说明。
     */
    public void setPricingDesc(java.lang.String pricingDesc) {
        this.pricingDesc = pricingDesc;
    }

    /**
     * 获取 促销活动的资费说明。
     */
    public java.lang.String getPricingDesc() {
        return this.pricingDesc;
    }

    /**
     * 设置 促销活动的优先级
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 促销活动的优先级
     */
    public java.lang.Integer getPriority() {
        return this.priority;
    }

    /**
     * 设置 LOVB=PRC-C-0047
     */
    public void setActiType(java.lang.String actiType) {
        this.actiType = actiType;
    }

    /**
     * 获取 LOVB=PRC-C-0047
     */
    public java.lang.String getActiType() {
        return this.actiType;
    }

    /**
     * 设置 促销活动生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 促销活动生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 促销活动失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 促销活动失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 促销活动适用的本地网
     */
    public void setLanId(java.lang.Integer lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 促销活动适用的本地网
     */
    public java.lang.Integer getLanId() {
        return this.lanId;
    }

    /**
     * 设置 普通记录状态.PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 普通记录状态.PRC-C-0026
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建员工号
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建员工号
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改员工号
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改员工号
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
