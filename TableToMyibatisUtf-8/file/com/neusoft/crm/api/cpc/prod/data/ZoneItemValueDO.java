package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义在最底层的区表节点上所包含的一组有实际代表意义的数值，如电话号码（区号），IP地址（前缀）等。
 * @实体表  :ZONE_ITEM_VALUE
 */
public class ZoneItemValueDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ZONE_ITEM_VALUE_S";

    /**
     * 区表节点取值的标识
     */
    public java.lang.Integer itemRefId;

    /**
     * 区表节点的标识
     */
    public java.lang.Integer zoneItemId;

    /**
     * 用于进行归并操作的参考对象取值，即参考对象＝该值时，对应此节点
     */
    public java.lang.String itemRefValue;

    /**
     * 何时生效
     */
    public java.util.Date effDate;

    /**
     * 何时失效，为空时表示还没有决定何时生效
     */
    public java.util.Date expDate;

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
     * 设置 区表节点取值的标识
     */
    public void setItemRefId(java.lang.Integer itemRefId) {
        this.itemRefId = itemRefId;
    }

    /**
     * 获取 区表节点取值的标识
     */
    public java.lang.Integer getItemRefId() {
        return this.itemRefId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.itemRefId = SeqUtils.createIntegerId(ID_SEQ);
         return this.itemRefId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 区表节点的标识
     */
    public void setZoneItemId(java.lang.Integer zoneItemId) {
        this.zoneItemId = zoneItemId;
    }

    /**
     * 获取 区表节点的标识
     */
    public java.lang.Integer getZoneItemId() {
        return this.zoneItemId;
    }

    /**
     * 设置 用于进行归并操作的参考对象取值，即参考对象＝该值时，对应此节点
     */
    public void setItemRefValue(java.lang.String itemRefValue) {
        this.itemRefValue = itemRefValue;
    }

    /**
     * 获取 用于进行归并操作的参考对象取值，即参考对象＝该值时，对应此节点
     */
    public java.lang.String getItemRefValue() {
        return this.itemRefValue;
    }

    /**
     * 设置 何时生效
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 何时生效
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 何时失效，为空时表示还没有决定何时生效
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 何时失效，为空时表示还没有决定何时生效
     */
    public java.util.Date getExpDate() {
        return this.expDate;
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
