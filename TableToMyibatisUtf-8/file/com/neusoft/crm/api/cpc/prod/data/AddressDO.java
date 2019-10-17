package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述行政区域的详细地址，如：北京中路110号就是物理地址的具体描述。
 * @实体表  :ADDRESS
 */
public class AddressDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ADDRESS_S";

    /**
     * 记录地址标识。
     */
    public java.lang.Long addressId;

    /**
     * 记录行政区域标识。
     */
    public java.lang.Long locId;

    /**
     * 记录详细的地址信息。
     */
    public java.lang.String detailAddr;

    /**
     * 记录固定格式的地址。
     */
    public java.lang.String formatAddr;

    /**
     * 记录地址简拼信息。
     */
    public java.lang.String addrAbbr;

    /**
     * 记录地址全拼信息。
     */
    public java.lang.String addrPyName;

    /**
     * 记录邮政地址信息
     */
    public java.lang.String postAddr;

    /**
     * 记录邮政编码信息。
     */
    public java.lang.String postcode;

    /**
     * 记录局向标识。
     */
    public java.lang.Long exchId;

    /**
     * 记录局向名称。
     */
    public java.lang.String tmlName;

    /**
     * 记录局向编码。
     */
    public java.lang.String tmlCode;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录实例信息创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次信息变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录任何变动时，修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录地址标识。
     */
    public void setAddressId(java.lang.Long addressId) {
        this.addressId = addressId;
    }

    /**
     * 获取 记录地址标识。
     */
    public java.lang.Long getAddressId() {
        return this.addressId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.addressId = SeqUtils.createLongId(ID_SEQ);
         return this.addressId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录行政区域标识。
     */
    public void setLocId(java.lang.Long locId) {
        this.locId = locId;
    }

    /**
     * 获取 记录行政区域标识。
     */
    public java.lang.Long getLocId() {
        return this.locId;
    }

    /**
     * 设置 记录详细的地址信息。
     */
    public void setDetailAddr(java.lang.String detailAddr) {
        this.detailAddr = detailAddr;
    }

    /**
     * 获取 记录详细的地址信息。
     */
    public java.lang.String getDetailAddr() {
        return this.detailAddr;
    }

    /**
     * 设置 记录固定格式的地址。
     */
    public void setFormatAddr(java.lang.String formatAddr) {
        this.formatAddr = formatAddr;
    }

    /**
     * 获取 记录固定格式的地址。
     */
    public java.lang.String getFormatAddr() {
        return this.formatAddr;
    }

    /**
     * 设置 记录地址简拼信息。
     */
    public void setAddrAbbr(java.lang.String addrAbbr) {
        this.addrAbbr = addrAbbr;
    }

    /**
     * 获取 记录地址简拼信息。
     */
    public java.lang.String getAddrAbbr() {
        return this.addrAbbr;
    }

    /**
     * 设置 记录地址全拼信息。
     */
    public void setAddrPyName(java.lang.String addrPyName) {
        this.addrPyName = addrPyName;
    }

    /**
     * 获取 记录地址全拼信息。
     */
    public java.lang.String getAddrPyName() {
        return this.addrPyName;
    }

    /**
     * 设置 记录邮政地址信息
     */
    public void setPostAddr(java.lang.String postAddr) {
        this.postAddr = postAddr;
    }

    /**
     * 获取 记录邮政地址信息
     */
    public java.lang.String getPostAddr() {
        return this.postAddr;
    }

    /**
     * 设置 记录邮政编码信息。
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }

    /**
     * 获取 记录邮政编码信息。
     */
    public java.lang.String getPostcode() {
        return this.postcode;
    }

    /**
     * 设置 记录局向标识。
     */
    public void setExchId(java.lang.Long exchId) {
        this.exchId = exchId;
    }

    /**
     * 获取 记录局向标识。
     */
    public java.lang.Long getExchId() {
        return this.exchId;
    }

    /**
     * 设置 记录局向名称。
     */
    public void setTmlName(java.lang.String tmlName) {
        this.tmlName = tmlName;
    }

    /**
     * 获取 记录局向名称。
     */
    public java.lang.String getTmlName() {
        return this.tmlName;
    }

    /**
     * 设置 记录局向编码。
     */
    public void setTmlCode(java.lang.String tmlCode) {
        this.tmlCode = tmlCode;
    }

    /**
     * 获取 记录局向编码。
     */
    public java.lang.String getTmlCode() {
        return this.tmlCode;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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
     * 设置 记录实例信息创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录实例信息创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次信息变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录每次信息变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录任何变动时，修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录任何变动时，修改的时间。
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
