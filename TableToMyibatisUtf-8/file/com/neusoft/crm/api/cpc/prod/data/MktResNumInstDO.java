package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录号码类营销资源实例信息。营销资源实例编码，记录号码。
号码实例独立成表原因：数量较多，使用比较频繁，管理
 * @实体表  :MKT_RES_NUM_INST
 */
public class MktResNumInstDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_NUM_INST_S";

    /**
     * 营销资源实例标识。
     */
    public java.lang.Long mktResInstId;

    /**
     * 营销资源实例编码，记录号码。
     */
    public java.lang.String mktResInstNbr;

    /**
     * 来源于物资管理系统时产生的数据
     */
    public java.lang.Integer mktResBatchId;

    /**
     * 营销资源标识
     */
    public java.lang.Integer mktResId;

    /**
     * 营销资源仓库标识
     */
    public java.lang.Integer mktResStoreId;

    /**
     * 记录所属号码头。
     */
    public java.lang.Integer headId;

    /**
     * 营销资源实例的零售价格，记录号码要求的预存费，单位为分。
     */
    public java.lang.Long depositAmount;

    /**
     * 记录号码要求的最低消费金额。
     */
    public java.lang.Integer minConsume;

    /**
     * 记录号码等级。
     */
    public java.lang.String numLevel;

    /**
     * 记录号码业务类型，用于区分物理号码、逻辑号码。LOVB=RES-C-0050
     */
    public java.lang.String numActType;

    /**
     * 记录来源平台标识，如MSS或集团终端系统。
     */
    public java.lang.Long platId;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Long regionId;

    /**
     * 记录本地网标识。
     */
    public java.lang.Long lanId;

    /**
     * 记录占用的产品实例标识。
     */
    public java.lang.Long prodInstId;

    /**
     * 记录预留对象类型，LOVB=RES-C-0018
     */
    public java.lang.String keepObjType;

    /**
     * 记录预留对象标识。
     */
    public java.lang.Integer keepObjId;

    /**
     * 记录预留起始时间。
     */
    public java.util.Date keepStartDate;

    /**
     * 记录预留结束时间。
     */
    public java.util.Date keepEndDate;

    /**
     * 归属HLR标识
     */
    public java.lang.Integer hlrId;

    /**
     * 记录优质号码标志，LOVB=PUB-C-0006
     */
    public java.lang.String highGradeFlag;

    /**
     * 记录签发状态，签发功能只针对优质号码使用，优质签发人、单位、批准人、说明放在号码实例属性中。LOVB=RES-C-0029
     */
    public java.lang.String signCd;

    /**
     * 记录备注。
     */
    public java.lang.String remark;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录状态。LOVB=RES-C-0023
     */
    public java.lang.String statusCd;

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
     * 设置 营销资源实例标识。
     */
    public void setMktResInstId(java.lang.Long mktResInstId) {
        this.mktResInstId = mktResInstId;
    }

    /**
     * 获取 营销资源实例标识。
     */
    public java.lang.Long getMktResInstId() {
        return this.mktResInstId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktResInstId = SeqUtils.createLongId(ID_SEQ);
         return this.mktResInstId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 营销资源实例编码，记录号码。
     */
    public void setMktResInstNbr(java.lang.String mktResInstNbr) {
        this.mktResInstNbr = mktResInstNbr;
    }

    /**
     * 获取 营销资源实例编码，记录号码。
     */
    public java.lang.String getMktResInstNbr() {
        return this.mktResInstNbr;
    }

    /**
     * 设置 来源于物资管理系统时产生的数据
     */
    public void setMktResBatchId(java.lang.Integer mktResBatchId) {
        this.mktResBatchId = mktResBatchId;
    }

    /**
     * 获取 来源于物资管理系统时产生的数据
     */
    public java.lang.Integer getMktResBatchId() {
        return this.mktResBatchId;
    }

    /**
     * 设置 营销资源标识
     */
    public void setMktResId(java.lang.Integer mktResId) {
        this.mktResId = mktResId;
    }

    /**
     * 获取 营销资源标识
     */
    public java.lang.Integer getMktResId() {
        return this.mktResId;
    }

    /**
     * 设置 营销资源仓库标识
     */
    public void setMktResStoreId(java.lang.Integer mktResStoreId) {
        this.mktResStoreId = mktResStoreId;
    }

    /**
     * 获取 营销资源仓库标识
     */
    public java.lang.Integer getMktResStoreId() {
        return this.mktResStoreId;
    }

    /**
     * 设置 记录所属号码头。
     */
    public void setHeadId(java.lang.Integer headId) {
        this.headId = headId;
    }

    /**
     * 获取 记录所属号码头。
     */
    public java.lang.Integer getHeadId() {
        return this.headId;
    }

    /**
     * 设置 营销资源实例的零售价格，记录号码要求的预存费，单位为分。
     */
    public void setDepositAmount(java.lang.Long depositAmount) {
        this.depositAmount = depositAmount;
    }

    /**
     * 获取 营销资源实例的零售价格，记录号码要求的预存费，单位为分。
     */
    public java.lang.Long getDepositAmount() {
        return this.depositAmount;
    }

    /**
     * 设置 记录号码要求的最低消费金额。
     */
    public void setMinConsume(java.lang.Integer minConsume) {
        this.minConsume = minConsume;
    }

    /**
     * 获取 记录号码要求的最低消费金额。
     */
    public java.lang.Integer getMinConsume() {
        return this.minConsume;
    }

    /**
     * 设置 记录号码等级。
     */
    public void setNumLevel(java.lang.String numLevel) {
        this.numLevel = numLevel;
    }

    /**
     * 获取 记录号码等级。
     */
    public java.lang.String getNumLevel() {
        return this.numLevel;
    }

    /**
     * 设置 记录号码业务类型，用于区分物理号码、逻辑号码。LOVB=RES-C-0050
     */
    public void setNumActType(java.lang.String numActType) {
        this.numActType = numActType;
    }

    /**
     * 获取 记录号码业务类型，用于区分物理号码、逻辑号码。LOVB=RES-C-0050
     */
    public java.lang.String getNumActType() {
        return this.numActType;
    }

    /**
     * 设置 记录来源平台标识，如MSS或集团终端系统。
     */
    public void setPlatId(java.lang.Long platId) {
        this.platId = platId;
    }

    /**
     * 获取 记录来源平台标识，如MSS或集团终端系统。
     */
    public java.lang.Long getPlatId() {
        return this.platId;
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

    /**
     * 设置 记录本地网标识。
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 记录本地网标识。
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

    /**
     * 设置 记录占用的产品实例标识。
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 记录占用的产品实例标识。
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 记录预留对象类型，LOVB=RES-C-0018
     */
    public void setKeepObjType(java.lang.String keepObjType) {
        this.keepObjType = keepObjType;
    }

    /**
     * 获取 记录预留对象类型，LOVB=RES-C-0018
     */
    public java.lang.String getKeepObjType() {
        return this.keepObjType;
    }

    /**
     * 设置 记录预留对象标识。
     */
    public void setKeepObjId(java.lang.Integer keepObjId) {
        this.keepObjId = keepObjId;
    }

    /**
     * 获取 记录预留对象标识。
     */
    public java.lang.Integer getKeepObjId() {
        return this.keepObjId;
    }

    /**
     * 设置 记录预留起始时间。
     */
    public void setKeepStartDate(java.util.Date keepStartDate) {
        this.keepStartDate = keepStartDate;
    }

    /**
     * 获取 记录预留起始时间。
     */
    public java.util.Date getKeepStartDate() {
        return this.keepStartDate;
    }

    /**
     * 设置 记录预留结束时间。
     */
    public void setKeepEndDate(java.util.Date keepEndDate) {
        this.keepEndDate = keepEndDate;
    }

    /**
     * 获取 记录预留结束时间。
     */
    public java.util.Date getKeepEndDate() {
        return this.keepEndDate;
    }

    /**
     * 设置 归属HLR标识
     */
    public void setHlrId(java.lang.Integer hlrId) {
        this.hlrId = hlrId;
    }

    /**
     * 获取 归属HLR标识
     */
    public java.lang.Integer getHlrId() {
        return this.hlrId;
    }

    /**
     * 设置 记录优质号码标志，LOVB=PUB-C-0006
     */
    public void setHighGradeFlag(java.lang.String highGradeFlag) {
        this.highGradeFlag = highGradeFlag;
    }

    /**
     * 获取 记录优质号码标志，LOVB=PUB-C-0006
     */
    public java.lang.String getHighGradeFlag() {
        return this.highGradeFlag;
    }

    /**
     * 设置 记录签发状态，签发功能只针对优质号码使用，优质签发人、单位、批准人、说明放在号码实例属性中。LOVB=RES-C-0029
     */
    public void setSignCd(java.lang.String signCd) {
        this.signCd = signCd;
    }

    /**
     * 获取 记录签发状态，签发功能只针对优质号码使用，优质签发人、单位、批准人、说明放在号码实例属性中。LOVB=RES-C-0029
     */
    public java.lang.String getSignCd() {
        return this.signCd;
    }

    /**
     * 设置 记录备注。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注。
     */
    public java.lang.String getRemark() {
        return this.remark;
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
     * 设置 记录状态。LOVB=RES-C-0023
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=RES-C-0023
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

}
