package com.len.ts114.entity;

import io.swagger.models.auth.In;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

@Table(name = "t_zserver")
public class Zserver implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 子分类名称
     */
    @Column(name = "subclass_name")
    private String subclassName;

    /**
     * 父分类外键
     */
    @Column(name = "server_id")
    private Long serverId;
    private Integer priority;
    @Column(name="create_time")
    private Date createTime;

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
     * 获取子分类名称
     *
     * @return subclass_name - 子分类名称
     */
    public String getSubclassName() {
        return subclassName;
    }

    /**
     * 设置子分类名称
     *
     * @param subclassName 子分类名称
     */
    public void setSubclassName(String subclassName) {
        this.subclassName = subclassName == null ? null : subclassName.trim();
    }

    /**
     * 获取父分类外键
     *
     * @return server_id - 父分类外键
     */
    public Long getServerId() {
        return serverId;
    }

    /**
     * 设置父分类外键
     *
     * @param serverId 父分类外键
     */
    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zserver zserver = (Zserver) o;
        return Objects.equals(id, zserver.id) &&
                Objects.equals(subclassName, zserver.subclassName) &&
                Objects.equals(serverId, zserver.serverId) &&
                Objects.equals(priority, zserver.priority) &&
                Objects.equals(createTime, zserver.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subclassName, serverId, priority, createTime);
    }

    @Override
    public String toString() {
        return "Zserver{" +
                "id=" + id +
                ", subclassName='" + subclassName + '\'' +
                ", serverId=" + serverId +
                ", priority=" + priority +
                ", createTime=" + createTime +
                '}';
    }
}