package com.jgy.demo;


import com.jgy.demo.bean.UserBean;
import com.jgy.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {
    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        UserBean userBean = userService.loginIn("2015035107096");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getStu_name());
    }
}
