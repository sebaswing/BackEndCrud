package com.Crud.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/users"})
@CrossOrigin(origins="http://localhost:4200")
public class Controladorusers {
	
	@Autowired
	UserService service;
	
	@GetMapping("/usersLogin/{id}")
	public User listarTodos(@PathVariable("id") String id){
		return service.listarUser(id);
	}
	
	@GetMapping("/userExist/{id}")
	public User buscarUser(@PathVariable("id") String id){
		return service.listarUser(id);
	}
	
	@PostMapping
	public User agregar(@RequestBody User u) {
		return service.add(u);
	}

}
