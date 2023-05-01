package com.daflix20.model;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(authorId, dislikeCount, id, likeCount, text);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		return Objects.equals(authorId, other.authorId) && Objects.equals(dislikeCount, other.dislikeCount)
				&& Objects.equals(id, other.id) && Objects.equals(likeCount, other.likeCount)
				&& Objects.equals(text, other.text);
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", text=" + text + ", authorId=" + authorId + ", likeCount=" + likeCount
				+ ", dislikeCount=" + dislikeCount + "]";
	}
	

}
