package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述某些帐目类型的组合，帐目组可用于帐务定制关系、专款专用，优惠等业务场景使用，减少配置量，如：通话费帐目组，可以包含本
 * @实体表  :ACCT_ITEM_GROUP
 */
public class AcctItemGroupDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCT_ITEM_GROUP_S";

    /**
     * 为每个帐目组生成的唯一编号。
     */
    public java.lang.Integer acctItemGroupId;

    /**
     * 帐目组的名称。
     */
    public java.lang.String acctItemGroupName;

    /**
     * 定义帐目组之间的优先级关系。
     */
    public java.lang.Integer priority;

    /**
     * LOVB=ACC-C-0044
     */
    public java.lang.Integer ifInclude;

    /**
     * 父帐目组标识
     */
    public java.lang.Integer parentItemGroupId;

    /**
     * 帐目组分类标识。ACC-C-0001
     */
    public java.lang.Integer groupType;

    /**
     * 区域标识
     */
    public java.lang.Integer regionId;

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
     * 设置 为每个帐目组生成的唯一编号。
     */
    public void setAcctItemGroupId(java.lang.Integer acctItemGroupId) {
        this.acctItemGroupId = acctItemGroupId;
    }

    /**
     * 获取 为每个帐目组生成的唯一编号。
     */
    public java.lang.Integer getAcctItemGroupId() {
        return this.acctItemGroupId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.acctItemGroupId = SeqUtils.createIntegerId(ID_SEQ);
         return this.acctItemGroupId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 帐目组的名称。
     */
    public void setAcctItemGroupName(java.lang.String acctItemGroupName) {
        this.acctItemGroupName = acctItemGroupName;
    }

    /**
     * 获取 帐目组的名称。
     */
    public java.lang.String getAcctItemGroupName() {
        return this.acctItemGroupName;
    }

    /**
     * 设置 定义帐目组之间的优先级关系。
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 定义帐目组之间的优先级关系。
     */
    public java.lang.Integer getPriority() {
        return this.priority;
    }

    /**
     * 设置 LOVB=ACC-C-0044
     */
    public void setIfInclude(java.lang.Integer ifInclude) {
        this.ifInclude = ifInclude;
    }

    /**
     * 获取 LOVB=ACC-C-0044
     */
    public java.lang.Integer getIfInclude() {
        return this.ifInclude;
    }

    /**
     * 设置 父帐目组标识
     */
    public void setParentItemGroupId(java.lang.Integer parentItemGroupId) {
        this.parentItemGroupId = parentItemGroupId;
    }

    /**
     * 获取 父帐目组标识
     */
    public java.lang.Integer getParentItemGroupId() {
        return this.parentItemGroupId;
    }

    /**
     * 设置 帐目组分类标识。ACC-C-0001
     */
    public void setGroupType(java.lang.Integer groupType) {
        this.groupType = groupType;
    }

    /**
     * 获取 帐目组分类标识。ACC-C-0001
     */
    public java.lang.Integer getGroupType() {
        return this.groupType;
    }

    /**
     * 设置 区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
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
