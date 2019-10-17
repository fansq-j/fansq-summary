package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:积分兑换货品按目录树方式进行管理。积分兑换货品目录位置存放积分兑换货品在积分兑换货品目录树上的节点位置。
 * @实体表  :POINT_EXCH_GOODS_CTLG
 */
public class PointExchGoodsCtlgDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_EXCH_GOODS_CTLG_S";

    /**
     * 积分兑换货品目录位置标识，作为主键
     */
    public java.lang.Integer pointExchGoodsCtlgId;

    /**
     * 积分兑换货品标识，作为外键，指向积分兑换货品实体
     */
    public java.lang.Integer pointExchGoodsId;

    /**
     * 记录目录节点标识，作为外键，指向目录节点实体。
     */
    public java.lang.Long catalogItemId;

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
     * 设置 积分兑换货品目录位置标识，作为主键
     */
    public void setPointExchGoodsCtlgId(java.lang.Integer pointExchGoodsCtlgId) {
        this.pointExchGoodsCtlgId = pointExchGoodsCtlgId;
    }

    /**
     * 获取 积分兑换货品目录位置标识，作为主键
     */
    public java.lang.Integer getPointExchGoodsCtlgId() {
        return this.pointExchGoodsCtlgId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pointExchGoodsCtlgId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pointExchGoodsCtlgId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
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
     * 设置 记录目录节点标识，作为外键，指向目录节点实体。
     */
    public void setCatalogItemId(java.lang.Long catalogItemId) {
        this.catalogItemId = catalogItemId;
    }

    /**
     * 获取 记录目录节点标识，作为外键，指向目录节点实体。
     */
    public java.lang.Long getCatalogItemId() {
        return this.catalogItemId;
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
