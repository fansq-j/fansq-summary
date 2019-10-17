package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:批量任务预处理
 * @实体表  :BATCH_TASK_SOURCE
 */
public class BatchTaskSourceDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BATCH_TASK_SOURCE_S";

    /**
     * 批量源明细标识
     */
    public java.lang.Long batchTaskSourceId;

    /**
     * 文件队列标识
     */
    public java.lang.Long batchTaskId;

    /**
     * 文件行号
     */
    public java.lang.Integer fileRowId;

    /**
     * 导入列1
     */
    public java.lang.String col1;

    /**
     * 导入列2
     */
    public java.lang.String col2;

    /**
     * 导入列3
     */
    public java.lang.String col3;

    /**
     * 导入列4
     */
    public java.lang.String col4;

    /**
     * 导入列5
     */
    public java.lang.String col5;

    /**
     * 导入列6
     */
    public java.lang.String col6;

    /**
     * 导入列7
     */
    public java.lang.String col7;

    /**
     * 导入列8
     */
    public java.lang.String col8;

    /**
     * 导入列9
     */
    public java.lang.String col9;

    /**
     * 导入列10
     */
    public java.lang.String col10;

    /**
     * 导入列11
     */
    public java.lang.String col11;

    /**
     * 导入列12
     */
    public java.lang.String col12;

    /**
     * 导入列13
     */
    public java.lang.String col13;

    /**
     * 导入列14
     */
    public java.lang.String col14;

    /**
     * 导入列15
     */
    public java.lang.String col15;

    /**
     * 导入列16
     */
    public java.lang.String col16;

    /**
     * 导入列17
     */
    public java.lang.String col17;

    /**
     * 导入列18
     */
    public java.lang.String col18;

    /**
     * 导入列19
     */
    public java.lang.String col19;

    /**
     * 导入列20
     */
    public java.lang.String col20;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
     */
    public java.util.Date statusDate;

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
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 批量源明细标识
     */
    public void setBatchTaskSourceId(java.lang.Long batchTaskSourceId) {
        this.batchTaskSourceId = batchTaskSourceId;
    }

    /**
     * 获取 批量源明细标识
     */
    public java.lang.Long getBatchTaskSourceId() {
        return this.batchTaskSourceId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.batchTaskSourceId = SeqUtils.createLongId(ID_SEQ);
         return this.batchTaskSourceId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 文件队列标识
     */
    public void setBatchTaskId(java.lang.Long batchTaskId) {
        this.batchTaskId = batchTaskId;
    }

    /**
     * 获取 文件队列标识
     */
    public java.lang.Long getBatchTaskId() {
        return this.batchTaskId;
    }

    /**
     * 设置 文件行号
     */
    public void setFileRowId(java.lang.Integer fileRowId) {
        this.fileRowId = fileRowId;
    }

    /**
     * 获取 文件行号
     */
    public java.lang.Integer getFileRowId() {
        return this.fileRowId;
    }

    /**
     * 设置 导入列1
     */
    public void setCol1(java.lang.String col1) {
        this.col1 = col1;
    }

    /**
     * 获取 导入列1
     */
    public java.lang.String getCol1() {
        return this.col1;
    }

    /**
     * 设置 导入列2
     */
    public void setCol2(java.lang.String col2) {
        this.col2 = col2;
    }

    /**
     * 获取 导入列2
     */
    public java.lang.String getCol2() {
        return this.col2;
    }

    /**
     * 设置 导入列3
     */
    public void setCol3(java.lang.String col3) {
        this.col3 = col3;
    }

    /**
     * 获取 导入列3
     */
    public java.lang.String getCol3() {
        return this.col3;
    }

    /**
     * 设置 导入列4
     */
    public void setCol4(java.lang.String col4) {
        this.col4 = col4;
    }

    /**
     * 获取 导入列4
     */
    public java.lang.String getCol4() {
        return this.col4;
    }

    /**
     * 设置 导入列5
     */
    public void setCol5(java.lang.String col5) {
        this.col5 = col5;
    }

    /**
     * 获取 导入列5
     */
    public java.lang.String getCol5() {
        return this.col5;
    }

    /**
     * 设置 导入列6
     */
    public void setCol6(java.lang.String col6) {
        this.col6 = col6;
    }

    /**
     * 获取 导入列6
     */
    public java.lang.String getCol6() {
        return this.col6;
    }

    /**
     * 设置 导入列7
     */
    public void setCol7(java.lang.String col7) {
        this.col7 = col7;
    }

    /**
     * 获取 导入列7
     */
    public java.lang.String getCol7() {
        return this.col7;
    }

    /**
     * 设置 导入列8
     */
    public void setCol8(java.lang.String col8) {
        this.col8 = col8;
    }

    /**
     * 获取 导入列8
     */
    public java.lang.String getCol8() {
        return this.col8;
    }

    /**
     * 设置 导入列9
     */
    public void setCol9(java.lang.String col9) {
        this.col9 = col9;
    }

    /**
     * 获取 导入列9
     */
    public java.lang.String getCol9() {
        return this.col9;
    }

    /**
     * 设置 导入列10
     */
    public void setCol10(java.lang.String col10) {
        this.col10 = col10;
    }

    /**
     * 获取 导入列10
     */
    public java.lang.String getCol10() {
        return this.col10;
    }

    /**
     * 设置 导入列11
     */
    public void setCol11(java.lang.String col11) {
        this.col11 = col11;
    }

    /**
     * 获取 导入列11
     */
    public java.lang.String getCol11() {
        return this.col11;
    }

    /**
     * 设置 导入列12
     */
    public void setCol12(java.lang.String col12) {
        this.col12 = col12;
    }

    /**
     * 获取 导入列12
     */
    public java.lang.String getCol12() {
        return this.col12;
    }

    /**
     * 设置 导入列13
     */
    public void setCol13(java.lang.String col13) {
        this.col13 = col13;
    }

    /**
     * 获取 导入列13
     */
    public java.lang.String getCol13() {
        return this.col13;
    }

    /**
     * 设置 导入列14
     */
    public void setCol14(java.lang.String col14) {
        this.col14 = col14;
    }

    /**
     * 获取 导入列14
     */
    public java.lang.String getCol14() {
        return this.col14;
    }

    /**
     * 设置 导入列15
     */
    public void setCol15(java.lang.String col15) {
        this.col15 = col15;
    }

    /**
     * 获取 导入列15
     */
    public java.lang.String getCol15() {
        return this.col15;
    }

    /**
     * 设置 导入列16
     */
    public void setCol16(java.lang.String col16) {
        this.col16 = col16;
    }

    /**
     * 获取 导入列16
     */
    public java.lang.String getCol16() {
        return this.col16;
    }

    /**
     * 设置 导入列17
     */
    public void setCol17(java.lang.String col17) {
        this.col17 = col17;
    }

    /**
     * 获取 导入列17
     */
    public java.lang.String getCol17() {
        return this.col17;
    }

    /**
     * 设置 导入列18
     */
    public void setCol18(java.lang.String col18) {
        this.col18 = col18;
    }

    /**
     * 获取 导入列18
     */
    public java.lang.String getCol18() {
        return this.col18;
    }

    /**
     * 设置 导入列19
     */
    public void setCol19(java.lang.String col19) {
        this.col19 = col19;
    }

    /**
     * 获取 导入列19
     */
    public java.lang.String getCol19() {
        return this.col19;
    }

    /**
     * 设置 导入列20
     */
    public void setCol20(java.lang.String col20) {
        this.col20 = col20;
    }

    /**
     * 获取 导入列20
     */
    public java.lang.String getCol20() {
        return this.col20;
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
     * 设置 记录状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
