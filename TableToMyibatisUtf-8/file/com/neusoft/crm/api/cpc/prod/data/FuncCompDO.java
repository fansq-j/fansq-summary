package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:指系统内的系统功能菜单的最小功能单元及组件。
 * @实体表  :FUNC_COMP
 */
public class FuncCompDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "FUNC_COMP_S";

    /**
     * 模块组件标识，主键
     */
    public java.lang.Integer compId;

    /**
     * 模块组件名称
     */
    public java.lang.String compName;

    /**
     * 模块组件类型，LOVB=STF-C-0014。
     */
    public java.lang.String compType;

    /**
     * 模块组件描述
     */
    public java.lang.String compDesc;

    /**
     * 模块组件URL链接地址
     */
    public java.lang.String urlAddr;

    /**
     * 菜单标识，主键
     */
    public java.lang.Integer menuId;

    /**
     * 模块组件状态
     */
    public java.lang.String statusCd;

    /**
     * 模块组件状态修改时间
     */
    public java.util.Date statusDate;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 设置 模块组件标识，主键
     */
    public void setCompId(java.lang.Integer compId) {
        this.compId = compId;
    }

    /**
     * 获取 模块组件标识，主键
     */
    public java.lang.Integer getCompId() {
        return this.compId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.compId = SeqUtils.createIntegerId(ID_SEQ);
         return this.compId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 模块组件名称
     */
    public void setCompName(java.lang.String compName) {
        this.compName = compName;
    }

    /**
     * 获取 模块组件名称
     */
    public java.lang.String getCompName() {
        return this.compName;
    }

    /**
     * 设置 模块组件类型，LOVB=STF-C-0014。
     */
    public void setCompType(java.lang.String compType) {
        this.compType = compType;
    }

    /**
     * 获取 模块组件类型，LOVB=STF-C-0014。
     */
    public java.lang.String getCompType() {
        return this.compType;
    }

    /**
     * 设置 模块组件描述
     */
    public void setCompDesc(java.lang.String compDesc) {
        this.compDesc = compDesc;
    }

    /**
     * 获取 模块组件描述
     */
    public java.lang.String getCompDesc() {
        return this.compDesc;
    }

    /**
     * 设置 模块组件URL链接地址
     */
    public void setUrlAddr(java.lang.String urlAddr) {
        this.urlAddr = urlAddr;
    }

    /**
     * 获取 模块组件URL链接地址
     */
    public java.lang.String getUrlAddr() {
        return this.urlAddr;
    }

    /**
     * 设置 菜单标识，主键
     */
    public void setMenuId(java.lang.Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取 菜单标识，主键
     */
    public java.lang.Integer getMenuId() {
        return this.menuId;
    }

    /**
     * 设置 模块组件状态
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 模块组件状态
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 模块组件状态修改时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 模块组件状态修改时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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

}
