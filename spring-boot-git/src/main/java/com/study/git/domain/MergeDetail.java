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
@Table(name = "t_git_merge_detail")
public class MergeDetail implements Serializable {

    @Id
    @Column(length = 32)
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    private String id;
    @NotEmpty
    @Column(nullable = false, length = 32)
    private String mergeId;
    @Column(nullable = false, length = 20)
    private String appCode;
    @Column(nullable = false, length = 20)
    private String mergeStatus;
    @Column(length = 20)
    private String packageStatus;
    @Column(length = 20)
    private String deployStatus;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyTime;

    public MergeDetail() {
    }

    public MergeDetail(String appCode, @NotEmpty String mergeId) {
        this.appCode = appCode;
        this.mergeId = mergeId;
        this.mergeStatus = Constants.MERGE_STATUS_WAITING;
        Date date = new Date();
        this.createTime = date;
        this.lastModifyTime = date;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
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

    public String getDeployStatus() {
        return deployStatus;
    }

    public void setDeployStatus(String deployStatus) {
        this.deployStatus = deployStatus;
    }

    public String getMergeId() {
        return mergeId;
    }

    public void setMergeId(String mergeId) {
        this.mergeId = mergeId;
    }

    public String getMergeStatus() {
        return mergeStatus;
    }

    public void setMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
    }

    public String getPackageStatus() {
        return packageStatus;
    }

    public void setPackageStatus(String packageStatus) {
        this.packageStatus = packageStatus;
    }
}
