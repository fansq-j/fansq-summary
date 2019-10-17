package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录客户购物的清单，与订单项类似，按照作用的对象可以分为客户类、帐户类、销售品类、产品类购物项。
 * @实体表  :SHOPPING_CART_ITEM
 */
public class ShoppingCartItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SHOPPING_CART_ITEM_S";

    /**
     * 记录订单项标识。
     */
    public java.lang.Long cartItemId;

    /**
     * 记录分组标识
     */
    public java.lang.Integer groupId;

    /**
     * 记录客户订单标识
     */
    public java.lang.Long cartId;

    /**
     * 购物项类型，LOVB=EVT-C-0009
     */
    public java.lang.String cartItemCd;

    /**
     * 记录订单作用对象的规格标识，例如产品类申请事项的产品标识。
     */
    public java.lang.Long applyObjSpec;

    /**
     * 作用对象标识，记录作用的客户、帐户、销售品实例、产品实例等。
     */
    public java.lang.Long objId;

    /**
     * 记录订单作用对象的服务提供标识。
     */
    public java.lang.Integer serviceOfferId;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 记录状态，LOVB=EVT-C-0010
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录首次创建的系统岗位标识。
     */
    public java.lang.Long createPost;

    /**
     * 记录首次创建的组织机构标识。
     */
    public java.lang.Long createOrgId;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 设置 记录订单项标识。
     */
    public void setCartItemId(java.lang.Long cartItemId) {
        this.cartItemId = cartItemId;
    }

    /**
     * 获取 记录订单项标识。
     */
    public java.lang.Long getCartItemId() {
        return this.cartItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.cartItemId = SeqUtils.createLongId(ID_SEQ);
         return this.cartItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录分组标识
     */
    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取 记录分组标识
     */
    public java.lang.Integer getGroupId() {
        return this.groupId;
    }

    /**
     * 设置 记录客户订单标识
     */
    public void setCartId(java.lang.Long cartId) {
        this.cartId = cartId;
    }

    /**
     * 获取 记录客户订单标识
     */
    public java.lang.Long getCartId() {
        return this.cartId;
    }

    /**
     * 设置 购物项类型，LOVB=EVT-C-0009
     */
    public void setCartItemCd(java.lang.String cartItemCd) {
        this.cartItemCd = cartItemCd;
    }

    /**
     * 获取 购物项类型，LOVB=EVT-C-0009
     */
    public java.lang.String getCartItemCd() {
        return this.cartItemCd;
    }

    /**
     * 设置 记录订单作用对象的规格标识，例如产品类申请事项的产品标识。
     */
    public void setApplyObjSpec(java.lang.Long applyObjSpec) {
        this.applyObjSpec = applyObjSpec;
    }

    /**
     * 获取 记录订单作用对象的规格标识，例如产品类申请事项的产品标识。
     */
    public java.lang.Long getApplyObjSpec() {
        return this.applyObjSpec;
    }

    /**
     * 设置 作用对象标识，记录作用的客户、帐户、销售品实例、产品实例等。
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 作用对象标识，记录作用的客户、帐户、销售品实例、产品实例等。
     */
    public java.lang.Long getObjId() {
        return this.objId;
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
     * 设置 记录状态，LOVB=EVT-C-0010
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=EVT-C-0010
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

}
