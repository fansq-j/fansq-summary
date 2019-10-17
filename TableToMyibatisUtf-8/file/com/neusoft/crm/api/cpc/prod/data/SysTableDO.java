package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录系统功能实现中涉及的物理库表信息。
 * @实体表  :SYS_TABLE
 */
public class SysTableDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SYS_TABLE_S";

    /**
     * 记录物理库表的主键
     */
    public java.lang.Long tabId;

    /**
     * 记录物理库表的名称
     */
    public java.lang.String tabName;

    /**
     * 记录物理库表的类型，LOVB=PUB-C-0011
     */
    public java.lang.String tabType;

    /**
     * 记录表主键字段名，类似prod_inst_attr.prod_inst_attr_id
     */
    public java.lang.String tabKeyColName;

    /**
     * 记录纵表实例字段名，类似prod_inst_attr.prod_inst_id
     */
    public java.lang.String slaTabInstColName;

    /**
     * 记录纵表属性字段名，类似prod_inst_attr.attr_id
     */
    public java.lang.String slaTabAttrColName;

    /**
     * 记录纵表属性值字段名，类似prod_inst_attr.attr_value
     */
    public java.lang.String slaTabAttrValColName;

    /**
     * 记录归属主表标识
     */
    public java.lang.Long mstrTabId;

    /**
     * 记录版本号
     */
    public java.lang.Integer verNum;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录的创建员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录的修改员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录的创建时间
     */
    public java.util.Date createDate;

    /**
     * 状态的修改时间
     */
    public java.util.Date statusDate;

    /**
     * 记录的修改时间
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录物理库表的主键
     */
    public void setTabId(java.lang.Long tabId) {
        this.tabId = tabId;
    }

    /**
     * 获取 记录物理库表的主键
     */
    public java.lang.Long getTabId() {
        return this.tabId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.tabId = SeqUtils.createLongId(ID_SEQ);
         return this.tabId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录物理库表的名称
     */
    public void setTabName(java.lang.String tabName) {
        this.tabName = tabName;
    }

    /**
     * 获取 记录物理库表的名称
     */
    public java.lang.String getTabName() {
        return this.tabName;
    }

    /**
     * 设置 记录物理库表的类型，LOVB=PUB-C-0011
     */
    public void setTabType(java.lang.String tabType) {
        this.tabType = tabType;
    }

    /**
     * 获取 记录物理库表的类型，LOVB=PUB-C-0011
     */
    public java.lang.String getTabType() {
        return this.tabType;
    }

    /**
     * 设置 记录表主键字段名，类似prod_inst_attr.prod_inst_attr_id
     */
    public void setTabKeyColName(java.lang.String tabKeyColName) {
        this.tabKeyColName = tabKeyColName;
    }

    /**
     * 获取 记录表主键字段名，类似prod_inst_attr.prod_inst_attr_id
     */
    public java.lang.String getTabKeyColName() {
        return this.tabKeyColName;
    }

    /**
     * 设置 记录纵表实例字段名，类似prod_inst_attr.prod_inst_id
     */
    public void setSlaTabInstColName(java.lang.String slaTabInstColName) {
        this.slaTabInstColName = slaTabInstColName;
    }

    /**
     * 获取 记录纵表实例字段名，类似prod_inst_attr.prod_inst_id
     */
    public java.lang.String getSlaTabInstColName() {
        return this.slaTabInstColName;
    }

    /**
     * 设置 记录纵表属性字段名，类似prod_inst_attr.attr_id
     */
    public void setSlaTabAttrColName(java.lang.String slaTabAttrColName) {
        this.slaTabAttrColName = slaTabAttrColName;
    }

    /**
     * 获取 记录纵表属性字段名，类似prod_inst_attr.attr_id
     */
    public java.lang.String getSlaTabAttrColName() {
        return this.slaTabAttrColName;
    }

    /**
     * 设置 记录纵表属性值字段名，类似prod_inst_attr.attr_value
     */
    public void setSlaTabAttrValColName(java.lang.String slaTabAttrValColName) {
        this.slaTabAttrValColName = slaTabAttrValColName;
    }

    /**
     * 获取 记录纵表属性值字段名，类似prod_inst_attr.attr_value
     */
    public java.lang.String getSlaTabAttrValColName() {
        return this.slaTabAttrValColName;
    }

    /**
     * 设置 记录归属主表标识
     */
    public void setMstrTabId(java.lang.Long mstrTabId) {
        this.mstrTabId = mstrTabId;
    }

    /**
     * 获取 记录归属主表标识
     */
    public java.lang.Long getMstrTabId() {
        return this.mstrTabId;
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
     * 设置 记录的创建员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录的创建员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录的修改员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录的修改员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录的创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录的创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态的修改时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态的修改时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录的修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录的修改时间
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
