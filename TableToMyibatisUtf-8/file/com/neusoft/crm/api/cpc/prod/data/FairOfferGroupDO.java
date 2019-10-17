package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:公允价值套餐组合表(fair_offer_group)描述E9自主版套餐的组成关系，在公允分摊业务流程中增加一个校验规则
 * @实体表  :FAIR_OFFER_GROUP
 */
public class FairOfferGroupDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "FAIR_OFFER_GROUP_S";

    /**
     * 主键
     */
    public java.lang.Integer fairOfferGroupId;

    /**
     * 套餐组合组别标识，一个组别之内表示一个套餐组合规则
     */
    public java.lang.Integer groupId;

    /**
     * 销售品标识
     */
    public java.lang.Integer offerId;

    /**
     * 销售品名称
     */
    public java.lang.String offerName;

    /**
     * a)套餐系列，9TA-主套餐，9TB，9TC关联套餐（9TB和9TC同类型，表示是主套餐的基础套餐）；像e9这样的组合套餐是用3个系列表示，将乐享3G、e8、优惠打折套餐分别用系列标识区分开，例如，打折优惠套餐系列9TA，乐享3G系列9TB，e8系列9TC；
            b)只有主套餐标识对应的销售品才按照新的组合分摊规则处理；
            
     */
    public java.lang.String offerSeries;

    /**
     * 优先级，升序排列，值小的优先级高。用户在同一个系列里面有受理多个套餐，按照优先级顺序来选择；例如，宽带用户原先办理了个包月套餐，后来又和手机一起捆绑受理了e8套餐， 这两个套餐都在系列2的销售品中，则选择优先级别高的套餐
     */
    public java.lang.Integer priorityValue;

    /**
     * 定位标识
     */
    public java.lang.Integer fairOfferId;

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
     * 设置 主键
     */
    public void setFairOfferGroupId(java.lang.Integer fairOfferGroupId) {
        this.fairOfferGroupId = fairOfferGroupId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Integer getFairOfferGroupId() {
        return this.fairOfferGroupId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.fairOfferGroupId = SeqUtils.createIntegerId(ID_SEQ);
         return this.fairOfferGroupId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 套餐组合组别标识，一个组别之内表示一个套餐组合规则
     */
    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取 套餐组合组别标识，一个组别之内表示一个套餐组合规则
     */
    public java.lang.Integer getGroupId() {
        return this.groupId;
    }

    /**
     * 设置 销售品标识
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 销售品标识
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 销售品名称
     */
    public void setOfferName(java.lang.String offerName) {
        this.offerName = offerName;
    }

    /**
     * 获取 销售品名称
     */
    public java.lang.String getOfferName() {
        return this.offerName;
    }

    /**
     * 设置 a)套餐系列，9TA-主套餐，9TB，9TC关联套餐（9TB和9TC同类型，表示是主套餐的基础套餐）；像e9这样的组合套餐是用3个系列表示，将乐享3G、e8、优惠打折套餐分别用系列标识区分开，例如，打折优惠套餐系列9TA，乐享3G系列9TB，e8系列9TC；
            b)只有主套餐标识对应的销售品才按照新的组合分摊规则处理；
            
     */
    public void setOfferSeries(java.lang.String offerSeries) {
        this.offerSeries = offerSeries;
    }

    /**
     * 获取 a)套餐系列，9TA-主套餐，9TB，9TC关联套餐（9TB和9TC同类型，表示是主套餐的基础套餐）；像e9这样的组合套餐是用3个系列表示，将乐享3G、e8、优惠打折套餐分别用系列标识区分开，例如，打折优惠套餐系列9TA，乐享3G系列9TB，e8系列9TC；
            b)只有主套餐标识对应的销售品才按照新的组合分摊规则处理；
            
     */
    public java.lang.String getOfferSeries() {
        return this.offerSeries;
    }

    /**
     * 设置 优先级，升序排列，值小的优先级高。用户在同一个系列里面有受理多个套餐，按照优先级顺序来选择；例如，宽带用户原先办理了个包月套餐，后来又和手机一起捆绑受理了e8套餐， 这两个套餐都在系列2的销售品中，则选择优先级别高的套餐
     */
    public void setPriorityValue(java.lang.Integer priorityValue) {
        this.priorityValue = priorityValue;
    }

    /**
     * 获取 优先级，升序排列，值小的优先级高。用户在同一个系列里面有受理多个套餐，按照优先级顺序来选择；例如，宽带用户原先办理了个包月套餐，后来又和手机一起捆绑受理了e8套餐， 这两个套餐都在系列2的销售品中，则选择优先级别高的套餐
     */
    public java.lang.Integer getPriorityValue() {
        return this.priorityValue;
    }

    /**
     * 设置 定位标识
     */
    public void setFairOfferId(java.lang.Integer fairOfferId) {
        this.fairOfferId = fairOfferId;
    }

    /**
     * 获取 定位标识
     */
    public java.lang.Integer getFairOfferId() {
        return this.fairOfferId;
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
