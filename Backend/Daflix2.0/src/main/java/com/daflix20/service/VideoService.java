package com.daflix20.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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
}
