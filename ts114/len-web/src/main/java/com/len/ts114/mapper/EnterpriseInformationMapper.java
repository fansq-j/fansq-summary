package com.len.ts114.mapper;

import com.len.base.BaseMapper;
import com.len.ts114.entity.EnterpriseInformation;

import java.util.List;

public interface EnterpriseInformationMapper extends BaseMapper<EnterpriseInformation,String> {
    List<EnterpriseInformation> checkEnterprise(EnterpriseInformation enterpriseInformation);
}