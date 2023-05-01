package com.daflix20.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.daflix20.DTO.UploadVideoResponse;
import com.daflix20.DTO.VideoDto;
import com.daflix20.service.VideoService;

@RestController
@RequestMapping("/api/videos")
public class VideoController {
	
	private VideoService videoService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UploadVideoResponse uploadVideo(@RequestParam("file") MultipartFile file) {
		  return  videoService.uploadVideo(file);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public VideoDto editVideoMetaData(@RequestBody VideoDto videoDto) {
		return videoService.editVideo(videoDto);
	}
	
	
	@PostMapping("/thumbnail")
	@ResponseStatus(HttpStatus.CREATED)
	public String uploadThumbnail(@RequestParam("file") MultipartFile file, @RequestParam("videoId") String videoId ) {
		  return videoService.uploadThumbnail(file, videoId );
	}

}
