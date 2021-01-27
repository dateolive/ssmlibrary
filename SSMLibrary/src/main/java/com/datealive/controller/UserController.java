package com.datealive.controller;

import com.datealive.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @author: datealive
 * @date: 2021/1/27  21:15
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;
    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping("/gotologin")
    public String gotoLogin(){
        return "login";
    }
    @PostMapping("/userlogin")
    public String userlogbooklistn(HttpSession session,String userName,String password){
        boolean isTrue = userService.queryUser(userName, password);
        if(isTrue){
            session.setAttribute("userName",userName);
            session.setAttribute("password",password);
            return "home";
        }
        return "login";
    }
    @RequestMapping("/loginout")
    public String loginout(HttpSession session){
        session.invalidate();
        return "login";
    }

}
