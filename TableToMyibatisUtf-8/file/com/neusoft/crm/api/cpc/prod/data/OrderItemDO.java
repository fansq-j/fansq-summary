package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:是对客户订单的分解，对客户各种受理请求信息的结构化展现，根据受理信息类型不同，分为客户订单项、帐户订单项、销售品订单项、
 * @实体表  :ORDER_ITEM
 */
public class OrderItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORDER_ITEM_S";

    /**
     * 记录订单项标识。
     */
    public java.lang.Long orderItemId;

    /**
     * 记录客户订单标识
     */
    public java.lang.Long custOrderId;

    /**
     * 订单经办人信息标识
     */
    public java.lang.Long orderHandlerId;

    /**
     * 记录订单作用对象的服务提供标识。
     */
    public java.lang.Integer serviceOfferId;

    /**
     * 记录订单项的编码。
     */
    public java.lang.String orderItemNbr;

    /**
     * 记录订单项版本号。
     */
    public java.lang.Integer verNum;

    /**
     * 记录订单项的操作类型，LOVB=EVT-C-0003
     */
    public java.lang.String operType;

    /**
     * 记录本次业务的鉴权方式,LOVB=CUS-C-0015
     */
    public java.lang.String authType;

    /**
     * 记录上级订单项标识，例如功能产品订单项上记录接入产品订单项标识。
     */
    public java.lang.Long parOrderItemId;

    /**
     * 订单项类型，LOVB=EVT-0003
     */
    public java.lang.String orderItemCd;

    /**
     * 记录订单作用对象的规格标识，例如产品订单项的产品标识。
     */
    public java.lang.Long applyObjSpec;

    /**
     * 作用对象标识，记录订单作用的客户、帐户、销售品实例、产品实例等。
     */
    public java.lang.Long objId;

    /**
     * 记录优先级。
     */
    public java.lang.Integer priority;

    /**
     * 记录是否预受理。LOVB=PUB-C-0006
     */
    public java.lang.String preHandleFlag;

    /**
     * 记录初次受理时间，改单时不再修改。
     */
    public java.util.Date acceptDate;

    /**
     * 记录OSS施工返回的业务开通时间。
     */
    public java.util.Date openDate;

    /**
     * 记录订单的归属本地网，同作用对象的本地网。
     */
    public java.lang.Long belongLanId;

    /**
     * 记录订单的归属区域，同作用对象的区域。指向公共管理区域标识
     */
    public java.lang.Long regionId;

    /**
     * 记录受理本地网标识。
     */
    public java.lang.Long acceptLanId;

    /**
     * 记录受理区域标识，指向公共管理区域
     */
    public java.lang.Long acceptRegionId;

    /**
     * 记录订单项的归属客户，同作用对象的产权客户。
     */
    public java.lang.Long belongCustId;

    /**
     * 记录订单来源，例如IPAD或某个APP产生的订单，或从前台或批量的方式受理产生的订单。LOVB=EVT-C-0001
     */
    public java.lang.String orderSource;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 记录状态，LOVB=EVT-0001
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的系统岗位标识。
     */
    public java.lang.Long createPost;

    /**
     * 记录首次创建的组织机构标识。
     */
    public java.lang.Long createOrgId;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录每次修改的系统岗位标识。
     */
    public java.lang.Long updatePost;

    /**
     * 记录每次修改的组织机构标识。
     */
    public java.lang.Long updateOrg;

    /**
     * 记录外部订单项标识
     */
    public java.lang.String extOrderItemId;

    /**
     * 设置 记录订单项标识。
     */
    public void setOrderItemId(java.lang.Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 获取 记录订单项标识。
     */
    public java.lang.Long getOrderItemId() {
        return this.orderItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.orderItemId = SeqUtils.createLongId(ID_SEQ);
         return this.orderItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录客户订单标识
     */
    public void setCustOrderId(java.lang.Long custOrderId) {
        this.custOrderId = custOrderId;
    }

    /**
     * 获取 记录客户订单标识
     */
    public java.lang.Long getCustOrderId() {
        return this.custOrderId;
    }

    /**
     * 设置 订单经办人信息标识
     */
    public void setOrderHandlerId(java.lang.Long orderHandlerId) {
        this.orderHandlerId = orderHandlerId;
    }

    /**
     * 获取 订单经办人信息标识
     */
    public java.lang.Long getOrderHandlerId() {
        return this.orderHandlerId;
    }

    /**
     * 设置 记录订单作用对象的服务提供标识。
     */
    public void setServiceOfferId(java.lang.Integer serviceOfferId) {
        this.serviceOfferId = serviceOfferId;
    }

    /**
     * 获取 记录订单作用对象的服务提供标识。
     */
    public java.lang.Integer getServiceOfferId() {
        return this.serviceOfferId;
    }

    /**
     * 设置 记录订单项的编码。
     */
    public void setOrderItemNbr(java.lang.String orderItemNbr) {
        this.orderItemNbr = orderItemNbr;
    }

    /**
     * 获取 记录订单项的编码。
     */
    public java.lang.String getOrderItemNbr() {
        return this.orderItemNbr;
    }

    /**
     * 设置 记录订单项版本号。
     */
    public void setVerNum(java.lang.Integer verNum) {
        this.verNum = verNum;
    }

    /**
     * 获取 记录订单项版本号。
     */
    public java.lang.Integer getVerNum() {
        return this.verNum;
    }

    /**
     * 设置 记录订单项的操作类型，LOVB=EVT-C-0003
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 记录订单项的操作类型，LOVB=EVT-C-0003
     */
    public java.lang.String getOperType() {
        return this.operType;
    }

    /**
     * 设置 记录本次业务的鉴权方式,LOVB=CUS-C-0015
     */
    public void setAuthType(java.lang.String authType) {
        this.authType = authType;
    }

    /**
     * 获取 记录本次业务的鉴权方式,LOVB=CUS-C-0015
     */
    public java.lang.String getAuthType() {
        return this.authType;
    }

    /**
     * 设置 记录上级订单项标识，例如功能产品订单项上记录接入产品订单项标识。
     */
    public void setParOrderItemId(java.lang.Long parOrderItemId) {
        this.parOrderItemId = parOrderItemId;
    }

    /**
     * 获取 记录上级订单项标识，例如功能产品订单项上记录接入产品订单项标识。
     */
    public java.lang.Long getParOrderItemId() {
        return this.parOrderItemId;
    }

    /**
     * 设置 订单项类型，LOVB=EVT-0003
     */
    public void setOrderItemCd(java.lang.String orderItemCd) {
        this.orderItemCd = orderItemCd;
    }

    /**
     * 获取 订单项类型，LOVB=EVT-0003
     */
    public java.lang.String getOrderItemCd() {
        return this.orderItemCd;
    }

    /**
     * 设置 记录订单作用对象的规格标识，例如产品订单项的产品标识。
     */
    public void setApplyObjSpec(java.lang.Long applyObjSpec) {
        this.applyObjSpec = applyObjSpec;
    }

    /**
     * 获取 记录订单作用对象的规格标识，例如产品订单项的产品标识。
     */
    public java.lang.Long getApplyObjSpec() {
        return this.applyObjSpec;
    }

    /**
     * 设置 作用对象标识，记录订单作用的客户、帐户、销售品实例、产品实例等。
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 作用对象标识，记录订单作用的客户、帐户、销售品实例、产品实例等。
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 记录优先级。
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 记录优先级。
     */
    public java.lang.Integer getPriority() {
        return this.priority;
    }

    /**
     * 设置 记录是否预受理。LOVB=PUB-C-0006
     */
    public void setPreHandleFlag(java.lang.String preHandleFlag) {
        this.preHandleFlag = preHandleFlag;
    }

    /**
     * 获取 记录是否预受理。LOVB=PUB-C-0006
     */
    public java.lang.String getPreHandleFlag() {
        return this.preHandleFlag;
    }

    /**
     * 设置 记录初次受理时间，改单时不再修改。
     */
    public void setAcceptDate(java.util.Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    /**
     * 获取 记录初次受理时间，改单时不再修改。
     */
    public java.util.Date getAcceptDate() {
        return this.acceptDate;
    }

    /**
     * 设置 记录OSS施工返回的业务开通时间。
     */
    public void setOpenDate(java.util.Date openDate) {
        this.openDate = openDate;
    }

    /**
     * 获取 记录OSS施工返回的业务开通时间。
     */
    public java.util.Date getOpenDate() {
        return this.openDate;
    }

    /**
     * 设置 记录订单的归属本地网，同作用对象的本地网。
     */
    public void setBelongLanId(java.lang.Long belongLanId) {
        this.belongLanId = belongLanId;
    }

    /**
     * 获取 记录订单的归属本地网，同作用对象的本地网。
     */
    public java.lang.Long getBelongLanId() {
        return this.belongLanId;
    }

    /**
     * 设置 记录订单的归属区域，同作用对象的区域。指向公共管理区域标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 记录订单的归属区域，同作用对象的区域。指向公共管理区域标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 记录受理本地网标识。
     */
    public void setAcceptLanId(java.lang.Long acceptLanId) {
        this.acceptLanId = acceptLanId;
    }

    /**
     * 获取 记录受理本地网标识。
     */
    public java.lang.Long getAcceptLanId() {
        return this.acceptLanId;
    }

    /**
     * 设置 记录受理区域标识，指向公共管理区域
     */
    public void setAcceptRegionId(java.lang.Long acceptRegionId) {
        this.acceptRegionId = acceptRegionId;
    }

    /**
     * 获取 记录受理区域标识，指向公共管理区域
     */
    public java.lang.Long getAcceptRegionId() {
        return this.acceptRegionId;
    }

    /**
     * 设置 记录订单项的归属客户，同作用对象的产权客户。
     */
    public void setBelongCustId(java.lang.Long belongCustId) {
        this.belongCustId = belongCustId;
    }

    /**
     * 获取 记录订单项的归属客户，同作用对象的产权客户。
     */
    public java.lang.Long getBelongCustId() {
        return this.belongCustId;
    }

    /**
     * 设置 记录订单来源，例如IPAD或某个APP产生的订单，或从前台或批量的方式受理产生的订单。LOVB=EVT-C-0001
     */
    public void setOrderSource(java.lang.String orderSource) {
        this.orderSource = orderSource;
    }

    /**
     * 获取 记录订单来源，例如IPAD或某个APP产生的订单，或从前台或批量的方式受理产生的订单。LOVB=EVT-C-0001
     */
    public java.lang.String getOrderSource() {
        return this.orderSource;
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

    /**
     * 设置 记录状态，LOVB=EVT-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=EVT-0001
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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
     * 设置 记录首次创建的系统岗位标识。
     */
    public void setCreatePost(java.lang.Long createPost) {
        this.createPost = createPost;
    }

    /**
     * 获取 记录首次创建的系统岗位标识。
     */
    public java.lang.Long getCreatePost() {
        return this.createPost;
    }

    /**
     * 设置 记录首次创建的组织机构标识。
     */
    public void setCreateOrgId(java.lang.Long createOrgId) {
        this.createOrgId = createOrgId;
    }

    /**
     * 获取 记录首次创建的组织机构标识。
     */
    public java.lang.Long getCreateOrgId() {
        return this.createOrgId;
    }

    /**
     * 设置 记录首次创建的员工标识。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间。
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录每次修改的系统岗位标识。
     */
    public void setUpdatePost(java.lang.Long updatePost) {
        this.updatePost = updatePost;
    }

    /**
     * 获取 记录每次修改的系统岗位标识。
     */
    public java.lang.Long getUpdatePost() {
        return this.updatePost;
    }

    /**
     * 设置 记录每次修改的组织机构标识。
     */
    public void setUpdateOrg(java.lang.Long updateOrg) {
        this.updateOrg = updateOrg;
    }

    /**
     * 获取 记录每次修改的组织机构标识。
     */
    public java.lang.Long getUpdateOrg() {
        return this.updateOrg;
    }

    /**
     * 设置 记录外部订单项标识
     */
    public void setExtOrderItemId(java.lang.String extOrderItemId) {
        this.extOrderItemId = extOrderItemId;
    }

    /**
     * 获取 记录外部订单项标识
     */
    public java.lang.String getExtOrderItemId() {
        return this.extOrderItemId;
    }

}
