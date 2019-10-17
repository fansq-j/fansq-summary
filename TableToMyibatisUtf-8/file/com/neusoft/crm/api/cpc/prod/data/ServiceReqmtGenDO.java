package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述某个服务等级下的所有客户能够享有的服务内容和服务标准。例如：金卡客户可以享受10000号排队时间不超过1分钟的服务。
 * @实体表  :SERVICE_REQMT_GEN
 */
public class ServiceReqmtGenDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SERVICE_REQMT_GEN_S";

    /**
     * 记录通用服务要求标识，作为主键
     */
    public java.lang.Long serviceReqmtGenId;

    /**
     * 记录客户服务等级，如钻石服务客户、金牌服务客户、银牌服务客户等。LOVB=CUS-C-0005。
     */
    public java.lang.String serviceLevel;

    /**
     * 文字描述该项服务等级涉及的服务要求。
     */
    public java.lang.String serviceReqmtDesc;

    /**
     * 记录通用要求的管控对象类型。LOVB=CUS-C-0014。
     */
    public java.lang.String controlObjType;

    /**
     * 对象类型如果是服务提供，对象标识记录服务提供标识；如果是属性，对象标识记录属性标识（参见公共域的属性规格）
     */
    public java.lang.Long controlObjId;

    /**
     * 记录属性值。
     */
    public java.lang.String controlAttrValue;

    /**
     * 记录管控对象的限制类型。LOVB=CUS-C-0010。
     */
    public java.lang.String limitType;

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
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录通用服务要求标识，作为主键
     */
    public void setServiceReqmtGenId(java.lang.Long serviceReqmtGenId) {
        this.serviceReqmtGenId = serviceReqmtGenId;
    }

    /**
     * 获取 记录通用服务要求标识，作为主键
     */
    public java.lang.Long getServiceReqmtGenId() {
        return this.serviceReqmtGenId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.serviceReqmtGenId = SeqUtils.createLongId(ID_SEQ);
         return this.serviceReqmtGenId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录客户服务等级，如钻石服务客户、金牌服务客户、银牌服务客户等。LOVB=CUS-C-0005。
     */
    public void setServiceLevel(java.lang.String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    /**
     * 获取 记录客户服务等级，如钻石服务客户、金牌服务客户、银牌服务客户等。LOVB=CUS-C-0005。
     */
    public java.lang.String getServiceLevel() {
        return this.serviceLevel;
    }

    /**
     * 设置 文字描述该项服务等级涉及的服务要求。
     */
    public void setServiceReqmtDesc(java.lang.String serviceReqmtDesc) {
        this.serviceReqmtDesc = serviceReqmtDesc;
    }

    /**
     * 获取 文字描述该项服务等级涉及的服务要求。
     */
    public java.lang.String getServiceReqmtDesc() {
        return this.serviceReqmtDesc;
    }

    /**
     * 设置 记录通用要求的管控对象类型。LOVB=CUS-C-0014。
     */
    public void setControlObjType(java.lang.String controlObjType) {
        this.controlObjType = controlObjType;
    }

    /**
     * 获取 记录通用要求的管控对象类型。LOVB=CUS-C-0014。
     */
    public java.lang.String getControlObjType() {
        return this.controlObjType;
    }

    /**
     * 设置 对象类型如果是服务提供，对象标识记录服务提供标识；如果是属性，对象标识记录属性标识（参见公共域的属性规格）
     */
    public void setControlObjId(java.lang.Long controlObjId) {
        this.controlObjId = controlObjId;
    }

    /**
     * 获取 对象类型如果是服务提供，对象标识记录服务提供标识；如果是属性，对象标识记录属性标识（参见公共域的属性规格）
     */
    public java.lang.Long getControlObjId() {
        return this.controlObjId;
    }

    /**
     * 设置 记录属性值。
     */
    public void setControlAttrValue(java.lang.String controlAttrValue) {
        this.controlAttrValue = controlAttrValue;
    }

    /**
     * 获取 记录属性值。
     */
    public java.lang.String getControlAttrValue() {
        return this.controlAttrValue;
    }

    /**
     * 设置 记录管控对象的限制类型。LOVB=CUS-C-0010。
     */
    public void setLimitType(java.lang.String limitType) {
        this.limitType = limitType;
    }

    /**
     * 获取 记录管控对象的限制类型。LOVB=CUS-C-0010。
     */
    public java.lang.String getLimitType() {
        return this.limitType;
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
