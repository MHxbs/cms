package com.yanzhen.utils;

import com.github.pagehelper.PageInfo;

import java.util.Map;
import java.util.Random;

public class Result {

    //常量
    public static final Integer SUCCESS_CODE = 200;
    public static final Integer ERROR_CODE = 500;
    //属性(私有的非静态的)
    private Integer status;
    private String msg;
    private Object data = null;


    //失败响应
    public static Result fail(Integer status, String msg) {
        return new Result(status, msg, null);
    }

    public static Result fail(String msg) {
        return new Result(ERROR_CODE, msg, null);
    }

    public static Result fail() {
        return new Result(ERROR_CODE, "操作失败");
    }


    //成功响应
    public static Result ok(Integer status, String msg, Object data) {
        return new Result(status, msg, data);
    }

    public static Result ok(String msg, Object data) {
        return new Result(SUCCESS_CODE,msg, data);
    }

    public static Result ok(Object data) {
        return new Result(SUCCESS_CODE,"操作成功",data);
    }

    public static Map ok(PageInfo pageInfo) {
        return Maps.build().put("status",SUCCESS_CODE)
                .put("msg","操作成功")
                .put("list",pageInfo.getList())
                .put("total",pageInfo.getTotal())
                .getMap();
    }

    public static Result ok() {
        return new Result(SUCCESS_CODE,"操作成功",null);
    }



    //构造重载
    public Result() {
    }

    public Result(Object data) {
        this.data = data;
    }

    public Result(String msg, Object data) {
        this.msg = msg;
        this.data = data;
    }

    public Result(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Result(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }



}
