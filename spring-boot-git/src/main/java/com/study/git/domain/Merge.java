package com.study.git.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.study.git.utils.Constants;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

/**
 * @author TangFD@HF 2018/11/27
 */
@Entity
@Table(name = "t_git_merge")
public class Merge implements Serializable {

    @Id
    @Column(length = 32)
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    private String id;
    @NotEmpty
    @Column(nullable = false, length = 1000)
    private String appCodes;
    /**
     * WAITING：待合并，MERGING：合并中，PACKAGING：打包中，DEPLOYING：部署中，FINISHED：已完成
     */
    @Column(nullable = false, length = 20)
    private String status;
    @Column(nullable = false, length = 100)
    private String v4Branch = "master";
    @Column(nullable = false, length = 100)
    private String v5Branch = "v5_master";
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyTime;

    public String getV4Branch() {
        return v4Branch;
    }

    public void setV4Branch(String v4Branch) {
        this.v4Branch = v4Branch;
    }

    public String getV5Branch() {
        return v5Branch;
    }

    public void setV5Branch(String v5Branch) {
        this.v5Branch = v5Branch;
    }

    public String getAppCodes() {
        return appCodes;
    }

    public void setAppCodes(String appCodes) {
        this.appCodes = appCodes;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Merge(@NotEmpty String appCodes) {
        this.appCodes = appCodes;
        this.status = Constants.MERGE_STATUS_WAITING;
        Date date = new Date();
        this.createTime = date;
        this.lastModifyTime = date;
    }

    public Merge() {
    }
}
