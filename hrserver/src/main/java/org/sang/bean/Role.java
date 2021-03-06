package org.sang.bean;

import java.io.Serializable;

/**
 * Created by sang on 2017/12/28.
 */
public class Role implements Serializable {
    @Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", nameZh=" + nameZh + "]";
	}

	private Long id;
    private String name;
    private String nameZh;

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
