package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义营业厅与支持办理的业务服务的关系以及业务服务是否可进行线上预约
 * @实体表  :ORG_BUSI_SERV_REL
 */
public class OrgBusiServRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORG_BUSI_SERV_REL_S";

    /**
     * 主键，营业厅服务关系标识
     */
    public java.lang.Long orgServRelId;

    /**
     * 营业厅标识
     */
    public java.lang.Long orgId;

    /**
     * 服务类型标识
     */
    public java.lang.Long servTypeId;

    /**
     * 预约标志，主数据：可预约、不可预约.LOVB=STF-C-0027
     */
    public java.lang.String bookFlag;

    /**
     * 预约开始范围，单位为小时
     */
    public java.lang.Integer bookStart;

    /**
     * 预约结束范围，单位为小时
     */
    public java.lang.Integer bookEnd;

    /**
     * 状态，LOVB=PUB-C-0001
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
     * 设置 主键，营业厅服务关系标识
     */
    public void setOrgServRelId(java.lang.Long orgServRelId) {
        this.orgServRelId = orgServRelId;
    }

    /**
     * 获取 主键，营业厅服务关系标识
     */
    public java.lang.Long getOrgServRelId() {
        return this.orgServRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.orgServRelId = SeqUtils.createLongId(ID_SEQ);
         return this.orgServRelId;
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
     * 设置 服务类型标识
     */
    public void setServTypeId(java.lang.Long servTypeId) {
        this.servTypeId = servTypeId;
    }

    /**
     * 获取 服务类型标识
     */
    public java.lang.Long getServTypeId() {
        return this.servTypeId;
    }

    /**
     * 设置 预约标志，主数据：可预约、不可预约.LOVB=STF-C-0027
     */
    public void setBookFlag(java.lang.String bookFlag) {
        this.bookFlag = bookFlag;
    }

    /**
     * 获取 预约标志，主数据：可预约、不可预约.LOVB=STF-C-0027
     */
    public java.lang.String getBookFlag() {
        return this.bookFlag;
    }

    /**
     * 设置 预约开始范围，单位为小时
     */
    public void setBookStart(java.lang.Integer bookStart) {
        this.bookStart = bookStart;
    }

    /**
     * 获取 预约开始范围，单位为小时
     */
    public java.lang.Integer getBookStart() {
        return this.bookStart;
    }

    /**
     * 设置 预约结束范围，单位为小时
     */
    public void setBookEnd(java.lang.Integer bookEnd) {
        this.bookEnd = bookEnd;
    }

    /**
     * 获取 预约结束范围，单位为小时
     */
    public java.lang.Integer getBookEnd() {
        return this.bookEnd;
    }

    /**
     * 设置 状态，LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态，LOVB=PUB-C-0001
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
