package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录用户的收藏夹内容。
 * @实体表  :SYSUSER_COLLECTION
 */
public class SysuserCollectionDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SYSUSER_COLLECTION_S";

    /**
     * 收藏标识，主键
     */
    public java.lang.Long collectId;

    /**
     * 系统用户标识，外键
     */
    public java.lang.Long sysUserId;

    /**
     * 收藏人员对应工号
     */
    public java.lang.Long collectStaff;

    /**
     * 收藏时间
     */
    public java.util.Date collectDate;

    /**
     * 收藏内容类型，LOVB=STF-C-0010。
     */
    public java.lang.String contentType;

    /**
     * 收藏内容标识，根据收藏内容类型，关联对应的表主键
     */
    public java.lang.Long contentId;

    /**
     * 收藏排序
     */
    public java.lang.Integer collectSort;

    /**
     * 记录系统用户登录设置的状态，如有效、无效等。
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录系统用户登录设置创建时间
     */
    public java.util.Date createDate;

    /**
     * 记录系统用户登录设置的创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 设置 收藏标识，主键
     */
    public void setCollectId(java.lang.Long collectId) {
        this.collectId = collectId;
    }

    /**
     * 获取 收藏标识，主键
     */
    public java.lang.Long getCollectId() {
        return this.collectId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.collectId = SeqUtils.createLongId(ID_SEQ);
         return this.collectId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 系统用户标识，外键
     */
    public void setSysUserId(java.lang.Long sysUserId) {
        this.sysUserId = sysUserId;
    }

    /**
     * 获取 系统用户标识，外键
     */
    public java.lang.Long getSysUserId() {
        return this.sysUserId;
    }

    /**
     * 设置 收藏人员对应工号
     */
    public void setCollectStaff(java.lang.Long collectStaff) {
        this.collectStaff = collectStaff;
    }

    /**
     * 获取 收藏人员对应工号
     */
    public java.lang.Long getCollectStaff() {
        return this.collectStaff;
    }

    /**
     * 设置 收藏时间
     */
    public void setCollectDate(java.util.Date collectDate) {
        this.collectDate = collectDate;
    }

    /**
     * 获取 收藏时间
     */
    public java.util.Date getCollectDate() {
        return this.collectDate;
    }

    /**
     * 设置 收藏内容类型，LOVB=STF-C-0010。
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }

    /**
     * 获取 收藏内容类型，LOVB=STF-C-0010。
     */
    public java.lang.String getContentType() {
        return this.contentType;
    }

    /**
     * 设置 收藏内容标识，根据收藏内容类型，关联对应的表主键
     */
    public void setContentId(java.lang.Long contentId) {
        this.contentId = contentId;
    }

    /**
     * 获取 收藏内容标识，根据收藏内容类型，关联对应的表主键
     */
    public java.lang.Long getContentId() {
        return this.contentId;
    }

    /**
     * 设置 收藏排序
     */
    public void setCollectSort(java.lang.Integer collectSort) {
        this.collectSort = collectSort;
    }

    /**
     * 获取 收藏排序
     */
    public java.lang.Integer getCollectSort() {
        return this.collectSort;
    }

    /**
     * 设置 记录系统用户登录设置的状态，如有效、无效等。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录系统用户登录设置的状态，如有效、无效等。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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
     * 设置 记录系统用户登录设置创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录系统用户登录设置创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录系统用户登录设置的创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录系统用户登录设置的创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
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

}
