package com.datealive.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: User
 * @Description: TODO
 * @author: datealive
 * @date: 2021/1/27  20:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int userID;
    private String userName;
    private String password;
}
