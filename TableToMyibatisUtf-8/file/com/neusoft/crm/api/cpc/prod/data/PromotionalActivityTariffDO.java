package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义营销资源的促销活动的资费信息

促销活动资费类型主要有：

打折
                                                
 * @实体表  :PROMOTIONAL_ACTIVITY_TARIFF
 */
public class PromotionalActivityTariffDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROMOTIONAL_ACTIVITY_TARIFF_S";

    /**
     * 促销活动资费的标识
     */
    public java.lang.Integer promActiTariffId;

    /**
     * 促销活动资费的名称
     */
    public java.lang.String promActiTariffName;

    /**
     * 促销活动资费的资费说明。
     */
    public java.lang.String tariffDesc;

    /**
     * 促销活动资费的优先级
     */
    public java.lang.Integer priority;

    /**
     * 促销活动的资费类型：主要分为
            。PRC-C-0049
     */
    public java.lang.String tariffType;

    /**
     * 定义是否允许叠加使用优惠券. LOVB=PRC-C-0036
     */
    public java.lang.Integer ifUseCoupon;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 资费的适用地区标识
     */
    public java.lang.Integer lanId;

    /**
     * 普通记录状态.LOVB=PRC-C-0026.
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
     * 设置 促销活动资费的标识
     */
    public void setPromActiTariffId(java.lang.Integer promActiTariffId) {
        this.promActiTariffId = promActiTariffId;
    }

    /**
     * 获取 促销活动资费的标识
     */
    public java.lang.Integer getPromActiTariffId() {
        return this.promActiTariffId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.promActiTariffId = SeqUtils.createIntegerId(ID_SEQ);
         return this.promActiTariffId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 促销活动资费的名称
     */
    public void setPromActiTariffName(java.lang.String promActiTariffName) {
        this.promActiTariffName = promActiTariffName;
    }

    /**
     * 获取 促销活动资费的名称
     */
    public java.lang.String getPromActiTariffName() {
        return this.promActiTariffName;
    }

    /**
     * 设置 促销活动资费的资费说明。
     */
    public void setTariffDesc(java.lang.String tariffDesc) {
        this.tariffDesc = tariffDesc;
    }

    /**
     * 获取 促销活动资费的资费说明。
     */
    public java.lang.String getTariffDesc() {
        return this.tariffDesc;
    }

    /**
     * 设置 促销活动资费的优先级
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 促销活动资费的优先级
     */
    public java.lang.Integer getPriority() {
        return this.priority;
    }

    /**
     * 设置 促销活动的资费类型：主要分为
            。PRC-C-0049
     */
    public void setTariffType(java.lang.String tariffType) {
        this.tariffType = tariffType;
    }

    /**
     * 获取 促销活动的资费类型：主要分为
            。PRC-C-0049
     */
    public java.lang.String getTariffType() {
        return this.tariffType;
    }

    /**
     * 设置 定义是否允许叠加使用优惠券. LOVB=PRC-C-0036
     */
    public void setIfUseCoupon(java.lang.Integer ifUseCoupon) {
        this.ifUseCoupon = ifUseCoupon;
    }

    /**
     * 获取 定义是否允许叠加使用优惠券. LOVB=PRC-C-0036
     */
    public java.lang.Integer getIfUseCoupon() {
        return this.ifUseCoupon;
    }

    /**
     * 设置 生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 资费的适用地区标识
     */
    public void setLanId(java.lang.Integer lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 资费的适用地区标识
     */
    public java.lang.Integer getLanId() {
        return this.lanId;
    }

    /**
     * 设置 普通记录状态.LOVB=PRC-C-0026.
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 普通记录状态.LOVB=PRC-C-0026.
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
