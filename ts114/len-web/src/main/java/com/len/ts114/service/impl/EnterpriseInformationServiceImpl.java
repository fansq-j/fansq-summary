package com.len.ts114.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.len.base.BaseMapper;
import com.len.base.impl.BaseServiceImpl;
import com.len.exception.MyException;
import com.len.ts114.entity.EnterpriseInformation;
import com.len.ts114.entity.KeyWord;
import com.len.ts114.mapper.EnterpriseInformationMapper;
import com.len.ts114.mapper.KeyWordMapper;
import com.len.ts114.service.EnterpriseInformationService;
import com.len.util.BeanUtil;
import com.len.util.JsonUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class EnterpriseInformationServiceImpl extends BaseServiceImpl<EnterpriseInformation,String> implements EnterpriseInformationService{
    @Autowired
    private EnterpriseInformationMapper enterpriseInformationMapper;
    @Autowired
    private KeyWordMapper keyWordMapper;
    /**
     * 修改公司相关信息
     * @param enterpriseInformation
     * @return 成功执行条数
     * @author chenshuxian
     */
    @Override
    public JsonUtil updateEnterpriseInformation(EnterpriseInformation enterpriseInformation, String[] keywords) {
        JsonUtil j = new JsonUtil();
        try {
            if (enterpriseInformation == null) {
                return JsonUtil.error("获取数据失败");
            }
            if (keywords == null || keywords.length==0){
                return JsonUtil.error("关键字不能为空");
            }
            //判断公司名称是否重复
            List<EnterpriseInformation> list = enterpriseInformationMapper.checkEnterprise(enterpriseInformation);
            if (list!=null && list.size()>0){
                return JsonUtil.error("公司名称已存在");
            }
            EnterpriseInformation oldEnterprise = selectByPrimaryKey(enterpriseInformation.getId());
            BeanUtil.copyNotNullBean(enterpriseInformation,oldEnterprise);
            updateByPrimaryKeySelective(oldEnterprise);
            //将之前对应关键字删除
            List<KeyWord> keyWordList = keyWordMapper.findKeywordByEnterprise(enterpriseInformation.getId());
            for (KeyWord k : keyWordList){
                keyWordMapper.delete(k);
            }
            //重新添加公司相对应关键字
            KeyWord keyWord = new KeyWord();
            keyWord.setCompanyId(enterpriseInformation.getId());
            for (String k : keywords){
                if (k!=null && !k.equals("")) {
                    keyWord.setId(null);
                    keyWord.setName(k);
                    keyWordMapper.insertSelective(keyWord);
                }

            }
            j.setFlag(true);
            j.setMsg("修改成功");
        } catch (MyException e) {
            e.printStackTrace();
            j.setMsg("修改失败");
            j.setFlag(false);
        }

        return j;
    }
    /**
     * 根据id查询公司相关信息
     * @param enterpriseInformationId 公司id
     * @return 相对应公司相关信息
     * @author chenshuxian
     */
    @Override
    public EnterpriseInformation getEnterpriseInformationById(long enterpriseInformationId) {
        return enterpriseInformationMapper.selectByPrimaryKey(enterpriseInformationId);
    }
    /**
     * 分页查询所有公司信息
     * @param page 页数
     * @param limit 每页显示的条数
     * @return
     * @author chenshuxian
     */
    @Override
    public PageInfo<EnterpriseInformation> findAllEnterprise(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<EnterpriseInformation> enterpriseInformationList = enterpriseInformationMapper.selectAll();
        PageInfo<EnterpriseInformation> pageInfo = new PageInfo<>(enterpriseInformationList);
        return pageInfo;
    }


    @Override
    public JsonUtil addEnterprise(EnterpriseInformation enterpriseInformation, String[] keywords) {
        JsonUtil j = new JsonUtil();
        //判断数据有效性
        if (StringUtils.isEmpty(enterpriseInformation.getCompanyName()) || StringUtils.isEmpty(enterpriseInformation.getCompanyTel())
        || StringUtils.isEmpty(enterpriseInformation.getCompanyAddress())) {
            return JsonUtil.error("公司名称、电话、地址都不能为空");
        }
        if (keywords == null || keywords.length==0 ) {
            return JsonUtil.error("公司关键字不能为空");
        }
        //判断公司名称是否重复
        List<EnterpriseInformation> list = enterpriseInformationMapper.checkEnterprise(enterpriseInformation);
        if (list!=null && list.size()>0){
            return JsonUtil.error("公司名称已存在");
        }
        try {
            enterpriseInformation.setCreateTime(new Date());
            //添加公司信息
            insertSelective(enterpriseInformation);
            //添加公司相对应关键字
            KeyWord keyWord = new KeyWord();
            keyWord.setCompanyId(enterpriseInformation.getId());
            for (String k : keywords){
                if (k != null && !k.equals("")) {
                    keyWord.setId(null);
                    keyWord.setName(k);
                    keyWordMapper.insertSelective(keyWord);
                }

            }
            j.setFlag(true);
            j.setMsg("保存成功");
        } catch (MyException e) {
            j.setMsg("保存失败");
            j.setFlag(false);
            e.printStackTrace();
        }

        return j;
    }

    @Override
    public JsonUtil auditEnterprise(EnterpriseInformation enterpriseInformation) {
        JsonUtil j = new JsonUtil();
        if (enterpriseInformation == null) {
            return JsonUtil.error("获取数据失败");
        }
        Integer row = enterpriseInformationMapper.updateByPrimaryKeySelective(enterpriseInformation);
        if (row > 0) {
            j.setFlag(true);
            j.setMsg("审核成功");
        } else {
            j.setFlag(false);
            j.setMsg("审核失败");
        }
        return j;
    }

    @Override
    public BaseMapper<EnterpriseInformation, String> getMappser() {
        return enterpriseInformationMapper;

    }
}
