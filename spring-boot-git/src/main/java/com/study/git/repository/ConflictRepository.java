 package com.study.git.repository;

import com.study.git.domain.Conflict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author TangFD@HF 2018/11/27
 */
@Repository("conflictRepository")
public interface ConflictRepository extends JpaRepository<Conflict, String> {
    /**
     * 根据合并详情Id查询冲突的文件数据
     *
     * @param detailId 合并详情Id，不可为空
     * @return 冲突的文件数据列表
     */
    List<Conflict> findByDetailIdOrderByCreateTimeDesc(String detailId);
}
