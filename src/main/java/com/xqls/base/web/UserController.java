package com.xqls.base.web;

import com.xqls.base.entity.UserInfo;
import com.xqls.base.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserInfoService service;


    @RequestMapping("/list")
    @ResponseBody
    public List<UserInfo> list(){
        UserInfo userInfo = new UserInfo();
        return service.list(userInfo);
    }
}
