package com.len.ts114.service;

import com.github.pagehelper.PageInfo;
import com.len.base.BaseService;
import com.len.ts114.entity.EnterpriseInformation;
import com.len.util.JsonUtil;

import java.util.List;

public interface EnterpriseInformationService extends BaseService<EnterpriseInformation,String> {


    /**
     * 修改公司相关信息
     * @param enterpriseInformation
     * @return 成功执行条数
     * @author chenshuxian
     */
    JsonUtil updateEnterpriseInformation(EnterpriseInformation enterpriseInformation, String[] keyword);

    /**
     * 根据id查询公司相关信息
     * @param enterpriseInformationId 公司id
     * @return 相对应公司相关信息
     * @author chenshuxian
     */
    EnterpriseInformation getEnterpriseInformationById(long enterpriseInformationId);

    /**
     * 分页查询所有公司信息
     * @param page 页数
     * @param limit 每页显示的条数
     * @return
     * @author chenshuxian
     */
    PageInfo<EnterpriseInformation> findAllEnterprise(Integer page, Integer limit);



    JsonUtil addEnterprise(EnterpriseInformation enterpriseInformation, String[] keywords);

    /**
     * 审核公司信息
     * @param enterpriseInformation
     * @return
     */
    JsonUtil auditEnterprise(EnterpriseInformation enterpriseInformation);
}
