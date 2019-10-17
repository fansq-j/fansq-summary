package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:高额过滤条件，对于每个高额类型定义一套对应的过滤计算规则，包括参考对象标识、条件运算符标识、比较值定义标识等
                                      -&#&
 * @实体表  :HIGHFEE_CONDITION
 */
public class HighfeeConditionDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "HIGHFEE_CONDITION_S";

    /**
     * 高额过滤条件标识
     */
    public java.lang.Integer highfeeCondId;

    /**
     * 高额类型标识
     */
    public java.lang.Integer highfeeTypeId;

    /**
     * 参考值定义标识
     */
    public java.lang.Integer refValueId;

    /**
     * 条件运算标识
     */
    public java.lang.Integer operatorId;

    /**
     * 比较值定义标识，引用定价参考值实体中的记录
     */
    public java.lang.Integer compValueId;

    /**
     * 分组标识，对过滤条件进行分组。同一组的每行可以自行约定为与或或的逻辑
     */
    public java.lang.Integer groupId;

    /**
     * LOVB=PRC-C-0026
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
     * 设置 高额过滤条件标识
     */
    public void setHighfeeCondId(java.lang.Integer highfeeCondId) {
        this.highfeeCondId = highfeeCondId;
    }

    /**
     * 获取 高额过滤条件标识
     */
    public java.lang.Integer getHighfeeCondId() {
        return this.highfeeCondId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.highfeeCondId = SeqUtils.createIntegerId(ID_SEQ);
         return this.highfeeCondId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 高额类型标识
     */
    public void setHighfeeTypeId(java.lang.Integer highfeeTypeId) {
        this.highfeeTypeId = highfeeTypeId;
    }

    /**
     * 获取 高额类型标识
     */
    public java.lang.Integer getHighfeeTypeId() {
        return this.highfeeTypeId;
    }

    /**
     * 设置 参考值定义标识
     */
    public void setRefValueId(java.lang.Integer refValueId) {
        this.refValueId = refValueId;
    }

    /**
     * 获取 参考值定义标识
     */
    public java.lang.Integer getRefValueId() {
        return this.refValueId;
    }

    /**
     * 设置 条件运算标识
     */
    public void setOperatorId(java.lang.Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 获取 条件运算标识
     */
    public java.lang.Integer getOperatorId() {
        return this.operatorId;
    }

    /**
     * 设置 比较值定义标识，引用定价参考值实体中的记录
     */
    public void setCompValueId(java.lang.Integer compValueId) {
        this.compValueId = compValueId;
    }

    /**
     * 获取 比较值定义标识，引用定价参考值实体中的记录
     */
    public java.lang.Integer getCompValueId() {
        return this.compValueId;
    }

    /**
     * 设置 分组标识，对过滤条件进行分组。同一组的每行可以自行约定为与或或的逻辑
     */
    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取 分组标识，对过滤条件进行分组。同一组的每行可以自行约定为与或或的逻辑
     */
    public java.lang.Integer getGroupId() {
        return this.groupId;
    }

    /**
     * 设置 LOVB=PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PRC-C-0026
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
