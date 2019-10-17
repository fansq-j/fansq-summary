package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:积分兑换对象构成记录积分兑换对象的构成货品、构成货品的数量及数量单位
 * @实体表  :POINT_EXCH_OBJ_COMP
 */
public class PointExchObjCompDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_EXCH_OBJ_COMP_S";

    /**
     * 积分兑换对象构成标识，作为主键
     */
    public java.lang.Integer pointExchObjCompId;

    /**
     * 积分兑换对象标识，作为外键，指向积分兑换对象实体
     */
    public java.lang.Integer pointExchObjId;

    /**
     * 积分兑换货品标识，作为外键，指向积分兑换货品实体
     */
    public java.lang.Integer pointExchGoodsId;

    /**
     * 积分兑换货品数量
     */
    public java.lang.Integer pointExchGoodsAmt;

    /**
     * 生效日期
     */
    public java.util.Date effDate;

    /**
     * 失效日期
     */
    public java.util.Date expDate;

    /**
     * 记录创建的员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录修改的员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 状态，LOVB=PUB-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 设置 积分兑换对象构成标识，作为主键
     */
    public void setPointExchObjCompId(java.lang.Integer pointExchObjCompId) {
        this.pointExchObjCompId = pointExchObjCompId;
    }

    /**
     * 获取 积分兑换对象构成标识，作为主键
     */
    public java.lang.Integer getPointExchObjCompId() {
        return this.pointExchObjCompId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pointExchObjCompId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pointExchObjCompId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 积分兑换对象标识，作为外键，指向积分兑换对象实体
     */
    public void setPointExchObjId(java.lang.Integer pointExchObjId) {
        this.pointExchObjId = pointExchObjId;
    }

    /**
     * 获取 积分兑换对象标识，作为外键，指向积分兑换对象实体
     */
    public java.lang.Integer getPointExchObjId() {
        return this.pointExchObjId;
    }

    /**
     * 设置 积分兑换货品标识，作为外键，指向积分兑换货品实体
     */
    public void setPointExchGoodsId(java.lang.Integer pointExchGoodsId) {
        this.pointExchGoodsId = pointExchGoodsId;
    }

    /**
     * 获取 积分兑换货品标识，作为外键，指向积分兑换货品实体
     */
    public java.lang.Integer getPointExchGoodsId() {
        return this.pointExchGoodsId;
    }

    /**
     * 设置 积分兑换货品数量
     */
    public void setPointExchGoodsAmt(java.lang.Integer pointExchGoodsAmt) {
        this.pointExchGoodsAmt = pointExchGoodsAmt;
    }

    /**
     * 获取 积分兑换货品数量
     */
    public java.lang.Integer getPointExchGoodsAmt() {
        return this.pointExchGoodsAmt;
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

}
