package org.generation.ecommercedb.controller;

import java.util.List;

import org.generation.ecommercedb.model.User;
import org.generation.ecommercedb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/user/")
//@CrossOrigin(origins="*")

public class UserController{

	//constante
	public final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}//constructor

	
	//GET para todos los usuarios
	@GetMapping
	public List<User> getUsuarios(){
		return userService.getUsers();
	}//get para todos los usuarios
	
	
	//GET para usuario por id
	@GetMapping(path = "{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		return userService.getUser(userId);
	}//get para un usuario por id
	
	
	//DELETE para borrar usuarios
	@DeleteMapping(path="{userId}")
	public void deleteUsuario(@PathVariable ("userId") Long userId) {
		userService.deleteUser(userId);
	}//deleteUsuario
	

	//POST para agregar nuevos usuarios
	@PostMapping
	public void addUsuario(@RequestBody User user) {
		userService.addUsuario(user);
	}//addUsuario
	
	
	//PUT para actualizar nuevos usuarios
	@PutMapping(path = "{userId}")
	public void updateUsuario(@PathVariable("userId") Long userId,
			@RequestParam(required = false) String currentPassword,
			@RequestParam(required = false) String newPassword) {
		this.userService.updateUser(userId, currentPassword, newPassword);
	}//updateUsuario

	
	
	
	
	
	
	
	
	//DELETE
	//POST
	//PUT
	
	

}
