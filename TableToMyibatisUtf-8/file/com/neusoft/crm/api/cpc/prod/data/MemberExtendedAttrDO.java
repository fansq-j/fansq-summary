package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录俱乐部会员扩展属性。
 * @实体表  :MEMBER_EXTENDED_ATTR
 */
public class MemberExtendedAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MEMBER_EXTENDED_ATTR_S";

    /**
     * 会员扩展属性标识，主键
     */
    public java.lang.Long clubMemberAttrId;

    /**
     * 俱乐部会员标识
     */
    public java.lang.Long clubMemberId;

    /**
     * 记录属性的主键
     */
    public java.lang.Long attrId;

    /**
     * 属性值标识，选填
     */
    public java.lang.Long attrValueId;

    /**
     * 记录属性值
     */
    public java.lang.String attrValue;

    /**
     * 状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 状态日期
     */
    public java.util.Date statusDate;

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
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 会员扩展属性标识，主键
     */
    public void setClubMemberAttrId(java.lang.Long clubMemberAttrId) {
        this.clubMemberAttrId = clubMemberAttrId;
    }

    /**
     * 获取 会员扩展属性标识，主键
     */
    public java.lang.Long getClubMemberAttrId() {
        return this.clubMemberAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.clubMemberAttrId = SeqUtils.createLongId(ID_SEQ);
         return this.clubMemberAttrId;
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
     * 设置 记录属性的主键
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 记录属性的主键
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
    }

    /**
     * 设置 属性值标识，选填
     */
    public void setAttrValueId(java.lang.Long attrValueId) {
        this.attrValueId = attrValueId;
    }

    /**
     * 获取 属性值标识，选填
     */
    public java.lang.Long getAttrValueId() {
        return this.attrValueId;
    }

    /**
     * 设置 记录属性值
     */
    public void setAttrValue(java.lang.String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * 获取 记录属性值
     */
    public java.lang.String getAttrValue() {
        return this.attrValue;
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
     * 设置 状态日期
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态日期
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
