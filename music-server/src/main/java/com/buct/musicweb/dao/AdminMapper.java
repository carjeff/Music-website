package com.buct.musicweb.dao;

import org.springframework.stereotype.Repository;

/**
 * @author JeffCar
 * @date 12/30/2020 - 12:23 AM
 *
 * 管理员DAO
 */

@Repository
public interface AdminMapper {
    //验证账号密码是否正确
    public int verifyPassword(String name, String password);

}
