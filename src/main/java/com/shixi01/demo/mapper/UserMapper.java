package com.shixi01.demo.mapper;

import com.shixi01.demo.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> selectUserList();
    List<User> selectWorkList();
}
