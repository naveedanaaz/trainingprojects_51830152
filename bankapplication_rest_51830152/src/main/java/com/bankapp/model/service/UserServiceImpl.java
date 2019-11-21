package com.bankapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.model.entities.User;
import com.bankapp.model.repo.UserRepository;
import com.bankapp.model.service.exceptions.UserNotFoundException;
@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void blockUser(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
		
	}

	

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllusers() {
		
		return userRepository.findAll();
	}

	@Override
	public User updateUser(Long id, User user) {
		User usertoBeUpdated=userRepository.findById(id).orElseThrow(UserNotFoundException::new);//orElseThrow(UserNotFoundException::new);
	    usertoBeUpdated.setAddress(user.getAddress());
	    usertoBeUpdated.setPhone(user.getPhone());
		return userRepository.save(usertoBeUpdated);
	}

	/*@Override
	public User findUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}*/

}
