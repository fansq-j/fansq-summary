package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述客户订单的操作概况信息，记录客户订单自身的服务提供（如新建、改单、撤单、缓装）、受理员工、经办人等信息。
 * @实体表  :ORDER_MODIFY
 */
public class OrderModifyDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORDER_MODIFY_S";

    /**
     * 记录数据的行号，主键。
     */
    public java.lang.Long rowId;

    /**
     * 客户订单变更记录标识
     */
    public java.lang.Long custOrderModifyId;

    /**
     * 客户订单标识
     */
    public java.lang.Long custOrderId;

    /**
     * 记录订单版本号。
     */
    public java.lang.Integer verNum;

    /**
     * 订单经办人信息标识
     */
    public java.lang.Long orderHandlerId;

    /**
     * 记录客户订单的操作类型，LOVB=EVT-C-0011
     */
    public java.lang.String operType;

    /**
     * 记录本次业务的鉴权方式
     */
    public java.lang.String authType;

    /**
     * 记录客户订单的归属客户
     */
    public java.lang.Long custId;

    /**
     * 客户订单编码
     */
    public java.lang.String custOrderNbr;

    /**
     * 记录客户订单类型，LOVB=EVT-C-0012
     */
    public java.lang.String custOrderType;

    /**
     * LOVB=PUB-C-0006
     */
    public java.lang.String preHandleFlag;

    /**
     * 记录优先级。LOVB=EVT-C-0005
     */
    public java.lang.Integer priority;

    /**
     * 记录初次受理时间，改单时不再修改。
     */
    public java.util.Date acceptDate;

    /**
     * 记录受理本地网标识。
     */
    public java.lang.Integer acceptLanId;

    /**
     * 记录受理区域标识，指向公共管理区域
     */
    public java.lang.Long acceptRegionId;

    /**
     * 记录订单来源，例如IPAD或某个APP产生的订单，或从前台或批量的方式受理产生的订单。LOVB=EVT-C-0001
     */
    public java.lang.String orderSource;

    /**
     * 记录订单计划送开通的激活时间。
     */
    public java.util.Date planActDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 记录客户订单状态。LOVB=EVT-0002
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
     * 设置 记录数据的行号，主键。
     */
    public void setRowId(java.lang.Long rowId) {
        this.rowId = rowId;
    }

    /**
     * 获取 记录数据的行号，主键。
     */
    public java.lang.Long getRowId() {
        return this.rowId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.rowId = SeqUtils.createLongId(ID_SEQ);
         return this.rowId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 客户订单变更记录标识
     */
    public void setCustOrderModifyId(java.lang.Long custOrderModifyId) {
        this.custOrderModifyId = custOrderModifyId;
    }

    /**
     * 获取 客户订单变更记录标识
     */
    public java.lang.Long getCustOrderModifyId() {
        return this.custOrderModifyId;
    }

    /**
     * 设置 客户订单标识
     */
    public void setCustOrderId(java.lang.Long custOrderId) {
        this.custOrderId = custOrderId;
    }

    /**
     * 获取 客户订单标识
     */
    public java.lang.Long getCustOrderId() {
        return this.custOrderId;
    }

    /**
     * 设置 记录订单版本号。
     */
    public void setVerNum(java.lang.Integer verNum) {
        this.verNum = verNum;
    }

    /**
     * 获取 记录订单版本号。
     */
    public java.lang.Integer getVerNum() {
        return this.verNum;
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
     * 设置 记录客户订单的操作类型，LOVB=EVT-C-0011
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 记录客户订单的操作类型，LOVB=EVT-C-0011
     */
    public java.lang.String getOperType() {
        return this.operType;
    }

    /**
     * 设置 记录本次业务的鉴权方式
     */
    public void setAuthType(java.lang.String authType) {
        this.authType = authType;
    }

    /**
     * 获取 记录本次业务的鉴权方式
     */
    public java.lang.String getAuthType() {
        return this.authType;
    }

    /**
     * 设置 记录客户订单的归属客户
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }

    /**
     * 获取 记录客户订单的归属客户
     */
    public java.lang.Long getCustId() {
        return this.custId;
    }

    /**
     * 设置 客户订单编码
     */
    public void setCustOrderNbr(java.lang.String custOrderNbr) {
        this.custOrderNbr = custOrderNbr;
    }

    /**
     * 获取 客户订单编码
     */
    public java.lang.String getCustOrderNbr() {
        return this.custOrderNbr;
    }

    /**
     * 设置 记录客户订单类型，LOVB=EVT-C-0012
     */
    public void setCustOrderType(java.lang.String custOrderType) {
        this.custOrderType = custOrderType;
    }

    /**
     * 获取 记录客户订单类型，LOVB=EVT-C-0012
     */
    public java.lang.String getCustOrderType() {
        return this.custOrderType;
    }

    /**
     * 设置 LOVB=PUB-C-0006
     */
    public void setPreHandleFlag(java.lang.String preHandleFlag) {
        this.preHandleFlag = preHandleFlag;
    }

    /**
     * 获取 LOVB=PUB-C-0006
     */
    public java.lang.String getPreHandleFlag() {
        return this.preHandleFlag;
    }

    /**
     * 设置 记录优先级。LOVB=EVT-C-0005
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 记录优先级。LOVB=EVT-C-0005
     */
    public java.lang.Integer getPriority() {
        return this.priority;
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
     * 设置 记录受理本地网标识。
     */
    public void setAcceptLanId(java.lang.Integer acceptLanId) {
        this.acceptLanId = acceptLanId;
    }

    /**
     * 获取 记录受理本地网标识。
     */
    public java.lang.Integer getAcceptLanId() {
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
     * 设置 记录订单计划送开通的激活时间。
     */
    public void setPlanActDate(java.util.Date planActDate) {
        this.planActDate = planActDate;
    }

    /**
     * 获取 记录订单计划送开通的激活时间。
     */
    public java.util.Date getPlanActDate() {
        return this.planActDate;
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
     * 设置 记录客户订单状态。LOVB=EVT-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录客户订单状态。LOVB=EVT-0002
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

}
