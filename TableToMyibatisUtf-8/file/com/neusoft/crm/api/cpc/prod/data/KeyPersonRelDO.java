package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:关键人关系
 * @实体表  :KEY_PERSON_REL
 */
public class KeyPersonRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "KEY_PERSON_REL_S";

    /**
     * 记录关键人关系标识，作为主键
     */
    public java.lang.Long keyPersonRelId;

    /**
     * 记录A关键人标识，作为外键，指向关键人实体
     */
    public java.lang.Long aKeyPersonId;

    /**
     * 记录Z关键人标识，作为外键，指向关键人实体
     */
    public java.lang.Long zKeyPersonId;

    /**
     * 记录关键人的关系类型。LOVB=CUS-C-0026。
     */
    public java.lang.String relType;

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
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录关键人关系标识，作为主键
     */
    public void setKeyPersonRelId(java.lang.Long keyPersonRelId) {
        this.keyPersonRelId = keyPersonRelId;
    }

    /**
     * 获取 记录关键人关系标识，作为主键
     */
    public java.lang.Long getKeyPersonRelId() {
        return this.keyPersonRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.keyPersonRelId = SeqUtils.createLongId(ID_SEQ);
         return this.keyPersonRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录A关键人标识，作为外键，指向关键人实体
     */
    public void setAKeyPersonId(java.lang.Long aKeyPersonId) {
        this.aKeyPersonId = aKeyPersonId;
    }

    /**
     * 获取 记录A关键人标识，作为外键，指向关键人实体
     */
    public java.lang.Long getAKeyPersonId() {
        return this.aKeyPersonId;
    }

    /**
     * 设置 记录Z关键人标识，作为外键，指向关键人实体
     */
    public void setZKeyPersonId(java.lang.Long zKeyPersonId) {
        this.zKeyPersonId = zKeyPersonId;
    }

    /**
     * 获取 记录Z关键人标识，作为外键，指向关键人实体
     */
    public java.lang.Long getZKeyPersonId() {
        return this.zKeyPersonId;
    }

    /**
     * 设置 记录关键人的关系类型。LOVB=CUS-C-0026。
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 记录关键人的关系类型。LOVB=CUS-C-0026。
     */
    public java.lang.String getRelType() {
        return this.relType;
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
