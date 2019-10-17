package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述接口配置的参数信息表,记录每个事件源的接口配置的具体参数（如：URL，端口，授权用户，密码等）存储在接口配置参数实体
 * @实体表  :INTF_CFG_PARAM
 */
public class IntfCfgParamDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "INTF_CFG_PARAM_S";

    /**
     * 记录接口配置参数的主键标识
     */
    public java.lang.Long intfCfgParamId;

    /**
     * 接口配置标识
     */
    public java.lang.Long interfaceCfgId;

    /**
     * 描述接口的调用地址URL
     */
    public java.lang.String url;

    /**
     * 描述服务端的服务端口号
     */
    public java.lang.String port;

    /**
     * 记录有权限访问服务端服务的用户名称
     */
    public java.lang.String userName;

    /**
     * 记录有权限访问服务端服务的用户密码
     */
    public java.lang.String password;

    /**
     * 记录接口的超时时间，单位秒
     */
    public java.lang.Integer timeout;

    /**
     * 记录加密的公钥
     */
    public java.lang.String publicKey;

    /**
     * 记录接口的本地网区域标识
     */
    public java.lang.Long regionId;

    /**
     * 状态。LOVB=PUB-C-0001
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
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录接口配置参数的主键标识
     */
    public void setIntfCfgParamId(java.lang.Long intfCfgParamId) {
        this.intfCfgParamId = intfCfgParamId;
    }

    /**
     * 获取 记录接口配置参数的主键标识
     */
    public java.lang.Long getIntfCfgParamId() {
        return this.intfCfgParamId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.intfCfgParamId = SeqUtils.createLongId(ID_SEQ);
         return this.intfCfgParamId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 接口配置标识
     */
    public void setInterfaceCfgId(java.lang.Long interfaceCfgId) {
        this.interfaceCfgId = interfaceCfgId;
    }

    /**
     * 获取 接口配置标识
     */
    public java.lang.Long getInterfaceCfgId() {
        return this.interfaceCfgId;
    }

    /**
     * 设置 描述接口的调用地址URL
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    /**
     * 获取 描述接口的调用地址URL
     */
    public java.lang.String getUrl() {
        return this.url;
    }

    /**
     * 设置 描述服务端的服务端口号
     */
    public void setPort(java.lang.String port) {
        this.port = port;
    }

    /**
     * 获取 描述服务端的服务端口号
     */
    public java.lang.String getPort() {
        return this.port;
    }

    /**
     * 设置 记录有权限访问服务端服务的用户名称
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    /**
     * 获取 记录有权限访问服务端服务的用户名称
     */
    public java.lang.String getUserName() {
        return this.userName;
    }

    /**
     * 设置 记录有权限访问服务端服务的用户密码
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    /**
     * 获取 记录有权限访问服务端服务的用户密码
     */
    public java.lang.String getPassword() {
        return this.password;
    }

    /**
     * 设置 记录接口的超时时间，单位秒
     */
    public void setTimeout(java.lang.Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * 获取 记录接口的超时时间，单位秒
     */
    public java.lang.Integer getTimeout() {
        return this.timeout;
    }

    /**
     * 设置 记录加密的公钥
     */
    public void setPublicKey(java.lang.String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * 获取 记录加密的公钥
     */
    public java.lang.String getPublicKey() {
        return this.publicKey;
    }

    /**
     * 设置 记录接口的本地网区域标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 记录接口的本地网区域标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 状态。LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态。LOVB=PUB-C-0001
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
