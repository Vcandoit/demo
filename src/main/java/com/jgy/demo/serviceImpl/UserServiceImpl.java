package com.jgy.demo.serviceImpl;

import com.jgy.demo.bean.UserBean;
import com.jgy.demo.constants.HttpResp;
import com.jgy.demo.mapper.UserMapper;
import com.jgy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;


@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String id) {
        return userMapper.getInfo(id);
    }

    @Override
    public HttpResp userIn(String id){
        UserBean user = userMapper.getInfo(id);

        int code = 1;
        String msg = "success";
        HashMap<String, Object> map = new HashMap<>();
        map.put("data",user);
        return HttpResp.result(code, msg, map);
    }


    @Override
    public HttpResp test(){
        int code = 1;
        String msg = "success";
        HashMap<String, Object> map = new HashMap<>();
        map.put("sid","2015035107096");
        return HttpResp.result(code, msg, map);
    }
}
