package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录营销资源仓库之间除上下级以外的其它关系。
 * @实体表  :MKT_RES_STORE_REL
 */
public class MktResStoreRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_STORE_REL_S";

    /**
     * 主键，营销资源仓库关系标识
     */
    public java.lang.Long mktResStoreRelId;

    /**
     * 营销资源仓库标识
     */
    public java.lang.Integer aMktResStoreId;

    /**
     * 营销资源仓库标识
     */
    public java.lang.Integer zMktResStoreId;

    /**
     * 记录营销资源仓库之间的关系,LOVB=RES-C-0014
     */
    public java.lang.String relType;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 限制营销资源仓库关系的范围，LOVB=RES-C-0039
     */
    public java.lang.String relTypeDom;

    /**
     * 限制存在关系的两个营销资源仓库之间的具体的营销资源类别或者营销资源
     */
    public java.lang.Integer relDomId;

    /**
     * 设置 主键，营销资源仓库关系标识
     */
    public void setMktResStoreRelId(java.lang.Long mktResStoreRelId) {
        this.mktResStoreRelId = mktResStoreRelId;
    }

    /**
     * 获取 主键，营销资源仓库关系标识
     */
    public java.lang.Long getMktResStoreRelId() {
        return this.mktResStoreRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktResStoreRelId = SeqUtils.createLongId(ID_SEQ);
         return this.mktResStoreRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 营销资源仓库标识
     */
    public void setAMktResStoreId(java.lang.Integer aMktResStoreId) {
        this.aMktResStoreId = aMktResStoreId;
    }

    /**
     * 获取 营销资源仓库标识
     */
    public java.lang.Integer getAMktResStoreId() {
        return this.aMktResStoreId;
    }

    /**
     * 设置 营销资源仓库标识
     */
    public void setZMktResStoreId(java.lang.Integer zMktResStoreId) {
        this.zMktResStoreId = zMktResStoreId;
    }

    /**
     * 获取 营销资源仓库标识
     */
    public java.lang.Integer getZMktResStoreId() {
        return this.zMktResStoreId;
    }

    /**
     * 设置 记录营销资源仓库之间的关系,LOVB=RES-C-0014
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 记录营销资源仓库之间的关系,LOVB=RES-C-0014
     */
    public java.lang.String getRelType() {
        return this.relType;
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
     * 设置 状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
     * 设置 限制营销资源仓库关系的范围，LOVB=RES-C-0039
     */
    public void setRelTypeDom(java.lang.String relTypeDom) {
        this.relTypeDom = relTypeDom;
    }

    /**
     * 获取 限制营销资源仓库关系的范围，LOVB=RES-C-0039
     */
    public java.lang.String getRelTypeDom() {
        return this.relTypeDom;
    }

    /**
     * 设置 限制存在关系的两个营销资源仓库之间的具体的营销资源类别或者营销资源
     */
    public void setRelDomId(java.lang.Integer relDomId) {
        this.relDomId = relDomId;
    }

    /**
     * 获取 限制存在关系的两个营销资源仓库之间的具体的营销资源类别或者营销资源
     */
    public java.lang.Integer getRelDomId() {
        return this.relDomId;
    }

}
