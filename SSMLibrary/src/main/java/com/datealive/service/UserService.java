package com.datealive.service;

import com.datealive.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @author: datealive
 * @date: 2021/1/27  20:53
 */
public interface UserService {

    /**
     * 查询用户账户和密码
     * @param userName
     * @param password
     * @return
     */
    public boolean queryUser(String userName,String password);
}
