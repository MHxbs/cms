package com.yanzhen.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 596183363@qq.com
 * @Description:
 * @date 2020/10/2620:38
 */
public class RequestUtils {

    public static String getBasePath(HttpServletRequest request){
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
        System.out.println(basePath);
        return basePath;
    }
}
