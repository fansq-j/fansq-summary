package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:1.记录营销资源卡实例信息。营销资源实例编码，记录ICCID卡号。
2.营销资源卡实例实体名称修改为“营销资
 * @实体表  :MKT_RES_CARD_INST
 */
public class MktResCardInstDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_CARD_INST_S";

    /**
     * 营销资源实例的标识，主键
     */
    public java.lang.Long mktResInstId;

    /**
     * MIN码
     */
    public java.lang.Long min;

    /**
     * 营销资源实例编码，记录ICCID卡号。
     */
    public java.lang.String mktResInstNbr;

    /**
     * 来源于物资管理系统时产生的数据，记录卡管系统导入数据的批次信息
     */
    public java.lang.Integer mktResBatchId;

    /**
     * 营销资源标识
     */
    public java.lang.Integer mktResId;

    /**
     * 营销资源仓库标识
     */
    public java.lang.Integer mktResStoreId;

    /**
     * 记录占用的产品实例标识。
     */
    public java.lang.Long prodInstId;

    /**
     * 记录UIM卡功能类型。LOVB=RES-C-0030
     */
    public java.lang.String funType;

    /**
     * 记录UIM卡功能小类。LOVB=RES-C-0031
     */
    public java.lang.String funSubType;

    /**
     * 记录UIM卡信息制卡的状态，LOVB=RES-C-0032
     */
    public java.lang.String cardStatusCd;

    /**
     * 记录来源平台标识，如MSS或集团终端系统
     */
    public java.lang.Long platId;

    /**
     * 记录本地网标识。
     */
    public java.lang.Long lanId;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Long regionId;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录状态。LOVB=RES-C-0017。
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
     * 设置 营销资源实例的标识，主键
     */
    public void setMktResInstId(java.lang.Long mktResInstId) {
        this.mktResInstId = mktResInstId;
    }

    /**
     * 获取 营销资源实例的标识，主键
     */
    public java.lang.Long getMktResInstId() {
        return this.mktResInstId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktResInstId = SeqUtils.createLongId(ID_SEQ);
         return this.mktResInstId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 MIN码
     */
    public void setMin(java.lang.Long min) {
        this.min = min;
    }

    /**
     * 获取 MIN码
     */
    public java.lang.Long getMin() {
        return this.min;
    }

    /**
     * 设置 营销资源实例编码，记录ICCID卡号。
     */
    public void setMktResInstNbr(java.lang.String mktResInstNbr) {
        this.mktResInstNbr = mktResInstNbr;
    }

    /**
     * 获取 营销资源实例编码，记录ICCID卡号。
     */
    public java.lang.String getMktResInstNbr() {
        return this.mktResInstNbr;
    }

    /**
     * 设置 来源于物资管理系统时产生的数据，记录卡管系统导入数据的批次信息
     */
    public void setMktResBatchId(java.lang.Integer mktResBatchId) {
        this.mktResBatchId = mktResBatchId;
    }

    /**
     * 获取 来源于物资管理系统时产生的数据，记录卡管系统导入数据的批次信息
     */
    public java.lang.Integer getMktResBatchId() {
        return this.mktResBatchId;
    }

    /**
     * 设置 营销资源标识
     */
    public void setMktResId(java.lang.Integer mktResId) {
        this.mktResId = mktResId;
    }

    /**
     * 获取 营销资源标识
     */
    public java.lang.Integer getMktResId() {
        return this.mktResId;
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
     * 设置 记录占用的产品实例标识。
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 记录占用的产品实例标识。
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 记录UIM卡功能类型。LOVB=RES-C-0030
     */
    public void setFunType(java.lang.String funType) {
        this.funType = funType;
    }

    /**
     * 获取 记录UIM卡功能类型。LOVB=RES-C-0030
     */
    public java.lang.String getFunType() {
        return this.funType;
    }

    /**
     * 设置 记录UIM卡功能小类。LOVB=RES-C-0031
     */
    public void setFunSubType(java.lang.String funSubType) {
        this.funSubType = funSubType;
    }

    /**
     * 获取 记录UIM卡功能小类。LOVB=RES-C-0031
     */
    public java.lang.String getFunSubType() {
        return this.funSubType;
    }

    /**
     * 设置 记录UIM卡信息制卡的状态，LOVB=RES-C-0032
     */
    public void setCardStatusCd(java.lang.String cardStatusCd) {
        this.cardStatusCd = cardStatusCd;
    }

    /**
     * 获取 记录UIM卡信息制卡的状态，LOVB=RES-C-0032
     */
    public java.lang.String getCardStatusCd() {
        return this.cardStatusCd;
    }

    /**
     * 设置 记录来源平台标识，如MSS或集团终端系统
     */
    public void setPlatId(java.lang.Long platId) {
        this.platId = platId;
    }

    /**
     * 获取 记录来源平台标识，如MSS或集团终端系统
     */
    public java.lang.Long getPlatId() {
        return this.platId;
    }

    /**
     * 设置 记录本地网标识。
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 记录本地网标识。
     */
    public java.lang.Long getLanId() {
        return this.lanId;
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
     * 设置 记录状态。LOVB=RES-C-0017。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=RES-C-0017。
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

}
