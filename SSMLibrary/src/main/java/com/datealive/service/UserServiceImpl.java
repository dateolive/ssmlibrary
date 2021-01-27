package com.datealive.service;

import com.datealive.mapper.UserMapper;
import com.datealive.pojo.User;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @author: datealive
 * @date: 2021/1/27  20:54
 */
public class UserServiceImpl implements UserService{

    //调用dao层
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper){
        this.userMapper=userMapper;
    }

    @Override
    public boolean queryUser(String userName, String password) {
        User user = userMapper.queryUser(userName, password);
        if(user!=null&&user.getPassword().equals(password)){
            return true;
        }
        return false;
    }
}
