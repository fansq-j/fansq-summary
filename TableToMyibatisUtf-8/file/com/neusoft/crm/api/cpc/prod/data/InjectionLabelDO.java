package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:注智标签是大数据基于事物固有属性经过统计分析得出的具有一定统计归类意义、用以智慧营销CPC计算的标签。注智标签表描述这类
 * @实体表  :INJECTION_LABEL
 */
public class InjectionLabelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "INJECTION_LABEL_S";

    /**
     * 注智标签标识，主键
     */
    public java.lang.Long injectionLabelId;

    /**
     * 注智标签的编码
     */
    public java.lang.String injectionLabelCode;

    /**
     * 注智标签的名称
     */
    public java.lang.String injectionLabelName;

    /**
     * 注智标签的详细描述信息
     */
    public java.lang.String injectionLabelDesc;

    /**
     * 区分注智标签归属的业务类型;LOVB=CAM-C-0021
            
     */
    public java.lang.String labelType;

    /**
     * 区分注智标签值的类型LOVB=PUB-C-0007
     */
    public java.lang.String labelValueType;

    /**
     * 记录注智标签值的数据类型，LOVB=PUB-C-0014
     */
    public java.lang.String labelDataType;

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
     * 设置 注智标签标识，主键
     */
    public void setInjectionLabelId(java.lang.Long injectionLabelId) {
        this.injectionLabelId = injectionLabelId;
    }

    /**
     * 获取 注智标签标识，主键
     */
    public java.lang.Long getInjectionLabelId() {
        return this.injectionLabelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.injectionLabelId = SeqUtils.createLongId(ID_SEQ);
         return this.injectionLabelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 注智标签的编码
     */
    public void setInjectionLabelCode(java.lang.String injectionLabelCode) {
        this.injectionLabelCode = injectionLabelCode;
    }

    /**
     * 获取 注智标签的编码
     */
    public java.lang.String getInjectionLabelCode() {
        return this.injectionLabelCode;
    }

    /**
     * 设置 注智标签的名称
     */
    public void setInjectionLabelName(java.lang.String injectionLabelName) {
        this.injectionLabelName = injectionLabelName;
    }

    /**
     * 获取 注智标签的名称
     */
    public java.lang.String getInjectionLabelName() {
        return this.injectionLabelName;
    }

    /**
     * 设置 注智标签的详细描述信息
     */
    public void setInjectionLabelDesc(java.lang.String injectionLabelDesc) {
        this.injectionLabelDesc = injectionLabelDesc;
    }

    /**
     * 获取 注智标签的详细描述信息
     */
    public java.lang.String getInjectionLabelDesc() {
        return this.injectionLabelDesc;
    }

    /**
     * 设置 区分注智标签归属的业务类型;LOVB=CAM-C-0021
            
     */
    public void setLabelType(java.lang.String labelType) {
        this.labelType = labelType;
    }

    /**
     * 获取 区分注智标签归属的业务类型;LOVB=CAM-C-0021
            
     */
    public java.lang.String getLabelType() {
        return this.labelType;
    }

    /**
     * 设置 区分注智标签值的类型LOVB=PUB-C-0007
     */
    public void setLabelValueType(java.lang.String labelValueType) {
        this.labelValueType = labelValueType;
    }

    /**
     * 获取 区分注智标签值的类型LOVB=PUB-C-0007
     */
    public java.lang.String getLabelValueType() {
        return this.labelValueType;
    }

    /**
     * 设置 记录注智标签值的数据类型，LOVB=PUB-C-0014
     */
    public void setLabelDataType(java.lang.String labelDataType) {
        this.labelDataType = labelDataType;
    }

    /**
     * 获取 记录注智标签值的数据类型，LOVB=PUB-C-0014
     */
    public java.lang.String getLabelDataType() {
        return this.labelDataType;
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
