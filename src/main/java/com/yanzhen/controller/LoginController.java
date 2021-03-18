package com.yanzhen.controller;

import com.yanzhen.entity.User;
import com.yanzhen.framework.jwt.JWTUtil;
import com.yanzhen.service.UserService;
import com.yanzhen.utils.Maps;
import com.yanzhen.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody Map<String,String> map){
        String userName = map.get("userName");
        String password = map.get("password");
        User user = userService.login(userName, password);
        if(user != null){
            String token = JWTUtil.sign(user);
            return Result.ok(Maps.build().put("token", token).put("user", user).getMap());
        }else{
            return Result.fail("用户名或密码错误");
        }
    }

}
