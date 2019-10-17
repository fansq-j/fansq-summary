package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:俱乐部会员指消费积分达到会员资格标准的客户或经过评定的政企客户的关键人。会员可以享受中国电信俱乐部提供的差异化服务。
 * @实体表  :CLUB_MEMBER
 */
public class ClubMemberDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CLUB_MEMBER_S";

    /**
     * 俱乐部会员标识，主键
     */
    public java.lang.Long clubMemberId;

    /**
     * 俱乐部标识
     */
    public java.lang.Integer clubId;

    /**
     * 记录参与人标识
     */
    public java.lang.Long partyId;

    /**
     * 客户标识
     */
    public java.lang.Long custId;

    /**
     * 记录会员唯一编码
     */
    public java.lang.String memberCode;

    /**
     * 记录会员名称
     */
    public java.lang.String memberName;

    /**
     * 记录会员密码
     */
    public java.lang.String password;

    /**
     * 记录会员级别.LOVB=CLB-0002
     */
    public java.lang.String membershipLevel;

    /**
     * 记录当前会员级别的评定日期
     */
    public java.util.Date assessDate;

    /**
     * 记录当前有效会员卡生效日期
     */
    public java.util.Date effDate;

    /**
     * 记录当前有效会员卡失效日期
     */
    public java.util.Date expDate;

    /**
     * 记录会员加入日期
     */
    public java.util.Date enterDate;

    /**
     * 记录会员状态。LOVB=CLB-0003。
     */
    public java.lang.String statusCd;

    /**
     * 记录最近会员状态变更的日期
     */
    public java.util.Date statusDate;

    /**
     * 记录创建日期
     */
    public java.util.Date createDate;

    /**
     * 记录创建人
     */
    public java.lang.Long createStaff;

    /**
     * 设置 俱乐部会员标识，主键
     */
    public void setClubMemberId(java.lang.Long clubMemberId) {
        this.clubMemberId = clubMemberId;
    }

    /**
     * 获取 俱乐部会员标识，主键
     */
    public java.lang.Long getClubMemberId() {
        return this.clubMemberId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.clubMemberId = SeqUtils.createLongId(ID_SEQ);
         return this.clubMemberId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 俱乐部标识
     */
    public void setClubId(java.lang.Integer clubId) {
        this.clubId = clubId;
    }

    /**
     * 获取 俱乐部标识
     */
    public java.lang.Integer getClubId() {
        return this.clubId;
    }

    /**
     * 设置 记录参与人标识
     */
    public void setPartyId(java.lang.Long partyId) {
        this.partyId = partyId;
    }

    /**
     * 获取 记录参与人标识
     */
    public java.lang.Long getPartyId() {
        return this.partyId;
    }

    /**
     * 设置 客户标识
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }

    /**
     * 获取 客户标识
     */
    public java.lang.Long getCustId() {
        return this.custId;
    }

    /**
     * 设置 记录会员唯一编码
     */
    public void setMemberCode(java.lang.String memberCode) {
        this.memberCode = memberCode;
    }

    /**
     * 获取 记录会员唯一编码
     */
    public java.lang.String getMemberCode() {
        return this.memberCode;
    }

    /**
     * 设置 记录会员名称
     */
    public void setMemberName(java.lang.String memberName) {
        this.memberName = memberName;
    }

    /**
     * 获取 记录会员名称
     */
    public java.lang.String getMemberName() {
        return this.memberName;
    }

    /**
     * 设置 记录会员密码
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    /**
     * 获取 记录会员密码
     */
    public java.lang.String getPassword() {
        return this.password;
    }

    /**
     * 设置 记录会员级别.LOVB=CLB-0002
     */
    public void setMembershipLevel(java.lang.String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    /**
     * 获取 记录会员级别.LOVB=CLB-0002
     */
    public java.lang.String getMembershipLevel() {
        return this.membershipLevel;
    }

    /**
     * 设置 记录当前会员级别的评定日期
     */
    public void setAssessDate(java.util.Date assessDate) {
        this.assessDate = assessDate;
    }

    /**
     * 获取 记录当前会员级别的评定日期
     */
    public java.util.Date getAssessDate() {
        return this.assessDate;
    }

    /**
     * 设置 记录当前有效会员卡生效日期
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录当前有效会员卡生效日期
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录当前有效会员卡失效日期
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录当前有效会员卡失效日期
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 记录会员加入日期
     */
    public void setEnterDate(java.util.Date enterDate) {
        this.enterDate = enterDate;
    }

    /**
     * 获取 记录会员加入日期
     */
    public java.util.Date getEnterDate() {
        return this.enterDate;
    }

    /**
     * 设置 记录会员状态。LOVB=CLB-0003。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录会员状态。LOVB=CLB-0003。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录最近会员状态变更的日期
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录最近会员状态变更的日期
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录创建日期
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建日期
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

}
