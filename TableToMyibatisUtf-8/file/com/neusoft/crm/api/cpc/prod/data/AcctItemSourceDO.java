package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述帐目的具体来源，例如：要把7点到24点，24～7点通话费用分开合帐，就通过帐目来源（具体时段、具体优惠政策）来区分。
 * @实体表  :ACCT_ITEM_SOURCE
 */
public class AcctItemSourceDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCT_ITEM_SOURCE_S";

    /**
     * 为每一种帐目类型的帐目的来源生成的唯一标识。
     */
    public java.lang.Integer itemSourceId;

    /**
     * 区别帐目类型的唯一标号
     */
    public java.lang.Integer acctItemTypeId;

    /**
     * 对帐目来源的一个归类标识。ACC-C-0007
     */
    public java.lang.Integer itemSourceType;

    /**
     * 帐目来源的名称。
     */
    public java.lang.String name;

    /**
     * 帐目来源的描述。
     */
    public java.lang.String comments;

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
     * 设置 为每一种帐目类型的帐目的来源生成的唯一标识。
     */
    public void setItemSourceId(java.lang.Integer itemSourceId) {
        this.itemSourceId = itemSourceId;
    }

    /**
     * 获取 为每一种帐目类型的帐目的来源生成的唯一标识。
     */
    public java.lang.Integer getItemSourceId() {
        return this.itemSourceId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.itemSourceId = SeqUtils.createIntegerId(ID_SEQ);
         return this.itemSourceId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 区别帐目类型的唯一标号
     */
    public void setAcctItemTypeId(java.lang.Integer acctItemTypeId) {
        this.acctItemTypeId = acctItemTypeId;
    }

    /**
     * 获取 区别帐目类型的唯一标号
     */
    public java.lang.Integer getAcctItemTypeId() {
        return this.acctItemTypeId;
    }

    /**
     * 设置 对帐目来源的一个归类标识。ACC-C-0007
     */
    public void setItemSourceType(java.lang.Integer itemSourceType) {
        this.itemSourceType = itemSourceType;
    }

    /**
     * 获取 对帐目来源的一个归类标识。ACC-C-0007
     */
    public java.lang.Integer getItemSourceType() {
        return this.itemSourceType;
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
     * 设置 帐目来源的描述。
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    /**
     * 获取 帐目来源的描述。
     */
    public java.lang.String getComments() {
        return this.comments;
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
