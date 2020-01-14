package com.len.ts114.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_keyword")
public class KeyWord implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 关键字名称 
     */
    private String name;

    /**
     * 热度
     */
    private Long heat;

    /**
     * 公司外键
     */
    @Column(name = "company_id")
    private Long companyId;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取关键字名称 
     *
     * @return name - 关键字名称 
     */
    public String getName() {
        return name;
    }

    /**
     * 设置关键字名称 
     *
     * @param name 关键字名称 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取公司外键
     *
     * @return company_id - 公司外键
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * 设置公司外键
     *
     * @param companyId 公司外键
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getHeat() {
        return heat;
    }

    public void setHeat(Long heat) {
        this.heat = heat;
    }
}