package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:发票作废合并到发票使用记录中，记录每次打印或作废的流水号与票号。发票打印不触发事件,发票作废需要申请，生成作废事件。
                                        
 * @实体表  :MKT_RES_INV_USE_REC
 */
public class MktResInvUseRecDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_INV_USE_REC_S";

    /**
     * 营销资源使用记录ID的标识，主键
     */
    public java.lang.Long mktResUseRecId;

    /**
     * 记录营销资源实例ID。
     */
    public java.lang.Long mktResInvInstId;

    /**
     * 记录使用发票的系统或模块：如计费，自助终端等。2015.04.21
     */
    public java.lang.String useSystem;

    /**
     * 记录计费或其他系统打印发票的流水号
     */
    public java.lang.String printNbr;

    /**
     * 记录发票使用的状态：发票打印成功，未打印发票作废，已打印普票作废，已打印增值税专票作废。LOVB=RES-C-0028
     */
    public java.lang.String usedCd;

    /**
     * 记录当前打印或作废的起始票号。一般需要记录每一张打印或作废的发票，起始票号和结束票号相同；如果是发票未打印作废，一般都是一本发票过期，需要分别记录开始和结束票号。20150421
     */
    public java.lang.Long invStaNum;

    /**
     * 记录当前打印或作废的结束票号。一般需要记录每一张打印或作废的发票，起始票号和结束票号相同；如果是发票未打印作废，一般都是一本发票过期，需要分别记录开始和结束票号。
     */
    public java.lang.Long invEndNum;

    /**
     * 记录使用时间。
     */
    public java.util.Date usingTime;

    /**
     * 记录使用数量。
     */
    public java.lang.Long usedQuantity;

    /**
     * 记录备注信息，如发票作废原因，使用记录无效原因。
     */
    public java.lang.String remark;

    /**
     * 营销资源库存变动事件标识，记录申请发票作废事件标识
     */
    public java.lang.Long mktResEventId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间。
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
     * 本地网标识
     */
    public java.lang.Long lanId;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Long regionId;

    /**
     * 设置 营销资源使用记录ID的标识，主键
     */
    public void setMktResUseRecId(java.lang.Long mktResUseRecId) {
        this.mktResUseRecId = mktResUseRecId;
    }

    /**
     * 获取 营销资源使用记录ID的标识，主键
     */
    public java.lang.Long getMktResUseRecId() {
        return this.mktResUseRecId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktResUseRecId = SeqUtils.createLongId(ID_SEQ);
         return this.mktResUseRecId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录营销资源实例ID。
     */
    public void setMktResInvInstId(java.lang.Long mktResInvInstId) {
        this.mktResInvInstId = mktResInvInstId;
    }

    /**
     * 获取 记录营销资源实例ID。
     */
    public java.lang.Long getMktResInvInstId() {
        return this.mktResInvInstId;
    }

    /**
     * 设置 记录使用发票的系统或模块：如计费，自助终端等。2015.04.21
     */
    public void setUseSystem(java.lang.String useSystem) {
        this.useSystem = useSystem;
    }

    /**
     * 获取 记录使用发票的系统或模块：如计费，自助终端等。2015.04.21
     */
    public java.lang.String getUseSystem() {
        return this.useSystem;
    }

    /**
     * 设置 记录计费或其他系统打印发票的流水号
     */
    public void setPrintNbr(java.lang.String printNbr) {
        this.printNbr = printNbr;
    }

    /**
     * 获取 记录计费或其他系统打印发票的流水号
     */
    public java.lang.String getPrintNbr() {
        return this.printNbr;
    }

    /**
     * 设置 记录发票使用的状态：发票打印成功，未打印发票作废，已打印普票作废，已打印增值税专票作废。LOVB=RES-C-0028
     */
    public void setUsedCd(java.lang.String usedCd) {
        this.usedCd = usedCd;
    }

    /**
     * 获取 记录发票使用的状态：发票打印成功，未打印发票作废，已打印普票作废，已打印增值税专票作废。LOVB=RES-C-0028
     */
    public java.lang.String getUsedCd() {
        return this.usedCd;
    }

    /**
     * 设置 记录当前打印或作废的起始票号。一般需要记录每一张打印或作废的发票，起始票号和结束票号相同；如果是发票未打印作废，一般都是一本发票过期，需要分别记录开始和结束票号。20150421
     */
    public void setInvStaNum(java.lang.Long invStaNum) {
        this.invStaNum = invStaNum;
    }

    /**
     * 获取 记录当前打印或作废的起始票号。一般需要记录每一张打印或作废的发票，起始票号和结束票号相同；如果是发票未打印作废，一般都是一本发票过期，需要分别记录开始和结束票号。20150421
     */
    public java.lang.Long getInvStaNum() {
        return this.invStaNum;
    }

    /**
     * 设置 记录当前打印或作废的结束票号。一般需要记录每一张打印或作废的发票，起始票号和结束票号相同；如果是发票未打印作废，一般都是一本发票过期，需要分别记录开始和结束票号。
     */
    public void setInvEndNum(java.lang.Long invEndNum) {
        this.invEndNum = invEndNum;
    }

    /**
     * 获取 记录当前打印或作废的结束票号。一般需要记录每一张打印或作废的发票，起始票号和结束票号相同；如果是发票未打印作废，一般都是一本发票过期，需要分别记录开始和结束票号。
     */
    public java.lang.Long getInvEndNum() {
        return this.invEndNum;
    }

    /**
     * 设置 记录使用时间。
     */
    public void setUsingTime(java.util.Date usingTime) {
        this.usingTime = usingTime;
    }

    /**
     * 获取 记录使用时间。
     */
    public java.util.Date getUsingTime() {
        return this.usingTime;
    }

    /**
     * 设置 记录使用数量。
     */
    public void setUsedQuantity(java.lang.Long usedQuantity) {
        this.usedQuantity = usedQuantity;
    }

    /**
     * 获取 记录使用数量。
     */
    public java.lang.Long getUsedQuantity() {
        return this.usedQuantity;
    }

    /**
     * 设置 记录备注信息，如发票作废原因，使用记录无效原因。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息，如发票作废原因，使用记录无效原因。
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

    /**
     * 设置 营销资源库存变动事件标识，记录申请发票作废事件标识
     */
    public void setMktResEventId(java.lang.Long mktResEventId) {
        this.mktResEventId = mktResEventId;
    }

    /**
     * 获取 营销资源库存变动事件标识，记录申请发票作废事件标识
     */
    public java.lang.Long getMktResEventId() {
        return this.mktResEventId;
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
     * 设置 记录状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间。
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
     * 设置 本地网标识
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 本地网标识
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

    /**
     * 设置 指向公共管理区域标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 指向公共管理区域标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

}
