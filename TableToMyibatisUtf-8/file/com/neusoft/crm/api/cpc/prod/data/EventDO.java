package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:事件指在用户交互行为发生时,被采集并封装的信息。
记录事件的基本信息，包含事件名称、事件描述、触点地址、触点
 * @实体表  :EVENT
 */
public class EventDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EVENT_S";

    /**
     * 事件主键标识
     */
    public java.lang.Long eventId;

    /**
     * 接口配置标识，主键标识
     */
    public java.lang.Long interfaceCfgId;

    /**
     * 记录事件的编码信息
     */
    public java.lang.String eventNbr;

    /**
     * 记录事件的名称
     */
    public java.lang.String eventName;

    /**
     * 记录事件的映射地址，事件识别时可通过这个映身地址来适配触点事件，可以是URL地址，APP的类包名或其它识别编码
     */
    public java.lang.String evtMappedAddr;

    /**
     * 记录事件的映射匹配IP地址，事件识别可通过匹配IP地址进行匹配触点事件
     */
    public java.lang.String evtMappedIp;

    /**
     * 记录接口协议类型,LOVB=EVT-C-1002
     */
    public java.lang.String evtProcotolType;

    /**
     * 事件匹配映射的方法名，用于事件识别
     */
    public java.lang.String evtMappedFunName;

    /**
     * 记录事件的描述说明
     */
    public java.lang.String eventDesc;

    /**
     * 记录事件的所属事件类型标识
     */
    public java.lang.Long evtTypeId;

    /**
     * 记录事件的触发类型,LOVB=EVT-C-1003
            包括：实时触发事件，定期触发事件，人工触发事件
     */
    public java.lang.String eventTrigType;

    /**
     * 记录集团下发的事件标识
     */
    public java.lang.Long extEventId;

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
     * 设置 事件主键标识
     */
    public void setEventId(java.lang.Long eventId) {
        this.eventId = eventId;
    }

    /**
     * 获取 事件主键标识
     */
    public java.lang.Long getEventId() {
        return this.eventId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.eventId = SeqUtils.createLongId(ID_SEQ);
         return this.eventId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 接口配置标识，主键标识
     */
    public void setInterfaceCfgId(java.lang.Long interfaceCfgId) {
        this.interfaceCfgId = interfaceCfgId;
    }

    /**
     * 获取 接口配置标识，主键标识
     */
    public java.lang.Long getInterfaceCfgId() {
        return this.interfaceCfgId;
    }

    /**
     * 设置 记录事件的编码信息
     */
    public void setEventNbr(java.lang.String eventNbr) {
        this.eventNbr = eventNbr;
    }

    /**
     * 获取 记录事件的编码信息
     */
    public java.lang.String getEventNbr() {
        return this.eventNbr;
    }

    /**
     * 设置 记录事件的名称
     */
    public void setEventName(java.lang.String eventName) {
        this.eventName = eventName;
    }

    /**
     * 获取 记录事件的名称
     */
    public java.lang.String getEventName() {
        return this.eventName;
    }

    /**
     * 设置 记录事件的映射地址，事件识别时可通过这个映身地址来适配触点事件，可以是URL地址，APP的类包名或其它识别编码
     */
    public void setEvtMappedAddr(java.lang.String evtMappedAddr) {
        this.evtMappedAddr = evtMappedAddr;
    }

    /**
     * 获取 记录事件的映射地址，事件识别时可通过这个映身地址来适配触点事件，可以是URL地址，APP的类包名或其它识别编码
     */
    public java.lang.String getEvtMappedAddr() {
        return this.evtMappedAddr;
    }

    /**
     * 设置 记录事件的映射匹配IP地址，事件识别可通过匹配IP地址进行匹配触点事件
     */
    public void setEvtMappedIp(java.lang.String evtMappedIp) {
        this.evtMappedIp = evtMappedIp;
    }

    /**
     * 获取 记录事件的映射匹配IP地址，事件识别可通过匹配IP地址进行匹配触点事件
     */
    public java.lang.String getEvtMappedIp() {
        return this.evtMappedIp;
    }

    /**
     * 设置 记录接口协议类型,LOVB=EVT-C-1002
     */
    public void setEvtProcotolType(java.lang.String evtProcotolType) {
        this.evtProcotolType = evtProcotolType;
    }

    /**
     * 获取 记录接口协议类型,LOVB=EVT-C-1002
     */
    public java.lang.String getEvtProcotolType() {
        return this.evtProcotolType;
    }

    /**
     * 设置 事件匹配映射的方法名，用于事件识别
     */
    public void setEvtMappedFunName(java.lang.String evtMappedFunName) {
        this.evtMappedFunName = evtMappedFunName;
    }

    /**
     * 获取 事件匹配映射的方法名，用于事件识别
     */
    public java.lang.String getEvtMappedFunName() {
        return this.evtMappedFunName;
    }

    /**
     * 设置 记录事件的描述说明
     */
    public void setEventDesc(java.lang.String eventDesc) {
        this.eventDesc = eventDesc;
    }

    /**
     * 获取 记录事件的描述说明
     */
    public java.lang.String getEventDesc() {
        return this.eventDesc;
    }

    /**
     * 设置 记录事件的所属事件类型标识
     */
    public void setEvtTypeId(java.lang.Long evtTypeId) {
        this.evtTypeId = evtTypeId;
    }

    /**
     * 获取 记录事件的所属事件类型标识
     */
    public java.lang.Long getEvtTypeId() {
        return this.evtTypeId;
    }

    /**
     * 设置 记录事件的触发类型,LOVB=EVT-C-1003
            包括：实时触发事件，定期触发事件，人工触发事件
     */
    public void setEventTrigType(java.lang.String eventTrigType) {
        this.eventTrigType = eventTrigType;
    }

    /**
     * 获取 记录事件的触发类型,LOVB=EVT-C-1003
            包括：实时触发事件，定期触发事件，人工触发事件
     */
    public java.lang.String getEventTrigType() {
        return this.eventTrigType;
    }

    /**
     * 设置 记录集团下发的事件标识
     */
    public void setExtEventId(java.lang.Long extEventId) {
        this.extEventId = extEventId;
    }

    /**
     * 获取 记录集团下发的事件标识
     */
    public java.lang.Long getExtEventId() {
        return this.extEventId;
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
