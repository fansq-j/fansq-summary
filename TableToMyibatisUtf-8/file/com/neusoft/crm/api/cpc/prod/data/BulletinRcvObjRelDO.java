package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述公告的接收对象的信息，比如公告的接收对象是所有人、某个员工、某个岗位、某个组织等。
 * @实体表  :BULLETIN_RCV_OBJ_REL
 */
public class BulletinRcvObjRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BULLETIN_RCV_OBJ_REL_S";

    /**
     * 记录公告接收信息主键
     */
    public java.lang.Long bulletinRcvObjRelId;

    /**
     * 记录公告的主键
     */
    public java.lang.Long bulletinId;

    /**
     * 记录接收公告的对象类型，包括所有人、组织、员工、岗位，如果是某个本地网，可以通过选择某个本地网的关联的组织来限制，LOVB=PUB-C-0015
     */
    public java.lang.String rcvType;

    /**
     * 记录接收对象标识，如果类型是所有人，置空该字段
     */
    public java.lang.Long rcvId;

    /**
     * 记录状态。LOVB=PUB-C-0001
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
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 状态修改的时间
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
     * 设置 记录公告接收信息主键
     */
    public void setBulletinRcvObjRelId(java.lang.Long bulletinRcvObjRelId) {
        this.bulletinRcvObjRelId = bulletinRcvObjRelId;
    }

    /**
     * 获取 记录公告接收信息主键
     */
    public java.lang.Long getBulletinRcvObjRelId() {
        return this.bulletinRcvObjRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.bulletinRcvObjRelId = SeqUtils.createLongId(ID_SEQ);
         return this.bulletinRcvObjRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录公告的主键
     */
    public void setBulletinId(java.lang.Long bulletinId) {
        this.bulletinId = bulletinId;
    }

    /**
     * 获取 记录公告的主键
     */
    public java.lang.Long getBulletinId() {
        return this.bulletinId;
    }

    /**
     * 设置 记录接收公告的对象类型，包括所有人、组织、员工、岗位，如果是某个本地网，可以通过选择某个本地网的关联的组织来限制，LOVB=PUB-C-0015
     */
    public void setRcvType(java.lang.String rcvType) {
        this.rcvType = rcvType;
    }

    /**
     * 获取 记录接收公告的对象类型，包括所有人、组织、员工、岗位，如果是某个本地网，可以通过选择某个本地网的关联的组织来限制，LOVB=PUB-C-0015
     */
    public java.lang.String getRcvType() {
        return this.rcvType;
    }

    /**
     * 设置 记录接收对象标识，如果类型是所有人，置空该字段
     */
    public void setRcvId(java.lang.Long rcvId) {
        this.rcvId = rcvId;
    }

    /**
     * 获取 记录接收对象标识，如果类型是所有人，置空该字段
     */
    public java.lang.Long getRcvId() {
        return this.rcvId;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001
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
     * 设置 记录创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态修改的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间
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
