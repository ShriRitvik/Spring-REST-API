package com.SB.RestAPI.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SB.RestAPI.Entity.User;
import com.SB.RestAPI.Repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public User createuser(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> createUsers(List<User> user) {
		return userRepo.saveAll(user);
	}

	@Override
	public User getUserById(int userId) {
		return userRepo.findById(userId).get();
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User updateUser(User user,int userId) {
		User ur=userRepo.findById(userId).get();
		ur.setFname(user.getFname());
		ur.setName(user.getName());
		ur.setEmail(user.getEmail());
		return userRepo.save(ur);
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
	userRepo.deleteById(userId);	
	}
	
	
	

}
