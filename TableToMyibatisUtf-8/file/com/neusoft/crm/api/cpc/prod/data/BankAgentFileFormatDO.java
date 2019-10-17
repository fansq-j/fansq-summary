package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述托收文件格式的配置。
 * @实体表  :BANK_AGENT_FILE_FORMAT
 */
public class BankAgentFileFormatDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BANK_AGENT_FILE_FORMAT_S";

    /**
     * 文件格式项标识，主键
     */
    public java.lang.Integer bankAgentFileFormatId;

    /**
     * 格式标识
            
     */
    public java.lang.Integer bankFormatId;

    /**
     * 项目名称
     */
    public java.lang.String itemName;

    /**
     * 默认值
     */
    public java.lang.String defaultValue;

    /**
     * 起始位置
     */
    public java.lang.Integer begionPosition;

    /**
     * 项目长度
     */
    public java.lang.Integer itemLength;

    /**
     * 补串类型指的是前面补、后面补。ACC-C-0102
     */
    public java.lang.Integer padType;

    /**
     * 补串值
     */
    public java.lang.String padString;

    /**
     * LOVB=ACC-C-0132
     */
    public java.lang.Integer rowType;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

    /**
     * 设置 文件格式项标识，主键
     */
    public void setBankAgentFileFormatId(java.lang.Integer bankAgentFileFormatId) {
        this.bankAgentFileFormatId = bankAgentFileFormatId;
    }

    /**
     * 获取 文件格式项标识，主键
     */
    public java.lang.Integer getBankAgentFileFormatId() {
        return this.bankAgentFileFormatId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.bankAgentFileFormatId = SeqUtils.createIntegerId(ID_SEQ);
         return this.bankAgentFileFormatId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 格式标识
            
     */
    public void setBankFormatId(java.lang.Integer bankFormatId) {
        this.bankFormatId = bankFormatId;
    }

    /**
     * 获取 格式标识
            
     */
    public java.lang.Integer getBankFormatId() {
        return this.bankFormatId;
    }

    /**
     * 设置 项目名称
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }

    /**
     * 获取 项目名称
     */
    public java.lang.String getItemName() {
        return this.itemName;
    }

    /**
     * 设置 默认值
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * 获取 默认值
     */
    public java.lang.String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * 设置 起始位置
     */
    public void setBegionPosition(java.lang.Integer begionPosition) {
        this.begionPosition = begionPosition;
    }

    /**
     * 获取 起始位置
     */
    public java.lang.Integer getBegionPosition() {
        return this.begionPosition;
    }

    /**
     * 设置 项目长度
     */
    public void setItemLength(java.lang.Integer itemLength) {
        this.itemLength = itemLength;
    }

    /**
     * 获取 项目长度
     */
    public java.lang.Integer getItemLength() {
        return this.itemLength;
    }

    /**
     * 设置 补串类型指的是前面补、后面补。ACC-C-0102
     */
    public void setPadType(java.lang.Integer padType) {
        this.padType = padType;
    }

    /**
     * 获取 补串类型指的是前面补、后面补。ACC-C-0102
     */
    public java.lang.Integer getPadType() {
        return this.padType;
    }

    /**
     * 设置 补串值
     */
    public void setPadString(java.lang.String padString) {
        this.padString = padString;
    }

    /**
     * 获取 补串值
     */
    public java.lang.String getPadString() {
        return this.padString;
    }

    /**
     * 设置 LOVB=ACC-C-0132
     */
    public void setRowType(java.lang.Integer rowType) {
        this.rowType = rowType;
    }

    /**
     * 获取 LOVB=ACC-C-0132
     */
    public java.lang.Integer getRowType() {
        return this.rowType;
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

}
