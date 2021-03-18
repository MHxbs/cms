package com.yanzhen.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yanzhen.entity.User;
import com.yanzhen.mapper.UserDao;
import com.yanzhen.utils.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public int create(User user){
        return userDao.create(user);
    }

    public int delete(Integer id){
        return userDao.delete(Maps.build(id).getMap());
    }

    public int update(User user){
        return userDao.update(Maps.build(user.getId()).beanToMapForUpdate(user));
    }

    public PageInfo<User> query(User user){
        if(user != null && user.getPage() != null){
            PageHelper.startPage(user.getPage(),user.getLimit());
        }
        List<User> list = userDao.query(Maps.build().beanToMap(user));
        return new PageInfo<User>(list);
    }

    public User detail(Integer id){
        return userDao.detail(Maps.build(id).getMap());
    }

    public User login(String userName,String password){
        return userDao.detail(Maps.build()
                .put("userName",userName)
                .put("password",password)
                .getMap());
    }

    public int count(User user){
        return userDao.count(Maps.build().beanToMap(user));
    }




}
