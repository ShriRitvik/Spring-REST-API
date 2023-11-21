package com.SB.RestAPI.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SB.RestAPI.Entity.User;
import com.SB.RestAPI.Services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	// alwayes call services method
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return userService.createuser(user);

	}

	@PostMapping("/addAll")
	public List<User> addAllUser(@RequestBody List<User> user) {
		return userService.createUsers(user);
	}

	@GetMapping("/{userId}")
	public User getUserById(@PathVariable int userId) {
		return userService.getUserById(userId);
	}

	@GetMapping("/getAll")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@PutMapping("/update/{id}")
	public User updateUser(@RequestBody User user, @PathVariable int id) {
		// user.setId(id);
		return userService.updateUser(user,id);

	}

	@DeleteMapping("/del/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);

	}

}
