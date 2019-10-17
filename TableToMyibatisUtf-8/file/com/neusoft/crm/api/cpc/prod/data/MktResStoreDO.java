package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录了营销资源仓库。
 * @实体表  :MKT_RES_STORE
 */
public class MktResStoreDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_STORE_S";

    /**
     * 营销资源仓库标识
     */
    public java.lang.Integer mktResStoreId;

    /**
     * 记录营销资源仓库编码编码。
     */
    public java.lang.String mktResStoreNbr;

    /**
     * 记录仓库名称。
     */
    public java.lang.String mktResStoreName;

    /**
     * 记录盘存时间。
     */
    public java.util.Date checkDate;

    /**
     * 记录上级库存标识。UP_STORE_ID -->PAR_STORE_ID。修改为上级仓库标识。
     */
    public java.lang.Integer parStoreId;

    /**
     * 记录资源回收的目标库存标识。待讨论。
     */
    public java.lang.Integer recStoreId;

    /**
     * 记录号码的回收方式：本地网回收，管理机构回收，回收池回收，回收池回收并回放，默认管理机构回收。LOVB=RES-C-0015
     */
    public java.lang.String recType;

    /**
     * 记录号码回收期限：必须输入（天数，默认90天）@20050414
     */
    public java.lang.Integer recDay;

    /**
     * 记录营销资源仓库的类型，LOVB=RES-0001
     */
    public java.lang.String storeType;

    /**
     * 记录营销资源仓库的小类型，LOVB=RES-C-0003
     */
    public java.lang.String storeSubType;

    /**
     * 仓库层级，LOVB=RES-C-0016
     */
    public java.lang.String storeGrade;

    /**
     * 记录仓库正式启用的时间
     */
    public java.util.Date effDate;

    /**
     * 记录仓库正式失效的时间。
     */
    public java.util.Date expDate;

    /**
     * 记录营销资源仓库状态。LOVB=RES-0002
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 备注。
     */
    public java.lang.String remark;

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
     * 本地网标识
     */
    public java.lang.Long lanId;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Long regionId;

    /**
     * 设置 营销资源仓库标识
     */
    public void setMktResStoreId(java.lang.Integer mktResStoreId) {
        this.mktResStoreId = mktResStoreId;
    }

    /**
     * 获取 营销资源仓库标识
     */
    public java.lang.Integer getMktResStoreId() {
        return this.mktResStoreId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.mktResStoreId = SeqUtils.createIntegerId(ID_SEQ);
         return this.mktResStoreId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 记录营销资源仓库编码编码。
     */
    public void setMktResStoreNbr(java.lang.String mktResStoreNbr) {
        this.mktResStoreNbr = mktResStoreNbr;
    }

    /**
     * 获取 记录营销资源仓库编码编码。
     */
    public java.lang.String getMktResStoreNbr() {
        return this.mktResStoreNbr;
    }

    /**
     * 设置 记录仓库名称。
     */
    public void setMktResStoreName(java.lang.String mktResStoreName) {
        this.mktResStoreName = mktResStoreName;
    }

    /**
     * 获取 记录仓库名称。
     */
    public java.lang.String getMktResStoreName() {
        return this.mktResStoreName;
    }

    /**
     * 设置 记录盘存时间。
     */
    public void setCheckDate(java.util.Date checkDate) {
        this.checkDate = checkDate;
    }

    /**
     * 获取 记录盘存时间。
     */
    public java.util.Date getCheckDate() {
        return this.checkDate;
    }

    /**
     * 设置 记录上级库存标识。UP_STORE_ID -->PAR_STORE_ID。修改为上级仓库标识。
     */
    public void setParStoreId(java.lang.Integer parStoreId) {
        this.parStoreId = parStoreId;
    }

    /**
     * 获取 记录上级库存标识。UP_STORE_ID -->PAR_STORE_ID。修改为上级仓库标识。
     */
    public java.lang.Integer getParStoreId() {
        return this.parStoreId;
    }

    /**
     * 设置 记录资源回收的目标库存标识。待讨论。
     */
    public void setRecStoreId(java.lang.Integer recStoreId) {
        this.recStoreId = recStoreId;
    }

    /**
     * 获取 记录资源回收的目标库存标识。待讨论。
     */
    public java.lang.Integer getRecStoreId() {
        return this.recStoreId;
    }

    /**
     * 设置 记录号码的回收方式：本地网回收，管理机构回收，回收池回收，回收池回收并回放，默认管理机构回收。LOVB=RES-C-0015
     */
    public void setRecType(java.lang.String recType) {
        this.recType = recType;
    }

    /**
     * 获取 记录号码的回收方式：本地网回收，管理机构回收，回收池回收，回收池回收并回放，默认管理机构回收。LOVB=RES-C-0015
     */
    public java.lang.String getRecType() {
        return this.recType;
    }

    /**
     * 设置 记录号码回收期限：必须输入（天数，默认90天）@20050414
     */
    public void setRecDay(java.lang.Integer recDay) {
        this.recDay = recDay;
    }

    /**
     * 获取 记录号码回收期限：必须输入（天数，默认90天）@20050414
     */
    public java.lang.Integer getRecDay() {
        return this.recDay;
    }

    /**
     * 设置 记录营销资源仓库的类型，LOVB=RES-0001
     */
    public void setStoreType(java.lang.String storeType) {
        this.storeType = storeType;
    }

    /**
     * 获取 记录营销资源仓库的类型，LOVB=RES-0001
     */
    public java.lang.String getStoreType() {
        return this.storeType;
    }

    /**
     * 设置 记录营销资源仓库的小类型，LOVB=RES-C-0003
     */
    public void setStoreSubType(java.lang.String storeSubType) {
        this.storeSubType = storeSubType;
    }

    /**
     * 获取 记录营销资源仓库的小类型，LOVB=RES-C-0003
     */
    public java.lang.String getStoreSubType() {
        return this.storeSubType;
    }

    /**
     * 设置 仓库层级，LOVB=RES-C-0016
     */
    public void setStoreGrade(java.lang.String storeGrade) {
        this.storeGrade = storeGrade;
    }

    /**
     * 获取 仓库层级，LOVB=RES-C-0016
     */
    public java.lang.String getStoreGrade() {
        return this.storeGrade;
    }

    /**
     * 设置 记录仓库正式启用的时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录仓库正式启用的时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录仓库正式失效的时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录仓库正式失效的时间。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 记录营销资源仓库状态。LOVB=RES-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录营销资源仓库状态。LOVB=RES-0002
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

    /**
     * 设置 备注。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注。
     */
    public java.lang.String getRemark() {
        return this.remark;
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
     * 设置 本地网标识
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 本地网标识
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

}
