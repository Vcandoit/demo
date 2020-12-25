package com.jgy.demo.constants;

import java.util.List;
import java.util.Map;

/**
 *
 */
public class Commons {

    public static List<Map<String, String>> userInfo;

    public static List<Map<String, String>> getUserInfo() {
        return userInfo;
    }

    public static void setUserInfo(List<Map<String, String>> userInfo) {
        Commons.userInfo = userInfo;
    }
}
