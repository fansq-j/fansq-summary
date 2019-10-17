package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述客户化套餐类型同销售品的关系。
 * @实体表  :BILL_OFFER_TYPE_OFFER_REL
 */
public class BillOfferTypeOfferRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BILL_OFFER_TYPE_OFFER_REL_S";

    /**
     * 记录标识
     */
    public java.lang.Integer recordId;

    /**
     * 套餐类型标识
     */
    public java.lang.Integer preferTypeId;

    /**
     * 套餐商品规格标识
     */
    public java.lang.Integer preferSpecId;

    /**
     * 套餐商品规格名称
     */
    public java.lang.String preferSpecName;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

    /**
     * LOVB=ACC-C-0044
     */
    public java.lang.Integer ifPayYear;

    /**
     * LOVB=ACC-C-0044
     */
    public java.lang.Integer ifShowMember;

    /**
     * 显示优先级
     */
    public java.lang.Integer preferTypePrintPriority;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 记录状态。LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 记录标识
     */
    public void setRecordId(java.lang.Integer recordId) {
        this.recordId = recordId;
    }

    /**
     * 获取 记录标识
     */
    public java.lang.Integer getRecordId() {
        return this.recordId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.recordId = SeqUtils.createIntegerId(ID_SEQ);
         return this.recordId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 套餐类型标识
     */
    public void setPreferTypeId(java.lang.Integer preferTypeId) {
        this.preferTypeId = preferTypeId;
    }

    /**
     * 获取 套餐类型标识
     */
    public java.lang.Integer getPreferTypeId() {
        return this.preferTypeId;
    }

    /**
     * 设置 套餐商品规格标识
     */
    public void setPreferSpecId(java.lang.Integer preferSpecId) {
        this.preferSpecId = preferSpecId;
    }

    /**
     * 获取 套餐商品规格标识
     */
    public java.lang.Integer getPreferSpecId() {
        return this.preferSpecId;
    }

    /**
     * 设置 套餐商品规格名称
     */
    public void setPreferSpecName(java.lang.String preferSpecName) {
        this.preferSpecName = preferSpecName;
    }

    /**
     * 获取 套餐商品规格名称
     */
    public java.lang.String getPreferSpecName() {
        return this.preferSpecName;
    }

    /**
     * 设置 本地网标识
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 本地网标识
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

    /**
     * 设置 LOVB=ACC-C-0044
     */
    public void setIfPayYear(java.lang.Integer ifPayYear) {
        this.ifPayYear = ifPayYear;
    }

    /**
     * 获取 LOVB=ACC-C-0044
     */
    public java.lang.Integer getIfPayYear() {
        return this.ifPayYear;
    }

    /**
     * 设置 LOVB=ACC-C-0044
     */
    public void setIfShowMember(java.lang.Integer ifShowMember) {
        this.ifShowMember = ifShowMember;
    }

    /**
     * 获取 LOVB=ACC-C-0044
     */
    public java.lang.Integer getIfShowMember() {
        return this.ifShowMember;
    }

    /**
     * 设置 显示优先级
     */
    public void setPreferTypePrintPriority(java.lang.Integer preferTypePrintPriority) {
        this.preferTypePrintPriority = preferTypePrintPriority;
    }

    /**
     * 获取 显示优先级
     */
    public java.lang.Integer getPreferTypePrintPriority() {
        return this.preferTypePrintPriority;
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

    /**
     * 设置 记录状态。LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=ACC-C-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
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
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
