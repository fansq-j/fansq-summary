package com.len.ts114.entity;

import lombok.ToString;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import java.util.Date;

@Table(name = "t_enterprise_information")
@ToString
@Data
public class EnterpriseInformation implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 公司地址
     */
    @Column(name = "company_address")
    private String companyAddress;

    /**
     * 公司电话
     */
    @Column(name = "company_tel")
    private String companyTel;

    /**
     * 公司简介
     */
    private String intro;

    /**
     * 状态
     */
    private Byte state;


    /**
     * 公司介绍
     */
    private String introduce;

    /**
     * 营业执照
     */
    private String license;

    /**
     * 公司创建时间
     */
    @Column(name = "create_time")
    private Date createTime;
    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取公司名称
     *
     * @return company_name - 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置公司名称
     *
     * @param companyName 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 获取公司地址
     *
     * @return company_address - 公司地址
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * 设置公司地址
     *
     * @param companyAddress 公司地址
     */
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    /**
     * 获取公司电话
     *
     * @return company_tel - 公司电话
     */
    public String getCompanyTel() {
        return companyTel;
    }

    /**
     * 设置公司电话
     *
     * @param companyTel 公司电话
     */
    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel == null ? null : companyTel.trim();
    }

    /**
     * 获取公司简介
     *
     * @return intro - 公司简介
     */
    public String getIntro() {
        return intro;
    }

    /**
     * 设置公司简介
     *
     * @param intro 公司简介
     */
    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(Byte state) {
        this.state = state;
    }


    /**
     * 获取公司介绍
     *
     * @return introduce - 公司介绍
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * 设置公司介绍
     *
     * @param introduce 公司介绍
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}