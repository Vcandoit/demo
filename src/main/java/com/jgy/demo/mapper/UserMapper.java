package com.jgy.demo.mapper;

import com.jgy.demo.bean.UserBean;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    UserBean getInfo(String id);

    UserBean getUser(String id);
}
