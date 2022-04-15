package com.rtavared.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rtavared.workshopmongo.domain.User;
import com.rtavared.workshopmongo.repository.UserRepository;
import com.rtavared.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
