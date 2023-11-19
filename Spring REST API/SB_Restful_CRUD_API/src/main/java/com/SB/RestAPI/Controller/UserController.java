package com.SB.RestAPI.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SB.RestAPI.Entity.User;
import com.SB.RestAPI.Repo.UserRepo;

@RestController
public class UserController {

	@Autowired
	private UserRepo userRepo;

	@GetMapping("/")
	public String index() {
		return "Welcome To REST API ";
	}

	/* POSTMAPPING */

	// Store one Record

	@PostMapping("/save")
	public User save(@RequestBody User user) {
		return userRepo.save(user);
	}

	// Create multiple Record
	@PostMapping("/saveAll")
	public List<User> saveAll(@RequestBody List<User> user) {
		return userRepo.saveAll(user);
	}

	/* ================== GET MAPPING=================== */

	// Retrive All Records from Database
	@GetMapping("/userAll")
	public List<User> getUser() {
		return userRepo.findAll();
	}

	// Retrive Records from Database using ByID
	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable("id") int uId) {
		return userRepo.findById(uId);
	}

	/* ================== PUT (Update) MAPPING=================== */

	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return userRepo.save(user);
	}
	
	@PutMapping("/{id}")
	public User updateUser(@RequestBody User user,@PathVariable int id) {
		User u=userRepo.findById(id).get();
		u.setName(user.getName());
		u.setAddress(user.getAddress());
		return  userRepo.save(u); //u can be set values
		
	}
	
	/*
	 *@PutMapping("/{id}")
	public User updateUser(@RequestBody User user,@PathVariable int id) {
		Optional<User> u=userRepo.findById(id);
		User update=u.get();
		update.setName(user.getName());
		update.setAddress(user.getAddress());
		return  userRepo.save(update); //update can be set values
		
	}
	 * */
	
	/* ================== Delete MAPPING=================== */
	
	@DeleteMapping("/{id}")
	public User DeletUser(@PathVariable("id") int uId) {
		 userRepo.deleteById(uId);
		return null;
	}

}