package com.bankapp.model.service;

import java.util.List;

import com.bankapp.model.entities.User;

public interface UserService {

	public User findByEmail(String email);
	public List<User> findAll();
	public void blockUser(Long id);
	
	
	public User updateUser(Long id,User user);
    public User addUser(User user);
    public void deleteUser(Long id);
    public List<User> getAllusers();
   // public User findUserById(Long id);

}
