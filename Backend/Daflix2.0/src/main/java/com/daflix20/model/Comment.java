package com.daflix20.model;

import org.springframework.data.annotation.Id;

public class Comment {
	
	@Id
	private String id;
	private String text;
	private String authorId;
	private Integer likeCount;
	private Integer dislikeCount;
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(String id, String text, String authorId, Integer likeCount, Integer dislikeCount) {
		super();
		this.id = id;
		this.text = text;
		this.authorId = authorId;
		this.likeCount = likeCount;
		this.dislikeCount = dislikeCount;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAuthorId() {
		return authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	public Integer getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}
	public Integer getDislikeCount() {
		return dislikeCount;
	}
	public void setDislikeCount(Integer dislikeCount) {
		this.dislikeCount = dislikeCount;
	}
	

}
