package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:对系统涉及对象的抽象表达，可以根据实际需要定义业务对象。销售品、产品的配置在专门定义的表中表达，不在主数据配置中表达。
 * @实体表  :BUSI_OBJ
 */
public class BusiObjDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BUSI_OBJ_S";

    /**
     * 记录业务对象主键
     */
    public java.lang.Long busiObjId;

    /**
     * 记录业务大类主键
     */
    public java.lang.Long busiTypeId;

    /**
     * 记录父级业务对象标识
     */
    public java.lang.Long parBusiObjId;

    /**
     * 记录业务对象名称
     */
    public java.lang.String busiObjName;

    /**
     * 记录业务对象编码
     */
    public java.lang.String busiObjNbr;

    /**
     * 记录业务对象描述
     */
    public java.lang.String busiObjDesc;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录适用区域标识
     */
    public java.lang.Long applyRegionId;

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
     * 记录版本号
     */
    public java.lang.Integer verNum;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录业务对象主键
     */
    public void setBusiObjId(java.lang.Long busiObjId) {
        this.busiObjId = busiObjId;
    }

    /**
     * 获取 记录业务对象主键
     */
    public java.lang.Long getBusiObjId() {
        return this.busiObjId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.busiObjId = SeqUtils.createLongId(ID_SEQ);
         return this.busiObjId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录业务大类主键
     */
    public void setBusiTypeId(java.lang.Long busiTypeId) {
        this.busiTypeId = busiTypeId;
    }

    /**
     * 获取 记录业务大类主键
     */
    public java.lang.Long getBusiTypeId() {
        return this.busiTypeId;
    }

    /**
     * 设置 记录父级业务对象标识
     */
    public void setParBusiObjId(java.lang.Long parBusiObjId) {
        this.parBusiObjId = parBusiObjId;
    }

    /**
     * 获取 记录父级业务对象标识
     */
    public java.lang.Long getParBusiObjId() {
        return this.parBusiObjId;
    }

    /**
     * 设置 记录业务对象名称
     */
    public void setBusiObjName(java.lang.String busiObjName) {
        this.busiObjName = busiObjName;
    }

    /**
     * 获取 记录业务对象名称
     */
    public java.lang.String getBusiObjName() {
        return this.busiObjName;
    }

    /**
     * 设置 记录业务对象编码
     */
    public void setBusiObjNbr(java.lang.String busiObjNbr) {
        this.busiObjNbr = busiObjNbr;
    }

    /**
     * 获取 记录业务对象编码
     */
    public java.lang.String getBusiObjNbr() {
        return this.busiObjNbr;
    }

    /**
     * 设置 记录业务对象描述
     */
    public void setBusiObjDesc(java.lang.String busiObjDesc) {
        this.busiObjDesc = busiObjDesc;
    }

    /**
     * 获取 记录业务对象描述
     */
    public java.lang.String getBusiObjDesc() {
        return this.busiObjDesc;
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
     * 设置 记录适用区域标识
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用区域标识
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
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
     * 设置 记录版本号
     */
    public void setVerNum(java.lang.Integer verNum) {
        this.verNum = verNum;
    }

    /**
     * 获取 记录版本号
     */
    public java.lang.Integer getVerNum() {
        return this.verNum;
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
