package com.example.myfirstjava5.mapper;

import com.example.myfirstjava5.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> queryUserList();

    void addUser(User user);
}
