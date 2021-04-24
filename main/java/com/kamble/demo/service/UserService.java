package com.kamble.demo.service;

import com.kamble.demo.model.User;

public interface UserService {

	void saveUser(User user);
	
	
	User getUserByUsername(String username);
}
