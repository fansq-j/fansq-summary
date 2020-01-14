package com.len.ts114.entity.vo;

import com.len.ts114.entity.Zserver;

import java.io.Serializable;
import java.util.Objects;

public class ServerVo extends Zserver implements Serializable {
    private static final long serialVersionUID = -2736556070470881031L;
    private String serverName;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServerVo serverVo = (ServerVo) o;
        return Objects.equals(serverName, serverVo.serverName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverName);
    }

    @Override
    public String toString() {
        return "ServerVo{" +
                "serverName='" + serverName + '\'' +
                '}';
    }
}
