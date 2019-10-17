package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述区域组的成员包含的区域
 * @实体表  :COMMON_REGION_GRP_MEMBER
 */
public class CommonRegionGrpMemberDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "COMMON_REGION_GRP_MEMBER_S";

    /**
     * 公共管理区域组成员标识
     */
    public java.lang.Long commonRegionGrpMemberId;

    /**
     * 公共管理区域组标识
     */
    public java.lang.Long commonRegionGrpId;

    /**
     * 公共管理区域标识
     */
    public java.lang.Long commonRegionId;

    /**
     * 状态。LOVB=PUB-C-0001。
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
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 公共管理区域组成员标识
     */
    public void setCommonRegionGrpMemberId(java.lang.Long commonRegionGrpMemberId) {
        this.commonRegionGrpMemberId = commonRegionGrpMemberId;
    }

    /**
     * 获取 公共管理区域组成员标识
     */
    public java.lang.Long getCommonRegionGrpMemberId() {
        return this.commonRegionGrpMemberId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.commonRegionGrpMemberId = SeqUtils.createLongId(ID_SEQ);
         return this.commonRegionGrpMemberId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 公共管理区域组标识
     */
    public void setCommonRegionGrpId(java.lang.Long commonRegionGrpId) {
        this.commonRegionGrpId = commonRegionGrpId;
    }

    /**
     * 获取 公共管理区域组标识
     */
    public java.lang.Long getCommonRegionGrpId() {
        return this.commonRegionGrpId;
    }

    /**
     * 设置 公共管理区域标识
     */
    public void setCommonRegionId(java.lang.Long commonRegionId) {
        this.commonRegionId = commonRegionId;
    }

    /**
     * 获取 公共管理区域标识
     */
    public java.lang.Long getCommonRegionId() {
        return this.commonRegionId;
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
     * 设置 备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
