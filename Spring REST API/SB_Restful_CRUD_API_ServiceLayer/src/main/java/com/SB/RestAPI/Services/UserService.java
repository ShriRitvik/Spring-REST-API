package com.SB.RestAPI.Services;

import java.util.List;

import com.SB.RestAPI.Entity.User;

public interface UserService {

	User createuser(User user);

	List<User> createUsers(List<User> user);

	User getUserById(int userId);

	List<User> getAllUsers();

	User updateUser(User user,int id);

	void deleteUser(int id);

}
