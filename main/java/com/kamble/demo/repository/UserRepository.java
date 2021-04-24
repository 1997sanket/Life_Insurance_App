package com.kamble.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamble.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User getUserByUserName(String username);
}
