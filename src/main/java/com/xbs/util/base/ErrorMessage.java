package com.xbs.util.base;

/**
 * @Description
 * @Author cheng
 * @Date2019-11-02 11:35
 * @Version V1.0
 **/
public enum ErrorMessage {

    SERVER_ERROE(1,"服务器在偷懒"),
    PARAM_ERROE(2,"参数错误"),
    NEED_LOGIN(10000,"需要用户登录"),

    PASSWORD_ERROE(10001,"手机号或者密码错误"),
    PHONE_ERROR(10002,"手机号为空"),
    LOGIN_ERROR(10003,"登录失败，请重试"),
    ACCOUNT_EXISTS(1004,"账户已存在，请直接登录"),
    REGIST_ERROR(10005,"注册失败，请重试"),
    CODE_ERROER(10006,"验证码错误"),
    IVALID_PHONE(10007,"请输入正确的手机号");





    ErrorMessage(Integer code ,String message){

        this.code = code;
        this.message = message;
    }

    private Integer code;

    private String message;

    public Integer getCode(){

        return this.code;
    }

    public String getMessage(){

        return this.message;
    }
}
