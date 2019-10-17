package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:算法定义，描述算法基本信息。
 * @实体表  :MKT_ALGORITHMS
 */
public class MktAlgorithmsDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_ALGORITHMS_S";

    /**
     * 算法定义标识
     */
    public java.lang.Long algoId;

    /**
     * 算法编码
     */
    public java.lang.String algoCode;

    /**
     * 算法名称
     */
    public java.lang.String algoName;

    /**
     * 实现方法
     */
    public java.lang.String handleClass;

    /**
     * 算法描述
     */
    public java.lang.String algoDesc;

    /**
     * 记录状态。LOVB=PUB-C-0001
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
     * 设置 算法定义标识
     */
    public void setAlgoId(java.lang.Long algoId) {
        this.algoId = algoId;
    }

    /**
     * 获取 算法定义标识
     */
    public java.lang.Long getAlgoId() {
        return this.algoId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.algoId = SeqUtils.createLongId(ID_SEQ);
         return this.algoId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 算法编码
     */
    public void setAlgoCode(java.lang.String algoCode) {
        this.algoCode = algoCode;
    }

    /**
     * 获取 算法编码
     */
    public java.lang.String getAlgoCode() {
        return this.algoCode;
    }

    /**
     * 设置 算法名称
     */
    public void setAlgoName(java.lang.String algoName) {
        this.algoName = algoName;
    }

    /**
     * 获取 算法名称
     */
    public java.lang.String getAlgoName() {
        return this.algoName;
    }

    /**
     * 设置 实现方法
     */
    public void setHandleClass(java.lang.String handleClass) {
        this.handleClass = handleClass;
    }

    /**
     * 获取 实现方法
     */
    public java.lang.String getHandleClass() {
        return this.handleClass;
    }

    /**
     * 设置 算法描述
     */
    public void setAlgoDesc(java.lang.String algoDesc) {
        this.algoDesc = algoDesc;
    }

    /**
     * 获取 算法描述
     */
    public java.lang.String getAlgoDesc() {
        return this.algoDesc;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001
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
