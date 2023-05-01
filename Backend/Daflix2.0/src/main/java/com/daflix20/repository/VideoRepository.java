package com.daflix20.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.daflix20.model.Video;

public interface VideoRepository extends MongoRepository<Video, String> {
	
}
