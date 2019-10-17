package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:使用营销资源的对象,如产品实例，渠道，VIP客户等。对于不同的使用对象，针对不同的营销资源，使用方式可能不同。如对于终端
 * @实体表  :MKT_RES_USE_REC
 */
public class MktResUseRecDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_USE_REC_S";

    /**
     * 营销资源使用记录ID的标识，主键
     */
    public java.lang.Long mktResUseRecId;

    /**
     * 记录营销资源使用对象类型，LOVB=RES-C-0004
     */
    public java.lang.String objType;

    /**
     * 记录营销资源使用对象标识,MKT_RES_OBJECT_ID-->OBJ_ID
     */
    public java.lang.Long objId;

    /**
     * 记录序列化标识：是，否；LOVB=RES-0004
     */
    public java.lang.String orderedFlag;

    /**
     * 营销资源标识，对于有序资源，记录营销资源实例标识，对于无序资源，记录营销资源库存标识。
     */
    public java.lang.Long applyObjId;

    /**
     * 记录使用时间。
     */
    public java.util.Date usingTime;

    /**
     * 记录使用数量。
     */
    public java.lang.Long usedQuantity;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 营销资源库存变动事件标识
     */
    public java.lang.Long mktResEventId;

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
     * 记录终端的使用类型：自备、租用、购买等。LOVB=PRI-C-0010
     */
    public java.lang.String propertyType;

    /**
     * 记录订单项标识。
     */
    public java.lang.Long orderItemId;

    /**
     * 记录营销资源实例的实际销售价格
     */
    public java.lang.Long salesPrice;

    /**
     * 设置 营销资源使用记录ID的标识，主键
     */
    public void setMktResUseRecId(java.lang.Long mktResUseRecId) {
        this.mktResUseRecId = mktResUseRecId;
    }

    /**
     * 获取 营销资源使用记录ID的标识，主键
     */
    public java.lang.Long getMktResUseRecId() {
        return this.mktResUseRecId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktResUseRecId = SeqUtils.createLongId(ID_SEQ);
         return this.mktResUseRecId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录营销资源使用对象类型，LOVB=RES-C-0004
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录营销资源使用对象类型，LOVB=RES-C-0004
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 记录营销资源使用对象标识,MKT_RES_OBJECT_ID-->OBJ_ID
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 记录营销资源使用对象标识,MKT_RES_OBJECT_ID-->OBJ_ID
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 记录序列化标识：是，否；LOVB=RES-0004
     */
    public void setOrderedFlag(java.lang.String orderedFlag) {
        this.orderedFlag = orderedFlag;
    }

    /**
     * 获取 记录序列化标识：是，否；LOVB=RES-0004
     */
    public java.lang.String getOrderedFlag() {
        return this.orderedFlag;
    }

    /**
     * 设置 营销资源标识，对于有序资源，记录营销资源实例标识，对于无序资源，记录营销资源库存标识。
     */
    public void setApplyObjId(java.lang.Long applyObjId) {
        this.applyObjId = applyObjId;
    }

    /**
     * 获取 营销资源标识，对于有序资源，记录营销资源实例标识，对于无序资源，记录营销资源库存标识。
     */
    public java.lang.Long getApplyObjId() {
        return this.applyObjId;
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
     * 设置 记录使用数量。
     */
    public void setUsedQuantity(java.lang.Long usedQuantity) {
        this.usedQuantity = usedQuantity;
    }

    /**
     * 获取 记录使用数量。
     */
    public java.lang.Long getUsedQuantity() {
        return this.usedQuantity;
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
     * 设置 记录营销资源实例的实际销售价格
     */
    public void setSalesPrice(java.lang.Long salesPrice) {
        this.salesPrice = salesPrice;
    }

    /**
     * 获取 记录营销资源实例的实际销售价格
     */
    public java.lang.Long getSalesPrice() {
        return this.salesPrice;
    }

}
