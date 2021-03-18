package com.yanzhen.entity;

import com.yanzhen.utils.Entity;
import java.util.Date;


/**
 * 
 * @author 596183363@qq.com
 * @time 2020-10-27 16:01:24
 */
public class FriendLink extends Entity{

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 
	 */
	private String url;
	/**
	 * 
	 */
	private String title;
	/**
	 * 
	 */
	private String path;
	/**
	 * 
	 */
	private String target;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
}