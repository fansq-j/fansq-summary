package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:对余额类型进行具体定义，例：现金预存、银行预存、本地网充值卡预存等。
 * @实体表  :BALANCE_TYPE
 */
public class BalanceTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BALANCE_TYPE_S";

    /**
     * 余额帐本所属的余额类型。ACC-C-0009
     */
    public java.lang.Integer balanceTypeId;

    /**
     * 余额类型优先级
     */
    public java.lang.Integer priority;

    /**
     * 为每种专款专用生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public java.lang.Integer spePaymentId;

    /**
     * 度量方法的标识
     */
    public java.lang.Integer measureMethodId;

    /**
     * 余额类型的名称。
     */
    public java.lang.String balanceTypeName;

    /**
     * 属于本余额产品的余额是否允许提取。ACC-C-0044
     */
    public java.lang.Integer allowDraw;

    /**
     * 提供发票标识，LOVB=ACC-C-0044
     */
    public java.lang.Integer invOffer;

    /**
     * 是否抵收入，LOVB=ACC-C-0044
     */
    public java.lang.Integer ifEarning;

    /**
     * 是否抵旧欠，LOVB=ACC-C-0044
     */
    public java.lang.Integer ifPayold;

    /**
     * 是否滚存，LOVB=ACC-C-0044
     */
    public java.lang.Integer ifSaveback;

    /**
     * 是否本金，LOVB=ACC-C-0044
     */
    public java.lang.Integer ifPrincipal;

    /**
     * 是否允许前台操作，LOVB=ACC-C-0044
     */
    public java.lang.Integer operFlag;

    /**
     * 是否允许转入转出，LOVB=ACC-C-0044
     */
    public java.lang.Integer transFlag;

    /**
     * 归属区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 记录创建员工号
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改员工号
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建时间
     */
    public java.util.Date createDate;

    /**
     * 记录状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 余额帐本所属的余额类型。ACC-C-0009
     */
    public void setBalanceTypeId(java.lang.Integer balanceTypeId) {
        this.balanceTypeId = balanceTypeId;
    }

    /**
     * 获取 余额帐本所属的余额类型。ACC-C-0009
     */
    public java.lang.Integer getBalanceTypeId() {
        return this.balanceTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.balanceTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.balanceTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 余额类型优先级
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 余额类型优先级
     */
    public java.lang.Integer getPriority() {
        return this.priority;
    }

    /**
     * 设置 为每种专款专用生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public void setSpePaymentId(java.lang.Integer spePaymentId) {
        this.spePaymentId = spePaymentId;
    }

    /**
     * 获取 为每种专款专用生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public java.lang.Integer getSpePaymentId() {
        return this.spePaymentId;
    }

    /**
     * 设置 度量方法的标识
     */
    public void setMeasureMethodId(java.lang.Integer measureMethodId) {
        this.measureMethodId = measureMethodId;
    }

    /**
     * 获取 度量方法的标识
     */
    public java.lang.Integer getMeasureMethodId() {
        return this.measureMethodId;
    }

    /**
     * 设置 余额类型的名称。
     */
    public void setBalanceTypeName(java.lang.String balanceTypeName) {
        this.balanceTypeName = balanceTypeName;
    }

    /**
     * 获取 余额类型的名称。
     */
    public java.lang.String getBalanceTypeName() {
        return this.balanceTypeName;
    }

    /**
     * 设置 属于本余额产品的余额是否允许提取。ACC-C-0044
     */
    public void setAllowDraw(java.lang.Integer allowDraw) {
        this.allowDraw = allowDraw;
    }

    /**
     * 获取 属于本余额产品的余额是否允许提取。ACC-C-0044
     */
    public java.lang.Integer getAllowDraw() {
        return this.allowDraw;
    }

    /**
     * 设置 提供发票标识，LOVB=ACC-C-0044
     */
    public void setInvOffer(java.lang.Integer invOffer) {
        this.invOffer = invOffer;
    }

    /**
     * 获取 提供发票标识，LOVB=ACC-C-0044
     */
    public java.lang.Integer getInvOffer() {
        return this.invOffer;
    }

    /**
     * 设置 是否抵收入，LOVB=ACC-C-0044
     */
    public void setIfEarning(java.lang.Integer ifEarning) {
        this.ifEarning = ifEarning;
    }

    /**
     * 获取 是否抵收入，LOVB=ACC-C-0044
     */
    public java.lang.Integer getIfEarning() {
        return this.ifEarning;
    }

    /**
     * 设置 是否抵旧欠，LOVB=ACC-C-0044
     */
    public void setIfPayold(java.lang.Integer ifPayold) {
        this.ifPayold = ifPayold;
    }

    /**
     * 获取 是否抵旧欠，LOVB=ACC-C-0044
     */
    public java.lang.Integer getIfPayold() {
        return this.ifPayold;
    }

    /**
     * 设置 是否滚存，LOVB=ACC-C-0044
     */
    public void setIfSaveback(java.lang.Integer ifSaveback) {
        this.ifSaveback = ifSaveback;
    }

    /**
     * 获取 是否滚存，LOVB=ACC-C-0044
     */
    public java.lang.Integer getIfSaveback() {
        return this.ifSaveback;
    }

    /**
     * 设置 是否本金，LOVB=ACC-C-0044
     */
    public void setIfPrincipal(java.lang.Integer ifPrincipal) {
        this.ifPrincipal = ifPrincipal;
    }

    /**
     * 获取 是否本金，LOVB=ACC-C-0044
     */
    public java.lang.Integer getIfPrincipal() {
        return this.ifPrincipal;
    }

    /**
     * 设置 是否允许前台操作，LOVB=ACC-C-0044
     */
    public void setOperFlag(java.lang.Integer operFlag) {
        this.operFlag = operFlag;
    }

    /**
     * 获取 是否允许前台操作，LOVB=ACC-C-0044
     */
    public java.lang.Integer getOperFlag() {
        return this.operFlag;
    }

    /**
     * 设置 是否允许转入转出，LOVB=ACC-C-0044
     */
    public void setTransFlag(java.lang.Integer transFlag) {
        this.transFlag = transFlag;
    }

    /**
     * 获取 是否允许转入转出，LOVB=ACC-C-0044
     */
    public java.lang.Integer getTransFlag() {
        return this.transFlag;
    }

    /**
     * 设置 归属区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 归属区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 记录状态，LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建员工号
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建员工号
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改员工号
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改员工号
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
