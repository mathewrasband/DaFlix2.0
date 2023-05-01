package com.daflix20.service;

import java.io.IOException;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class S3Service implements FileService {
	
	private final AmazonS3Client awsS3Client = new AmazonS3Client() ;

	@Override
	public String uploadFile(MultipartFile multipartFile) {
		
		var filenameExtenstion  = StringUtils.getFilename(multipartFile.getOriginalFilename());
		
		var key = UUID.randomUUID().toString() + filenameExtenstion;
		
		var metadata = new ObjectMetadata();
		metadata.setContentLength(multipartFile.getSize());
		metadata.setContentType(multipartFile.getContentType());
		try {
			awsS3Client.putObject("bucketname", key, multipartFile.getInputStream(), metadata);
		} catch (IOException ioException) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "An Exception occured while uploading the file");
		}
		
		awsS3Client.setObjectAcl("bucketname", key, CannedAccessControlList.PublicRead);
		
		return awsS3Client.getResourceUrl("bucketname", key); 
		
	}
}
