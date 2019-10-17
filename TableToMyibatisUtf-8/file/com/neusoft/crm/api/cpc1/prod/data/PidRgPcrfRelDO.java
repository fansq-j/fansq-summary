package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:PID和RG规格数据表。
 * @实体表  :PID_RG_PCRF_REL
 */
public class PidRgPcrfRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PID_RG_PCRF_REL_S";

    /**
     * 主键
     */
    public java.lang.Integer pidRgPcrfRelId;

    /**
     * pid。
     */
    public java.lang.String pid;

    /**
     * rg
     */
    public java.lang.String rg;

    /**
     * 描述。
     */
    public java.lang.String note;

    /**
     * 定向流量动作指令
     */
    public java.lang.String pcrfAction;

    /**
     * 状态
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
     * 设置 主键
     */
    public void setPidRgPcrfRelId(java.lang.Integer pidRgPcrfRelId) {
        this.pidRgPcrfRelId = pidRgPcrfRelId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Integer getPidRgPcrfRelId() {
        return this.pidRgPcrfRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pidRgPcrfRelId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pidRgPcrfRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 pid。
     */
    public void setPid(java.lang.String pid) {
        this.pid = pid;
    }

    /**
     * 获取 pid。
     */
    public java.lang.String getPid() {
        return this.pid;
    }

    /**
     * 设置 rg
     */
    public void setRg(java.lang.String rg) {
        this.rg = rg;
    }

    /**
     * 获取 rg
     */
    public java.lang.String getRg() {
        return this.rg;
    }

    /**
     * 设置 描述。
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }

    /**
     * 获取 描述。
     */
    public java.lang.String getNote() {
        return this.note;
    }

    /**
     * 设置 定向流量动作指令
     */
    public void setPcrfAction(java.lang.String pcrfAction) {
        this.pcrfAction = pcrfAction;
    }

    /**
     * 获取 定向流量动作指令
     */
    public java.lang.String getPcrfAction() {
        return this.pcrfAction;
    }

    /**
     * 设置 状态
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态
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

}
