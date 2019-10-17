package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:对帐目类型的一个更粗一级的归类，主要便于统计。
 * @实体表  :ACCT_ITEM_CLASS
 */
public class AcctItemClassDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCT_ITEM_CLASS_S";

    /**
     * 该帐目类型所属的帐目类型归类的标识。
     */
    public java.lang.Integer acctItemClassId;

    /**
     * 帐目类型归类的标准编码，LOVB=ACC-C-0218
     */
    public java.lang.Integer acctItemClassCode;

    /**
     * 帐目类型归类描述
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
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.acctItemClassId = SeqUtils.createIntegerId(ID_SEQ);
         return this.acctItemClassId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 帐目类型归类的标准编码，LOVB=ACC-C-0218
     */
    public void setAcctItemClassCode(java.lang.Integer acctItemClassCode) {
        this.acctItemClassCode = acctItemClassCode;
    }

    /**
     * 获取 帐目类型归类的标准编码，LOVB=ACC-C-0218
     */
    public java.lang.Integer getAcctItemClassCode() {
        return this.acctItemClassCode;
    }

    /**
     * 设置 帐目类型归类描述
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    /**
     * 获取 帐目类型归类描述
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
