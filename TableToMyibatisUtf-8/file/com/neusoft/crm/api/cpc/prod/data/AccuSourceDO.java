package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:量本来源记录. 用于记录量本转赠，转换，优惠赠送的记录。
 * @实体表  :ACCU_SOURCE
 */
public class AccuSourceDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCU_SOURCE_S";

    /**
     * 量本来源记录标识
     */
    public java.lang.Long accuSourceId;

    /**
     * 量本标识
     */
    public java.lang.Long accuId;

    /**
     * LOVB=ACC-C-0037
     */
    public java.lang.Integer sourceType;

    /**
     * 当来源类型为1时，记录初始化规则id.为2时，记录统一充值流水号(卡类)；3-记录转赠流水号；4-记录优惠规则标识; 5-记录充值流水号(前台)；6-记录转换流水号
     */
    public java.lang.Long fromSourceId;

    /**
     * 操作值
     */
    public java.lang.Long opValue;

    /**
     * 延期天数，相对失效日期的延期天数。 用于支撑流量卡量本在到期前续充延长有效期的业务场景.
     */
    public java.lang.Integer prolongDays;

    /**
     * 备注
     */
    public java.lang.String remark;

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
     * 设置 量本来源记录标识
     */
    public void setAccuSourceId(java.lang.Long accuSourceId) {
        this.accuSourceId = accuSourceId;
    }

    /**
     * 获取 量本来源记录标识
     */
    public java.lang.Long getAccuSourceId() {
        return this.accuSourceId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.accuSourceId = SeqUtils.createLongId(ID_SEQ);
         return this.accuSourceId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 量本标识
     */
    public void setAccuId(java.lang.Long accuId) {
        this.accuId = accuId;
    }

    /**
     * 获取 量本标识
     */
    public java.lang.Long getAccuId() {
        return this.accuId;
    }

    /**
     * 设置 LOVB=ACC-C-0037
     */
    public void setSourceType(java.lang.Integer sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * 获取 LOVB=ACC-C-0037
     */
    public java.lang.Integer getSourceType() {
        return this.sourceType;
    }

    /**
     * 设置 当来源类型为1时，记录初始化规则id.为2时，记录统一充值流水号(卡类)；3-记录转赠流水号；4-记录优惠规则标识; 5-记录充值流水号(前台)；6-记录转换流水号
     */
    public void setFromSourceId(java.lang.Long fromSourceId) {
        this.fromSourceId = fromSourceId;
    }

    /**
     * 获取 当来源类型为1时，记录初始化规则id.为2时，记录统一充值流水号(卡类)；3-记录转赠流水号；4-记录优惠规则标识; 5-记录充值流水号(前台)；6-记录转换流水号
     */
    public java.lang.Long getFromSourceId() {
        return this.fromSourceId;
    }

    /**
     * 设置 操作值
     */
    public void setOpValue(java.lang.Long opValue) {
        this.opValue = opValue;
    }

    /**
     * 获取 操作值
     */
    public java.lang.Long getOpValue() {
        return this.opValue;
    }

    /**
     * 设置 延期天数，相对失效日期的延期天数。 用于支撑流量卡量本在到期前续充延长有效期的业务场景.
     */
    public void setProlongDays(java.lang.Integer prolongDays) {
        this.prolongDays = prolongDays;
    }

    /**
     * 获取 延期天数，相对失效日期的延期天数。 用于支撑流量卡量本在到期前续充延长有效期的业务场景.
     */
    public java.lang.Integer getProlongDays() {
        return this.prolongDays;
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
