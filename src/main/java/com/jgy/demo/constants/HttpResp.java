package com.jgy.demo.constants;

import java.io.Serializable;

/**
 *
 * @param <T>
 */
public class HttpResp<T> implements Serializable {

    private int code;

    private String msg;

    private T data;

    public HttpResp(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public HttpResp(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public HttpResp(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static HttpResp result(int code, String msg) {
        return new HttpResp(code, msg);
    }

    public static <T> HttpResp<T> result(int code, String msg, T data) {
        return new HttpResp<>(code, msg, data);
    }

}
