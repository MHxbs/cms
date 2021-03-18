package com.yanzhen.controller;

import com.github.pagehelper.PageInfo;
import com.yanzhen.entity.FriendLink;
import com.yanzhen.service.FriendLinkService;
import com.yanzhen.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/friendLink")
public class FriendLinkController {

    @Autowired
    private FriendLinkService friendLinkService;

    @PostMapping("/create")
    public Result create(@RequestBody FriendLink friendLink){
        friendLinkService.create(friendLink);
        return Result.ok(friendLink);
    }

    @PostMapping("/delete")
    public Result delete(Integer id){
        friendLinkService.delete(id);
        return Result.ok();
    }

    @PostMapping("/update")
    public Result update(@RequestBody FriendLink friendLink){
        friendLinkService.update(friendLink);
        return Result.ok(friendLink);
    }

    @PostMapping("/query")
    public Map query(@RequestBody FriendLink friendLink){
        PageInfo<FriendLink> pageInfo = friendLinkService.query(friendLink);
        return Result.ok(pageInfo);
    }

    @PostMapping("/detail")
    public Result detail(Integer id){
        FriendLink friendLink = friendLinkService.detail(id);
        return Result.ok(friendLink);
    }

    @PostMapping("/count")
    public Result count(@RequestBody FriendLink friendLink){
        Integer count = friendLinkService.count(friendLink);
        return Result.ok(count);
    }

}
