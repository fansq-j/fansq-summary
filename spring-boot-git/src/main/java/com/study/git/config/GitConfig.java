package com.study.git.config;

import org.eclipse.jgit.transport.CredentialsProvider;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author TangFD@HF 2018/11/26
 */
@Component
@ConfigurationProperties(prefix = "git")
public class GitConfig {
    private String username = "tangfadong";
    private String password = "tfd681312";
    private String dirWin;
    private String dirLinux;
    private String url;
    private String batPathWin;
    private String batPathLinux;

    public String getBatPath() {
        String os = System.getProperty("os.name");
        if (os.toLowerCase().startsWith("win")) {
            return batPathWin;
        } else {
            return batPathLinux;
        }
    }

    public String getBatPathLinux() {
        return batPathLinux;
    }

    public void setBatPathLinux(String batPathLinux) {
        this.batPathLinux = batPathLinux;
    }

    public String getBatPathWin() {
        return batPathWin;
    }

    public void setBatPathWin(String batPathWin) {
        this.batPathWin = batPathWin;
    }

    public String getDirLinux() {
        return dirLinux;
    }

    public void setDirLinux(String dirLinux) {
        this.dirLinux = dirLinux;
    }

    public String getDirWin() {
        return dirWin;
    }

    public void setDirWin(String dirWin) {
        this.dirWin = dirWin;
    }

    public String getDir() {
        String os = System.getProperty("os.name");
        if (os.toLowerCase().startsWith("win")) {
            return dirWin;
        } else {
            return dirLinux;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public CredentialsProvider getCredentialsProvider() {
        return new UsernamePasswordCredentialsProvider(getUsername(), getPassword());
    }
}
