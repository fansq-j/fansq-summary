package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:关键字
 * @实体表  :MKT_KEYWORDS
 */
public class MktKeywordsDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_KEYWORDS_S";

    /**
     * 关键字标识,主键
     */
    public java.lang.Integer keywordId;

    /**
     * 关键字
     */
    public java.lang.String keywrod;

    /**
     * 关键字说明
     */
    public java.lang.String keywordDesc;

    /**
     * 记录状态,LOVB=PUB-C-0001
            
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
     */
    public java.util.Date statusDate;

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
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 关键字标识,主键
     */
    public void setKeywordId(java.lang.Integer keywordId) {
        this.keywordId = keywordId;
    }

    /**
     * 获取 关键字标识,主键
     */
    public java.lang.Integer getKeywordId() {
        return this.keywordId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.keywordId = SeqUtils.createIntegerId(ID_SEQ);
         return this.keywordId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 关键字
     */
    public void setKeywrod(java.lang.String keywrod) {
        this.keywrod = keywrod;
    }

    /**
     * 获取 关键字
     */
    public java.lang.String getKeywrod() {
        return this.keywrod;
    }

    /**
     * 设置 关键字说明
     */
    public void setKeywordDesc(java.lang.String keywordDesc) {
        this.keywordDesc = keywordDesc;
    }

    /**
     * 获取 关键字说明
     */
    public java.lang.String getKeywordDesc() {
        return this.keywordDesc;
    }

    /**
     * 设置 记录状态,LOVB=PUB-C-0001
            
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态,LOVB=PUB-C-0001
            
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
