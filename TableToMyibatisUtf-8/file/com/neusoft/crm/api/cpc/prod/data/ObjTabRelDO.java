package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述业务对象与实例表的关联。
 * @实体表  :OBJ_TAB_REL
 */
public class ObjTabRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OBJ_TAB_REL_S";

    /**
     * 记录对象与表关系主键
     */
    public java.lang.Long relId;

    /**
     * 记录表标识
     */
    public java.lang.Long tabId;

    /**
     * 记录对象类型，LOVB=PUB-C-0003
     */
    public java.lang.String objType;

    /**
     * 记录对象标识
     */
    public java.lang.Long objId;

    /**
     * 记录版本号
     */
    public java.lang.Integer verNum;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录的创建员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录的修改员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录的创建时间
     */
    public java.util.Date createDate;

    /**
     * 状态的修改时间
     */
    public java.util.Date statusDate;

    /**
     * 记录的修改时间
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录对象与表关系主键
     */
    public void setRelId(java.lang.Long relId) {
        this.relId = relId;
    }

    /**
     * 获取 记录对象与表关系主键
     */
    public java.lang.Long getRelId() {
        return this.relId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.relId = SeqUtils.createLongId(ID_SEQ);
         return this.relId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录表标识
     */
    public void setTabId(java.lang.Long tabId) {
        this.tabId = tabId;
    }

    /**
     * 获取 记录表标识
     */
    public java.lang.Long getTabId() {
        return this.tabId;
    }

    /**
     * 设置 记录对象类型，LOVB=PUB-C-0003
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录对象类型，LOVB=PUB-C-0003
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 记录对象标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 记录对象标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 记录版本号
     */
    public void setVerNum(java.lang.Integer verNum) {
        this.verNum = verNum;
    }

    /**
     * 获取 记录版本号
     */
    public java.lang.Integer getVerNum() {
        return this.verNum;
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
     * 设置 记录的创建员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录的创建员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录的修改员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录的修改员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录的创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录的创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态的修改时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态的修改时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录的修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录的修改时间
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

}
