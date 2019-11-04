package com.study.git.utils;

/**
 * @author TangFD@HF 2018/11/27
 */
public interface Constants {
    /**
     * 待操作
     */
    String MERGE_STATUS_WAITING = "WAITING";
    /**
     * 打包中
     */
    String MERGE_STATUS_PACKAGING = "PACKAGING";
    /**
     * 部署中
     */
    String MERGE_STATUS_DEPLOYING = "DEPLOYING";
    /**
     * 已完成
     */
    String MERGE_STATUS_FINISHED = "FINISHED";
    /**
     * 合并中
     */
    String MERGE_STATUS_MERGING = "MERGING";
    /**
     * 操作失败
     */
    String MERGE_STATUS_FAILED = "FAILED";

    String GIT_URL_SUFFIX = ".git";
}
