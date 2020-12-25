package com.jgy.demo.service;

import com.jgy.demo.bean.UserBean;
import com.jgy.demo.constants.HttpResp;

public interface UserService {
    UserBean loginIn(String id);

    HttpResp test();

    HttpResp userIn(String id);
}
