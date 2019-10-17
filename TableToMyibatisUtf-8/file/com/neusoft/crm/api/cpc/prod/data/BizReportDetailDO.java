package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:业务登记单详情表
 * @实体表  :BIZ_REPORT_DETAIL
 */
public class BizReportDetailDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BIZ_REPORT_DETAIL_S";

    /**
     * 业务登记单主键
     */
    public java.lang.Integer bizReportDetailId;

    /**
     * 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public java.lang.Integer offerId;

    /**
     * 编码
     */
    public java.lang.Integer detailCd;

    /**
     * 名称
     */
    public java.lang.String detailName;

    /**
     * 值
     */
    public java.lang.Integer detailValue;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 业务登记单主键
     */
    public void setBizReportDetailId(java.lang.Integer bizReportDetailId) {
        this.bizReportDetailId = bizReportDetailId;
    }

    /**
     * 获取 业务登记单主键
     */
    public java.lang.Integer getBizReportDetailId() {
        return this.bizReportDetailId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.bizReportDetailId = SeqUtils.createIntegerId(ID_SEQ);
         return this.bizReportDetailId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 编码
     */
    public void setDetailCd(java.lang.Integer detailCd) {
        this.detailCd = detailCd;
    }

    /**
     * 获取 编码
     */
    public java.lang.Integer getDetailCd() {
        return this.detailCd;
    }

    /**
     * 设置 名称
     */
    public void setDetailName(java.lang.String detailName) {
        this.detailName = detailName;
    }

    /**
     * 获取 名称
     */
    public java.lang.String getDetailName() {
        return this.detailName;
    }

    /**
     * 设置 值
     */
    public void setDetailValue(java.lang.Integer detailValue) {
        this.detailValue = detailValue;
    }

    /**
     * 获取 值
     */
    public java.lang.Integer getDetailValue() {
        return this.detailValue;
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
     * 设置 记录创建的员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 状态修改的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间
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
