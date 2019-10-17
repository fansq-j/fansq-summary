package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:根据注智标签将客户、用户、销售品等进行分群
 * @实体表  :TAR_GRP
 */
public class TarGrpDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TAR_GRP_S";

    /**
     * 目标分群标识
     */
    public java.lang.Long tarGrpId;

    /**
     * 目标分群名称
     */
    public java.lang.String tarGrpName;

    /**
     * 目标分群的详细描述信息
     */
    public java.lang.String tarGrpDesc;

    /**
     * 目标分群类型LOVB=CAM-C-0017
     */
    public java.lang.String tarGrpType;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 目标分群标识
     */
    public void setTarGrpId(java.lang.Long tarGrpId) {
        this.tarGrpId = tarGrpId;
    }

    /**
     * 获取 目标分群标识
     */
    public java.lang.Long getTarGrpId() {
        return this.tarGrpId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.tarGrpId = SeqUtils.createLongId(ID_SEQ);
         return this.tarGrpId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 目标分群名称
     */
    public void setTarGrpName(java.lang.String tarGrpName) {
        this.tarGrpName = tarGrpName;
    }

    /**
     * 获取 目标分群名称
     */
    public java.lang.String getTarGrpName() {
        return this.tarGrpName;
    }

    /**
     * 设置 目标分群的详细描述信息
     */
    public void setTarGrpDesc(java.lang.String tarGrpDesc) {
        this.tarGrpDesc = tarGrpDesc;
    }

    /**
     * 获取 目标分群的详细描述信息
     */
    public java.lang.String getTarGrpDesc() {
        return this.tarGrpDesc;
    }

    /**
     * 设置 目标分群类型LOVB=CAM-C-0017
     */
    public void setTarGrpType(java.lang.String tarGrpType) {
        this.tarGrpType = tarGrpType;
    }

    /**
     * 获取 目标分群类型LOVB=CAM-C-0017
     */
    public java.lang.String getTarGrpType() {
        return this.tarGrpType;
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
     * 设置 记录创建的员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态修改的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间
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
