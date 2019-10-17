package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义佣金进行定价的过程中所牵涉的对定价有影响的数据实体的相关参照属性，可以是（但不限于）产品、销售品、客户协议、帐户、计
 * @实体表  :SETT_OWNER_ATTR
 */
public class SettOwnerAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SETT_OWNER_ATTR_S";

    /**
     * 属主属性标识
     */
    public java.lang.Integer settOwnerAttrId;

    /**
     * 规则标识,主健
     */
    public java.lang.String settOwnerAttrName;

    /**
     * 属主属性描述
     */
    public java.lang.String settOwnerAttrDesc;

    /**
     * PRC-C-0060：1表示复杂因子计算的专用中间因子，0表示非中间因子
     */
    public java.lang.Integer attrFlag;

    /**
     * LOVB=PRC-C-0059
            1整型,2数值型,3字符型
     */
    public java.lang.Integer attrDataType;

    /**
     * 因子分类标识
     */
    public java.lang.Integer attrClassId;

    /**
     * LOVB=PRC-C-0026
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
     * 设置 属主属性标识
     */
    public void setSettOwnerAttrId(java.lang.Integer settOwnerAttrId) {
        this.settOwnerAttrId = settOwnerAttrId;
    }

    /**
     * 获取 属主属性标识
     */
    public java.lang.Integer getSettOwnerAttrId() {
        return this.settOwnerAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.settOwnerAttrId = SeqUtils.createIntegerId(ID_SEQ);
         return this.settOwnerAttrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 规则标识,主健
     */
    public void setSettOwnerAttrName(java.lang.String settOwnerAttrName) {
        this.settOwnerAttrName = settOwnerAttrName;
    }

    /**
     * 获取 规则标识,主健
     */
    public java.lang.String getSettOwnerAttrName() {
        return this.settOwnerAttrName;
    }

    /**
     * 设置 属主属性描述
     */
    public void setSettOwnerAttrDesc(java.lang.String settOwnerAttrDesc) {
        this.settOwnerAttrDesc = settOwnerAttrDesc;
    }

    /**
     * 获取 属主属性描述
     */
    public java.lang.String getSettOwnerAttrDesc() {
        return this.settOwnerAttrDesc;
    }

    /**
     * 设置 PRC-C-0060：1表示复杂因子计算的专用中间因子，0表示非中间因子
     */
    public void setAttrFlag(java.lang.Integer attrFlag) {
        this.attrFlag = attrFlag;
    }

    /**
     * 获取 PRC-C-0060：1表示复杂因子计算的专用中间因子，0表示非中间因子
     */
    public java.lang.Integer getAttrFlag() {
        return this.attrFlag;
    }

    /**
     * 设置 LOVB=PRC-C-0059
            1整型,2数值型,3字符型
     */
    public void setAttrDataType(java.lang.Integer attrDataType) {
        this.attrDataType = attrDataType;
    }

    /**
     * 获取 LOVB=PRC-C-0059
            1整型,2数值型,3字符型
     */
    public java.lang.Integer getAttrDataType() {
        return this.attrDataType;
    }

    /**
     * 设置 因子分类标识
     */
    public void setAttrClassId(java.lang.Integer attrClassId) {
        this.attrClassId = attrClassId;
    }

    /**
     * 获取 因子分类标识
     */
    public java.lang.Integer getAttrClassId() {
        return this.attrClassId;
    }

    /**
     * 设置 LOVB=PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PRC-C-0026
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
