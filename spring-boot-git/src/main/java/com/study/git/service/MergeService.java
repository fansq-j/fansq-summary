package com.study.git.service;

import com.study.git.domain.Merge;
import com.study.git.domain.MergeDetail;
import com.study.git.repository.MergeDetailRepository;
import com.study.git.repository.MergeRepository;
import com.study.git.utils.Constants;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author TangFD@HF 2018/11/27
 */
@Service
public class MergeService {
    @Resource
    private MergeRepository mergeRepository;
    @Resource
    private MergeDetailRepository mergeDetailRepository;

    /**
     * 删除待合并状态的合并记录，包括应用详情数据
     */
    @Transactional(isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public void deleteById(String id) {
        if (StringUtils.isEmpty(id)) {
            throw new IllegalArgumentException("id not be empty!");
        }

        Merge merge = mergeRepository.findById(id).get();
        if (merge == null || !Constants.MERGE_STATUS_WAITING.equals(merge.getStatus())) {
            throw new RuntimeException("merge can not delete by id [id=" + id + "]!");
        }

        mergeRepository.deleteById(id);
        mergeDetailRepository.deleteByMergeId(id);
    }

    /**
     * 保存合并实体信息
     */
    @Transactional(isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public void save(Merge merge, List<String> appCodeList) {
        if (merge == null || CollectionUtils.isEmpty(appCodeList)) {
            throw new IllegalArgumentException("param is invalid");
        }

        mergeRepository.save(merge);
        List<MergeDetail> mergeDetails = new ArrayList<>(appCodeList.size());
        String mergeId = merge.getId();
        mergeDetails.addAll(appCodeList.stream().map(appCode -> new MergeDetail(appCode, mergeId)).collect(Collectors.toList()));
        mergeDetailRepository.saveAll(mergeDetails);
    }
}
