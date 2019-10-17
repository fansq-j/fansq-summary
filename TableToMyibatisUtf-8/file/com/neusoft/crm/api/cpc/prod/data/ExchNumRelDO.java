package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录局向与号头关系。
 * @实体表  :EXCH_NUM_REL
 */
public class ExchNumRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EXCH_NUM_REL_S";

    /**
     * 记录局向与号头关系标识。
     */
    public java.lang.Long exchNumRelId;

    /**
     * 号头标识
     */
    public java.lang.Integer headId;

    /**
     * 记录局向ID。
     */
    public java.lang.Long exchId;

    /**
     * 记录适用区域标识。
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录号码归属的本地网。
     */
    public java.lang.Long lanId;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 记录局向与号头关系标识。
     */
    public void setExchNumRelId(java.lang.Long exchNumRelId) {
        this.exchNumRelId = exchNumRelId;
    }

    /**
     * 获取 记录局向与号头关系标识。
     */
    public java.lang.Long getExchNumRelId() {
        return this.exchNumRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.exchNumRelId = SeqUtils.createLongId(ID_SEQ);
         return this.exchNumRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 号头标识
     */
    public void setHeadId(java.lang.Integer headId) {
        this.headId = headId;
    }

    /**
     * 获取 号头标识
     */
    public java.lang.Integer getHeadId() {
        return this.headId;
    }

    /**
     * 设置 记录局向ID。
     */
    public void setExchId(java.lang.Long exchId) {
        this.exchId = exchId;
    }

    /**
     * 获取 记录局向ID。
     */
    public java.lang.Long getExchId() {
        return this.exchId;
    }

    /**
     * 设置 记录适用区域标识。
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用区域标识。
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
    }

    /**
     * 设置 记录号码归属的本地网。
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 记录号码归属的本地网。
     */
    public java.lang.Long getLanId() {
        return this.lanId;
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
