package com.simplecurdoperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/all")
	public List<User> allUser(){
		return userRepo.findAll();
	}
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		return userRepo.save(user);
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		userRepo.deleteById(id);
	}

	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User user) {
		userRepo.save(user);
		return user;
	}
}
