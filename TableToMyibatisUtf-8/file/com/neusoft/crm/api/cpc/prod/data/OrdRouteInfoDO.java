package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录订单变更的路由信息。
 * @实体表  :ORD_ROUTE_INFO
 */
public class OrdRouteInfoDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORD_ROUTE_INFO_S";

    /**
     * 记录路由信息标识，主键。
     */
    public java.lang.Long routeInfoId;

    /**
     * 记录产品实例标识，外键。
     */
    public java.lang.Long prodInstId;

    /**
     * 记录路由的来电区域。
     */
    public java.lang.Integer routeCallArea;

    /**
     * 记录指定流量：填数值1-100的整数,表示百分比  
     */
    public java.lang.Integer routeRate;

    /**
     * 记录路由日期段类型，1:所有日期，2：指定日期，3：除指定日期外的其他日期  
     */
    public java.lang.String routeDateType;

    /**
     * 记录指定日期的起始日期(格式：YYYY-MM-DD)  
     */
    public java.util.Date startDate;

    /**
     * 记录指定日期的结束日期(格式：YYYY-MM-DD)
     */
    public java.util.Date endDate;

    /**
     * 记录时间类型：1：所有时间，2：指定时间，3：除指定时间外的其他时间  
     */
    public java.lang.String routeTimeType;

    /**
     * 记录指定日期的起始日期(格式：HH24:MI:SS)     
     */
    public java.util.Date startTime;

    /**
     * 记录指定日期的结束时间(格式：HH24:MI:SS)   
     */
    public java.util.Date endTime;

    /**
     * 记录路由周类型：1：所有周，2：指定某几周，3：除指定周外的其他周
     */
    public java.lang.String routeWeekType;

    /**
     * 记录指定起始的周几，如周一、周二
     */
    public java.lang.String startWeek;

    /**
     * 记录指定结束的周几，如周一、周二
     */
    public java.lang.String endWeek;

    /**
     * 记录分配方式类型：1：用户被叫号码，2：静态语音 
     */
    public java.lang.String routeDescType;

    /**
     * 记录分配号码区号。
     */
    public java.lang.Integer routeDescNumHead;

    /**
     * 记录分配号码。
     */
    public java.lang.String routeDescNum;

    /**
     * 记录遇忙时转移功能(0不开通，1呼转到号码,2呼转到语音）
     */
    public java.lang.String busyFlag;

    /**
     * 记录遇忙时转移号码A区号。
     */
    public java.lang.String busyNumHeadA;

    /**
     * 记录遇忙时转移号码A。
     */
    public java.lang.String busyNumA;

    /**
     * 记录遇忙时转移号码B区号。
     */
    public java.lang.String busyNumHeadB;

    /**
     * 记录遇忙时转移号码B。
     */
    public java.lang.String busyNumB;

    /**
     * 记录遇无应答转移功能(0不开通，1呼转到号码,2呼转到语音）
     */
    public java.lang.String noFlag;

    /**
     * 记录遇无应答转移号码A区号。
     */
    public java.lang.String noNumHeadA;

    /**
     * 记录无应答转移号码A。
     */
    public java.lang.String noNumA;

    /**
     * 记录遇无应答转移号码B区号。
     */
    public java.lang.String noNumHeadB;

    /**
     * 记录遇无应答转移号码B。
     */
    public java.lang.String noNumB;

    /**
     * 记录遇其他转(0不开通，1呼转到号码,2呼转到语音）
     */
    public java.lang.String otherFlag;

    /**
     * 记录遇其他转号码A区号。
     */
    public java.lang.String otherNumHeadA;

    /**
     * 记录遇其他转号码A。
     */
    public java.lang.String otherNumA;

    /**
     * 记录遇其他转号码B区号。
     */
    public java.lang.String otherNumHeadB;

    /**
     * 记录遇其他转号码B。
     */
    public java.lang.String otherNumB;

    /**
     * 记录数据的行号，主键。
     */
    public java.lang.Long rowId;

    /**
     * 记录订单项标识。
     */
    public java.lang.Long orderItemId;

    /**
     * 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long oldRowId;

    /**
     * 操作类型，新增/修改/删除/保持
     */
    public java.lang.String operType;

    /**
     * 记录数据的状态，分为有效/无效/历史。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
     */
    public java.util.Date statusDate;

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
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 记录订单项版本号。
     */
    public java.lang.Integer verNum;

    /**
     * 设置 记录路由信息标识，主键。
     */
    public void setRouteInfoId(java.lang.Long routeInfoId) {
        this.routeInfoId = routeInfoId;
    }

    /**
     * 获取 记录路由信息标识，主键。
     */
    public java.lang.Long getRouteInfoId() {
        return this.routeInfoId;
    }

    /**
     * 设置 记录产品实例标识，外键。
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 记录产品实例标识，外键。
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 记录路由的来电区域。
     */
    public void setRouteCallArea(java.lang.Integer routeCallArea) {
        this.routeCallArea = routeCallArea;
    }

    /**
     * 获取 记录路由的来电区域。
     */
    public java.lang.Integer getRouteCallArea() {
        return this.routeCallArea;
    }

    /**
     * 设置 记录指定流量：填数值1-100的整数,表示百分比  
     */
    public void setRouteRate(java.lang.Integer routeRate) {
        this.routeRate = routeRate;
    }

    /**
     * 获取 记录指定流量：填数值1-100的整数,表示百分比  
     */
    public java.lang.Integer getRouteRate() {
        return this.routeRate;
    }

    /**
     * 设置 记录路由日期段类型，1:所有日期，2：指定日期，3：除指定日期外的其他日期  
     */
    public void setRouteDateType(java.lang.String routeDateType) {
        this.routeDateType = routeDateType;
    }

    /**
     * 获取 记录路由日期段类型，1:所有日期，2：指定日期，3：除指定日期外的其他日期  
     */
    public java.lang.String getRouteDateType() {
        return this.routeDateType;
    }

    /**
     * 设置 记录指定日期的起始日期(格式：YYYY-MM-DD)  
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取 记录指定日期的起始日期(格式：YYYY-MM-DD)  
     */
    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * 设置 记录指定日期的结束日期(格式：YYYY-MM-DD)
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取 记录指定日期的结束日期(格式：YYYY-MM-DD)
     */
    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * 设置 记录时间类型：1：所有时间，2：指定时间，3：除指定时间外的其他时间  
     */
    public void setRouteTimeType(java.lang.String routeTimeType) {
        this.routeTimeType = routeTimeType;
    }

    /**
     * 获取 记录时间类型：1：所有时间，2：指定时间，3：除指定时间外的其他时间  
     */
    public java.lang.String getRouteTimeType() {
        return this.routeTimeType;
    }

    /**
     * 设置 记录指定日期的起始日期(格式：HH24:MI:SS)     
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取 记录指定日期的起始日期(格式：HH24:MI:SS)     
     */
    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * 设置 记录指定日期的结束时间(格式：HH24:MI:SS)   
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取 记录指定日期的结束时间(格式：HH24:MI:SS)   
     */
    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * 设置 记录路由周类型：1：所有周，2：指定某几周，3：除指定周外的其他周
     */
    public void setRouteWeekType(java.lang.String routeWeekType) {
        this.routeWeekType = routeWeekType;
    }

    /**
     * 获取 记录路由周类型：1：所有周，2：指定某几周，3：除指定周外的其他周
     */
    public java.lang.String getRouteWeekType() {
        return this.routeWeekType;
    }

    /**
     * 设置 记录指定起始的周几，如周一、周二
     */
    public void setStartWeek(java.lang.String startWeek) {
        this.startWeek = startWeek;
    }

    /**
     * 获取 记录指定起始的周几，如周一、周二
     */
    public java.lang.String getStartWeek() {
        return this.startWeek;
    }

    /**
     * 设置 记录指定结束的周几，如周一、周二
     */
    public void setEndWeek(java.lang.String endWeek) {
        this.endWeek = endWeek;
    }

    /**
     * 获取 记录指定结束的周几，如周一、周二
     */
    public java.lang.String getEndWeek() {
        return this.endWeek;
    }

    /**
     * 设置 记录分配方式类型：1：用户被叫号码，2：静态语音 
     */
    public void setRouteDescType(java.lang.String routeDescType) {
        this.routeDescType = routeDescType;
    }

    /**
     * 获取 记录分配方式类型：1：用户被叫号码，2：静态语音 
     */
    public java.lang.String getRouteDescType() {
        return this.routeDescType;
    }

    /**
     * 设置 记录分配号码区号。
     */
    public void setRouteDescNumHead(java.lang.Integer routeDescNumHead) {
        this.routeDescNumHead = routeDescNumHead;
    }

    /**
     * 获取 记录分配号码区号。
     */
    public java.lang.Integer getRouteDescNumHead() {
        return this.routeDescNumHead;
    }

    /**
     * 设置 记录分配号码。
     */
    public void setRouteDescNum(java.lang.String routeDescNum) {
        this.routeDescNum = routeDescNum;
    }

    /**
     * 获取 记录分配号码。
     */
    public java.lang.String getRouteDescNum() {
        return this.routeDescNum;
    }

    /**
     * 设置 记录遇忙时转移功能(0不开通，1呼转到号码,2呼转到语音）
     */
    public void setBusyFlag(java.lang.String busyFlag) {
        this.busyFlag = busyFlag;
    }

    /**
     * 获取 记录遇忙时转移功能(0不开通，1呼转到号码,2呼转到语音）
     */
    public java.lang.String getBusyFlag() {
        return this.busyFlag;
    }

    /**
     * 设置 记录遇忙时转移号码A区号。
     */
    public void setBusyNumHeadA(java.lang.String busyNumHeadA) {
        this.busyNumHeadA = busyNumHeadA;
    }

    /**
     * 获取 记录遇忙时转移号码A区号。
     */
    public java.lang.String getBusyNumHeadA() {
        return this.busyNumHeadA;
    }

    /**
     * 设置 记录遇忙时转移号码A。
     */
    public void setBusyNumA(java.lang.String busyNumA) {
        this.busyNumA = busyNumA;
    }

    /**
     * 获取 记录遇忙时转移号码A。
     */
    public java.lang.String getBusyNumA() {
        return this.busyNumA;
    }

    /**
     * 设置 记录遇忙时转移号码B区号。
     */
    public void setBusyNumHeadB(java.lang.String busyNumHeadB) {
        this.busyNumHeadB = busyNumHeadB;
    }

    /**
     * 获取 记录遇忙时转移号码B区号。
     */
    public java.lang.String getBusyNumHeadB() {
        return this.busyNumHeadB;
    }

    /**
     * 设置 记录遇忙时转移号码B。
     */
    public void setBusyNumB(java.lang.String busyNumB) {
        this.busyNumB = busyNumB;
    }

    /**
     * 获取 记录遇忙时转移号码B。
     */
    public java.lang.String getBusyNumB() {
        return this.busyNumB;
    }

    /**
     * 设置 记录遇无应答转移功能(0不开通，1呼转到号码,2呼转到语音）
     */
    public void setNoFlag(java.lang.String noFlag) {
        this.noFlag = noFlag;
    }

    /**
     * 获取 记录遇无应答转移功能(0不开通，1呼转到号码,2呼转到语音）
     */
    public java.lang.String getNoFlag() {
        return this.noFlag;
    }

    /**
     * 设置 记录遇无应答转移号码A区号。
     */
    public void setNoNumHeadA(java.lang.String noNumHeadA) {
        this.noNumHeadA = noNumHeadA;
    }

    /**
     * 获取 记录遇无应答转移号码A区号。
     */
    public java.lang.String getNoNumHeadA() {
        return this.noNumHeadA;
    }

    /**
     * 设置 记录无应答转移号码A。
     */
    public void setNoNumA(java.lang.String noNumA) {
        this.noNumA = noNumA;
    }

    /**
     * 获取 记录无应答转移号码A。
     */
    public java.lang.String getNoNumA() {
        return this.noNumA;
    }

    /**
     * 设置 记录遇无应答转移号码B区号。
     */
    public void setNoNumHeadB(java.lang.String noNumHeadB) {
        this.noNumHeadB = noNumHeadB;
    }

    /**
     * 获取 记录遇无应答转移号码B区号。
     */
    public java.lang.String getNoNumHeadB() {
        return this.noNumHeadB;
    }

    /**
     * 设置 记录遇无应答转移号码B。
     */
    public void setNoNumB(java.lang.String noNumB) {
        this.noNumB = noNumB;
    }

    /**
     * 获取 记录遇无应答转移号码B。
     */
    public java.lang.String getNoNumB() {
        return this.noNumB;
    }

    /**
     * 设置 记录遇其他转(0不开通，1呼转到号码,2呼转到语音）
     */
    public void setOtherFlag(java.lang.String otherFlag) {
        this.otherFlag = otherFlag;
    }

    /**
     * 获取 记录遇其他转(0不开通，1呼转到号码,2呼转到语音）
     */
    public java.lang.String getOtherFlag() {
        return this.otherFlag;
    }

    /**
     * 设置 记录遇其他转号码A区号。
     */
    public void setOtherNumHeadA(java.lang.String otherNumHeadA) {
        this.otherNumHeadA = otherNumHeadA;
    }

    /**
     * 获取 记录遇其他转号码A区号。
     */
    public java.lang.String getOtherNumHeadA() {
        return this.otherNumHeadA;
    }

    /**
     * 设置 记录遇其他转号码A。
     */
    public void setOtherNumA(java.lang.String otherNumA) {
        this.otherNumA = otherNumA;
    }

    /**
     * 获取 记录遇其他转号码A。
     */
    public java.lang.String getOtherNumA() {
        return this.otherNumA;
    }

    /**
     * 设置 记录遇其他转号码B区号。
     */
    public void setOtherNumHeadB(java.lang.String otherNumHeadB) {
        this.otherNumHeadB = otherNumHeadB;
    }

    /**
     * 获取 记录遇其他转号码B区号。
     */
    public java.lang.String getOtherNumHeadB() {
        return this.otherNumHeadB;
    }

    /**
     * 设置 记录遇其他转号码B。
     */
    public void setOtherNumB(java.lang.String otherNumB) {
        this.otherNumB = otherNumB;
    }

    /**
     * 获取 记录遇其他转号码B。
     */
    public java.lang.String getOtherNumB() {
        return this.otherNumB;
    }

    /**
     * 设置 记录数据的行号，主键。
     */
    public void setRowId(java.lang.Long rowId) {
        this.rowId = rowId;
    }

    /**
     * 获取 记录数据的行号，主键。
     */
    public java.lang.Long getRowId() {
        return this.rowId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.rowId = SeqUtils.createLongId(ID_SEQ);
         return this.rowId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录订单项标识。
     */
    public void setOrderItemId(java.lang.Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 获取 记录订单项标识。
     */
    public java.lang.Long getOrderItemId() {
        return this.orderItemId;
    }

    /**
     * 设置 记录变更或删除记录对应的原始行号。
     */
    public void setOldRowId(java.lang.Long oldRowId) {
        this.oldRowId = oldRowId;
    }

    /**
     * 获取 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long getOldRowId() {
        return this.oldRowId;
    }

    /**
     * 设置 操作类型，新增/修改/删除/保持
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 操作类型，新增/修改/删除/保持
     */
    public java.lang.String getOperType() {
        return this.operType;
    }

    /**
     * 设置 记录数据的状态，分为有效/无效/历史。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录数据的状态，分为有效/无效/历史。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
     * 设置 记录订单项版本号。
     */
    public void setVerNum(java.lang.Integer verNum) {
        this.verNum = verNum;
    }

    /**
     * 获取 记录订单项版本号。
     */
    public java.lang.Integer getVerNum() {
        return this.verNum;
    }

}
