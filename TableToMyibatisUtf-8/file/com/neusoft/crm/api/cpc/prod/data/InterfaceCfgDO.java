package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:接口配置，记录事件采集模块与各触点渠道的接口配置信息，用于配置每种触点渠道与实时营销交互的接口信息。
 * @实体表  :INTERFACE_CFG
 */
public class InterfaceCfgDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "INTERFACE_CFG_S";

    /**
     * 接口配置标识，主键标识
     */
    public java.lang.Long interfaceCfgId;

    /**
     * 触点事件源标识
     */
    public java.lang.Integer evtSrcId;

    /**
     * 记录接口名称
     */
    public java.lang.String interfaceName;

    /**
     * 接口描述
     */
    public java.lang.String interfaceDesc;

    /**
     * 记录接口编码
     */
    public java.lang.String interfaceNbr;

    /**
     * 接口的交互类，LOVB=EVT-C-1001
            包括：服务接口、文件接口、数据同步接口、APP探针、页面探针
     */
    public java.lang.String interfaceType;

    /**
     * 接口的服务端的渠道名称
     */
    public java.lang.String provider;

    /**
     * 接口的调用端的渠道名称
     */
    public java.lang.String caller;

    /**
     * 协议类型，LOVB=EVT-C-1002
            描述接口交互的协议类型，如https，ftp等
     */
    public java.lang.String protocolType;

    /**
     * 状态。LOVB=PUB-C-0001
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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.interfaceCfgId = SeqUtils.createLongId(ID_SEQ);
         return this.interfaceCfgId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 触点事件源标识
     */
    public void setEvtSrcId(java.lang.Integer evtSrcId) {
        this.evtSrcId = evtSrcId;
    }

    /**
     * 获取 触点事件源标识
     */
    public java.lang.Integer getEvtSrcId() {
        return this.evtSrcId;
    }

    /**
     * 设置 记录接口名称
     */
    public void setInterfaceName(java.lang.String interfaceName) {
        this.interfaceName = interfaceName;
    }

    /**
     * 获取 记录接口名称
     */
    public java.lang.String getInterfaceName() {
        return this.interfaceName;
    }

    /**
     * 设置 接口描述
     */
    public void setInterfaceDesc(java.lang.String interfaceDesc) {
        this.interfaceDesc = interfaceDesc;
    }

    /**
     * 获取 接口描述
     */
    public java.lang.String getInterfaceDesc() {
        return this.interfaceDesc;
    }

    /**
     * 设置 记录接口编码
     */
    public void setInterfaceNbr(java.lang.String interfaceNbr) {
        this.interfaceNbr = interfaceNbr;
    }

    /**
     * 获取 记录接口编码
     */
    public java.lang.String getInterfaceNbr() {
        return this.interfaceNbr;
    }

    /**
     * 设置 接口的交互类，LOVB=EVT-C-1001
            包括：服务接口、文件接口、数据同步接口、APP探针、页面探针
     */
    public void setInterfaceType(java.lang.String interfaceType) {
        this.interfaceType = interfaceType;
    }

    /**
     * 获取 接口的交互类，LOVB=EVT-C-1001
            包括：服务接口、文件接口、数据同步接口、APP探针、页面探针
     */
    public java.lang.String getInterfaceType() {
        return this.interfaceType;
    }

    /**
     * 设置 接口的服务端的渠道名称
     */
    public void setProvider(java.lang.String provider) {
        this.provider = provider;
    }

    /**
     * 获取 接口的服务端的渠道名称
     */
    public java.lang.String getProvider() {
        return this.provider;
    }

    /**
     * 设置 接口的调用端的渠道名称
     */
    public void setCaller(java.lang.String caller) {
        this.caller = caller;
    }

    /**
     * 获取 接口的调用端的渠道名称
     */
    public java.lang.String getCaller() {
        return this.caller;
    }

    /**
     * 设置 协议类型，LOVB=EVT-C-1002
            描述接口交互的协议类型，如https，ftp等
     */
    public void setProtocolType(java.lang.String protocolType) {
        this.protocolType = protocolType;
    }

    /**
     * 获取 协议类型，LOVB=EVT-C-1002
            描述接口交互的协议类型，如https，ftp等
     */
    public java.lang.String getProtocolType() {
        return this.protocolType;
    }

    /**
     * 设置 状态。LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态。LOVB=PUB-C-0001
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
