package com.shixi01.demo.service.impl;

import com.shixi01.demo.mapper.UserMapper;
import com.shixi01.demo.po.User;
import com.shixi01.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }
    public List<User> selectWorkList(){return userMapper.selectWorkList();}
}
