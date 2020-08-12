package com.lgd.gmall.user.service.impl;


import com.lgd.gmall.user.bean.UmsMember;
import com.lgd.gmall.user.mapper.UserMapper;
import com.lgd.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired(required =false)
   public   UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList  =userMapper.selectAllUser();
        return umsMemberList;
    }
}
