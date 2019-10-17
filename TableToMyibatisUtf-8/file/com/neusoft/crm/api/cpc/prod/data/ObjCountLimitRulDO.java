package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:1、描述销售品关联的产品成员，用于表达这个组成员数量取值范围。
2、描述销售品组内可选销售品的限制。
                                        -&
 * @实体表  :OBJ_COUNT_LIMIT_RUL
 */
public class ObjCountLimitRulDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OBJ_COUNT_LIMIT_RUL_S";

    /**
     * 记录限制数量标识
     */
    public java.lang.Long limitCountId;

    /**
     * 记录数量限制规则名称
     */
    public java.lang.String name;

    /**
     * 记录数量限制描述
     */
    public java.lang.String limitDesc;

    /**
     * 限制类型：1）可以用于销售品成员产品构成。2）用于销售品，3）用于产品。LOVB=OFF-C-0054
     */
    public java.lang.String limitType;

    /**
     * 记录对象标识。 主要有：1-销售品标识，2-产品标识，3-构成对象标识
     */
    public java.lang.Long objId;

    /**
     * 记录最大值
     */
    public java.lang.String maxValue;

    /**
     * 记录最小值
     */
    public java.lang.String minValue;

    /**
     * 状态。LOVB=PUB-C-0001。
            
     */
    public java.lang.String statusCd;

    /**
     * 记录备注信息
     */
    public java.lang.String remark;

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
     * 设置 记录限制数量标识
     */
    public void setLimitCountId(java.lang.Long limitCountId) {
        this.limitCountId = limitCountId;
    }

    /**
     * 获取 记录限制数量标识
     */
    public java.lang.Long getLimitCountId() {
        return this.limitCountId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.limitCountId = SeqUtils.createLongId(ID_SEQ);
         return this.limitCountId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录数量限制规则名称
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * 获取 记录数量限制规则名称
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * 设置 记录数量限制描述
     */
    public void setLimitDesc(java.lang.String limitDesc) {
        this.limitDesc = limitDesc;
    }

    /**
     * 获取 记录数量限制描述
     */
    public java.lang.String getLimitDesc() {
        return this.limitDesc;
    }

    /**
     * 设置 限制类型：1）可以用于销售品成员产品构成。2）用于销售品，3）用于产品。LOVB=OFF-C-0054
     */
    public void setLimitType(java.lang.String limitType) {
        this.limitType = limitType;
    }

    /**
     * 获取 限制类型：1）可以用于销售品成员产品构成。2）用于销售品，3）用于产品。LOVB=OFF-C-0054
     */
    public java.lang.String getLimitType() {
        return this.limitType;
    }

    /**
     * 设置 记录对象标识。 主要有：1-销售品标识，2-产品标识，3-构成对象标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 记录对象标识。 主要有：1-销售品标识，2-产品标识，3-构成对象标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 记录最大值
     */
    public void setMaxValue(java.lang.String maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * 获取 记录最大值
     */
    public java.lang.String getMaxValue() {
        return this.maxValue;
    }

    /**
     * 设置 记录最小值
     */
    public void setMinValue(java.lang.String minValue) {
        this.minValue = minValue;
    }

    /**
     * 获取 记录最小值
     */
    public java.lang.String getMinValue() {
        return this.minValue;
    }

    /**
     * 设置 状态。LOVB=PUB-C-0001。
            
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态。LOVB=PUB-C-0001。
            
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录备注信息
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息
     */
    public java.lang.String getRemark() {
        return this.remark;
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

}
