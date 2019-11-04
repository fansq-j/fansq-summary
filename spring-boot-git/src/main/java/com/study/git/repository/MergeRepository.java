package com.study.git.repository;

import com.study.git.domain.Merge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author TangFD@HF 2018/11/27
 */
@Repository("mergeRepository")
public interface MergeRepository extends JpaRepository<Merge, String> {

}
