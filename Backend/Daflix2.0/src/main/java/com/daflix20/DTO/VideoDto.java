package com.daflix20.DTO;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.springframework.data.annotation.Id;

import com.daflix20.model.Comment;
import com.daflix20.model.VideoStatus;

public class VideoDto {
	
	private String id;
	private String title;
	private String description;
	private Set<String> tags;
	private String videoUrl;
	private VideoStatus videoStatus;
	private String thumbnailUrl;
	
	public VideoDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VideoDto(String id, String title, String description, Set<String> tags, String videoUrl,
			VideoStatus videoStatus, String thumbnailUrl) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.tags = tags;
		this.videoUrl = videoUrl;
		this.videoStatus = videoStatus;
		this.thumbnailUrl = thumbnailUrl;
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

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	@Override
	public String toString() {
		return "VideoDto [id=" + id + ", title=" + title + ", description=" + description + ", tags=" + tags
				+ ", videoUrl=" + videoUrl + ", videoStatus=" + videoStatus + ", thumbnailUrl=" + thumbnailUrl + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, id, tags, thumbnailUrl, title, videoStatus, videoUrl);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VideoDto other = (VideoDto) obj;
		return Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& Objects.equals(tags, other.tags) && Objects.equals(thumbnailUrl, other.thumbnailUrl)
				&& Objects.equals(title, other.title) && videoStatus == other.videoStatus
				&& Objects.equals(videoUrl, other.videoUrl);
	} 
	
	
	
}
