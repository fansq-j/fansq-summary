package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:营销脚本是营销活动中营销执行人员与客户沟通交流时所使用的设定的应对内容及流程的说明。
 * @实体表  :MKT_SCRIPT
 */
public class MktScriptDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_SCRIPT_S";

    /**
     * 营销脚本标识，主键
     */
    public java.lang.Long scriptId;

    /**
     * 记录营销脚本名称
     */
    public java.lang.String scriptName;

    /**
     * 记录营销脚本的具体脚本内容
     */
    public java.lang.String scriptDesc;

    /**
     * 记录营销脚本类型,LOVB=CAM-0002
     */
    public java.lang.String scriptType;

    /**
     * 记录渠道类型，LOVB=CHN-0017
     */
    public java.lang.String suitChannelType;

    /**
     * 记录营销脚本具体的执行渠道标识
     */
    public java.lang.String execChannel;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 营销脚本标识，主键
     */
    public void setScriptId(java.lang.Long scriptId) {
        this.scriptId = scriptId;
    }

    /**
     * 获取 营销脚本标识，主键
     */
    public java.lang.Long getScriptId() {
        return this.scriptId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.scriptId = SeqUtils.createLongId(ID_SEQ);
         return this.scriptId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录营销脚本名称
     */
    public void setScriptName(java.lang.String scriptName) {
        this.scriptName = scriptName;
    }

    /**
     * 获取 记录营销脚本名称
     */
    public java.lang.String getScriptName() {
        return this.scriptName;
    }

    /**
     * 设置 记录营销脚本的具体脚本内容
     */
    public void setScriptDesc(java.lang.String scriptDesc) {
        this.scriptDesc = scriptDesc;
    }

    /**
     * 获取 记录营销脚本的具体脚本内容
     */
    public java.lang.String getScriptDesc() {
        return this.scriptDesc;
    }

    /**
     * 设置 记录营销脚本类型,LOVB=CAM-0002
     */
    public void setScriptType(java.lang.String scriptType) {
        this.scriptType = scriptType;
    }

    /**
     * 获取 记录营销脚本类型,LOVB=CAM-0002
     */
    public java.lang.String getScriptType() {
        return this.scriptType;
    }

    /**
     * 设置 记录渠道类型，LOVB=CHN-0017
     */
    public void setSuitChannelType(java.lang.String suitChannelType) {
        this.suitChannelType = suitChannelType;
    }

    /**
     * 获取 记录渠道类型，LOVB=CHN-0017
     */
    public java.lang.String getSuitChannelType() {
        return this.suitChannelType;
    }

    /**
     * 设置 记录营销脚本具体的执行渠道标识
     */
    public void setExecChannel(java.lang.String execChannel) {
        this.execChannel = execChannel;
    }

    /**
     * 获取 记录营销脚本具体的执行渠道标识
     */
    public java.lang.String getExecChannel() {
        return this.execChannel;
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
