package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述业务对象关系规格具体特征的属性信息。
 * @实体表  :REL_SPEC_ATTR
 */
public class RelSpecAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "REL_SPEC_ATTR_S";

    /**
     * 记录关系规格属性主键
     */
    public java.lang.Long relSpecAttrId;

    /**
     * 记录关系规格主键
     */
    public java.lang.Long relSpecId;

    /**
     * 记录业务对象属性规格业务编码
     */
    public java.lang.Long attrId;

    /**
     * 记录物理的实例表标识
     */
    public java.lang.Long tabId;

    /**
     * 记录物理的实例字段标识
     */
    public java.lang.Long colId;

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
     * 设置 记录关系规格属性主键
     */
    public void setRelSpecAttrId(java.lang.Long relSpecAttrId) {
        this.relSpecAttrId = relSpecAttrId;
    }

    /**
     * 获取 记录关系规格属性主键
     */
    public java.lang.Long getRelSpecAttrId() {
        return this.relSpecAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.relSpecAttrId = SeqUtils.createLongId(ID_SEQ);
         return this.relSpecAttrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录关系规格主键
     */
    public void setRelSpecId(java.lang.Long relSpecId) {
        this.relSpecId = relSpecId;
    }

    /**
     * 获取 记录关系规格主键
     */
    public java.lang.Long getRelSpecId() {
        return this.relSpecId;
    }

    /**
     * 设置 记录业务对象属性规格业务编码
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 记录业务对象属性规格业务编码
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
    }

    /**
     * 设置 记录物理的实例表标识
     */
    public void setTabId(java.lang.Long tabId) {
        this.tabId = tabId;
    }

    /**
     * 获取 记录物理的实例表标识
     */
    public java.lang.Long getTabId() {
        return this.tabId;
    }

    /**
     * 设置 记录物理的实例字段标识
     */
    public void setColId(java.lang.Long colId) {
        this.colId = colId;
    }

    /**
     * 获取 记录物理的实例字段标识
     */
    public java.lang.Long getColId() {
        return this.colId;
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
