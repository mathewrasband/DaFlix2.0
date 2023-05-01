package com.daflix20.model;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Video")
public class Video {
	
	@Id
	private String id;
	private String title;
	private String description;
	private String userID;
	private Integer likes;
	private Integer dislakes;
	private Set<String> tags;
	private String videoUrl;
	private VideoStatus videoStatus;
	private Integer viewCount;
	private String thumbnailUrl;
	private List<Comment> commentList;
	
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Video(String id, String title, String description, String userID, Integer likes, Integer dislakes,
			Set<String> tags, String videoUrl, VideoStatus videoStatus, Integer viewCount, String thumbnailUrl,
			List<Comment> commentList) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.userID = userID;
		this.likes = likes;
		this.dislakes = dislakes;
		this.tags = tags;
		this.videoUrl = videoUrl;
		this.videoStatus = videoStatus;
		this.viewCount = viewCount;
		this.thumbnailUrl = thumbnailUrl;
		this.commentList = commentList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Integer getDislakes() {
		return dislakes;
	}

	public void setDislakes(Integer dislakes) {
		this.dislakes = dislakes;
	}

	public Set<String> getTags() {
		return tags;
	}

	public void setTags(Set<String> tags) {
		this.tags = tags;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public VideoStatus getVideoStatus() {
		return videoStatus;
	}

	public void setVideoStatus(VideoStatus videoStatus) {
		this.videoStatus = videoStatus;
	}

	public Integer getViewCount() {
		return viewCount;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(commentList, description, dislakes, id, likes, tags, thumbnailUrl, title, userID,
				videoStatus, videoUrl, viewCount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Video other = (Video) obj;
		return Objects.equals(commentList, other.commentList) && Objects.equals(description, other.description)
				&& Objects.equals(dislakes, other.dislakes) && Objects.equals(id, other.id)
				&& Objects.equals(likes, other.likes) && Objects.equals(tags, other.tags)
				&& Objects.equals(thumbnailUrl, other.thumbnailUrl) && Objects.equals(title, other.title)
				&& Objects.equals(userID, other.userID) && videoStatus == other.videoStatus
				&& Objects.equals(videoUrl, other.videoUrl) && Objects.equals(viewCount, other.viewCount);
	}

	@Override
	public String toString() {
		return "Video [id=" + id + ", title=" + title + ", description=" + description + ", userID=" + userID
				+ ", likes=" + likes + ", dislakes=" + dislakes + ", tags=" + tags + ", videoUrl=" + videoUrl
				+ ", videoStatus=" + videoStatus + ", viewCount=" + viewCount + ", thumbnailUrl=" + thumbnailUrl
				+ ", commentList=" + commentList + "]";
	}
	
	
}
