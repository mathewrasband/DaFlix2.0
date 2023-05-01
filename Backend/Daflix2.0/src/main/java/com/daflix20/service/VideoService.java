package com.daflix20.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.daflix20.DTO.VideoDto;
import com.daflix20.model.Video;
import com.daflix20.repository.VideoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VideoService {
	
	private S3Service s3Service;
	private VideoRepository videoRepository;
	
	public void uploadVideo(MultipartFile multipartFile) {
		
		String videoUrl = s3Service.uploadFile(multipartFile);
		var video = new Video();
		video.setVideoUrl(videoUrl);
		
		videoRepository.save(video);
	}

	public VideoDto editVideo(VideoDto videoDto) {
		//Find the video by video ID
		Video savedVideo = videoRepository.findById(videoDto.getId())
				.orElseThrow(() -> new IllegalArgumentException("Cannot find video by id - " + videoDto.getId()));
		
		//Map the videoDto 
		savedVideo.setTitle(videoDto.getTitle());
		savedVideo.setDescription(videoDto.getDescription());
		savedVideo.setTags(videoDto.getTags());
		savedVideo.setThumbnailUrl(videoDto.getThumbnailUrl());
		savedVideo.setVideoStatus(videoDto.getVideoStatus());
		
		// save the video to the database
		videoRepository.save(savedVideo);
		
		return videoDto;
	}
} 
