package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:指构成该设备覆盖的交换机、基站等。
 * @实体表  :EQUIP
 */
public class EquipDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EQUIP_S";

    /**
     * 唯一标识电信设备的编号
     */
    public java.lang.Integer equipId;

    /**
     * 唯一标识电信设备类型的编号
     */
    public java.lang.Integer equipTypeId;

    /**
     * 电信设备名称，如基站，交换机
     */
    public java.lang.String equipName;

    /**
     * 电信设备的描述
     */
    public java.lang.String equipDesc;

    /**
     * 归属区域标识。指向公共管理区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录实例信息创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次信息变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录任何变动时，修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 唯一标识电信设备的编号
     */
    public void setEquipId(java.lang.Integer equipId) {
        this.equipId = equipId;
    }

    /**
     * 获取 唯一标识电信设备的编号
     */
    public java.lang.Integer getEquipId() {
        return this.equipId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.equipId = SeqUtils.createIntegerId(ID_SEQ);
         return this.equipId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 唯一标识电信设备类型的编号
     */
    public void setEquipTypeId(java.lang.Integer equipTypeId) {
        this.equipTypeId = equipTypeId;
    }

    /**
     * 获取 唯一标识电信设备类型的编号
     */
    public java.lang.Integer getEquipTypeId() {
        return this.equipTypeId;
    }

    /**
     * 设置 电信设备名称，如基站，交换机
     */
    public void setEquipName(java.lang.String equipName) {
        this.equipName = equipName;
    }

    /**
     * 获取 电信设备名称，如基站，交换机
     */
    public java.lang.String getEquipName() {
        return this.equipName;
    }

    /**
     * 设置 电信设备的描述
     */
    public void setEquipDesc(java.lang.String equipDesc) {
        this.equipDesc = equipDesc;
    }

    /**
     * 获取 电信设备的描述
     */
    public java.lang.String getEquipDesc() {
        return this.equipDesc;
    }

    /**
     * 设置 归属区域标识。指向公共管理区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 归属区域标识。指向公共管理区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
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
     * 设置 记录实例信息创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录实例信息创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次信息变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录每次信息变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录任何变动时，修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录任何变动时，修改的时间。
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
