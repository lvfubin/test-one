package com.example.demo.dto;

import java.io.File;
import java.util.ResourceBundle;

/**
 * 常用的返回
 * reason从error.properties获取
 */
public class ResultCode {

    private static ResourceBundle rb;

    private String code;

    private String message;

    static {
        rb = ResourceBundle.getBundle("messages"+ File.separator + "error");
    }

    public ResultCode(String code) {
        this.code = code;
        this.message = rb.getString(code);
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    /**
     * 未知错误
     */
    public static final ResultCode UNKNOWN = new ResultCode("-1");

    /**
     * 正常操作
     */
    public static final ResultCode SUCCESS = new ResultCode("0");

    /**
     * 资源不存在
     */
    public static final ResultCode NOT_EXIST = new ResultCode("3");

    /**
     * 一些必须要有的数据没有传
     */
    public static final ResultCode DATA_NOT_FOUND = new ResultCode("4");

}
