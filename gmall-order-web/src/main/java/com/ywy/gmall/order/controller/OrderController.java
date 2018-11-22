package com.ywy.gmall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ywy.gmall.bean.UserAddress;
import com.ywy.gmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class OrderController {
//    @Autowired
    @Reference
    private UserInfoService userInfoService;

    @RequestMapping("/initOrder")
    @ResponseBody
    public List<UserAddress> initOrder(HttpServletRequest request){
        String userId = request.getParameter("userId");
        List<UserAddress> userAddressList = userInfoService.getUserAddressList(userId);
        return  userAddressList;
    }
}
