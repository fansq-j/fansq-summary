package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:一般用于400、800等号码，记录预选号码的相关信息；
也支撑普通号码预选，例如网厅、自助终端预约选号。
                                        
 * @实体表  :MKT_RES_NUM_PRE_USE
 */
public class MktResNumPreUseDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_NUM_PRE_USE_S";

    /**
     * 营销资源使用记录ID的标识，主键
     */
    public java.lang.Long mktResNumPreUseId;

    /**
     * 记录营销资源号码实例标识。
     */
    public java.lang.Long mktResInstId;

    /**
     * 记录申请人名称。
     */
    public java.lang.String applicantName;

    /**
     * 记录申请号码预选的申请人类型。LOVB=RES-C-0033
     */
    public java.lang.String applicantType;

    /**
     * 记录号码预选的申请人标识，如果是已有客户，记录客户标识；如果是客户经理，记录员工标识。新客户，则为空，根据证件判断。
     */
    public java.lang.Long applicantId;

    /**
     * 记录网厅或其他系统申请预选号码的请求流水号
     */
    public java.lang.String requestNbr;

    /**
     * 记录申请人证件类型。LOVB=PTY-0004
     */
    public java.lang.String certType;

    /**
     * 记录申请人联系电话。
     */
    public java.lang.String connectPhone;

    /**
     * 记录申请人证件号码。
     */
    public java.lang.String certNum;

    /**
     * 记录申请预选的来源渠道。LOVB=EVT-C-0001
     */
    public java.lang.String requestSource;

    /**
     * 记录申请号码预选的生效时间。
     */
    public java.util.Date effDate;

    /**
     * 记录申请号码预选的失效时间。
     */
    public java.util.Date expDate;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

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
     * 设置 营销资源使用记录ID的标识，主键
     */
    public void setMktResNumPreUseId(java.lang.Long mktResNumPreUseId) {
        this.mktResNumPreUseId = mktResNumPreUseId;
    }

    /**
     * 获取 营销资源使用记录ID的标识，主键
     */
    public java.lang.Long getMktResNumPreUseId() {
        return this.mktResNumPreUseId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktResNumPreUseId = SeqUtils.createLongId(ID_SEQ);
         return this.mktResNumPreUseId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录营销资源号码实例标识。
     */
    public void setMktResInstId(java.lang.Long mktResInstId) {
        this.mktResInstId = mktResInstId;
    }

    /**
     * 获取 记录营销资源号码实例标识。
     */
    public java.lang.Long getMktResInstId() {
        return this.mktResInstId;
    }

    /**
     * 设置 记录申请人名称。
     */
    public void setApplicantName(java.lang.String applicantName) {
        this.applicantName = applicantName;
    }

    /**
     * 获取 记录申请人名称。
     */
    public java.lang.String getApplicantName() {
        return this.applicantName;
    }

    /**
     * 设置 记录申请号码预选的申请人类型。LOVB=RES-C-0033
     */
    public void setApplicantType(java.lang.String applicantType) {
        this.applicantType = applicantType;
    }

    /**
     * 获取 记录申请号码预选的申请人类型。LOVB=RES-C-0033
     */
    public java.lang.String getApplicantType() {
        return this.applicantType;
    }

    /**
     * 设置 记录号码预选的申请人标识，如果是已有客户，记录客户标识；如果是客户经理，记录员工标识。新客户，则为空，根据证件判断。
     */
    public void setApplicantId(java.lang.Long applicantId) {
        this.applicantId = applicantId;
    }

    /**
     * 获取 记录号码预选的申请人标识，如果是已有客户，记录客户标识；如果是客户经理，记录员工标识。新客户，则为空，根据证件判断。
     */
    public java.lang.Long getApplicantId() {
        return this.applicantId;
    }

    /**
     * 设置 记录网厅或其他系统申请预选号码的请求流水号
     */
    public void setRequestNbr(java.lang.String requestNbr) {
        this.requestNbr = requestNbr;
    }

    /**
     * 获取 记录网厅或其他系统申请预选号码的请求流水号
     */
    public java.lang.String getRequestNbr() {
        return this.requestNbr;
    }

    /**
     * 设置 记录申请人证件类型。LOVB=PTY-0004
     */
    public void setCertType(java.lang.String certType) {
        this.certType = certType;
    }

    /**
     * 获取 记录申请人证件类型。LOVB=PTY-0004
     */
    public java.lang.String getCertType() {
        return this.certType;
    }

    /**
     * 设置 记录申请人联系电话。
     */
    public void setConnectPhone(java.lang.String connectPhone) {
        this.connectPhone = connectPhone;
    }

    /**
     * 获取 记录申请人联系电话。
     */
    public java.lang.String getConnectPhone() {
        return this.connectPhone;
    }

    /**
     * 设置 记录申请人证件号码。
     */
    public void setCertNum(java.lang.String certNum) {
        this.certNum = certNum;
    }

    /**
     * 获取 记录申请人证件号码。
     */
    public java.lang.String getCertNum() {
        return this.certNum;
    }

    /**
     * 设置 记录申请预选的来源渠道。LOVB=EVT-C-0001
     */
    public void setRequestSource(java.lang.String requestSource) {
        this.requestSource = requestSource;
    }

    /**
     * 获取 记录申请预选的来源渠道。LOVB=EVT-C-0001
     */
    public java.lang.String getRequestSource() {
        return this.requestSource;
    }

    /**
     * 设置 记录申请号码预选的生效时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录申请号码预选的生效时间。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录申请号码预选的失效时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录申请号码预选的失效时间。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 指向公共管理区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 指向公共管理区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
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

}
