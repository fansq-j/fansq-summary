package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:1.记录仓库与组织关系。仓库与组织下的员工的权限关系在员工子域配置。
2.修改实体“仓库与组织关系”的名称为
 * @实体表  :MKT_RES_STORE_OBJ_REL
 */
public class MktResStoreObjRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_STORE_OBJ_REL_S";

    /**
     * 记录仓库与使用对象关系标识。
     */
    public java.lang.Long mktResStoreObjRelId;

    /**
     * 营销资源仓库标识
     */
    public java.lang.Integer mktResStoreId;

    /**
     * 记录仓库的使用对象类型，LOVB=RES-C-0025
     */
    public java.lang.String objType;

    /**
     * 记录使用对象标识，组织标识，销售品标识，员工标识，系统标识等等。20150421。
     */
    public java.lang.Long objId;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Long regionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 是否默认使用对象，区分一个仓库可以关联多个使用对象，但是要区分是否默认的.LOVB=PUB-C-0006
     */
    public java.lang.Integer isDefault;

    /**
     * 限制能够使用的营销资源类别、营销资源，或者所有，LOVB=RES-C-0038
     */
    public java.lang.String useMktType;

    /**
     * 限制使用的具体的营销资源类别标识或者营销资源标识
     */
    public java.lang.Integer useMktId;

    /**
     * 设置 记录仓库与使用对象关系标识。
     */
    public void setMktResStoreObjRelId(java.lang.Long mktResStoreObjRelId) {
        this.mktResStoreObjRelId = mktResStoreObjRelId;
    }

    /**
     * 获取 记录仓库与使用对象关系标识。
     */
    public java.lang.Long getMktResStoreObjRelId() {
        return this.mktResStoreObjRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktResStoreObjRelId = SeqUtils.createLongId(ID_SEQ);
         return this.mktResStoreObjRelId;
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
    public void setMktResStoreId(java.lang.Integer mktResStoreId) {
        this.mktResStoreId = mktResStoreId;
    }

    /**
     * 获取 营销资源仓库标识
     */
    public java.lang.Integer getMktResStoreId() {
        return this.mktResStoreId;
    }

    /**
     * 设置 记录仓库的使用对象类型，LOVB=RES-C-0025
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录仓库的使用对象类型，LOVB=RES-C-0025
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 记录使用对象标识，组织标识，销售品标识，员工标识，系统标识等等。20150421。
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 记录使用对象标识，组织标识，销售品标识，员工标识，系统标识等等。20150421。
     */
    public java.lang.Long getObjId() {
        return this.objId;
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

    /**
     * 设置 是否默认使用对象，区分一个仓库可以关联多个使用对象，但是要区分是否默认的.LOVB=PUB-C-0006
     */
    public void setIsDefault(java.lang.Integer isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 获取 是否默认使用对象，区分一个仓库可以关联多个使用对象，但是要区分是否默认的.LOVB=PUB-C-0006
     */
    public java.lang.Integer getIsDefault() {
        return this.isDefault;
    }

    /**
     * 设置 限制能够使用的营销资源类别、营销资源，或者所有，LOVB=RES-C-0038
     */
    public void setUseMktType(java.lang.String useMktType) {
        this.useMktType = useMktType;
    }

    /**
     * 获取 限制能够使用的营销资源类别、营销资源，或者所有，LOVB=RES-C-0038
     */
    public java.lang.String getUseMktType() {
        return this.useMktType;
    }

    /**
     * 设置 限制使用的具体的营销资源类别标识或者营销资源标识
     */
    public void setUseMktId(java.lang.Integer useMktId) {
        this.useMktId = useMktId;
    }

    /**
     * 获取 限制使用的具体的营销资源类别标识或者营销资源标识
     */
    public java.lang.Integer getUseMktId() {
        return this.useMktId;
    }

}
