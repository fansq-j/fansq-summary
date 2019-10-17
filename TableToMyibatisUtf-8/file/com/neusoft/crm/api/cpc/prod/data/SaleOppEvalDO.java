package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:商机评估是对于某个部门、区域，一段时间内商机整体执行情况的评估，以实现对商机管理工作进行量化分析的管理需要。
 * @实体表  :SALE_OPP_EVAL
 */
public class SaleOppEvalDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SALE_OPP_EVAL_S";

    /**
     * 生成商机评估标识即序列号，表的主键。
     */
    public java.lang.Long saleOppEvalId;

    /**
     * 商机标识
     */
    public java.lang.Long saleOppId;

    /**
     * 记录考核得分。
     */
    public java.lang.Double evalScore;

    /**
     * 记录考核级别。LOVB=SAL-C-0004
     */
    public java.lang.String evalLevel;

    /**
     * 记录考核评语。
     */
    public java.lang.String evalDesc;

    /**
     * 记录状态，LOVB=PUB-C-0001
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
     * 设置 生成商机评估标识即序列号，表的主键。
     */
    public void setSaleOppEvalId(java.lang.Long saleOppEvalId) {
        this.saleOppEvalId = saleOppEvalId;
    }

    /**
     * 获取 生成商机评估标识即序列号，表的主键。
     */
    public java.lang.Long getSaleOppEvalId() {
        return this.saleOppEvalId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.saleOppEvalId = SeqUtils.createLongId(ID_SEQ);
         return this.saleOppEvalId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 商机标识
     */
    public void setSaleOppId(java.lang.Long saleOppId) {
        this.saleOppId = saleOppId;
    }

    /**
     * 获取 商机标识
     */
    public java.lang.Long getSaleOppId() {
        return this.saleOppId;
    }

    /**
     * 设置 记录考核得分。
     */
    public void setEvalScore(java.lang.Double evalScore) {
        this.evalScore = evalScore;
    }

    /**
     * 获取 记录考核得分。
     */
    public java.lang.Double getEvalScore() {
        return this.evalScore;
    }

    /**
     * 设置 记录考核级别。LOVB=SAL-C-0004
     */
    public void setEvalLevel(java.lang.String evalLevel) {
        this.evalLevel = evalLevel;
    }

    /**
     * 获取 记录考核级别。LOVB=SAL-C-0004
     */
    public java.lang.String getEvalLevel() {
        return this.evalLevel;
    }

    /**
     * 设置 记录考核评语。
     */
    public void setEvalDesc(java.lang.String evalDesc) {
        this.evalDesc = evalDesc;
    }

    /**
     * 获取 记录考核评语。
     */
    public java.lang.String getEvalDesc() {
        return this.evalDesc;
    }

    /**
     * 设置 记录状态，LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=PUB-C-0001
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
