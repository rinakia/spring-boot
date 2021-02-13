package com.example.demo.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.object.User;
import com.example.demo.domain.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	UserRepository userRepository;


	public User getById(int id) {

		//User user = userrepository.selectUser(id);
		User user = new User();
		user.setId(id);

		return user;
	}

	public List<User> getAllUser() {

		return userRepository.findAll();

	}



}
