package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义增值产品之间的关联关系
 * @实体表  :VA_PROD_REL
 */
public class VaProdRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "VA_PROD_REL_S";

    /**
     * 增值产品关系的主键
     */
    public java.lang.Long vaProdRelId;

    /**
     * 增值产品的标识，主键
     */
    public java.lang.Long aVaProdId;

    /**
     * 增值产品的标识，主键
     */
    public java.lang.Long zVaProdId;

    /**
     * 关系类型。LOVB=PRD-C-0012
     */
    public java.lang.String relType;

    /**
     * 记录复合产品构成角色ID。
     */
    public java.lang.Long roleId;

    /**
     * 关联实例最大数量。
     */
    public java.lang.Long maxNum;

    /**
     * 关联实例最小数量。
     */
    public java.lang.Long minNum;

    /**
     * 记录关系的生效时间。
     */
    public java.util.Date effDate;

    /**
     * 记录关系的失效时间。
     */
    public java.util.Date expDate;

    /**
     * 记录关系的适用区域，来源COMMON_REGION_ID。
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
     * 设置 增值产品关系的主键
     */
    public void setVaProdRelId(java.lang.Long vaProdRelId) {
        this.vaProdRelId = vaProdRelId;
    }

    /**
     * 获取 增值产品关系的主键
     */
    public java.lang.Long getVaProdRelId() {
        return this.vaProdRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.vaProdRelId = SeqUtils.createLongId(ID_SEQ);
         return this.vaProdRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 增值产品的标识，主键
     */
    public void setAVaProdId(java.lang.Long aVaProdId) {
        this.aVaProdId = aVaProdId;
    }

    /**
     * 获取 增值产品的标识，主键
     */
    public java.lang.Long getAVaProdId() {
        return this.aVaProdId;
    }

    /**
     * 设置 增值产品的标识，主键
     */
    public void setZVaProdId(java.lang.Long zVaProdId) {
        this.zVaProdId = zVaProdId;
    }

    /**
     * 获取 增值产品的标识，主键
     */
    public java.lang.Long getZVaProdId() {
        return this.zVaProdId;
    }

    /**
     * 设置 关系类型。LOVB=PRD-C-0012
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 关系类型。LOVB=PRD-C-0012
     */
    public java.lang.String getRelType() {
        return this.relType;
    }

    /**
     * 设置 记录复合产品构成角色ID。
     */
    public void setRoleId(java.lang.Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取 记录复合产品构成角色ID。
     */
    public java.lang.Long getRoleId() {
        return this.roleId;
    }

    /**
     * 设置 关联实例最大数量。
     */
    public void setMaxNum(java.lang.Long maxNum) {
        this.maxNum = maxNum;
    }

    /**
     * 获取 关联实例最大数量。
     */
    public java.lang.Long getMaxNum() {
        return this.maxNum;
    }

    /**
     * 设置 关联实例最小数量。
     */
    public void setMinNum(java.lang.Long minNum) {
        this.minNum = minNum;
    }

    /**
     * 获取 关联实例最小数量。
     */
    public java.lang.Long getMinNum() {
        return this.minNum;
    }

    /**
     * 设置 记录关系的生效时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录关系的生效时间。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录关系的失效时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录关系的失效时间。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 记录关系的适用区域，来源COMMON_REGION_ID。
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录关系的适用区域，来源COMMON_REGION_ID。
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
