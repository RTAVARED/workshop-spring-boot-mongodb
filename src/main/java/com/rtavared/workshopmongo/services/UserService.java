package com.rtavared.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rtavared.workshopmongo.domain.User;
import com.rtavared.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
}