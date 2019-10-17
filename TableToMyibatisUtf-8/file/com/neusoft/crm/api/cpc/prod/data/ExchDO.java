package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述信令所指的方向,如到某个局(每局对应一个DPC)的信令,可称到某局的局向。
 * @实体表  :EXCH
 */
public class ExchDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EXCH_S";

    /**
     * 局向标识
     */
    public java.lang.Long exchId;

    /**
     * OSS同步的局向描述
     */
    public java.lang.String srcExchDesc;

    /**
     * OSS同步的局向标识。
     */
    public java.lang.Long srcExchId;

    /**
     * 记录公共管理区域标识。
     */
    public java.lang.Long regionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

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
     * 设置 局向标识
     */
    public void setExchId(java.lang.Long exchId) {
        this.exchId = exchId;
    }

    /**
     * 获取 局向标识
     */
    public java.lang.Long getExchId() {
        return this.exchId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.exchId = SeqUtils.createLongId(ID_SEQ);
         return this.exchId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 OSS同步的局向描述
     */
    public void setSrcExchDesc(java.lang.String srcExchDesc) {
        this.srcExchDesc = srcExchDesc;
    }

    /**
     * 获取 OSS同步的局向描述
     */
    public java.lang.String getSrcExchDesc() {
        return this.srcExchDesc;
    }

    /**
     * 设置 OSS同步的局向标识。
     */
    public void setSrcExchId(java.lang.Long srcExchId) {
        this.srcExchId = srcExchId;
    }

    /**
     * 获取 OSS同步的局向标识。
     */
    public java.lang.Long getSrcExchId() {
        return this.srcExchId;
    }

    /**
     * 设置 记录公共管理区域标识。
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 记录公共管理区域标识。
     */
    public java.lang.Long getRegionId() {
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
