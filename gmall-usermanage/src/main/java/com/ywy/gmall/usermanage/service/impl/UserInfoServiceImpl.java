package com.ywy.gmall.usermanage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ywy.gmall.bean.UserAddress;
import com.ywy.gmall.bean.UserInfo;
import com.ywy.gmall.service.UserInfoService;
import com.ywy.gmall.usermanage.mapper.UserAddressMapper;
import com.ywy.gmall.usermanage.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserAddressMapper userAddressMapper;
    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        return userAddressMapper.select(userAddress);
    }
}
