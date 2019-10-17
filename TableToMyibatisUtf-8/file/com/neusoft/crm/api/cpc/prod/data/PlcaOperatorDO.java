package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:运算符的运算方法定义。
1  (+)：双目运算，返回精度取运算参数中精度最大的类型。支持整型和浮点之间的运算
 * @实体表  :PLCA_OPERATOR
 */
public class PlcaOperatorDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PLCA_OPERATOR_S";

    /**
     * LOVB=PLC-C-0040
     */
    public java.lang.Integer operatorId;

    /**
     * 对运算符进行命名，配置成英文运算符比较容易识别
     */
    public java.lang.String operatorName;

    /**
     * 1 - 单目运算符
            2 - 双目运算符
            3 - 三目运算符
     */
    public java.lang.Integer operandCnt;

    /**
     * LOVB=PLC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 LOVB=PLC-C-0040
     */
    public void setOperatorId(java.lang.Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 获取 LOVB=PLC-C-0040
     */
    public java.lang.Integer getOperatorId() {
        return this.operatorId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.operatorId = SeqUtils.createIntegerId(ID_SEQ);
         return this.operatorId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 对运算符进行命名，配置成英文运算符比较容易识别
     */
    public void setOperatorName(java.lang.String operatorName) {
        this.operatorName = operatorName;
    }

    /**
     * 获取 对运算符进行命名，配置成英文运算符比较容易识别
     */
    public java.lang.String getOperatorName() {
        return this.operatorName;
    }

    /**
     * 设置 1 - 单目运算符
            2 - 双目运算符
            3 - 三目运算符
     */
    public void setOperandCnt(java.lang.Integer operandCnt) {
        this.operandCnt = operandCnt;
    }

    /**
     * 获取 1 - 单目运算符
            2 - 双目运算符
            3 - 三目运算符
     */
    public java.lang.Integer getOperandCnt() {
        return this.operandCnt;
    }

    /**
     * 设置 LOVB=PLC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PLC-C-0026
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
