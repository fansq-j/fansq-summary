package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:对条件判断中使用的参考值进行定义。

 * @实体表  :PLCA_REF_VALUE
 */
public class PlcaRefValueDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PLCA_REF_VALUE_S";

    /**
     * 参考值的唯一标识
     */
    public java.lang.Integer refValueId;

    /**
     * 对参考值进行命名
     */
    public java.lang.String refValueName;

    /**
     * 定义参考值取值于系统中的哪个字段，如果这个参考值定义的是产品标识，则这个字段填'PRODUCT_ID'。
     */
    public java.lang.String fieldName;

    /**
     * LOVB=PLC-C-0004
     */
    public java.lang.Integer valueType;

    /**
     * LOVB=PLC-C-0005
     */
    public java.lang.Integer refValueType;

    /**
     * LOVB=PLC-C-0006
     */
    public java.lang.Integer propertyType;

    /**
     * LOVB=PLC-C-0007
     */
    public java.lang.Integer ownerObjectType;

    /**
     * 当参考值类型为1-参考对象且PROPERTY_TYPE=1-外部属性、2-内部属性、8 - 附属产品、9 - 量本
     */
    public java.lang.Integer propertyDefineId;

    /**
     * 当参考值类型为2 - 常量且数值类型不为数组类型时有效。
            支持整型、浮点型、字符串类型的常量
            布尔类型的常量只能配置成小写的true或false
     */
    public java.lang.String valueString;

    /**
     * 当参考值类型为 3 - 引用其他参考值运算后的结果 时有效。
     */
    public java.lang.Integer leftRefValueId;

    /**
     * 当参考值类型为 3 - 引用其他参考值运算后的结果 时有效。
     */
    public java.lang.Integer operatorId;

    /**
     * 当参考值类型为 3 - 引用其他参考值运算后的结果 时有效。
            如果是单目运算，这个字段就不填。
     */
    public java.lang.Integer rightRefValueId;

    /**
     * 运算精度
     */
    public java.lang.Integer calcPrecision;

    /**
     * LOVB=PLC-C-0008
     */
    public java.lang.Integer calcPrecisionMethod;

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
     * 设置 参考值的唯一标识
     */
    public void setRefValueId(java.lang.Integer refValueId) {
        this.refValueId = refValueId;
    }

    /**
     * 获取 参考值的唯一标识
     */
    public java.lang.Integer getRefValueId() {
        return this.refValueId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.refValueId = SeqUtils.createIntegerId(ID_SEQ);
         return this.refValueId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 对参考值进行命名
     */
    public void setRefValueName(java.lang.String refValueName) {
        this.refValueName = refValueName;
    }

    /**
     * 获取 对参考值进行命名
     */
    public java.lang.String getRefValueName() {
        return this.refValueName;
    }

    /**
     * 设置 定义参考值取值于系统中的哪个字段，如果这个参考值定义的是产品标识，则这个字段填'PRODUCT_ID'。
     */
    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * 获取 定义参考值取值于系统中的哪个字段，如果这个参考值定义的是产品标识，则这个字段填'PRODUCT_ID'。
     */
    public java.lang.String getFieldName() {
        return this.fieldName;
    }

    /**
     * 设置 LOVB=PLC-C-0004
     */
    public void setValueType(java.lang.Integer valueType) {
        this.valueType = valueType;
    }

    /**
     * 获取 LOVB=PLC-C-0004
     */
    public java.lang.Integer getValueType() {
        return this.valueType;
    }

    /**
     * 设置 LOVB=PLC-C-0005
     */
    public void setRefValueType(java.lang.Integer refValueType) {
        this.refValueType = refValueType;
    }

    /**
     * 获取 LOVB=PLC-C-0005
     */
    public java.lang.Integer getRefValueType() {
        return this.refValueType;
    }

    /**
     * 设置 LOVB=PLC-C-0006
     */
    public void setPropertyType(java.lang.Integer propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * 获取 LOVB=PLC-C-0006
     */
    public java.lang.Integer getPropertyType() {
        return this.propertyType;
    }

    /**
     * 设置 LOVB=PLC-C-0007
     */
    public void setOwnerObjectType(java.lang.Integer ownerObjectType) {
        this.ownerObjectType = ownerObjectType;
    }

    /**
     * 获取 LOVB=PLC-C-0007
     */
    public java.lang.Integer getOwnerObjectType() {
        return this.ownerObjectType;
    }

    /**
     * 设置 当参考值类型为1-参考对象且PROPERTY_TYPE=1-外部属性、2-内部属性、8 - 附属产品、9 - 量本
     */
    public void setPropertyDefineId(java.lang.Integer propertyDefineId) {
        this.propertyDefineId = propertyDefineId;
    }

    /**
     * 获取 当参考值类型为1-参考对象且PROPERTY_TYPE=1-外部属性、2-内部属性、8 - 附属产品、9 - 量本
     */
    public java.lang.Integer getPropertyDefineId() {
        return this.propertyDefineId;
    }

    /**
     * 设置 当参考值类型为2 - 常量且数值类型不为数组类型时有效。
            支持整型、浮点型、字符串类型的常量
            布尔类型的常量只能配置成小写的true或false
     */
    public void setValueString(java.lang.String valueString) {
        this.valueString = valueString;
    }

    /**
     * 获取 当参考值类型为2 - 常量且数值类型不为数组类型时有效。
            支持整型、浮点型、字符串类型的常量
            布尔类型的常量只能配置成小写的true或false
     */
    public java.lang.String getValueString() {
        return this.valueString;
    }

    /**
     * 设置 当参考值类型为 3 - 引用其他参考值运算后的结果 时有效。
     */
    public void setLeftRefValueId(java.lang.Integer leftRefValueId) {
        this.leftRefValueId = leftRefValueId;
    }

    /**
     * 获取 当参考值类型为 3 - 引用其他参考值运算后的结果 时有效。
     */
    public java.lang.Integer getLeftRefValueId() {
        return this.leftRefValueId;
    }

    /**
     * 设置 当参考值类型为 3 - 引用其他参考值运算后的结果 时有效。
     */
    public void setOperatorId(java.lang.Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 获取 当参考值类型为 3 - 引用其他参考值运算后的结果 时有效。
     */
    public java.lang.Integer getOperatorId() {
        return this.operatorId;
    }

    /**
     * 设置 当参考值类型为 3 - 引用其他参考值运算后的结果 时有效。
            如果是单目运算，这个字段就不填。
     */
    public void setRightRefValueId(java.lang.Integer rightRefValueId) {
        this.rightRefValueId = rightRefValueId;
    }

    /**
     * 获取 当参考值类型为 3 - 引用其他参考值运算后的结果 时有效。
            如果是单目运算，这个字段就不填。
     */
    public java.lang.Integer getRightRefValueId() {
        return this.rightRefValueId;
    }

    /**
     * 设置 运算精度
     */
    public void setCalcPrecision(java.lang.Integer calcPrecision) {
        this.calcPrecision = calcPrecision;
    }

    /**
     * 获取 运算精度
     */
    public java.lang.Integer getCalcPrecision() {
        return this.calcPrecision;
    }

    /**
     * 设置 LOVB=PLC-C-0008
     */
    public void setCalcPrecisionMethod(java.lang.Integer calcPrecisionMethod) {
        this.calcPrecisionMethod = calcPrecisionMethod;
    }

    /**
     * 获取 LOVB=PLC-C-0008
     */
    public java.lang.Integer getCalcPrecisionMethod() {
        return this.calcPrecisionMethod;
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
