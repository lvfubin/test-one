package com.example.demo.dao;

import com.example.demo.entity.BaseUser;

import java.util.List;
import java.util.Map;

/**
 * Created by bin on 2017/6/30 0030.
 */
public interface BaseUserDao {

    List<BaseUser> selectAll();

    void insert(BaseUser baseUser);
}
