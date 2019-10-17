package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:触点协议适配是内容推送前的重点环节，由于各类渠道可识别的内容结构不同，所以推送内容协议各不相同，在推送前根据触点渠道特征
 * @实体表  :CONTACT_CHL_CONVERT_CFG
 */
public class ContactChlConvertCfgDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CONTACT_CHL_CONVERT_CFG_S";

    /**
     * 协议适配转换配置标识
     */
    public java.lang.Long contactChlConvertCfgId;

    /**
     * 源传输协议
     */
    public java.lang.String sTransportProtocols;

    /**
     * 目标传输协议
     */
    public java.lang.String tTransportProtocols;

    /**
     * 转换处理类
     */
    public java.lang.String transformClass;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 协议适配转换配置标识
     */
    public void setContactChlConvertCfgId(java.lang.Long contactChlConvertCfgId) {
        this.contactChlConvertCfgId = contactChlConvertCfgId;
    }

    /**
     * 获取 协议适配转换配置标识
     */
    public java.lang.Long getContactChlConvertCfgId() {
        return this.contactChlConvertCfgId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.contactChlConvertCfgId = SeqUtils.createLongId(ID_SEQ);
         return this.contactChlConvertCfgId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 源传输协议
     */
    public void setSTransportProtocols(java.lang.String sTransportProtocols) {
        this.sTransportProtocols = sTransportProtocols;
    }

    /**
     * 获取 源传输协议
     */
    public java.lang.String getSTransportProtocols() {
        return this.sTransportProtocols;
    }

    /**
     * 设置 目标传输协议
     */
    public void setTTransportProtocols(java.lang.String tTransportProtocols) {
        this.tTransportProtocols = tTransportProtocols;
    }

    /**
     * 获取 目标传输协议
     */
    public java.lang.String getTTransportProtocols() {
        return this.tTransportProtocols;
    }

    /**
     * 设置 转换处理类
     */
    public void setTransformClass(java.lang.String transformClass) {
        this.transformClass = transformClass;
    }

    /**
     * 获取 转换处理类
     */
    public java.lang.String getTransformClass() {
        return this.transformClass;
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
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
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

}
