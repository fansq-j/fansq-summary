package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录会员服务可服务次数等信息
 * @实体表  :MEM_SERV_ACCT
 */
public class MemServAcctDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MEM_SERV_ACCT_S";

    /**
     * 会员服务帐户标识，主键
     */
    public java.lang.Long memServAcctId;

    /**
     * 俱乐部会员标识
     */
    public java.lang.Long clubMemberId;

    /**
     * 俱乐部会员服务标识
     */
    public java.lang.Long memberServiceId;

    /**
     * 当前周期总服务次数
     */
    public java.lang.Integer totalCount;

    /**
     * 当前周期剩余服务次数
     */
    public java.lang.Integer useableCount;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 状态。LOVB=PUB-C-0001。
            
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 会员服务帐户标识，主键
     */
    public void setMemServAcctId(java.lang.Long memServAcctId) {
        this.memServAcctId = memServAcctId;
    }

    /**
     * 获取 会员服务帐户标识，主键
     */
    public java.lang.Long getMemServAcctId() {
        return this.memServAcctId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.memServAcctId = SeqUtils.createLongId(ID_SEQ);
         return this.memServAcctId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 俱乐部会员标识
     */
    public void setClubMemberId(java.lang.Long clubMemberId) {
        this.clubMemberId = clubMemberId;
    }

    /**
     * 获取 俱乐部会员标识
     */
    public java.lang.Long getClubMemberId() {
        return this.clubMemberId;
    }

    /**
     * 设置 俱乐部会员服务标识
     */
    public void setMemberServiceId(java.lang.Long memberServiceId) {
        this.memberServiceId = memberServiceId;
    }

    /**
     * 获取 俱乐部会员服务标识
     */
    public java.lang.Long getMemberServiceId() {
        return this.memberServiceId;
    }

    /**
     * 设置 当前周期总服务次数
     */
    public void setTotalCount(java.lang.Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 获取 当前周期总服务次数
     */
    public java.lang.Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * 设置 当前周期剩余服务次数
     */
    public void setUseableCount(java.lang.Integer useableCount) {
        this.useableCount = useableCount;
    }

    /**
     * 获取 当前周期剩余服务次数
     */
    public java.lang.Integer getUseableCount() {
        return this.useableCount;
    }

    /**
     * 设置 生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 状态。LOVB=PUB-C-0001。
            
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态。LOVB=PUB-C-0001。
            
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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
