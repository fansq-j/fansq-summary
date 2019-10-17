package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:属主定义表用于定义定价参考对象归属的具体实例，如属主可以是产品实例、客户实例或事件实例等。
 * @实体表  :OWNER
 */
public class OwnerDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OWNER_S";

    /**
     * 属主的标识
     */
    public java.lang.Integer ownerId;

    /**
     * 属主名称
     */
    public java.lang.String ownerName;

    /**
     * 包含对象的标识. 当属主对象类型为定价包含对象时需要定义.
     */
    public java.lang.Integer pricingObjectId;

    /**
     * LOVB=PRC-C-0004
     */
    public java.lang.Integer ownerObjectType;

    /**
     * 属主属性必须要分出是主叫对应的属主还是被叫对应的属主。PRC-C-0037
     */
    public java.lang.Integer chargePartyId;

    /**
     * LOVB=PRC-C-0026
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
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 属主的标识
     */
    public void setOwnerId(java.lang.Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * 获取 属主的标识
     */
    public java.lang.Integer getOwnerId() {
        return this.ownerId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.ownerId = SeqUtils.createIntegerId(ID_SEQ);
         return this.ownerId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 属主名称
     */
    public void setOwnerName(java.lang.String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * 获取 属主名称
     */
    public java.lang.String getOwnerName() {
        return this.ownerName;
    }

    /**
     * 设置 包含对象的标识. 当属主对象类型为定价包含对象时需要定义.
     */
    public void setPricingObjectId(java.lang.Integer pricingObjectId) {
        this.pricingObjectId = pricingObjectId;
    }

    /**
     * 获取 包含对象的标识. 当属主对象类型为定价包含对象时需要定义.
     */
    public java.lang.Integer getPricingObjectId() {
        return this.pricingObjectId;
    }

    /**
     * 设置 LOVB=PRC-C-0004
     */
    public void setOwnerObjectType(java.lang.Integer ownerObjectType) {
        this.ownerObjectType = ownerObjectType;
    }

    /**
     * 获取 LOVB=PRC-C-0004
     */
    public java.lang.Integer getOwnerObjectType() {
        return this.ownerObjectType;
    }

    /**
     * 设置 属主属性必须要分出是主叫对应的属主还是被叫对应的属主。PRC-C-0037
     */
    public void setChargePartyId(java.lang.Integer chargePartyId) {
        this.chargePartyId = chargePartyId;
    }

    /**
     * 获取 属主属性必须要分出是主叫对应的属主还是被叫对应的属主。PRC-C-0037
     */
    public java.lang.Integer getChargePartyId() {
        return this.chargePartyId;
    }

    /**
     * 设置 LOVB=PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PRC-C-0026
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

}
