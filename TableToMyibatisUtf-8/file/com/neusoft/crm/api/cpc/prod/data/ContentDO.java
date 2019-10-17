package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:内容信息定义
 * @实体表  :CONTENT
 */
public class ContentDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CONTENT_S";

    /**
     * 内容标识，主键
     */
    public java.lang.Long contentId;

    /**
     * 内容的业务编码
     */
    public java.lang.String contentCd;

    /**
     * 内容的分类。LOVB=PRD-C-0006
     */
    public java.lang.String contentType;

    /**
     * 提供商标识
     */
    public java.lang.Long partnerId;

    /**
     * 内容的名称
     */
    public java.lang.String contentName;

    /**
     * 内容的具体描述
     */
    public java.lang.String contentDesc;

    /**
     * 记录适用的区域范围，来源COMMON_REGION_ID。
            
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 状态变更的时间
            
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
     * 设置 内容标识，主键
     */
    public void setContentId(java.lang.Long contentId) {
        this.contentId = contentId;
    }

    /**
     * 获取 内容标识，主键
     */
    public java.lang.Long getContentId() {
        return this.contentId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.contentId = SeqUtils.createLongId(ID_SEQ);
         return this.contentId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 内容的业务编码
     */
    public void setContentCd(java.lang.String contentCd) {
        this.contentCd = contentCd;
    }

    /**
     * 获取 内容的业务编码
     */
    public java.lang.String getContentCd() {
        return this.contentCd;
    }

    /**
     * 设置 内容的分类。LOVB=PRD-C-0006
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }

    /**
     * 获取 内容的分类。LOVB=PRD-C-0006
     */
    public java.lang.String getContentType() {
        return this.contentType;
    }

    /**
     * 设置 提供商标识
     */
    public void setPartnerId(java.lang.Long partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * 获取 提供商标识
     */
    public java.lang.Long getPartnerId() {
        return this.partnerId;
    }

    /**
     * 设置 内容的名称
     */
    public void setContentName(java.lang.String contentName) {
        this.contentName = contentName;
    }

    /**
     * 获取 内容的名称
     */
    public java.lang.String getContentName() {
        return this.contentName;
    }

    /**
     * 设置 内容的具体描述
     */
    public void setContentDesc(java.lang.String contentDesc) {
        this.contentDesc = contentDesc;
    }

    /**
     * 获取 内容的具体描述
     */
    public java.lang.String getContentDesc() {
        return this.contentDesc;
    }

    /**
     * 设置 记录适用的区域范围，来源COMMON_REGION_ID。
            
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用的区域范围，来源COMMON_REGION_ID。
            
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001。
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
     * 设置 状态变更的时间
            
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间
            
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
