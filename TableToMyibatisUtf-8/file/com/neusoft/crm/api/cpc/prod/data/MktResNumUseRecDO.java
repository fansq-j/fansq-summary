package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:营销资源号码使用记录。数据量太多，独立分表。按照号码、卡分别建一套表。
 * @实体表  :MKT_RES_NUM_USE_REC
 */
public class MktResNumUseRecDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_NUM_USE_REC_S";

    /**
     * 营销资源使用记录ID的标识，主键
     */
    public java.lang.Long mktResNumUseRecId;

    /**
     * 记录营销资源实例ID。
     */
    public java.lang.Long mktResInstId;

    /**
     * 记录营销资源使用对象类型：产品实例，订单项等。LOVB=RES-C-0004
     */
    public java.lang.String objType;

    /**
     * 记录营销资源使用对象ID标示；MKT_RES_OBJ_ID--》_OBJ_ID
     */
    public java.lang.Long objId;

    /**
     * 营销资源库存变动事件标识
     */
    public java.lang.Long mktResEventId;

    /**
     * 记录使用时间。
     */
    public java.util.Date usingTime;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的系统岗位标识。
     */
    public java.lang.Long createPost;

    /**
     * 记录首次创建的组织机构标识。
     */
    public java.lang.Long createOrgId;

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
     * 本地网标识
     */
    public java.lang.Long lanId;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Long regionId;

    /**
     * 设置 营销资源使用记录ID的标识，主键
     */
    public void setMktResNumUseRecId(java.lang.Long mktResNumUseRecId) {
        this.mktResNumUseRecId = mktResNumUseRecId;
    }

    /**
     * 获取 营销资源使用记录ID的标识，主键
     */
    public java.lang.Long getMktResNumUseRecId() {
        return this.mktResNumUseRecId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktResNumUseRecId = SeqUtils.createLongId(ID_SEQ);
         return this.mktResNumUseRecId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录营销资源实例ID。
     */
    public void setMktResInstId(java.lang.Long mktResInstId) {
        this.mktResInstId = mktResInstId;
    }

    /**
     * 获取 记录营销资源实例ID。
     */
    public java.lang.Long getMktResInstId() {
        return this.mktResInstId;
    }

    /**
     * 设置 记录营销资源使用对象类型：产品实例，订单项等。LOVB=RES-C-0004
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录营销资源使用对象类型：产品实例，订单项等。LOVB=RES-C-0004
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 记录营销资源使用对象ID标示；MKT_RES_OBJ_ID--》_OBJ_ID
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 记录营销资源使用对象ID标示；MKT_RES_OBJ_ID--》_OBJ_ID
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 营销资源库存变动事件标识
     */
    public void setMktResEventId(java.lang.Long mktResEventId) {
        this.mktResEventId = mktResEventId;
    }

    /**
     * 获取 营销资源库存变动事件标识
     */
    public java.lang.Long getMktResEventId() {
        return this.mktResEventId;
    }

    /**
     * 设置 记录使用时间。
     */
    public void setUsingTime(java.util.Date usingTime) {
        this.usingTime = usingTime;
    }

    /**
     * 获取 记录使用时间。
     */
    public java.util.Date getUsingTime() {
        return this.usingTime;
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
     * 设置 记录首次创建的系统岗位标识。
     */
    public void setCreatePost(java.lang.Long createPost) {
        this.createPost = createPost;
    }

    /**
     * 获取 记录首次创建的系统岗位标识。
     */
    public java.lang.Long getCreatePost() {
        return this.createPost;
    }

    /**
     * 设置 记录首次创建的组织机构标识。
     */
    public void setCreateOrgId(java.lang.Long createOrgId) {
        this.createOrgId = createOrgId;
    }

    /**
     * 获取 记录首次创建的组织机构标识。
     */
    public java.lang.Long getCreateOrgId() {
        return this.createOrgId;
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
     * 设置 指向公共管理区域标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 指向公共管理区域标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

}
