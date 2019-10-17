package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述增值产品销售品与增值产品的关联关系
 * @实体表  :VA_OFFER_PROD_REL
 */
public class VaOfferProdRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "VA_OFFER_PROD_REL_S";

    /**
     * 销售品产品关联主键
     */
    public java.lang.Long offerProdRelId;

    /**
     * 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public java.lang.Long vaOfferId;

    /**
     * 增值产品的标识，主键
     */
    public java.lang.Long vaProdId;

    /**
     * 缺省数量
     */
    public java.lang.Integer defaultCount;

    /**
     * 约束类型。LOVB=OFF-C-0004
     */
    public java.lang.String rstrType;

    /**
     * 最小数量
     */
    public java.lang.Integer minNum;

    /**
     * 最大数量
     */
    public java.lang.Integer maxNum;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 角色标识
     */
    public java.lang.Long roleId;

    /**
     * 区域标识，指向公共管理区域标识
     */
    public java.lang.Long regionId;

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
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 销售品产品关联主键
     */
    public void setOfferProdRelId(java.lang.Long offerProdRelId) {
        this.offerProdRelId = offerProdRelId;
    }

    /**
     * 获取 销售品产品关联主键
     */
    public java.lang.Long getOfferProdRelId() {
        return this.offerProdRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerProdRelId = SeqUtils.createLongId(ID_SEQ);
         return this.offerProdRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public void setVaOfferId(java.lang.Long vaOfferId) {
        this.vaOfferId = vaOfferId;
    }

    /**
     * 获取 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public java.lang.Long getVaOfferId() {
        return this.vaOfferId;
    }

    /**
     * 设置 增值产品的标识，主键
     */
    public void setVaProdId(java.lang.Long vaProdId) {
        this.vaProdId = vaProdId;
    }

    /**
     * 获取 增值产品的标识，主键
     */
    public java.lang.Long getVaProdId() {
        return this.vaProdId;
    }

    /**
     * 设置 缺省数量
     */
    public void setDefaultCount(java.lang.Integer defaultCount) {
        this.defaultCount = defaultCount;
    }

    /**
     * 获取 缺省数量
     */
    public java.lang.Integer getDefaultCount() {
        return this.defaultCount;
    }

    /**
     * 设置 约束类型。LOVB=OFF-C-0004
     */
    public void setRstrType(java.lang.String rstrType) {
        this.rstrType = rstrType;
    }

    /**
     * 获取 约束类型。LOVB=OFF-C-0004
     */
    public java.lang.String getRstrType() {
        return this.rstrType;
    }

    /**
     * 设置 最小数量
     */
    public void setMinNum(java.lang.Integer minNum) {
        this.minNum = minNum;
    }

    /**
     * 获取 最小数量
     */
    public java.lang.Integer getMinNum() {
        return this.minNum;
    }

    /**
     * 设置 最大数量
     */
    public void setMaxNum(java.lang.Integer maxNum) {
        this.maxNum = maxNum;
    }

    /**
     * 获取 最大数量
     */
    public java.lang.Integer getMaxNum() {
        return this.maxNum;
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
     * 设置 角色标识
     */
    public void setRoleId(java.lang.Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取 角色标识
     */
    public java.lang.Long getRoleId() {
        return this.roleId;
    }

    /**
     * 设置 区域标识，指向公共管理区域标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 区域标识，指向公共管理区域标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
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
