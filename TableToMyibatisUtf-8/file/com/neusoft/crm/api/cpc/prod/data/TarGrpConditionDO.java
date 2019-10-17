package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:根据注智标签进行分群的匹配条件配置
 * @实体表  :TAR_GRP_CONDITION
 */
public class TarGrpConditionDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TAR_GRP_CONDITION_S";

    /**
     * 目标分群条件标识
     */
    public java.lang.Long conditionId;

    /**
     * 目标分群标识
     */
    public java.lang.Long tarGrpId;

    /**
     * 是否是根条件，LOVB=PUB-C-0006
     */
    public java.lang.Integer rootFlag;

    /**
     * 左边参数，类型为注智标签时，对应为注智标签标识；类型为表达式时，为分群条件ID
     */
    public java.lang.String leftParam;

    /**
     * 参数类型LOVB =CAM-C-0019
     */
    public java.lang.String leftParamType;

    /**
     * 运算类型LOVB=CAM-C-0020
     */
    public java.lang.String operType;

    /**
     * 右边参数，类型为注智标签时，对应为注智标签标识；类型为表达式时，为分群条件ID
     */
    public java.lang.String rightParam;

    /**
     * 参数类型LOVB=CAM-C-0019
     */
    public java.lang.String rightParamType;

    /**
     * 条件表达式的业务含义，用于前台展示
     */
    public java.lang.String conditionText;

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
     * 设置 目标分群条件标识
     */
    public void setConditionId(java.lang.Long conditionId) {
        this.conditionId = conditionId;
    }

    /**
     * 获取 目标分群条件标识
     */
    public java.lang.Long getConditionId() {
        return this.conditionId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.conditionId = SeqUtils.createLongId(ID_SEQ);
         return this.conditionId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

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
     * 设置 是否是根条件，LOVB=PUB-C-0006
     */
    public void setRootFlag(java.lang.Integer rootFlag) {
        this.rootFlag = rootFlag;
    }

    /**
     * 获取 是否是根条件，LOVB=PUB-C-0006
     */
    public java.lang.Integer getRootFlag() {
        return this.rootFlag;
    }

    /**
     * 设置 左边参数，类型为注智标签时，对应为注智标签标识；类型为表达式时，为分群条件ID
     */
    public void setLeftParam(java.lang.String leftParam) {
        this.leftParam = leftParam;
    }

    /**
     * 获取 左边参数，类型为注智标签时，对应为注智标签标识；类型为表达式时，为分群条件ID
     */
    public java.lang.String getLeftParam() {
        return this.leftParam;
    }

    /**
     * 设置 参数类型LOVB =CAM-C-0019
     */
    public void setLeftParamType(java.lang.String leftParamType) {
        this.leftParamType = leftParamType;
    }

    /**
     * 获取 参数类型LOVB =CAM-C-0019
     */
    public java.lang.String getLeftParamType() {
        return this.leftParamType;
    }

    /**
     * 设置 运算类型LOVB=CAM-C-0020
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 运算类型LOVB=CAM-C-0020
     */
    public java.lang.String getOperType() {
        return this.operType;
    }

    /**
     * 设置 右边参数，类型为注智标签时，对应为注智标签标识；类型为表达式时，为分群条件ID
     */
    public void setRightParam(java.lang.String rightParam) {
        this.rightParam = rightParam;
    }

    /**
     * 获取 右边参数，类型为注智标签时，对应为注智标签标识；类型为表达式时，为分群条件ID
     */
    public java.lang.String getRightParam() {
        return this.rightParam;
    }

    /**
     * 设置 参数类型LOVB=CAM-C-0019
     */
    public void setRightParamType(java.lang.String rightParamType) {
        this.rightParamType = rightParamType;
    }

    /**
     * 获取 参数类型LOVB=CAM-C-0019
     */
    public java.lang.String getRightParamType() {
        return this.rightParamType;
    }

    /**
     * 设置 条件表达式的业务含义，用于前台展示
     */
    public void setConditionText(java.lang.String conditionText) {
        this.conditionText = conditionText;
    }

    /**
     * 获取 条件表达式的业务含义，用于前台展示
     */
    public java.lang.String getConditionText() {
        return this.conditionText;
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
