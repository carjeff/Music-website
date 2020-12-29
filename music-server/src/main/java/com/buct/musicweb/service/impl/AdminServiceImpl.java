package com.buct.musicweb.service.impl;

import com.buct.musicweb.dao.AdminMapper;
import com.buct.musicweb.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author JeffCar
 * @date 12/30/2020 - 12:36 AM
 */

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    /**
     * 验证Admin密码是否正确
     * @param name
     * @param password
     * @return
     */
    @Override
    public boolean verifyPassword(String name, String password) {
        return adminMapper.verifyPassword(name, password) >0;
    }
}
