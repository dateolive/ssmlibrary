package com.datealive.mapper;

import com.datealive.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: UserMapper
 * @Description: TODO
 * @author: datealive
 * @date: 2021/1/27  20:45
 */
public interface UserMapper {
    /**
     * 查询用户账户和密码
     * @param userName
     * @param password
     * @return
     */
    public User queryUser(@Param("userName") String userName,@Param("password") String password);
}
