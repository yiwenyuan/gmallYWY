package com.ywy.gmall.usermanage.controller;

import com.ywy.gmall.bean.UserInfo;
import com.ywy.gmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<UserInfo> findAll(){
        return userInfoService.findAll();
    }
 }
