package com.xbs.util.base;

/**
 * @Description
 * @Author cheng
 * @Date2019-11-02 11:35
 * @Version V1.0
 **/
public enum ErrorMessage {

    SERVER_ERROE(400,"服务器在偷懒,请稍后再试"),
    NEED_LOGIN(401,"请登录"),

    PARAM_ERROE(10000,"参数错误"),
    PHONE_ERROR(100001,"请输入正确的手机号"),
    PHONE_PASSWORD_ERROR(10002,"手机号或者密码错误"),
    PHONE_COMFIRM_ERROR(10003,"验证码错误"),
    TOKEN_ERROR(10004,"token过期请重新登录");



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
