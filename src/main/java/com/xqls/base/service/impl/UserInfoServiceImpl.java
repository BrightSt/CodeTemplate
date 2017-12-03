package com.xqls.base.service.impl;

import com.xqls.base.dao.UserInfoMapper;
import com.xqls.base.entity.UserInfo;
import com.xqls.base.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper dao;
    @Override
    public List<UserInfo> list(UserInfo userInfo) {
        return dao.list(userInfo);
    }
}
