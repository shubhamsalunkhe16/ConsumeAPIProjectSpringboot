package com.example.fetch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.fetch.modal.User;
import com.example.fetch.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	private final RestTemplate restTemplate;

	@Autowired
	public UserService(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	public String goPhygitalAPI(String username) {
		return restTemplate.getForObject("http://localhost:9292/user/" + username, String.class);
	}

	public User getUser(String username) {
		User user = this.userRepository.findByUsername(username);
		return user;
	}

}
