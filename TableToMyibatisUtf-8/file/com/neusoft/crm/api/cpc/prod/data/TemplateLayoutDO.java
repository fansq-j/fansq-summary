package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义回执模板布局，可以针对区域、打印项、打印详情
 * @实体表  :TEMPLATE_LAYOUT
 */
public class TemplateLayoutDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TEMPLATE_LAYOUT_S";

    /**
     * 模板布局标识
     */
    public java.lang.Long templateLayoutId;

    /**
     * 水平位置
     */
    public java.lang.String xPosition;

    /**
     * 垂直位置
     */
    public java.lang.String yPosition;

    /**
     * 最小高度
     */
    public java.lang.String minHeight;

    /**
     * 最小宽度
     */
    public java.lang.String minWidth;

    /**
     * 列数
     */
    public java.lang.Integer colNum;

    /**
     * 字体大小
     */
    public java.lang.Integer fontSize;

    /**
     * 字体
     */
    public java.lang.String fontFamily;

    /**
     * 左边距
     */
    public java.lang.String marginLeft;

    /**
     * 右边距
     */
    public java.lang.String marginRight;

    /**
     * 上边距
     */
    public java.lang.String marginTop;

    /**
     * 下边距
     */
    public java.lang.String marginBottom;

    /**
     * 子集间隔线类型，虚线、实线
     */
    public java.lang.String gapLine;

    /**
     * 样式
     */
    public java.lang.String cssClass;

    /**
     * 状态，LOVB=PUB-C-0001。
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
     * 设置 模板布局标识
     */
    public void setTemplateLayoutId(java.lang.Long templateLayoutId) {
        this.templateLayoutId = templateLayoutId;
    }

    /**
     * 获取 模板布局标识
     */
    public java.lang.Long getTemplateLayoutId() {
        return this.templateLayoutId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.templateLayoutId = SeqUtils.createLongId(ID_SEQ);
         return this.templateLayoutId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 水平位置
     */
    public void setXPosition(java.lang.String xPosition) {
        this.xPosition = xPosition;
    }

    /**
     * 获取 水平位置
     */
    public java.lang.String getXPosition() {
        return this.xPosition;
    }

    /**
     * 设置 垂直位置
     */
    public void setYPosition(java.lang.String yPosition) {
        this.yPosition = yPosition;
    }

    /**
     * 获取 垂直位置
     */
    public java.lang.String getYPosition() {
        return this.yPosition;
    }

    /**
     * 设置 最小高度
     */
    public void setMinHeight(java.lang.String minHeight) {
        this.minHeight = minHeight;
    }

    /**
     * 获取 最小高度
     */
    public java.lang.String getMinHeight() {
        return this.minHeight;
    }

    /**
     * 设置 最小宽度
     */
    public void setMinWidth(java.lang.String minWidth) {
        this.minWidth = minWidth;
    }

    /**
     * 获取 最小宽度
     */
    public java.lang.String getMinWidth() {
        return this.minWidth;
    }

    /**
     * 设置 列数
     */
    public void setColNum(java.lang.Integer colNum) {
        this.colNum = colNum;
    }

    /**
     * 获取 列数
     */
    public java.lang.Integer getColNum() {
        return this.colNum;
    }

    /**
     * 设置 字体大小
     */
    public void setFontSize(java.lang.Integer fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * 获取 字体大小
     */
    public java.lang.Integer getFontSize() {
        return this.fontSize;
    }

    /**
     * 设置 字体
     */
    public void setFontFamily(java.lang.String fontFamily) {
        this.fontFamily = fontFamily;
    }

    /**
     * 获取 字体
     */
    public java.lang.String getFontFamily() {
        return this.fontFamily;
    }

    /**
     * 设置 左边距
     */
    public void setMarginLeft(java.lang.String marginLeft) {
        this.marginLeft = marginLeft;
    }

    /**
     * 获取 左边距
     */
    public java.lang.String getMarginLeft() {
        return this.marginLeft;
    }

    /**
     * 设置 右边距
     */
    public void setMarginRight(java.lang.String marginRight) {
        this.marginRight = marginRight;
    }

    /**
     * 获取 右边距
     */
    public java.lang.String getMarginRight() {
        return this.marginRight;
    }

    /**
     * 设置 上边距
     */
    public void setMarginTop(java.lang.String marginTop) {
        this.marginTop = marginTop;
    }

    /**
     * 获取 上边距
     */
    public java.lang.String getMarginTop() {
        return this.marginTop;
    }

    /**
     * 设置 下边距
     */
    public void setMarginBottom(java.lang.String marginBottom) {
        this.marginBottom = marginBottom;
    }

    /**
     * 获取 下边距
     */
    public java.lang.String getMarginBottom() {
        return this.marginBottom;
    }

    /**
     * 设置 子集间隔线类型，虚线、实线
     */
    public void setGapLine(java.lang.String gapLine) {
        this.gapLine = gapLine;
    }

    /**
     * 获取 子集间隔线类型，虚线、实线
     */
    public java.lang.String getGapLine() {
        return this.gapLine;
    }

    /**
     * 设置 样式
     */
    public void setCssClass(java.lang.String cssClass) {
        this.cssClass = cssClass;
    }

    /**
     * 获取 样式
     */
    public java.lang.String getCssClass() {
        return this.cssClass;
    }

    /**
     * 设置 状态，LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态，LOVB=PUB-C-0001。
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
