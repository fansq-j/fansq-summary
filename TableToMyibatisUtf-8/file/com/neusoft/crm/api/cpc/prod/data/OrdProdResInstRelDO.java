package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录订单变更的产品实例营销资源实例关系。
 * @实体表  :ORD_PROD_RES_INST_REL
 */
public class OrdProdResInstRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORD_PROD_RES_INST_REL_S";

    /**
     * 记录关系标识，主键。
     */
    public java.lang.Long prodResInstRelId;

    /**
     * 记录产品实例标识，外键。
     */
    public java.lang.Long prodInstId;

    /**
     * 记录产品和营销资源实体区分。1000表示终端类型1100表示卡类型
     */
    public java.lang.String mktResType;

    /**
     * 记录营销资源实例标识，外键。
     */
    public java.lang.Long mktResInstId;

    /**
     * 记录营销资源标识，外键。
     */
    public java.lang.Integer mktResId;

    /**
     * 记录产品实例和营销类资源实例的关联方式:1,产品实例使用营销类资源;2,营销类资源实例作为产品实例
     */
    public java.lang.String relType;

    /**
     * 记录终端的使用类型：自备、租用、购买等。LOVB=PRI-C-0010
     */
    public java.lang.String propertyType;

    /**
     * 记录营销资源数量。
     */
    public java.lang.Integer mktResNum;

    /**
     * 记录数据的行号，主键。
     */
    public java.lang.Long rowId;

    /**
     * 记录订单项标识。
     */
    public java.lang.Long orderItemId;

    /**
     * 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long oldRowId;

    /**
     * 操作类型，新增/修改/删除/保持
     */
    public java.lang.String operType;

    /**
     * 记录数据的状态，分为有效/无效/历史。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
     */
    public java.util.Date statusDate;

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
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 记录订单项版本号。
     */
    public java.lang.Integer verNum;

    /**
     * 设置 记录关系标识，主键。
     */
    public void setProdResInstRelId(java.lang.Long prodResInstRelId) {
        this.prodResInstRelId = prodResInstRelId;
    }

    /**
     * 获取 记录关系标识，主键。
     */
    public java.lang.Long getProdResInstRelId() {
        return this.prodResInstRelId;
    }

    /**
     * 设置 记录产品实例标识，外键。
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 记录产品实例标识，外键。
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 记录产品和营销资源实体区分。1000表示终端类型1100表示卡类型
     */
    public void setMktResType(java.lang.String mktResType) {
        this.mktResType = mktResType;
    }

    /**
     * 获取 记录产品和营销资源实体区分。1000表示终端类型1100表示卡类型
     */
    public java.lang.String getMktResType() {
        return this.mktResType;
    }

    /**
     * 设置 记录营销资源实例标识，外键。
     */
    public void setMktResInstId(java.lang.Long mktResInstId) {
        this.mktResInstId = mktResInstId;
    }

    /**
     * 获取 记录营销资源实例标识，外键。
     */
    public java.lang.Long getMktResInstId() {
        return this.mktResInstId;
    }

    /**
     * 设置 记录营销资源标识，外键。
     */
    public void setMktResId(java.lang.Integer mktResId) {
        this.mktResId = mktResId;
    }

    /**
     * 获取 记录营销资源标识，外键。
     */
    public java.lang.Integer getMktResId() {
        return this.mktResId;
    }

    /**
     * 设置 记录产品实例和营销类资源实例的关联方式:1,产品实例使用营销类资源;2,营销类资源实例作为产品实例
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 记录产品实例和营销类资源实例的关联方式:1,产品实例使用营销类资源;2,营销类资源实例作为产品实例
     */
    public java.lang.String getRelType() {
        return this.relType;
    }

    /**
     * 设置 记录终端的使用类型：自备、租用、购买等。LOVB=PRI-C-0010
     */
    public void setPropertyType(java.lang.String propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * 获取 记录终端的使用类型：自备、租用、购买等。LOVB=PRI-C-0010
     */
    public java.lang.String getPropertyType() {
        return this.propertyType;
    }

    /**
     * 设置 记录营销资源数量。
     */
    public void setMktResNum(java.lang.Integer mktResNum) {
        this.mktResNum = mktResNum;
    }

    /**
     * 获取 记录营销资源数量。
     */
    public java.lang.Integer getMktResNum() {
        return this.mktResNum;
    }

    /**
     * 设置 记录数据的行号，主键。
     */
    public void setRowId(java.lang.Long rowId) {
        this.rowId = rowId;
    }

    /**
     * 获取 记录数据的行号，主键。
     */
    public java.lang.Long getRowId() {
        return this.rowId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.rowId = SeqUtils.createLongId(ID_SEQ);
         return this.rowId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录订单项标识。
     */
    public void setOrderItemId(java.lang.Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 获取 记录订单项标识。
     */
    public java.lang.Long getOrderItemId() {
        return this.orderItemId;
    }

    /**
     * 设置 记录变更或删除记录对应的原始行号。
     */
    public void setOldRowId(java.lang.Long oldRowId) {
        this.oldRowId = oldRowId;
    }

    /**
     * 获取 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long getOldRowId() {
        return this.oldRowId;
    }

    /**
     * 设置 操作类型，新增/修改/删除/保持
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 操作类型，新增/修改/删除/保持
     */
    public java.lang.String getOperType() {
        return this.operType;
    }

    /**
     * 设置 记录数据的状态，分为有效/无效/历史。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录数据的状态，分为有效/无效/历史。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
     * 设置 记录备注信息。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息。
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

    /**
     * 设置 记录订单项版本号。
     */
    public void setVerNum(java.lang.Integer verNum) {
        this.verNum = verNum;
    }

    /**
     * 获取 记录订单项版本号。
     */
    public java.lang.Integer getVerNum() {
        return this.verNum;
    }

}
