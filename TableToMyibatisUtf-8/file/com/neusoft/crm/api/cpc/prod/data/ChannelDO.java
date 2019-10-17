package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:渠道资料表，记录电信组织作为渠道的相关属性信息。（渠道单元、店中商）
 * @实体表  :CHANNEL
 */
public class ChannelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CHANNEL_S";

    /**
     * 电信组织标识主键
     */
    public java.lang.Long orgId;

    /**
     * 渠道编码，LOVB=CHN-0005
     */
    public java.lang.String channelNbr;

    /**
     * 渠道名称
     */
    public java.lang.String channelName;

    /**
     * 渠道类型。LOVB=CHN-0007。
     */
    public java.lang.String channelClass;

    /**
     * 渠道单元一级类，LOVB=CHN-0017
     */
    public java.lang.String salesFirstType;

    /**
     * 渠道单元二级类,LOVB=CHN-0017
     */
    public java.lang.String salesSecondType;

    /**
     * 渠道单元三级类,LOVB=CHN-0017
     */
    public java.lang.String salesThirdType;

    /**
     * 渠道对应组织的关联参与人标识,参与人唯一标识
     */
    public java.lang.Long partyId;

    /**
     * 渠道描述
     */
    public java.lang.String channelDesc;

    /**
     * 公用管理区域标识,记录区域唯一标识
     */
    public java.lang.Long regionId;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 渠道状态。LOVB=CHN-0004。
     */
    public java.lang.String statusCd;

    /**
     * 渠道状态时间
     */
    public java.util.Date statusDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 设置 电信组织标识主键
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 电信组织标识主键
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.orgId = SeqUtils.createLongId(ID_SEQ);
         return this.orgId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 渠道编码，LOVB=CHN-0005
     */
    public void setChannelNbr(java.lang.String channelNbr) {
        this.channelNbr = channelNbr;
    }

    /**
     * 获取 渠道编码，LOVB=CHN-0005
     */
    public java.lang.String getChannelNbr() {
        return this.channelNbr;
    }

    /**
     * 设置 渠道名称
     */
    public void setChannelName(java.lang.String channelName) {
        this.channelName = channelName;
    }

    /**
     * 获取 渠道名称
     */
    public java.lang.String getChannelName() {
        return this.channelName;
    }

    /**
     * 设置 渠道类型。LOVB=CHN-0007。
     */
    public void setChannelClass(java.lang.String channelClass) {
        this.channelClass = channelClass;
    }

    /**
     * 获取 渠道类型。LOVB=CHN-0007。
     */
    public java.lang.String getChannelClass() {
        return this.channelClass;
    }

    /**
     * 设置 渠道单元一级类，LOVB=CHN-0017
     */
    public void setSalesFirstType(java.lang.String salesFirstType) {
        this.salesFirstType = salesFirstType;
    }

    /**
     * 获取 渠道单元一级类，LOVB=CHN-0017
     */
    public java.lang.String getSalesFirstType() {
        return this.salesFirstType;
    }

    /**
     * 设置 渠道单元二级类,LOVB=CHN-0017
     */
    public void setSalesSecondType(java.lang.String salesSecondType) {
        this.salesSecondType = salesSecondType;
    }

    /**
     * 获取 渠道单元二级类,LOVB=CHN-0017
     */
    public java.lang.String getSalesSecondType() {
        return this.salesSecondType;
    }

    /**
     * 设置 渠道单元三级类,LOVB=CHN-0017
     */
    public void setSalesThirdType(java.lang.String salesThirdType) {
        this.salesThirdType = salesThirdType;
    }

    /**
     * 获取 渠道单元三级类,LOVB=CHN-0017
     */
    public java.lang.String getSalesThirdType() {
        return this.salesThirdType;
    }

    /**
     * 设置 渠道对应组织的关联参与人标识,参与人唯一标识
     */
    public void setPartyId(java.lang.Long partyId) {
        this.partyId = partyId;
    }

    /**
     * 获取 渠道对应组织的关联参与人标识,参与人唯一标识
     */
    public java.lang.Long getPartyId() {
        return this.partyId;
    }

    /**
     * 设置 渠道描述
     */
    public void setChannelDesc(java.lang.String channelDesc) {
        this.channelDesc = channelDesc;
    }

    /**
     * 获取 渠道描述
     */
    public java.lang.String getChannelDesc() {
        return this.channelDesc;
    }

    /**
     * 设置 公用管理区域标识,记录区域唯一标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 公用管理区域标识,记录区域唯一标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
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
     * 设置 渠道状态。LOVB=CHN-0004。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 渠道状态。LOVB=CHN-0004。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 渠道状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 渠道状态时间
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

}
