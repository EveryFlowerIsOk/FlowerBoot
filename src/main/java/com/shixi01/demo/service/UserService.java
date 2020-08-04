package com.shixi01.demo.service;
import com.shixi01.demo.po.User;
import org.springframework.stereotype.Service;
import java.util.List;

public interface UserService {
    List<User> selectUserList();
    List<User> selectWorkList();
}
