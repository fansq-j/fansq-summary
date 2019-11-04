package com.study.git.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author TangFD@HF 2018/11/26
 */
@Component
@ConfigurationProperties(prefix = "app.code")
public class AppCodeConfig {
    private List<String> appSvcCodes;
    private List<String> excludeCodes;
    private Map<String, String> maps;

    public List<String> getExcludeCodes() {
        return excludeCodes;
    }

    public void setExcludeCodes(List<String> excludeCodes) {
        this.excludeCodes = excludeCodes;
    }

    public List<String> getAppSvcCodes() {
        return appSvcCodes;
    }

    public void setAppSvcCodes(List<String> appSvcCodes) {
        this.appSvcCodes = appSvcCodes;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Set<String> getAppCodeList(String appCodes) {
        if (StringUtils.isEmpty(appCodes)) {
            return new HashSet<>(0);
        }

        appCodes = appCodes.replace("，", ",").replace("、", ",");
        String[] split = appCodes.split(",");
        Set<String> appCodeList = new HashSet<>(split.length);
        for (String appCode : split) {
            if (StringUtils.isEmpty(appCode)) {
                continue;
            }

            appCode = StringUtils.trimWhitespace(appCode);
            if (excludeCodes.contains(appCode)) {
                continue;
            }

            String fullCode = maps.get(appCode);
            if (StringUtils.isEmpty(fullCode)) {
                continue;
            }

            appCodeList.add(fullCode);
        }

        return appCodeList;
    }

    public Set<String> getExcludeCodes(String appCodes) {
        if (StringUtils.isEmpty(appCodes)) {
            return new HashSet<>(0);
        }

        appCodes = appCodes.replace("，", ",").replace("、", ",");
        String[] split = appCodes.split(",");
        Set<String> appCodeList = new HashSet<>();
        for (String appCode : split) {
            if (StringUtils.isEmpty(appCode)) {
                continue;
            }

            appCode = StringUtils.trimWhitespace(appCode);
            if (excludeCodes.contains(appCode) || StringUtils.isEmpty(maps.get(appCode))) {
                appCodeList.add(appCode);
            }
        }

        return appCodeList;
    }
}
