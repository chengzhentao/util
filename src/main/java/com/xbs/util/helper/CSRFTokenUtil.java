package com.xbs.util.helper;

import java.util.UUID;

/**
 *
 * 防止csrf攻击生成csrfToken
 *
 * @Description
 * @Author cheng
 * @Date2020-02-28 16:08
 * @Version V1.0
 **/
public class CSRFTokenUtil {

    public static String generate(){

        return UUID.randomUUID().toString().replace("-","");
    }

}
