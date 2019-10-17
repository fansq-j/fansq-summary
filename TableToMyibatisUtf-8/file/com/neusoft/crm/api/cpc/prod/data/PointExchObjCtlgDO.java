package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:积分兑换对象按目录树方式进行管理。积分兑换对象目录位置存放积分兑换对象在积分兑换对象目录树上的节点位置。
 * @实体表  :POINT_EXCH_OBJ_CTLG
 */
public class PointExchObjCtlgDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_EXCH_OBJ_CTLG_S";

    /**
     * 积分兑换对象目录位置标识，作为主键
     */
    public java.lang.Integer pointExchObjCtlgId;

    /**
     * 积分兑换对象标识，作为外键，指向积分兑换对象实体
     */
    public java.lang.Integer pointExchObjId;

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
     * 设置 积分兑换对象目录位置标识，作为主键
     */
    public void setPointExchObjCtlgId(java.lang.Integer pointExchObjCtlgId) {
        this.pointExchObjCtlgId = pointExchObjCtlgId;
    }

    /**
     * 获取 积分兑换对象目录位置标识，作为主键
     */
    public java.lang.Integer getPointExchObjCtlgId() {
        return this.pointExchObjCtlgId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pointExchObjCtlgId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pointExchObjCtlgId;
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
