package com.daflix20.model;

import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "User")
class User {
	
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String fullName;
	private String emailAddress;
	private Set<String> subscribedToUsers;
	private Set<String> subscribers;
	private List<String> videoHistory;
	private Set<String> likedVideos;
	private Set<String> dislikedVideos;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String id, String firstName, String lastName, String fullName, String emailAddress,
			Set<String> subscribedToUsers, Set<String> subscribers, List<String> videoHistory, Set<String> likedVideos,
			Set<String> dislikedVideos) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.emailAddress = emailAddress;
		this.subscribedToUsers = subscribedToUsers;
		this.subscribers = subscribers;
		this.videoHistory = videoHistory;
		this.likedVideos = likedVideos;
		this.dislikedVideos = dislikedVideos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Set<String> getSubscribedToUsers() {
		return subscribedToUsers;
	}

	public void setSubscribedToUsers(Set<String> subscribedToUsers) {
		this.subscribedToUsers = subscribedToUsers;
	}

	public Set<String> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(Set<String> subscribers) {
		this.subscribers = subscribers;
	}

	public List<String> getVideoHistory() {
		return videoHistory;
	}

	public void setVideoHistory(List<String> videoHistory) {
		this.videoHistory = videoHistory;
	}

	public Set<String> getLikedVideos() {
		return likedVideos;
	}

	public void setLikedVideos(Set<String> likedVideos) {
		this.likedVideos = likedVideos;
	}

	public Set<String> getDislikedVideos() {
		return dislikedVideos;
	}

	public void setDislikedVideos(Set<String> dislikedVideos) {
		this.dislikedVideos = dislikedVideos;
	}
	
	
}
