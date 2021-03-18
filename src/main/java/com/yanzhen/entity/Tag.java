package com.yanzhen.entity;

import com.yanzhen.utils.Entity;

/**
 * @author 596183363@qq.com
 * @Description:
 * @date 2020/10/2718:30
 */
public class Tag extends Entity {

    private Integer id;
    private String tagName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}
