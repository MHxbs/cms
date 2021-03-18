package com.yanzhen.mapper;

import java.util.List;
import java.util.Map;

import com.yanzhen.entity.Comment;

public interface CommentDao {
	public int create(Comment pi);
	public int delete(Map<String, Object> paramMap);
	public int update(Map<String, Object> paramMap);
	public List<Comment> query(Map<String, Object> paramMap);
	public Comment detail(Map<String, Object> paramMap);
	public int count(Map<String, Object> paramMap);
}