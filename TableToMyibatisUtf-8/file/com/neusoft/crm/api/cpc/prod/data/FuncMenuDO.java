package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:功能模块和功能模块之间存在上下级关系，一个功能模块可以有多个下级功能模块，一个功能模块只能属于一个上级功能模块。例如：一
 * @实体表  :FUNC_MENU
 */
public class FuncMenuDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "FUNC_MENU_S";

    /**
     * 菜单标识，主键
     */
    public java.lang.Integer menuId;

    /**
     * 菜单名称
     */
    public java.lang.String menuName;

    /**
     * 菜单类型。LOVB=STF-C-0013。
     */
    public java.lang.String menuType;

    /**
     * 菜单项级别(从0开始)
     */
    public java.lang.Integer menuLevel;

    /**
     * 菜单排序号（从0开始）
     */
    public java.lang.Integer menuIndex;

    /**
     * 上级菜单标识
     */
    public java.lang.Integer parMenuId;

    /**
     * 菜单描述
     */
    public java.lang.String menuDesc;

    /**
     * 菜单URL链接地址
     */
    public java.lang.String urlAddr;

    /**
     * 公用管理区域标识,记录区域唯一标识
     */
    public java.lang.Long regionId;

    /**
     * 系统用户的归属系统
     */
    public java.lang.Long systemInfoId;

    /**
     * 菜单状态
     */
    public java.lang.String statusCd;

    /**
     * 状态时间
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
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.menuId = SeqUtils.createIntegerId(ID_SEQ);
         return this.menuId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 菜单名称
     */
    public void setMenuName(java.lang.String menuName) {
        this.menuName = menuName;
    }

    /**
     * 获取 菜单名称
     */
    public java.lang.String getMenuName() {
        return this.menuName;
    }

    /**
     * 设置 菜单类型。LOVB=STF-C-0013。
     */
    public void setMenuType(java.lang.String menuType) {
        this.menuType = menuType;
    }

    /**
     * 获取 菜单类型。LOVB=STF-C-0013。
     */
    public java.lang.String getMenuType() {
        return this.menuType;
    }

    /**
     * 设置 菜单项级别(从0开始)
     */
    public void setMenuLevel(java.lang.Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    /**
     * 获取 菜单项级别(从0开始)
     */
    public java.lang.Integer getMenuLevel() {
        return this.menuLevel;
    }

    /**
     * 设置 菜单排序号（从0开始）
     */
    public void setMenuIndex(java.lang.Integer menuIndex) {
        this.menuIndex = menuIndex;
    }

    /**
     * 获取 菜单排序号（从0开始）
     */
    public java.lang.Integer getMenuIndex() {
        return this.menuIndex;
    }

    /**
     * 设置 上级菜单标识
     */
    public void setParMenuId(java.lang.Integer parMenuId) {
        this.parMenuId = parMenuId;
    }

    /**
     * 获取 上级菜单标识
     */
    public java.lang.Integer getParMenuId() {
        return this.parMenuId;
    }

    /**
     * 设置 菜单描述
     */
    public void setMenuDesc(java.lang.String menuDesc) {
        this.menuDesc = menuDesc;
    }

    /**
     * 获取 菜单描述
     */
    public java.lang.String getMenuDesc() {
        return this.menuDesc;
    }

    /**
     * 设置 菜单URL链接地址
     */
    public void setUrlAddr(java.lang.String urlAddr) {
        this.urlAddr = urlAddr;
    }

    /**
     * 获取 菜单URL链接地址
     */
    public java.lang.String getUrlAddr() {
        return this.urlAddr;
    }

    /**
     * 设置 公用管理区域标识,记录区域唯一标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 公用管理区域标识,记录区域唯一标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 系统用户的归属系统
     */
    public void setSystemInfoId(java.lang.Long systemInfoId) {
        this.systemInfoId = systemInfoId;
    }

    /**
     * 获取 系统用户的归属系统
     */
    public java.lang.Long getSystemInfoId() {
        return this.systemInfoId;
    }

    /**
     * 设置 菜单状态
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 菜单状态
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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
