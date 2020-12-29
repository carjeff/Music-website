package com.buct.musicweb.domain;

import java.io.Serializable;

/**
 * @author JeffCar
 * @date 12/30/2020 - 12:20 AM
 *
 * 后台管理员
 */
public class Admin implements Serializable {
    private Integer id;
    private String name; //账号
    private String password; //密码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
