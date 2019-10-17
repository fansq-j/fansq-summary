package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录系统功能实现中涉及物理库表的字段信息。
 * @实体表  :SYS_COLUMN
 */
public class SysColumnDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SYS_COLUMN_S";

    /**
     * 记录字段主键
     */
    public java.lang.Long colId;

    /**
     * 记录表的主键
     */
    public java.lang.Long tabId;

    /**
     * 记录字段名称
     */
    public java.lang.String colName;

    /**
     * 记录字段类型，LOVB=PUB-C-0012
     */
    public java.lang.String colType;

    /**
     * 记录字段描述
     */
    public java.lang.String colDesc;

    /**
     * 记录物理表字段的长度
     */
    public java.lang.Long colLenght;

    /**
     * 记录物理表字段是否可空.LOVB=PUB-C-0006
            
     */
    public java.lang.Integer colNullable;

    /**
     * 记录物理表字段是否外键.LOVB=PUB-C-0006
     */
    public java.lang.Integer colForeignKey;

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
     * 记录状态修改的时间
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
     * 设置 记录字段主键
     */
    public void setColId(java.lang.Long colId) {
        this.colId = colId;
    }

    /**
     * 获取 记录字段主键
     */
    public java.lang.Long getColId() {
        return this.colId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.colId = SeqUtils.createLongId(ID_SEQ);
         return this.colId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录表的主键
     */
    public void setTabId(java.lang.Long tabId) {
        this.tabId = tabId;
    }

    /**
     * 获取 记录表的主键
     */
    public java.lang.Long getTabId() {
        return this.tabId;
    }

    /**
     * 设置 记录字段名称
     */
    public void setColName(java.lang.String colName) {
        this.colName = colName;
    }

    /**
     * 获取 记录字段名称
     */
    public java.lang.String getColName() {
        return this.colName;
    }

    /**
     * 设置 记录字段类型，LOVB=PUB-C-0012
     */
    public void setColType(java.lang.String colType) {
        this.colType = colType;
    }

    /**
     * 获取 记录字段类型，LOVB=PUB-C-0012
     */
    public java.lang.String getColType() {
        return this.colType;
    }

    /**
     * 设置 记录字段描述
     */
    public void setColDesc(java.lang.String colDesc) {
        this.colDesc = colDesc;
    }

    /**
     * 获取 记录字段描述
     */
    public java.lang.String getColDesc() {
        return this.colDesc;
    }

    /**
     * 设置 记录物理表字段的长度
     */
    public void setColLenght(java.lang.Long colLenght) {
        this.colLenght = colLenght;
    }

    /**
     * 获取 记录物理表字段的长度
     */
    public java.lang.Long getColLenght() {
        return this.colLenght;
    }

    /**
     * 设置 记录物理表字段是否可空.LOVB=PUB-C-0006
            
     */
    public void setColNullable(java.lang.Integer colNullable) {
        this.colNullable = colNullable;
    }

    /**
     * 获取 记录物理表字段是否可空.LOVB=PUB-C-0006
            
     */
    public java.lang.Integer getColNullable() {
        return this.colNullable;
    }

    /**
     * 设置 记录物理表字段是否外键.LOVB=PUB-C-0006
     */
    public void setColForeignKey(java.lang.Integer colForeignKey) {
        this.colForeignKey = colForeignKey;
    }

    /**
     * 获取 记录物理表字段是否外键.LOVB=PUB-C-0006
     */
    public java.lang.Integer getColForeignKey() {
        return this.colForeignKey;
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
     * 设置 记录状态修改的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态修改的时间
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
