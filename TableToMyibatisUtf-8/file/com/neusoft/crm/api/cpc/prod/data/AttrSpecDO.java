package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:属性是事物固有的特性，是一种事物和其他事物相互联系中所表现出来的性质。由于事物的联系具有广泛性，同一事物就可以具有多方面
 * @实体表  :ATTR_SPEC
 */
public class AttrSpecDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ATTR_SPEC_S";

    /**
     * 记录属性的主键
     */
    public java.lang.Long attrId;

    /**
     * 记录业务大类主键
     */
    public java.lang.Long busiTypeId;

    /**
     * 记录父级属性的标识
     */
    public java.lang.Long parAttrId;

    /**
     * 记录属性编码
     */
    public java.lang.String attrNbr;

    /**
     * 记录业务对象属性规格名称
     */
    public java.lang.String attrName;

    /**
     * 记录业务对象属性规格详细描述
     */
    public java.lang.String attrDesc;

    /**
     * 记录属性规格默认取值
     */
    public java.lang.String defaultValue;

    /**
     * 记录属性规格取值范围之最小值
     */
    public java.lang.String valueFrom;

    /**
     * 记录属性规格取值范围之最大值
     */
    public java.lang.String valueTo;

    /**
     * 记录属性值在业务对象实例中唯一，LOVB=PUB-C-0006
     */
    public java.lang.Integer isUnique;

    /**
     * 记录是否可空，LOVB=PUB-C-0006
     */
    public java.lang.Integer isNullable;

    /**
     * 记录属性值数据类型，LOVB=PUB-C-0014
     */
    public java.lang.String attrValueDataType;

    /**
     * 记录是否动态属性，动态属性在横表，静态属性在纵表，LOVB=PUB-C-0006
     */
    public java.lang.Integer isDanyAttr;

    /**
     * 记录属性值类型，LOVB=PUB-C-0007
     */
    public java.lang.String attrValueType;

    /**
     * 记录属性规格值格式(正则表达式),用于属性值生成、合法性效验
     */
    public java.lang.String attrFormat;

    /**
     * 记录属性规格值长度
     */
    public java.lang.Integer attrLength;

    /**
     * 记录外部属性标识，存集团集约属性标识。
     */
    public java.lang.String extAttrId;

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
     * 设置 记录属性的主键
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 记录属性的主键
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.attrId = SeqUtils.createLongId(ID_SEQ);
         return this.attrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录业务大类主键
     */
    public void setBusiTypeId(java.lang.Long busiTypeId) {
        this.busiTypeId = busiTypeId;
    }

    /**
     * 获取 记录业务大类主键
     */
    public java.lang.Long getBusiTypeId() {
        return this.busiTypeId;
    }

    /**
     * 设置 记录父级属性的标识
     */
    public void setParAttrId(java.lang.Long parAttrId) {
        this.parAttrId = parAttrId;
    }

    /**
     * 获取 记录父级属性的标识
     */
    public java.lang.Long getParAttrId() {
        return this.parAttrId;
    }

    /**
     * 设置 记录属性编码
     */
    public void setAttrNbr(java.lang.String attrNbr) {
        this.attrNbr = attrNbr;
    }

    /**
     * 获取 记录属性编码
     */
    public java.lang.String getAttrNbr() {
        return this.attrNbr;
    }

    /**
     * 设置 记录业务对象属性规格名称
     */
    public void setAttrName(java.lang.String attrName) {
        this.attrName = attrName;
    }

    /**
     * 获取 记录业务对象属性规格名称
     */
    public java.lang.String getAttrName() {
        return this.attrName;
    }

    /**
     * 设置 记录业务对象属性规格详细描述
     */
    public void setAttrDesc(java.lang.String attrDesc) {
        this.attrDesc = attrDesc;
    }

    /**
     * 获取 记录业务对象属性规格详细描述
     */
    public java.lang.String getAttrDesc() {
        return this.attrDesc;
    }

    /**
     * 设置 记录属性规格默认取值
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * 获取 记录属性规格默认取值
     */
    public java.lang.String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * 设置 记录属性规格取值范围之最小值
     */
    public void setValueFrom(java.lang.String valueFrom) {
        this.valueFrom = valueFrom;
    }

    /**
     * 获取 记录属性规格取值范围之最小值
     */
    public java.lang.String getValueFrom() {
        return this.valueFrom;
    }

    /**
     * 设置 记录属性规格取值范围之最大值
     */
    public void setValueTo(java.lang.String valueTo) {
        this.valueTo = valueTo;
    }

    /**
     * 获取 记录属性规格取值范围之最大值
     */
    public java.lang.String getValueTo() {
        return this.valueTo;
    }

    /**
     * 设置 记录属性值在业务对象实例中唯一，LOVB=PUB-C-0006
     */
    public void setIsUnique(java.lang.Integer isUnique) {
        this.isUnique = isUnique;
    }

    /**
     * 获取 记录属性值在业务对象实例中唯一，LOVB=PUB-C-0006
     */
    public java.lang.Integer getIsUnique() {
        return this.isUnique;
    }

    /**
     * 设置 记录是否可空，LOVB=PUB-C-0006
     */
    public void setIsNullable(java.lang.Integer isNullable) {
        this.isNullable = isNullable;
    }

    /**
     * 获取 记录是否可空，LOVB=PUB-C-0006
     */
    public java.lang.Integer getIsNullable() {
        return this.isNullable;
    }

    /**
     * 设置 记录属性值数据类型，LOVB=PUB-C-0014
     */
    public void setAttrValueDataType(java.lang.String attrValueDataType) {
        this.attrValueDataType = attrValueDataType;
    }

    /**
     * 获取 记录属性值数据类型，LOVB=PUB-C-0014
     */
    public java.lang.String getAttrValueDataType() {
        return this.attrValueDataType;
    }

    /**
     * 设置 记录是否动态属性，动态属性在横表，静态属性在纵表，LOVB=PUB-C-0006
     */
    public void setIsDanyAttr(java.lang.Integer isDanyAttr) {
        this.isDanyAttr = isDanyAttr;
    }

    /**
     * 获取 记录是否动态属性，动态属性在横表，静态属性在纵表，LOVB=PUB-C-0006
     */
    public java.lang.Integer getIsDanyAttr() {
        return this.isDanyAttr;
    }

    /**
     * 设置 记录属性值类型，LOVB=PUB-C-0007
     */
    public void setAttrValueType(java.lang.String attrValueType) {
        this.attrValueType = attrValueType;
    }

    /**
     * 获取 记录属性值类型，LOVB=PUB-C-0007
     */
    public java.lang.String getAttrValueType() {
        return this.attrValueType;
    }

    /**
     * 设置 记录属性规格值格式(正则表达式),用于属性值生成、合法性效验
     */
    public void setAttrFormat(java.lang.String attrFormat) {
        this.attrFormat = attrFormat;
    }

    /**
     * 获取 记录属性规格值格式(正则表达式),用于属性值生成、合法性效验
     */
    public java.lang.String getAttrFormat() {
        return this.attrFormat;
    }

    /**
     * 设置 记录属性规格值长度
     */
    public void setAttrLength(java.lang.Integer attrLength) {
        this.attrLength = attrLength;
    }

    /**
     * 获取 记录属性规格值长度
     */
    public java.lang.Integer getAttrLength() {
        return this.attrLength;
    }

    /**
     * 设置 记录外部属性标识，存集团集约属性标识。
     */
    public void setExtAttrId(java.lang.String extAttrId) {
        this.extAttrId = extAttrId;
    }

    /**
     * 获取 记录外部属性标识，存集团集约属性标识。
     */
    public java.lang.String getExtAttrId() {
        return this.extAttrId;
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
