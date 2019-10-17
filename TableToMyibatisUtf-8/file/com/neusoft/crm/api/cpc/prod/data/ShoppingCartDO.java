package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:是客户购物暂存销售品的容器。
 * @实体表  :SHOPPING_CART
 */
public class ShoppingCartDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SHOPPING_CART_S";

    /**
     * 购物车标识。
     */
    public java.lang.Long cartId;

    /**
     * 记录购物车归属的用户类型，匿名用户、客户，暂时只支持客户。LOVB=EVT-C-0007
     */
    public java.lang.String userType;

    /**
     * 记录用户标识，对于匿名用户记录其cookie或session信息，已认证用户记录客户标识
     */
    public java.lang.Long userId;

    /**
     * 记录购物车状态。LOVB=EVT-C-0008
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
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
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 购物车标识。
     */
    public void setCartId(java.lang.Long cartId) {
        this.cartId = cartId;
    }

    /**
     * 获取 购物车标识。
     */
    public java.lang.Long getCartId() {
        return this.cartId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.cartId = SeqUtils.createLongId(ID_SEQ);
         return this.cartId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录购物车归属的用户类型，匿名用户、客户，暂时只支持客户。LOVB=EVT-C-0007
     */
    public void setUserType(java.lang.String userType) {
        this.userType = userType;
    }

    /**
     * 获取 记录购物车归属的用户类型，匿名用户、客户，暂时只支持客户。LOVB=EVT-C-0007
     */
    public java.lang.String getUserType() {
        return this.userType;
    }

    /**
     * 设置 记录用户标识，对于匿名用户记录其cookie或session信息，已认证用户记录客户标识
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }

    /**
     * 获取 记录用户标识，对于匿名用户记录其cookie或session信息，已认证用户记录客户标识
     */
    public java.lang.Long getUserId() {
        return this.userId;
    }

    /**
     * 设置 记录购物车状态。LOVB=EVT-C-0008
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录购物车状态。LOVB=EVT-C-0008
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间。
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
