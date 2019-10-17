package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录触发积分计算的事件类型定义，包括销帐事件、周期事件、一次性事件等。

 * @实体表  :POINT_EVENT_TYPE
 */
public class PointEventTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_EVENT_TYPE_S";

    /**
     * 积分事件类型标识，作为主键
     */
    public java.lang.Integer pointEventTypeId;

    /**
     * 积分事件类型名称
            消费积分事件
            在网积分事件
            信用积分事件
            其它积分事件
     */
    public java.lang.String pointEventTypeName;

    /**
     * 状态，LOVB=PUB-C-0001
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
     * 记录状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 设置 积分事件类型标识，作为主键
     */
    public void setPointEventTypeId(java.lang.Integer pointEventTypeId) {
        this.pointEventTypeId = pointEventTypeId;
    }

    /**
     * 获取 积分事件类型标识，作为主键
     */
    public java.lang.Integer getPointEventTypeId() {
        return this.pointEventTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pointEventTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pointEventTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 积分事件类型名称
            消费积分事件
            在网积分事件
            信用积分事件
            其它积分事件
     */
    public void setPointEventTypeName(java.lang.String pointEventTypeName) {
        this.pointEventTypeName = pointEventTypeName;
    }

    /**
     * 获取 积分事件类型名称
            消费积分事件
            在网积分事件
            信用积分事件
            其它积分事件
     */
    public java.lang.String getPointEventTypeName() {
        return this.pointEventTypeName;
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
