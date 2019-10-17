package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:帐务定制关系附加属性
 * @实体表  :PROD_INST_ACCT_REL_ATTR
 */
public class ProdInstAcctRelAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_INST_ACCT_REL_ATTR_S";

    /**
     * 帐务定制关系附加属性标识
     */
    public java.lang.Integer prodInstAcctRelAttrId;

    /**
     * 帐务关系标识
            
     */
    public java.lang.Long prodInstAcctRelId;

    /**
     * 记录属性标识。
     */
    public java.lang.Long attrId;

    /**
     * 属性值标识
     */
    public java.lang.Long attrValueId;

    /**
     * 记录属性值。
     */
    public java.lang.String attrValue;

    /**
     * 记录生效时间
     */
    public java.util.Date effDate;

    /**
     * 记录失效时间
     */
    public java.util.Date expDate;

    /**
     * 记录属性的名称。
     */
    public java.lang.String attrName;

    /**
     * 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 状态时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 设置 帐务定制关系附加属性标识
     */
    public void setProdInstAcctRelAttrId(java.lang.Integer prodInstAcctRelAttrId) {
        this.prodInstAcctRelAttrId = prodInstAcctRelAttrId;
    }

    /**
     * 获取 帐务定制关系附加属性标识
     */
    public java.lang.Integer getProdInstAcctRelAttrId() {
        return this.prodInstAcctRelAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.prodInstAcctRelAttrId = SeqUtils.createIntegerId(ID_SEQ);
         return this.prodInstAcctRelAttrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 帐务关系标识
            
     */
    public void setProdInstAcctRelId(java.lang.Long prodInstAcctRelId) {
        this.prodInstAcctRelId = prodInstAcctRelId;
    }

    /**
     * 获取 帐务关系标识
            
     */
    public java.lang.Long getProdInstAcctRelId() {
        return this.prodInstAcctRelId;
    }

    /**
     * 设置 记录属性标识。
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 记录属性标识。
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
    }

    /**
     * 设置 属性值标识
     */
    public void setAttrValueId(java.lang.Long attrValueId) {
        this.attrValueId = attrValueId;
    }

    /**
     * 获取 属性值标识
     */
    public java.lang.Long getAttrValueId() {
        return this.attrValueId;
    }

    /**
     * 设置 记录属性值。
     */
    public void setAttrValue(java.lang.String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * 获取 记录属性值。
     */
    public java.lang.String getAttrValue() {
        return this.attrValue;
    }

    /**
     * 设置 记录生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 记录属性的名称。
     */
    public void setAttrName(java.lang.String attrName) {
        this.attrName = attrName;
    }

    /**
     * 获取 记录属性的名称。
     */
    public java.lang.String getAttrName() {
        return this.attrName;
    }

    /**
     * 设置 记录状态，LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录创建的员工。
            
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工。
            
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录创建的时间。
            
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间。
            
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录修改的员工。
            
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工。
            
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录修改的时间。
            
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间。
            
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
