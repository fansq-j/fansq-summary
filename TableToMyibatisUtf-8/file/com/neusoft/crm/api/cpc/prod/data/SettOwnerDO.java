package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:佣金属主定义表用于定义定价参考对象归属的具体实例，如属主可以是产品实例、销售品实例或渠道实例等。
 * @实体表  :SETT_OWNER
 */
public class SettOwnerDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SETT_OWNER_S";

    /**
     * 佣金属主标识
     */
    public java.lang.Integer settOwnerId;

    /**
     * 佣金属主名称
     */
    public java.lang.String settOwnerName;

    /**
     * 包括本产品实例,本客户,本帐户,本事件,销售品对象、具有某些相同属性的产品实例集合的产品实例集合等。
            LOVB=PRC-C-0056
            1	产品实例
            2	销售品实例
            3	事件
            4	客户
            5	指定类别的产品实例总集
            6              渠道
            7              经营主体
            8              工号
     */
    public java.lang.Integer ownerObjectType;

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
     * 设置 佣金属主标识
     */
    public void setSettOwnerId(java.lang.Integer settOwnerId) {
        this.settOwnerId = settOwnerId;
    }

    /**
     * 获取 佣金属主标识
     */
    public java.lang.Integer getSettOwnerId() {
        return this.settOwnerId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.settOwnerId = SeqUtils.createIntegerId(ID_SEQ);
         return this.settOwnerId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 佣金属主名称
     */
    public void setSettOwnerName(java.lang.String settOwnerName) {
        this.settOwnerName = settOwnerName;
    }

    /**
     * 获取 佣金属主名称
     */
    public java.lang.String getSettOwnerName() {
        return this.settOwnerName;
    }

    /**
     * 设置 包括本产品实例,本客户,本帐户,本事件,销售品对象、具有某些相同属性的产品实例集合的产品实例集合等。
            LOVB=PRC-C-0056
            1	产品实例
            2	销售品实例
            3	事件
            4	客户
            5	指定类别的产品实例总集
            6              渠道
            7              经营主体
            8              工号
     */
    public void setOwnerObjectType(java.lang.Integer ownerObjectType) {
        this.ownerObjectType = ownerObjectType;
    }

    /**
     * 获取 包括本产品实例,本客户,本帐户,本事件,销售品对象、具有某些相同属性的产品实例集合的产品实例集合等。
            LOVB=PRC-C-0056
            1	产品实例
            2	销售品实例
            3	事件
            4	客户
            5	指定类别的产品实例总集
            6              渠道
            7              经营主体
            8              工号
     */
    public java.lang.Integer getOwnerObjectType() {
        return this.ownerObjectType;
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
