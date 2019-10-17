package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录积分类型组成员构成，积分类型组成员由积分类型组成。
 * @实体表  :POINT_TYPE_GROUP_MBR
 */
public class PointTypeGroupMbrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_TYPE_GROUP_MBR_S";

    /**
     * 积分类型组成员标识，作为主键
     */
    public java.lang.Integer pointTypeGroupMbrId;

    /**
     * 积分类型组标识，作为外键，指向积分类型组实体
     */
    public java.lang.Integer pointTypeGroupId;

    /**
     * 积分类型标识，作为外键，指向积分类型实体
     */
    public java.lang.Integer pointTypeId;

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
     * 状态，LOVB=PUB-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 设置 积分类型组成员标识，作为主键
     */
    public void setPointTypeGroupMbrId(java.lang.Integer pointTypeGroupMbrId) {
        this.pointTypeGroupMbrId = pointTypeGroupMbrId;
    }

    /**
     * 获取 积分类型组成员标识，作为主键
     */
    public java.lang.Integer getPointTypeGroupMbrId() {
        return this.pointTypeGroupMbrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pointTypeGroupMbrId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pointTypeGroupMbrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 积分类型组标识，作为外键，指向积分类型组实体
     */
    public void setPointTypeGroupId(java.lang.Integer pointTypeGroupId) {
        this.pointTypeGroupId = pointTypeGroupId;
    }

    /**
     * 获取 积分类型组标识，作为外键，指向积分类型组实体
     */
    public java.lang.Integer getPointTypeGroupId() {
        return this.pointTypeGroupId;
    }

    /**
     * 设置 积分类型标识，作为外键，指向积分类型实体
     */
    public void setPointTypeId(java.lang.Integer pointTypeId) {
        this.pointTypeId = pointTypeId;
    }

    /**
     * 获取 积分类型标识，作为外键，指向积分类型实体
     */
    public java.lang.Integer getPointTypeId() {
        return this.pointTypeId;
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

    /**
     * 设置 状态，LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态，LOVB=PUB-C-0001
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

}
