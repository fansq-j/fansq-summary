package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:广告表
 * @实体表  :BULLETIN
 */
public class BulletinDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BULLETIN_S";

    /**
     * 记录公告的主键
     */
    public java.lang.Long bulletinId;

    /**
     * 记录公告标题
     */
    public java.lang.String bulletinTitle;

    /**
     * 记录公告内容
     */
    public java.lang.String bulletinContent;

    /**
     * 记录公告类型，LOVB=PUB-C-0009
     */
    public java.lang.String bulletinType;

    /**
     * 记录公告等级，LOVB=PUB-C-0016
     */
    public java.lang.String bulletinLevel;

    /**
     * 记录是否置顶,置顶的公告在醒目位置显示，LOVB=PUB-C-0006
     */
    public java.lang.Integer isTop;

    /**
     * 记录发布公告的员工
     */
    public java.lang.Long launchStaff;

    /**
     * 记录发布公告的员工在的组织
     */
    public java.lang.Long launchOrg;

    /**
     * 记录公告的生效时间
     */
    public java.util.Date effDate;

    /**
     * 记录公告的失效时间
     */
    public java.util.Date expDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录的创建员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录的修改员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录的修改时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录公告发布的时间
     */
    public java.util.Date createDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录公告的主键
     */
    public void setBulletinId(java.lang.Long bulletinId) {
        this.bulletinId = bulletinId;
    }

    /**
     * 获取 记录公告的主键
     */
    public java.lang.Long getBulletinId() {
        return this.bulletinId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.bulletinId = SeqUtils.createLongId(ID_SEQ);
         return this.bulletinId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录公告标题
     */
    public void setBulletinTitle(java.lang.String bulletinTitle) {
        this.bulletinTitle = bulletinTitle;
    }

    /**
     * 获取 记录公告标题
     */
    public java.lang.String getBulletinTitle() {
        return this.bulletinTitle;
    }

    /**
     * 设置 记录公告内容
     */
    public void setBulletinContent(java.lang.String bulletinContent) {
        this.bulletinContent = bulletinContent;
    }

    /**
     * 获取 记录公告内容
     */
    public java.lang.String getBulletinContent() {
        return this.bulletinContent;
    }

    /**
     * 设置 记录公告类型，LOVB=PUB-C-0009
     */
    public void setBulletinType(java.lang.String bulletinType) {
        this.bulletinType = bulletinType;
    }

    /**
     * 获取 记录公告类型，LOVB=PUB-C-0009
     */
    public java.lang.String getBulletinType() {
        return this.bulletinType;
    }

    /**
     * 设置 记录公告等级，LOVB=PUB-C-0016
     */
    public void setBulletinLevel(java.lang.String bulletinLevel) {
        this.bulletinLevel = bulletinLevel;
    }

    /**
     * 获取 记录公告等级，LOVB=PUB-C-0016
     */
    public java.lang.String getBulletinLevel() {
        return this.bulletinLevel;
    }

    /**
     * 设置 记录是否置顶,置顶的公告在醒目位置显示，LOVB=PUB-C-0006
     */
    public void setIsTop(java.lang.Integer isTop) {
        this.isTop = isTop;
    }

    /**
     * 获取 记录是否置顶,置顶的公告在醒目位置显示，LOVB=PUB-C-0006
     */
    public java.lang.Integer getIsTop() {
        return this.isTop;
    }

    /**
     * 设置 记录发布公告的员工
     */
    public void setLaunchStaff(java.lang.Long launchStaff) {
        this.launchStaff = launchStaff;
    }

    /**
     * 获取 记录发布公告的员工
     */
    public java.lang.Long getLaunchStaff() {
        return this.launchStaff;
    }

    /**
     * 设置 记录发布公告的员工在的组织
     */
    public void setLaunchOrg(java.lang.Long launchOrg) {
        this.launchOrg = launchOrg;
    }

    /**
     * 获取 记录发布公告的员工在的组织
     */
    public java.lang.Long getLaunchOrg() {
        return this.launchOrg;
    }

    /**
     * 设置 记录公告的生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录公告的生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录公告的失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录公告的失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
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
     * 设置 记录的创建员工。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录的创建员工。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录的修改员工。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录的修改员工。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录的修改时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录的修改时间。
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录状态修改的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态修改的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录公告发布的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录公告发布的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
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
