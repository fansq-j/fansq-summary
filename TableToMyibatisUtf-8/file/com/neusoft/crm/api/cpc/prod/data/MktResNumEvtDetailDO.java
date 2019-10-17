package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述号码出入库详细信息，数据量太多，独立分表。按照号码、卡分别建一套表。
 * @实体表  :MKT_RES_NUM_EVT_DETAIL
 */
public class MktResNumEvtDetailDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_NUM_EVT_DETAIL_S";

    /**
     * 营销资源库存变动事件明细ID
     */
    public java.lang.Long mktResChngEvtDetailId;

    /**
     * 营销资源仓库标识，记录事件影响的仓库
     */
    public java.lang.Integer mktResStoreId;

    /**
     * 营销资源实例标识
     */
    public java.lang.Long mktResInstId;

    /**
     * 营销资源库存变动事件标识
     */
    public java.lang.Long mktResEventId;

    /**
     * 记录出入库类型，LOVB=RES-0006
     */
    public java.lang.String chngType;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 本地网
     */
    public java.lang.Long lanId;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Long regionId;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 营销资源库存变动事件明细ID
     */
    public void setMktResChngEvtDetailId(java.lang.Long mktResChngEvtDetailId) {
        this.mktResChngEvtDetailId = mktResChngEvtDetailId;
    }

    /**
     * 获取 营销资源库存变动事件明细ID
     */
    public java.lang.Long getMktResChngEvtDetailId() {
        return this.mktResChngEvtDetailId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktResChngEvtDetailId = SeqUtils.createLongId(ID_SEQ);
         return this.mktResChngEvtDetailId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 营销资源仓库标识，记录事件影响的仓库
     */
    public void setMktResStoreId(java.lang.Integer mktResStoreId) {
        this.mktResStoreId = mktResStoreId;
    }

    /**
     * 获取 营销资源仓库标识，记录事件影响的仓库
     */
    public java.lang.Integer getMktResStoreId() {
        return this.mktResStoreId;
    }

    /**
     * 设置 营销资源实例标识
     */
    public void setMktResInstId(java.lang.Long mktResInstId) {
        this.mktResInstId = mktResInstId;
    }

    /**
     * 获取 营销资源实例标识
     */
    public java.lang.Long getMktResInstId() {
        return this.mktResInstId;
    }

    /**
     * 设置 营销资源库存变动事件标识
     */
    public void setMktResEventId(java.lang.Long mktResEventId) {
        this.mktResEventId = mktResEventId;
    }

    /**
     * 获取 营销资源库存变动事件标识
     */
    public java.lang.Long getMktResEventId() {
        return this.mktResEventId;
    }

    /**
     * 设置 记录出入库类型，LOVB=RES-0006
     */
    public void setChngType(java.lang.String chngType) {
        this.chngType = chngType;
    }

    /**
     * 获取 记录出入库类型，LOVB=RES-0006
     */
    public java.lang.String getChngType() {
        return this.chngType;
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
     * 设置 记录首次创建的员工标识。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间。
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 本地网
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 本地网
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

    /**
     * 设置 指向公共管理区域标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 指向公共管理区域标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
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
