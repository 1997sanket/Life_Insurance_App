/**
 * 
 */
package com.kamble.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamble.demo.model.User;
import com.kamble.demo.repository.UserRepository;

/**
 * @author Sanket.Kamble
 *
 */

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		
		userRepository.save(user);

	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		
		return userRepository.getUserByUserName(username);
	}

}
