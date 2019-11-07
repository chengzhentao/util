package com.xbs.util.base;

import java.io.Serializable;

/**
 * @Description
 * @Author cheng
 * @Date2019-11-02 11:32
 * @Version V1.0
 **/
public class Result implements Serializable {

    private static final Integer SUCCESS = 0;

    private Integer code;

    private String message;

    private Object data;


    private Result(){}


    private Result(Integer code ,Object data){

        this.code = code;
        this.data = data;
    }

    public Integer getCode(){
         return this.code;
    }

    public Object getData(){
        return this.data;
    }

    public static Result success(){

        return new Result();
    }


    public static Result success(Object data){

        return new Result(SUCCESS,data);
    }

    public static Result error(ErrorMessage errorMessage){

        return new Result(errorMessage.getCode(),errorMessage.getMessage());
    }

    public static Result error(Integer code , String message){

        return new Result(code,message);
    }
}
