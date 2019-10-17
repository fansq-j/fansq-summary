package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:根据应用场景，可以将不同的注智标签进行分组
 * @实体表  :INJECTION_LABEL_GRP
 */
public class InjectionLabelGrpDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "INJECTION_LABEL_GRP_S";

    /**
     * 注智标签组的主键
     */
    public java.lang.Long grpId;

    /**
     * 注智标签组标准编码
     */
    public java.lang.String grpNbr;

    /**
     * 注智标签组的名称
     */
    public java.lang.String grpName;

    /**
     * 注智标签组的详细描述信息
     */
    public java.lang.String grpDesc;

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
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 注智标签组的主键
     */
    public void setGrpId(java.lang.Long grpId) {
        this.grpId = grpId;
    }

    /**
     * 获取 注智标签组的主键
     */
    public java.lang.Long getGrpId() {
        return this.grpId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.grpId = SeqUtils.createLongId(ID_SEQ);
         return this.grpId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 注智标签组标准编码
     */
    public void setGrpNbr(java.lang.String grpNbr) {
        this.grpNbr = grpNbr;
    }

    /**
     * 获取 注智标签组标准编码
     */
    public java.lang.String getGrpNbr() {
        return this.grpNbr;
    }

    /**
     * 设置 注智标签组的名称
     */
    public void setGrpName(java.lang.String grpName) {
        this.grpName = grpName;
    }

    /**
     * 获取 注智标签组的名称
     */
    public java.lang.String getGrpName() {
        return this.grpName;
    }

    /**
     * 设置 注智标签组的详细描述信息
     */
    public void setGrpDesc(java.lang.String grpDesc) {
        this.grpDesc = grpDesc;
    }

    /**
     * 获取 注智标签组的详细描述信息
     */
    public java.lang.String getGrpDesc() {
        return this.grpDesc;
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
