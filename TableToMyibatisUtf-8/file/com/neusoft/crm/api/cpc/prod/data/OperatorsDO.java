package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:经营主体信息，描述电信组织作为经营主体的相关属性信息。
 * @实体表  :OPERATORS
 */
public class OperatorsDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OPERATORS_S";

    /**
     * 电信组织标识主键
     */
    public java.lang.Long orgId;

    /**
     * 经营主体编码。LOVB=CHN-0012。
     */
    public java.lang.String operatorsNbr;

    /**
     * 经营主体名称：自营渠道：中国电信**分公司
            社会渠道：营业执照中注册的公司名称或法人
     */
    public java.lang.String operatorsName;

    /**
     * 经营主体简称：如国美电器有限公司，简称为"国美电器"；简称中不含地域信息、不含公司形式
     */
    public java.lang.String operatorsSname;

    /**
     * 经营主体对应组织的关联参与人标识,参与人唯一标识
     */
    public java.lang.Long partyId;

    /**
     * 经营主体级别，LOVB=CHN-0015。
     */
    public java.lang.String operatorsLevel;

    /**
     * 法定代表人
     */
    public java.lang.String legalRepr;

    /**
     * 上级经营主体标识
     */
    public java.lang.Long parentOperId;

    /**
     * 经营主体描述
     */
    public java.lang.String operatorsDesc;

    /**
     * 区分经营主体是否是连锁，LOVB=PUB-C-0006
     */
    public java.lang.Integer isChain;

    /**
     * 连锁经营主体的类型，区分是全国级连锁、省级连锁、地市级连锁、县级连锁。LOVB=STF-C-0036。
     */
    public java.lang.String chainType;

    /**
     * 公用管理区域标识,记录区域唯一标识
     */
    public java.lang.Long regionId;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 经营主体状态。LOVB=CHN-0014。
     */
    public java.lang.String statusCd;

    /**
     * 经营主体状态时间
     */
    public java.util.Date statusDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 是否代理商,LOVB=PUB-C-0006
     */
    public java.lang.Integer isAgent;

    /**
     * 经营主体类型，LOVB=STF-C-0003
            
     */
    public java.lang.String operatorsTypeCd;

    /**
     * 强商类型。LOVB=CHN-C-0017
     */
    public java.lang.String topType;

    /**
     * 设置 电信组织标识主键
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 电信组织标识主键
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.orgId = SeqUtils.createLongId(ID_SEQ);
         return this.orgId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 经营主体编码。LOVB=CHN-0012。
     */
    public void setOperatorsNbr(java.lang.String operatorsNbr) {
        this.operatorsNbr = operatorsNbr;
    }

    /**
     * 获取 经营主体编码。LOVB=CHN-0012。
     */
    public java.lang.String getOperatorsNbr() {
        return this.operatorsNbr;
    }

    /**
     * 设置 经营主体名称：自营渠道：中国电信**分公司
            社会渠道：营业执照中注册的公司名称或法人
     */
    public void setOperatorsName(java.lang.String operatorsName) {
        this.operatorsName = operatorsName;
    }

    /**
     * 获取 经营主体名称：自营渠道：中国电信**分公司
            社会渠道：营业执照中注册的公司名称或法人
     */
    public java.lang.String getOperatorsName() {
        return this.operatorsName;
    }

    /**
     * 设置 经营主体简称：如国美电器有限公司，简称为"国美电器"；简称中不含地域信息、不含公司形式
     */
    public void setOperatorsSname(java.lang.String operatorsSname) {
        this.operatorsSname = operatorsSname;
    }

    /**
     * 获取 经营主体简称：如国美电器有限公司，简称为"国美电器"；简称中不含地域信息、不含公司形式
     */
    public java.lang.String getOperatorsSname() {
        return this.operatorsSname;
    }

    /**
     * 设置 经营主体对应组织的关联参与人标识,参与人唯一标识
     */
    public void setPartyId(java.lang.Long partyId) {
        this.partyId = partyId;
    }

    /**
     * 获取 经营主体对应组织的关联参与人标识,参与人唯一标识
     */
    public java.lang.Long getPartyId() {
        return this.partyId;
    }

    /**
     * 设置 经营主体级别，LOVB=CHN-0015。
     */
    public void setOperatorsLevel(java.lang.String operatorsLevel) {
        this.operatorsLevel = operatorsLevel;
    }

    /**
     * 获取 经营主体级别，LOVB=CHN-0015。
     */
    public java.lang.String getOperatorsLevel() {
        return this.operatorsLevel;
    }

    /**
     * 设置 法定代表人
     */
    public void setLegalRepr(java.lang.String legalRepr) {
        this.legalRepr = legalRepr;
    }

    /**
     * 获取 法定代表人
     */
    public java.lang.String getLegalRepr() {
        return this.legalRepr;
    }

    /**
     * 设置 上级经营主体标识
     */
    public void setParentOperId(java.lang.Long parentOperId) {
        this.parentOperId = parentOperId;
    }

    /**
     * 获取 上级经营主体标识
     */
    public java.lang.Long getParentOperId() {
        return this.parentOperId;
    }

    /**
     * 设置 经营主体描述
     */
    public void setOperatorsDesc(java.lang.String operatorsDesc) {
        this.operatorsDesc = operatorsDesc;
    }

    /**
     * 获取 经营主体描述
     */
    public java.lang.String getOperatorsDesc() {
        return this.operatorsDesc;
    }

    /**
     * 设置 区分经营主体是否是连锁，LOVB=PUB-C-0006
     */
    public void setIsChain(java.lang.Integer isChain) {
        this.isChain = isChain;
    }

    /**
     * 获取 区分经营主体是否是连锁，LOVB=PUB-C-0006
     */
    public java.lang.Integer getIsChain() {
        return this.isChain;
    }

    /**
     * 设置 连锁经营主体的类型，区分是全国级连锁、省级连锁、地市级连锁、县级连锁。LOVB=STF-C-0036。
     */
    public void setChainType(java.lang.String chainType) {
        this.chainType = chainType;
    }

    /**
     * 获取 连锁经营主体的类型，区分是全国级连锁、省级连锁、地市级连锁、县级连锁。LOVB=STF-C-0036。
     */
    public java.lang.String getChainType() {
        return this.chainType;
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
     * 设置 经营主体状态。LOVB=CHN-0014。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 经营主体状态。LOVB=CHN-0014。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 经营主体状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 经营主体状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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

    /**
     * 设置 是否代理商,LOVB=PUB-C-0006
     */
    public void setIsAgent(java.lang.Integer isAgent) {
        this.isAgent = isAgent;
    }

    /**
     * 获取 是否代理商,LOVB=PUB-C-0006
     */
    public java.lang.Integer getIsAgent() {
        return this.isAgent;
    }

    /**
     * 设置 经营主体类型，LOVB=STF-C-0003
            
     */
    public void setOperatorsTypeCd(java.lang.String operatorsTypeCd) {
        this.operatorsTypeCd = operatorsTypeCd;
    }

    /**
     * 获取 经营主体类型，LOVB=STF-C-0003
            
     */
    public java.lang.String getOperatorsTypeCd() {
        return this.operatorsTypeCd;
    }

    /**
     * 设置 强商类型。LOVB=CHN-C-0017
     */
    public void setTopType(java.lang.String topType) {
        this.topType = topType;
    }

    /**
     * 获取 强商类型。LOVB=CHN-C-0017
     */
    public java.lang.String getTopType() {
        return this.topType;
    }

}
