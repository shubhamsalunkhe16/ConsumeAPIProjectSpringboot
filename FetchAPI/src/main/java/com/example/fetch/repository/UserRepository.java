package com.example.fetch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.fetch.modal.User;

@Service
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUsername(String username);
}
