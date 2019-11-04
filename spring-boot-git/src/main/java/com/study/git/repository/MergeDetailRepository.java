package com.study.git.repository;

import com.study.git.domain.MergeDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author TangFD@HF 2018/11/27
 */
@Repository("mergeDetailRepository")
public interface MergeDetailRepository extends JpaRepository<MergeDetail, String> {
    /**
     * 根据合并Id，删除应用详情数据
     *
     * @param mergeId 合并Id，不可为空
     */
    void deleteByMergeId(String mergeId);

    /**
     * 根据合并Id，获取应用详情数据
     *
     * @param mergeId 合并Id，不可为空
     * @return 应用详情数据列表
     */
    List<MergeDetail> findByMergeIdOrderByLastModifyTimeDesc(String mergeId);
}
