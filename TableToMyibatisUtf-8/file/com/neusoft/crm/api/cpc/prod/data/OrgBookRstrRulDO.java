package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义营业厅不同业务服务的线上预约时间段及数量限制规则
 * @实体表  :ORG_BOOK_RSTR_RUL
 */
public class OrgBookRstrRulDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORG_BOOK_RSTR_RUL_S";

    /**
     * 主键，预约限制标识
     */
    public java.lang.Long bookRstrRulId;

    /**
     * 营业厅标识
     */
    public java.lang.Long orgId;

    /**
     * 营业厅服务关系标识
     */
    public java.lang.Long orgServRelId;

    /**
     * 预约时段标识
     */
    public java.lang.Long bookTimeId;

    /**
     * 预约时段内最大可预约数量
     */
    public java.lang.Integer bookNum;

    /**
     * 记录状态，LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 主键，预约限制标识
     */
    public void setBookRstrRulId(java.lang.Long bookRstrRulId) {
        this.bookRstrRulId = bookRstrRulId;
    }

    /**
     * 获取 主键，预约限制标识
     */
    public java.lang.Long getBookRstrRulId() {
        return this.bookRstrRulId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.bookRstrRulId = SeqUtils.createLongId(ID_SEQ);
         return this.bookRstrRulId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 营业厅标识
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 营业厅标识
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置 营业厅服务关系标识
     */
    public void setOrgServRelId(java.lang.Long orgServRelId) {
        this.orgServRelId = orgServRelId;
    }

    /**
     * 获取 营业厅服务关系标识
     */
    public java.lang.Long getOrgServRelId() {
        return this.orgServRelId;
    }

    /**
     * 设置 预约时段标识
     */
    public void setBookTimeId(java.lang.Long bookTimeId) {
        this.bookTimeId = bookTimeId;
    }

    /**
     * 获取 预约时段标识
     */
    public java.lang.Long getBookTimeId() {
        return this.bookTimeId;
    }

    /**
     * 设置 预约时段内最大可预约数量
     */
    public void setBookNum(java.lang.Integer bookNum) {
        this.bookNum = bookNum;
    }

    /**
     * 获取 预约时段内最大可预约数量
     */
    public java.lang.Integer getBookNum() {
        return this.bookNum;
    }

    /**
     * 设置 记录状态，LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建的员工。
            
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工。
            
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工。
            
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工。
            
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间。
            
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间。
            
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态变更的时间。
            
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间。
            
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改的时间。
            
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间。
            
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录备注信息
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
