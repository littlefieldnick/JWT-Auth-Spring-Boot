package org.openhds.jwtauth.service.impl;

import java.util.List;

import org.openhds.jwtauth.domain.User;
import org.openhds.jwtauth.repository.UserRepository;
import org.openhds.jwtauth.service.UserService;

public class UserServiceImpl implements UserService{
	UserRepository userRepository;
	
	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public List<User> findAllUsers() {
		return (List<User>)userRepository.findAll();
	}
}

