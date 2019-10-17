package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:高额告警级别，用于对高额场景的归类，比如套佣金结算高额防欺诈、渠道养卡高额防欺诈等

 * @实体表  :HIGHFEE_LEVEL
 */
public class HighfeeLevelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "HIGHFEE_LEVEL_S";

    /**
     * 高额告警级别标识
     */
    public java.lang.Integer highfeeLevelId;

    /**
     * 高额告警级别名称
     */
    public java.lang.String highfeeLevelName;

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
     * 设置 高额告警级别标识
     */
    public void setHighfeeLevelId(java.lang.Integer highfeeLevelId) {
        this.highfeeLevelId = highfeeLevelId;
    }

    /**
     * 获取 高额告警级别标识
     */
    public java.lang.Integer getHighfeeLevelId() {
        return this.highfeeLevelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.highfeeLevelId = SeqUtils.createIntegerId(ID_SEQ);
         return this.highfeeLevelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 高额告警级别名称
     */
    public void setHighfeeLevelName(java.lang.String highfeeLevelName) {
        this.highfeeLevelName = highfeeLevelName;
    }

    /**
     * 获取 高额告警级别名称
     */
    public java.lang.String getHighfeeLevelName() {
        return this.highfeeLevelName;
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
