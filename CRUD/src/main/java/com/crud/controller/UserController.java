package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.empties.User;
import com.crud.repositorio.UserRepositorio;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserRepositorio userRepositorio;
	
	@GetMapping("/user")
	public List<User> getUser(){
		return userRepositorio.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Long id){
		return userRepositorio.findOne(id);
	}
	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable Long id){
		userRepositorio.delete(id);
		return true;
	}
	
	/*
	 * @PostMapping pode ser substituido por RequestMapping(RequestMethod.POST, value="/user")
	 * 
	 * */
	@PostMapping("/user")
	public User createUser(User user){
		return userRepositorio.save(user);
	}
	@PutMapping("/user")
	public User updateUser(User user){
		return userRepositorio.save(user);
	}

	
	
}
