package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录线上预约办理业务信息，包括预约号码、业务服务类型、预约时间、营业厅等信息；
 * @实体表  :BOOK_ORDER
 */
public class BookOrderDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BOOK_ORDER_S";

    /**
     * 预约单标识,主键
     */
    public java.lang.Long bookOrderId;

    /**
     * 预约单编码
     */
    public java.lang.String bookOrderNbr;

    /**
     * 服务类型标识
     */
    public java.lang.Long servTypeId;

    /**
     * 营业厅标识
     */
    public java.lang.Long orgId;

    /**
     * 区域标识
     */
    public java.lang.Long regionId;

    /**
     * 本地网
     */
    public java.lang.Integer lanId;

    /**
     * 预约日期
     */
    public java.util.Date bookDate;

    /**
     * 预约时段标识
     */
    public java.lang.Long bookTimeId;

    /**
     * 预约渠道标识
     */
    public java.lang.String channelId;

    /**
     * 对象类型，主数据：客户、证件、号码等.LOVB=STF-C-0028
     */
    public java.lang.String objType;

    /**
     * 对象信息，客户标识、证件号码，手机号码
     */
    public java.lang.String objId;

    /**
     * 主数据：已预约、已取号、已过期.LOVB=STF-C-0029
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 预约单标识,主键
     */
    public void setBookOrderId(java.lang.Long bookOrderId) {
        this.bookOrderId = bookOrderId;
    }

    /**
     * 获取 预约单标识,主键
     */
    public java.lang.Long getBookOrderId() {
        return this.bookOrderId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.bookOrderId = SeqUtils.createLongId(ID_SEQ);
         return this.bookOrderId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 预约单编码
     */
    public void setBookOrderNbr(java.lang.String bookOrderNbr) {
        this.bookOrderNbr = bookOrderNbr;
    }

    /**
     * 获取 预约单编码
     */
    public java.lang.String getBookOrderNbr() {
        return this.bookOrderNbr;
    }

    /**
     * 设置 服务类型标识
     */
    public void setServTypeId(java.lang.Long servTypeId) {
        this.servTypeId = servTypeId;
    }

    /**
     * 获取 服务类型标识
     */
    public java.lang.Long getServTypeId() {
        return this.servTypeId;
    }

    /**
     * 设置 营业厅标识
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 营业厅标识
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置 区域标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 区域标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 本地网
     */
    public void setLanId(java.lang.Integer lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 本地网
     */
    public java.lang.Integer getLanId() {
        return this.lanId;
    }

    /**
     * 设置 预约日期
     */
    public void setBookDate(java.util.Date bookDate) {
        this.bookDate = bookDate;
    }

    /**
     * 获取 预约日期
     */
    public java.util.Date getBookDate() {
        return this.bookDate;
    }

    /**
     * 设置 预约时段标识
     */
    public void setBookTimeId(java.lang.Long bookTimeId) {
        this.bookTimeId = bookTimeId;
    }

    /**
     * 获取 预约时段标识
     */
    public java.lang.Long getBookTimeId() {
        return this.bookTimeId;
    }

    /**
     * 设置 预约渠道标识
     */
    public void setChannelId(java.lang.String channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取 预约渠道标识
     */
    public java.lang.String getChannelId() {
        return this.channelId;
    }

    /**
     * 设置 对象类型，主数据：客户、证件、号码等.LOVB=STF-C-0028
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 对象类型，主数据：客户、证件、号码等.LOVB=STF-C-0028
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 对象信息，客户标识、证件号码，手机号码
     */
    public void setObjId(java.lang.String objId) {
        this.objId = objId;
    }

    /**
     * 获取 对象信息，客户标识、证件号码，手机号码
     */
    public java.lang.String getObjId() {
        return this.objId;
    }

    /**
     * 设置 主数据：已预约、已取号、已过期.LOVB=STF-C-0029
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 主数据：已预约、已取号、已过期.LOVB=STF-C-0029
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建的员工。
            
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工。
            
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工。
            
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工。
            
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间。
            
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间。
            
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态变更的时间。
            
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间。
            
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改的时间。
            
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间。
            
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录备注信息
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
