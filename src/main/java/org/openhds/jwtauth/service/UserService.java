package org.openhds.jwtauth.service;

import java.util.List;

import org.openhds.jwtauth.domain.User;

public interface UserService {

	User findByUsername(String username) ;

	public List<User> findAllUsers();
}
