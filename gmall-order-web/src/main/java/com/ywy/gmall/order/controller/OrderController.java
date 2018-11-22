package com.ywy.gmall.order.controller;

import com.ywy.gmall.bean.UserAddress;
import com.ywy.gmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private UserInfoService userInfoService;

    public List<UserAddress> finaByUserIdUserAddress(HttpServletRequest request){
        String userId = request.getParameter("userId");
        List<UserAddress> userAddressList = userInfoService.getUserAddressList(userId);
        return  userAddressList;
    }
}
