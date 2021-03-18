package com.yanzhen.controller;

import com.github.pagehelper.PageInfo;
import com.yanzhen.entity.Tag;
import com.yanzhen.service.TagService;
import com.yanzhen.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagService tagService;

    @PostMapping("/create")
    public Result create(@RequestBody Tag tag){
        tagService.create(tag);
        return Result.ok(tag);
    }

    @PostMapping("/delete")
    public Result delete(Integer id){
        tagService.delete(id);
        return Result.ok();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Tag tag){
        tagService.update(tag);
        return Result.ok(tag);
    }

    @PostMapping("/query")
    public Map query(@RequestBody Tag tag){
        PageInfo<Tag> pageInfo = tagService.query(tag);
        return Result.ok(pageInfo);
    }

    @PostMapping("/all")
    public Result all(){
        return Result.ok(tagService.all());
    }

    @PostMapping("/detail")
    public Result detail(Integer id){
        Tag tag = tagService.detail(id);
        return Result.ok(tag);
    }

    @PostMapping("/count")
    public Result count(@RequestBody Tag tag){
        Integer count = tagService.count(tag);
        return Result.ok(count);
    }

}
