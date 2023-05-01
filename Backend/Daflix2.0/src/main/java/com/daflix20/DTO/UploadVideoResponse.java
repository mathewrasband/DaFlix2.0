package com.daflix20.DTO;

import java.util.Objects;

public class UploadVideoResponse {
	
	private String videoId;
	private String videoUrl;
	
	public UploadVideoResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UploadVideoResponse(String videoId, String videoUrl) {
		super();
		this.videoId = videoId;
		this.videoUrl = videoUrl;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	@Override
	public String toString() {
		return "UploadVideoResponse [videoId=" + videoId + ", videoUrl=" + videoUrl + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(videoId, videoUrl);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UploadVideoResponse other = (UploadVideoResponse) obj;
		return Objects.equals(videoId, other.videoId) && Objects.equals(videoUrl, other.videoUrl);
	}

}
