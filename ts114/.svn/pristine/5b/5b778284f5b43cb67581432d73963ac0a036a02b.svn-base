package com.len.ts114.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

@Table(name = "t_fserver")
public class Fserver implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 父分类名称
     */
    @Column(name = "server_name")
    private String serverName;

    private Integer priority;
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
     * 获取父分类名称
     *
     * @return server_name - 父分类名称
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * 设置父分类名称
     *
     * @param serverName 父分类名称
     */
    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
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
        Fserver fserver = (Fserver) o;
        return Objects.equals(id, fserver.id) &&
                Objects.equals(serverName, fserver.serverName) &&
                Objects.equals(priority, fserver.priority) &&
                Objects.equals(createTime, fserver.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serverName, priority, createTime);
    }

    @Override
    public String toString() {
        return "Fserver{" +
                "id=" + id +
                ", serverName='" + serverName + '\'' +
                ", priority=" + priority +
                ", createTime=" + createTime +
                '}';
    }
}