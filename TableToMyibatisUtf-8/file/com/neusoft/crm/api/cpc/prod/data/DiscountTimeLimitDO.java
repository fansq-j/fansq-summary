package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:用于定义优惠执行较复杂的时间方面的限制，如按照某个属性计算生效日期、在多少个帐期内有效等。
 * @实体表  :DISCOUNT_TIME_LIMIT
 */
public class DiscountTimeLimitDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DISCOUNT_TIME_LIMIT_S";

    /**
     * 优惠计算时间限制的标识
     */
    public java.lang.Integer discountTimeLimitId;

    /**
     * 
     */
    public java.lang.String discountTimeName;

    /**
     * 归属的优惠计算记录标识，说明本限制对那个优惠计算有效
     */
    public java.lang.Integer discountExpressId;

    /**
     * 说明该优惠根据何种周期类型确定其生效或失效条件。PRC-C-0008
     */
    public java.lang.Integer discountCycleType;

    /**
     * 该优惠开始生效的时间类别，只后面指定的日期是绝对生效日期还是相对生效日期如可以指定一个具体日期作为绝对生效日期或指定在购买后多少天生效这样的相对生效日期。PRC-C-0005
     */
    public java.lang.Integer beginTimeType;

    /**
     * 用于计算生效时间的定价参考对象，可以引用这个定价参考对象的来确定生效日期
     */
    public java.lang.Integer beginCalcObject;

    /**
     * 开始生效时间的偏移量，用于指定相对生效日期时使用
     */
    public java.lang.Double beginTimeDuration;

    /**
     * 该优惠失效的时间类别，只后面指定的日期是绝对失效日期还是相对失效日期如可以指定一个具体日期作为绝对失效日期或指定在购买后多少天失效这样的相对失效日期。PRC-C-0005
     */
    public java.lang.Integer endTimeType;

    /**
     * 用于计算失效时间的定价参考对象，可以引用这个定价参考对象的来确定失效日期
     */
    public java.lang.Integer endCalcObject;

    /**
     * 失效时间的偏移量，用于指定相对失效日期时使用
     */
    public java.lang.Double endTimeDuration;

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
     * 设置 优惠计算时间限制的标识
     */
    public void setDiscountTimeLimitId(java.lang.Integer discountTimeLimitId) {
        this.discountTimeLimitId = discountTimeLimitId;
    }

    /**
     * 获取 优惠计算时间限制的标识
     */
    public java.lang.Integer getDiscountTimeLimitId() {
        return this.discountTimeLimitId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.discountTimeLimitId = SeqUtils.createIntegerId(ID_SEQ);
         return this.discountTimeLimitId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 
     */
    public void setDiscountTimeName(java.lang.String discountTimeName) {
        this.discountTimeName = discountTimeName;
    }

    /**
     * 获取 
     */
    public java.lang.String getDiscountTimeName() {
        return this.discountTimeName;
    }

    /**
     * 设置 归属的优惠计算记录标识，说明本限制对那个优惠计算有效
     */
    public void setDiscountExpressId(java.lang.Integer discountExpressId) {
        this.discountExpressId = discountExpressId;
    }

    /**
     * 获取 归属的优惠计算记录标识，说明本限制对那个优惠计算有效
     */
    public java.lang.Integer getDiscountExpressId() {
        return this.discountExpressId;
    }

    /**
     * 设置 说明该优惠根据何种周期类型确定其生效或失效条件。PRC-C-0008
     */
    public void setDiscountCycleType(java.lang.Integer discountCycleType) {
        this.discountCycleType = discountCycleType;
    }

    /**
     * 获取 说明该优惠根据何种周期类型确定其生效或失效条件。PRC-C-0008
     */
    public java.lang.Integer getDiscountCycleType() {
        return this.discountCycleType;
    }

    /**
     * 设置 该优惠开始生效的时间类别，只后面指定的日期是绝对生效日期还是相对生效日期如可以指定一个具体日期作为绝对生效日期或指定在购买后多少天生效这样的相对生效日期。PRC-C-0005
     */
    public void setBeginTimeType(java.lang.Integer beginTimeType) {
        this.beginTimeType = beginTimeType;
    }

    /**
     * 获取 该优惠开始生效的时间类别，只后面指定的日期是绝对生效日期还是相对生效日期如可以指定一个具体日期作为绝对生效日期或指定在购买后多少天生效这样的相对生效日期。PRC-C-0005
     */
    public java.lang.Integer getBeginTimeType() {
        return this.beginTimeType;
    }

    /**
     * 设置 用于计算生效时间的定价参考对象，可以引用这个定价参考对象的来确定生效日期
     */
    public void setBeginCalcObject(java.lang.Integer beginCalcObject) {
        this.beginCalcObject = beginCalcObject;
    }

    /**
     * 获取 用于计算生效时间的定价参考对象，可以引用这个定价参考对象的来确定生效日期
     */
    public java.lang.Integer getBeginCalcObject() {
        return this.beginCalcObject;
    }

    /**
     * 设置 开始生效时间的偏移量，用于指定相对生效日期时使用
     */
    public void setBeginTimeDuration(java.lang.Double beginTimeDuration) {
        this.beginTimeDuration = beginTimeDuration;
    }

    /**
     * 获取 开始生效时间的偏移量，用于指定相对生效日期时使用
     */
    public java.lang.Double getBeginTimeDuration() {
        return this.beginTimeDuration;
    }

    /**
     * 设置 该优惠失效的时间类别，只后面指定的日期是绝对失效日期还是相对失效日期如可以指定一个具体日期作为绝对失效日期或指定在购买后多少天失效这样的相对失效日期。PRC-C-0005
     */
    public void setEndTimeType(java.lang.Integer endTimeType) {
        this.endTimeType = endTimeType;
    }

    /**
     * 获取 该优惠失效的时间类别，只后面指定的日期是绝对失效日期还是相对失效日期如可以指定一个具体日期作为绝对失效日期或指定在购买后多少天失效这样的相对失效日期。PRC-C-0005
     */
    public java.lang.Integer getEndTimeType() {
        return this.endTimeType;
    }

    /**
     * 设置 用于计算失效时间的定价参考对象，可以引用这个定价参考对象的来确定失效日期
     */
    public void setEndCalcObject(java.lang.Integer endCalcObject) {
        this.endCalcObject = endCalcObject;
    }

    /**
     * 获取 用于计算失效时间的定价参考对象，可以引用这个定价参考对象的来确定失效日期
     */
    public java.lang.Integer getEndCalcObject() {
        return this.endCalcObject;
    }

    /**
     * 设置 失效时间的偏移量，用于指定相对失效日期时使用
     */
    public void setEndTimeDuration(java.lang.Double endTimeDuration) {
        this.endTimeDuration = endTimeDuration;
    }

    /**
     * 获取 失效时间的偏移量，用于指定相对失效日期时使用
     */
    public java.lang.Double getEndTimeDuration() {
        return this.endTimeDuration;
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
