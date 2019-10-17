package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录了营销资源的类别。MKT_RESOURCE_TYPE--》MKT_RES_TYPE
 * @实体表  :MKT_RES_TYPE
 */
public class MktResTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_TYPE_S";

    /**
     * 营销资源CD的标识，主键
     */
    public java.lang.Integer mktResTypeId;

    /**
     * 记录营销资源类别编码，LOVB=RES-0003
     */
    public java.lang.String mktResTypeNbr;

    /**
     * 营销资源类别名称
     */
    public java.lang.String mktResTypeName;

    /**
     * 记录营销资源类别描述。
     */
    public java.lang.String mktResTypeDesc;

    /**
     * 记录序列化标识，以区分有序资源和无序资源。LOVB=RES-0004
     */
    public java.lang.String orderedFlag;

    /**
     * 记录营销资源上级类别CD
     */
    public java.lang.Integer parTypeId;

    /**
     * 记录管理区域标识。
     */
    public java.lang.Long manageRegionId;

    /**
     * 记录生效时间。
     */
    public java.util.Date effDate;

    /**
     * 记录失效日期。
     */
    public java.util.Date expDate;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录营销资源类别的状态，LOVB=PUB-C-0001
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
     * 设置 营销资源CD的标识，主键
     */
    public void setMktResTypeId(java.lang.Integer mktResTypeId) {
        this.mktResTypeId = mktResTypeId;
    }

    /**
     * 获取 营销资源CD的标识，主键
     */
    public java.lang.Integer getMktResTypeId() {
        return this.mktResTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.mktResTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.mktResTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 记录营销资源类别编码，LOVB=RES-0003
     */
    public void setMktResTypeNbr(java.lang.String mktResTypeNbr) {
        this.mktResTypeNbr = mktResTypeNbr;
    }

    /**
     * 获取 记录营销资源类别编码，LOVB=RES-0003
     */
    public java.lang.String getMktResTypeNbr() {
        return this.mktResTypeNbr;
    }

    /**
     * 设置 营销资源类别名称
     */
    public void setMktResTypeName(java.lang.String mktResTypeName) {
        this.mktResTypeName = mktResTypeName;
    }

    /**
     * 获取 营销资源类别名称
     */
    public java.lang.String getMktResTypeName() {
        return this.mktResTypeName;
    }

    /**
     * 设置 记录营销资源类别描述。
     */
    public void setMktResTypeDesc(java.lang.String mktResTypeDesc) {
        this.mktResTypeDesc = mktResTypeDesc;
    }

    /**
     * 获取 记录营销资源类别描述。
     */
    public java.lang.String getMktResTypeDesc() {
        return this.mktResTypeDesc;
    }

    /**
     * 设置 记录序列化标识，以区分有序资源和无序资源。LOVB=RES-0004
     */
    public void setOrderedFlag(java.lang.String orderedFlag) {
        this.orderedFlag = orderedFlag;
    }

    /**
     * 获取 记录序列化标识，以区分有序资源和无序资源。LOVB=RES-0004
     */
    public java.lang.String getOrderedFlag() {
        return this.orderedFlag;
    }

    /**
     * 设置 记录营销资源上级类别CD
     */
    public void setParTypeId(java.lang.Integer parTypeId) {
        this.parTypeId = parTypeId;
    }

    /**
     * 获取 记录营销资源上级类别CD
     */
    public java.lang.Integer getParTypeId() {
        return this.parTypeId;
    }

    /**
     * 设置 记录管理区域标识。
     */
    public void setManageRegionId(java.lang.Long manageRegionId) {
        this.manageRegionId = manageRegionId;
    }

    /**
     * 获取 记录管理区域标识。
     */
    public java.lang.Long getManageRegionId() {
        return this.manageRegionId;
    }

    /**
     * 设置 记录生效时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录生效时间。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录失效日期。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录失效日期。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
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
     * 设置 记录营销资源类别的状态，LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录营销资源类别的状态，LOVB=PUB-C-0001
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
