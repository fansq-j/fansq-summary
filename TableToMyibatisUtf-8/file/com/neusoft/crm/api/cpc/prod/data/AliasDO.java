package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述对于一个实际行政区域的另外一些表示方式，如金贸大厦。
 * @实体表  :ALIAS
 */
public class AliasDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ALIAS_S";

    /**
     * 别名标识，主键。
     */
    public java.lang.Long aliasId;

    /**
     * 行政区域的唯一标识。
     */
    public java.lang.Long locId;

    /**
     * 行政区域所指定的别名。
     */
    public java.lang.String aliasName;

    /**
     * 别名的具体描述。
     */
    public java.lang.String aliasDesc;

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
     * 设置 别名标识，主键。
     */
    public void setAliasId(java.lang.Long aliasId) {
        this.aliasId = aliasId;
    }

    /**
     * 获取 别名标识，主键。
     */
    public java.lang.Long getAliasId() {
        return this.aliasId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.aliasId = SeqUtils.createLongId(ID_SEQ);
         return this.aliasId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 行政区域的唯一标识。
     */
    public void setLocId(java.lang.Long locId) {
        this.locId = locId;
    }

    /**
     * 获取 行政区域的唯一标识。
     */
    public java.lang.Long getLocId() {
        return this.locId;
    }

    /**
     * 设置 行政区域所指定的别名。
     */
    public void setAliasName(java.lang.String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * 获取 行政区域所指定的别名。
     */
    public java.lang.String getAliasName() {
        return this.aliasName;
    }

    /**
     * 设置 别名的具体描述。
     */
    public void setAliasDesc(java.lang.String aliasDesc) {
        this.aliasDesc = aliasDesc;
    }

    /**
     * 获取 别名的具体描述。
     */
    public java.lang.String getAliasDesc() {
        return this.aliasDesc;
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
