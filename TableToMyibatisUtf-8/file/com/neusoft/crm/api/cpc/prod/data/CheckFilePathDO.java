package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:配置支付渠道、支付使用系统的对帐文件采集或推送路径
 * @实体表  :CHECK_FILE_PATH
 */
public class CheckFilePathDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CHECK_FILE_PATH_S";

    /**
     * 对帐文件路径标识主键
     */
    public java.lang.Integer pathId;

    /**
     * 对应采集协议主键
     */
    public java.lang.Integer protocalId;

    /**
     * PAY-C-0004：1-支付使用系统；2-支付渠道
     */
    public java.lang.Integer objType;

    /**
     * 当对象类型为1时，为使用系统标识；当对象类型为2时，未支付渠道标识
     */
    public java.lang.Integer objId;

    /**
     * PAY-C-0003：1-采集；2-推送；3-双向
     */
    public java.lang.Integer direction;

    /**
     * 采集或推送的频率，单位：秒
     */
    public java.lang.Integer percentTimes;

    /**
     * 采集主机
     */
    public java.lang.String gatherIp;

    /**
     * 采集主机端口
     */
    public java.lang.String gatherPort;

    /**
     * 采集主机用户名
     */
    public java.lang.String gatherUser;

    /**
     * 采集主机用户密码
     */
    public java.lang.String gatherPassword;

    /**
     * 文件采集路径
     */
    public java.lang.String gatherPath;

    /**
     * 备份路径
     */
    public java.lang.String backupPath;

    /**
     * 采集的URL
     */
    public java.lang.String gatherUrl;

    /**
     * 文件命名规则
     */
    public java.lang.String filenamePrefix;

    /**
     * 推送主机
     */
    public java.lang.String sendIp;

    /**
     * 推送主机端口
     */
    public java.lang.String sendPort;

    /**
     * 推送主机用户名
     */
    public java.lang.String sendUser;

    /**
     * 推送主机用户密码
     */
    public java.lang.String sendPassword;

    /**
     * 推送路径
     */
    public java.lang.String sendPath;

    /**
     * 推送URL
     */
    public java.lang.String sendUrl;

    /**
     * 最近一次采集日期
     */
    public java.util.Date lastGatherDate;

    /**
     * 最近一次推送日期
     */
    public java.util.Date lastSendDate;

    /**
     * 记录状态。PAY-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 创建员工
     */
    public java.lang.Long createStaff;

    /**
     * 修改员工
     */
    public java.lang.Long updateStaff;

    /**
     * 创建日期
     */
    public java.util.Date createDate;

    /**
     * 记录状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 对帐文件路径标识主键
     */
    public void setPathId(java.lang.Integer pathId) {
        this.pathId = pathId;
    }

    /**
     * 获取 对帐文件路径标识主键
     */
    public java.lang.Integer getPathId() {
        return this.pathId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pathId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pathId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 对应采集协议主键
     */
    public void setProtocalId(java.lang.Integer protocalId) {
        this.protocalId = protocalId;
    }

    /**
     * 获取 对应采集协议主键
     */
    public java.lang.Integer getProtocalId() {
        return this.protocalId;
    }

    /**
     * 设置 PAY-C-0004：1-支付使用系统；2-支付渠道
     */
    public void setObjType(java.lang.Integer objType) {
        this.objType = objType;
    }

    /**
     * 获取 PAY-C-0004：1-支付使用系统；2-支付渠道
     */
    public java.lang.Integer getObjType() {
        return this.objType;
    }

    /**
     * 设置 当对象类型为1时，为使用系统标识；当对象类型为2时，未支付渠道标识
     */
    public void setObjId(java.lang.Integer objId) {
        this.objId = objId;
    }

    /**
     * 获取 当对象类型为1时，为使用系统标识；当对象类型为2时，未支付渠道标识
     */
    public java.lang.Integer getObjId() {
        return this.objId;
    }

    /**
     * 设置 PAY-C-0003：1-采集；2-推送；3-双向
     */
    public void setDirection(java.lang.Integer direction) {
        this.direction = direction;
    }

    /**
     * 获取 PAY-C-0003：1-采集；2-推送；3-双向
     */
    public java.lang.Integer getDirection() {
        return this.direction;
    }

    /**
     * 设置 采集或推送的频率，单位：秒
     */
    public void setPercentTimes(java.lang.Integer percentTimes) {
        this.percentTimes = percentTimes;
    }

    /**
     * 获取 采集或推送的频率，单位：秒
     */
    public java.lang.Integer getPercentTimes() {
        return this.percentTimes;
    }

    /**
     * 设置 采集主机
     */
    public void setGatherIp(java.lang.String gatherIp) {
        this.gatherIp = gatherIp;
    }

    /**
     * 获取 采集主机
     */
    public java.lang.String getGatherIp() {
        return this.gatherIp;
    }

    /**
     * 设置 采集主机端口
     */
    public void setGatherPort(java.lang.String gatherPort) {
        this.gatherPort = gatherPort;
    }

    /**
     * 获取 采集主机端口
     */
    public java.lang.String getGatherPort() {
        return this.gatherPort;
    }

    /**
     * 设置 采集主机用户名
     */
    public void setGatherUser(java.lang.String gatherUser) {
        this.gatherUser = gatherUser;
    }

    /**
     * 获取 采集主机用户名
     */
    public java.lang.String getGatherUser() {
        return this.gatherUser;
    }

    /**
     * 设置 采集主机用户密码
     */
    public void setGatherPassword(java.lang.String gatherPassword) {
        this.gatherPassword = gatherPassword;
    }

    /**
     * 获取 采集主机用户密码
     */
    public java.lang.String getGatherPassword() {
        return this.gatherPassword;
    }

    /**
     * 设置 文件采集路径
     */
    public void setGatherPath(java.lang.String gatherPath) {
        this.gatherPath = gatherPath;
    }

    /**
     * 获取 文件采集路径
     */
    public java.lang.String getGatherPath() {
        return this.gatherPath;
    }

    /**
     * 设置 备份路径
     */
    public void setBackupPath(java.lang.String backupPath) {
        this.backupPath = backupPath;
    }

    /**
     * 获取 备份路径
     */
    public java.lang.String getBackupPath() {
        return this.backupPath;
    }

    /**
     * 设置 采集的URL
     */
    public void setGatherUrl(java.lang.String gatherUrl) {
        this.gatherUrl = gatherUrl;
    }

    /**
     * 获取 采集的URL
     */
    public java.lang.String getGatherUrl() {
        return this.gatherUrl;
    }

    /**
     * 设置 文件命名规则
     */
    public void setFilenamePrefix(java.lang.String filenamePrefix) {
        this.filenamePrefix = filenamePrefix;
    }

    /**
     * 获取 文件命名规则
     */
    public java.lang.String getFilenamePrefix() {
        return this.filenamePrefix;
    }

    /**
     * 设置 推送主机
     */
    public void setSendIp(java.lang.String sendIp) {
        this.sendIp = sendIp;
    }

    /**
     * 获取 推送主机
     */
    public java.lang.String getSendIp() {
        return this.sendIp;
    }

    /**
     * 设置 推送主机端口
     */
    public void setSendPort(java.lang.String sendPort) {
        this.sendPort = sendPort;
    }

    /**
     * 获取 推送主机端口
     */
    public java.lang.String getSendPort() {
        return this.sendPort;
    }

    /**
     * 设置 推送主机用户名
     */
    public void setSendUser(java.lang.String sendUser) {
        this.sendUser = sendUser;
    }

    /**
     * 获取 推送主机用户名
     */
    public java.lang.String getSendUser() {
        return this.sendUser;
    }

    /**
     * 设置 推送主机用户密码
     */
    public void setSendPassword(java.lang.String sendPassword) {
        this.sendPassword = sendPassword;
    }

    /**
     * 获取 推送主机用户密码
     */
    public java.lang.String getSendPassword() {
        return this.sendPassword;
    }

    /**
     * 设置 推送路径
     */
    public void setSendPath(java.lang.String sendPath) {
        this.sendPath = sendPath;
    }

    /**
     * 获取 推送路径
     */
    public java.lang.String getSendPath() {
        return this.sendPath;
    }

    /**
     * 设置 推送URL
     */
    public void setSendUrl(java.lang.String sendUrl) {
        this.sendUrl = sendUrl;
    }

    /**
     * 获取 推送URL
     */
    public java.lang.String getSendUrl() {
        return this.sendUrl;
    }

    /**
     * 设置 最近一次采集日期
     */
    public void setLastGatherDate(java.util.Date lastGatherDate) {
        this.lastGatherDate = lastGatherDate;
    }

    /**
     * 获取 最近一次采集日期
     */
    public java.util.Date getLastGatherDate() {
        return this.lastGatherDate;
    }

    /**
     * 设置 最近一次推送日期
     */
    public void setLastSendDate(java.util.Date lastSendDate) {
        this.lastSendDate = lastSendDate;
    }

    /**
     * 获取 最近一次推送日期
     */
    public java.util.Date getLastSendDate() {
        return this.lastSendDate;
    }

    /**
     * 设置 记录状态。PAY-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。PAY-C-0001
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 创建日期
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建日期
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
