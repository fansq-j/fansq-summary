package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:将可用于积分兑换的可选包、营销资源等，定义为积分可兑换货品。
 * @实体表  :POINT_EXCH_GOODS
 */
public class PointExchGoodsDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_EXCH_GOODS_S";

    /**
     * 积分兑换货品标识，作为主键
     */
    public java.lang.Integer pointExchGoodsId;

    /**
     * 积分兑换货品对象类型，LOVB=POI-C-0005
     */
    public java.lang.String goodsObjType;

    /**
     * 货品对象标识，指向货品对象类型对应的实体
     */
    public java.lang.Long goodsObjId;

    /**
     * 生效日期
     */
    public java.util.Date effDate;

    /**
     * 失效日期
     */
    public java.util.Date expDate;

    /**
     * 状态，LOVB=PUB-C-0001
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
     * 记录状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 设置 积分兑换货品标识，作为主键
     */
    public void setPointExchGoodsId(java.lang.Integer pointExchGoodsId) {
        this.pointExchGoodsId = pointExchGoodsId;
    }

    /**
     * 获取 积分兑换货品标识，作为主键
     */
    public java.lang.Integer getPointExchGoodsId() {
        return this.pointExchGoodsId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pointExchGoodsId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pointExchGoodsId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 积分兑换货品对象类型，LOVB=POI-C-0005
     */
    public void setGoodsObjType(java.lang.String goodsObjType) {
        this.goodsObjType = goodsObjType;
    }

    /**
     * 获取 积分兑换货品对象类型，LOVB=POI-C-0005
     */
    public java.lang.String getGoodsObjType() {
        return this.goodsObjType;
    }

    /**
     * 设置 货品对象标识，指向货品对象类型对应的实体
     */
    public void setGoodsObjId(java.lang.Long goodsObjId) {
        this.goodsObjId = goodsObjId;
    }

    /**
     * 获取 货品对象标识，指向货品对象类型对应的实体
     */
    public java.lang.Long getGoodsObjId() {
        return this.goodsObjId;
    }

    /**
     * 设置 生效日期
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效日期
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效日期
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效日期
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 状态，LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态，LOVB=PUB-C-0001
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
     * 设置 记录状态变更的时间。
            
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间。
            
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

}
