package com.example.demo.service;

import com.example.demo.dao.BaseUserDao;
import com.example.demo.entity.BaseUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bin on 2017/6/30 0030.
 */
@Service
public class BaseUserService {

    private final BaseUserDao baseUserDao;

    @Autowired(required = false)
    public BaseUserService(BaseUserDao baseUserDao) {
        this.baseUserDao = baseUserDao;
    }

    public List<BaseUser> selectAll() {
        return baseUserDao.selectAll();
    }

    public void insert(BaseUser baseUser) {
        baseUserDao.insert(baseUser);
    }
}
