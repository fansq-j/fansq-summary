package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义帐目的类型。是对计费系统定义的费用的描述，如市话次数费、租费等，而这些帐目有一定的归属关系，如长途基本费和长途附加费
 * @实体表  :ACCT_ITEM_TYPE
 */
public class AcctItemTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCT_ITEM_TYPE_S";

    /**
     * 对每一帐目类型的唯一编号
     */
    public java.lang.Integer acctItemTypeId;

    /**
     * 该帐目类型所属的帐目类型归类的标识。
     */
    public java.lang.Integer acctItemClassId;

    /**
     * 关联的运营商的唯一标识。
     */
    public java.lang.Integer partnerId;

    /**
     * 帐目来源的名称。
     */
    public java.lang.String name;

    /**
     * 说明是否费用有关的帐目类型。ACC-C-0024
     */
    public java.lang.Integer chargeMark;

    /**
     * 说明是否参与计算总帐目的类型标志。ACC-C-0018
     */
    public java.lang.Integer totalMark;

    /**
     * 帐目类型的外部标准编码。LOVB=ACC-C-0016
     */
    public java.lang.String acctItemTypeCode;

    /**
     * 不同账目类型，销账优先级不同，该字段体现销账优先级
            
     */
    public java.lang.Integer priority;

    /**
     * 上一级帐目类型。
     */
    public java.lang.Integer parentItemTypeId;

    /**
     * 是否允许调帐，LOVB=ACC-C-0044
     */
    public java.lang.Integer ifAdjust;

    /**
     * 记录状态 。 LOVB=ACC-C-0002
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
     * 设置 对每一帐目类型的唯一编号
     */
    public void setAcctItemTypeId(java.lang.Integer acctItemTypeId) {
        this.acctItemTypeId = acctItemTypeId;
    }

    /**
     * 获取 对每一帐目类型的唯一编号
     */
    public java.lang.Integer getAcctItemTypeId() {
        return this.acctItemTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.acctItemTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.acctItemTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 该帐目类型所属的帐目类型归类的标识。
     */
    public void setAcctItemClassId(java.lang.Integer acctItemClassId) {
        this.acctItemClassId = acctItemClassId;
    }

    /**
     * 获取 该帐目类型所属的帐目类型归类的标识。
     */
    public java.lang.Integer getAcctItemClassId() {
        return this.acctItemClassId;
    }

    /**
     * 设置 关联的运营商的唯一标识。
     */
    public void setPartnerId(java.lang.Integer partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * 获取 关联的运营商的唯一标识。
     */
    public java.lang.Integer getPartnerId() {
        return this.partnerId;
    }

    /**
     * 设置 帐目来源的名称。
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * 获取 帐目来源的名称。
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * 设置 说明是否费用有关的帐目类型。ACC-C-0024
     */
    public void setChargeMark(java.lang.Integer chargeMark) {
        this.chargeMark = chargeMark;
    }

    /**
     * 获取 说明是否费用有关的帐目类型。ACC-C-0024
     */
    public java.lang.Integer getChargeMark() {
        return this.chargeMark;
    }

    /**
     * 设置 说明是否参与计算总帐目的类型标志。ACC-C-0018
     */
    public void setTotalMark(java.lang.Integer totalMark) {
        this.totalMark = totalMark;
    }

    /**
     * 获取 说明是否参与计算总帐目的类型标志。ACC-C-0018
     */
    public java.lang.Integer getTotalMark() {
        return this.totalMark;
    }

    /**
     * 设置 帐目类型的外部标准编码。LOVB=ACC-C-0016
     */
    public void setAcctItemTypeCode(java.lang.String acctItemTypeCode) {
        this.acctItemTypeCode = acctItemTypeCode;
    }

    /**
     * 获取 帐目类型的外部标准编码。LOVB=ACC-C-0016
     */
    public java.lang.String getAcctItemTypeCode() {
        return this.acctItemTypeCode;
    }

    /**
     * 设置 不同账目类型，销账优先级不同，该字段体现销账优先级
            
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 不同账目类型，销账优先级不同，该字段体现销账优先级
            
     */
    public java.lang.Integer getPriority() {
        return this.priority;
    }

    /**
     * 设置 上一级帐目类型。
     */
    public void setParentItemTypeId(java.lang.Integer parentItemTypeId) {
        this.parentItemTypeId = parentItemTypeId;
    }

    /**
     * 获取 上一级帐目类型。
     */
    public java.lang.Integer getParentItemTypeId() {
        return this.parentItemTypeId;
    }

    /**
     * 设置 是否允许调帐，LOVB=ACC-C-0044
     */
    public void setIfAdjust(java.lang.Integer ifAdjust) {
        this.ifAdjust = ifAdjust;
    }

    /**
     * 获取 是否允许调帐，LOVB=ACC-C-0044
     */
    public java.lang.Integer getIfAdjust() {
        return this.ifAdjust;
    }

    /**
     * 设置 记录状态 。 LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态 。 LOVB=ACC-C-0002
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
