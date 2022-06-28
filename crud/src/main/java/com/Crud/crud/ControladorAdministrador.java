package com.Crud.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({"/administradores"})
@CrossOrigin(origins="http://localhost:4200")
public class ControladorAdministrador {
	
	@Autowired
	AdministradorService service;
	
	@GetMapping("/usersLogin/{email}")
	public Administrador listarTodos(@PathVariable("email") String email){
		Administrador p= service.listarUser(email);
		return p;
	}
	
	@GetMapping("/recuperarClave/{email}")
	public Administrador mandarClave (@PathVariable("email") String email) {
		Administrador p= service.listarUser(email);
		if(p!=null) {
			Mails m = new Mails();
			m.mandarMaildeRecuperarClave(p);
		}
		return p;
	}
	
	@GetMapping("/userExist/{email}")
	public Administrador buscarUser(@PathVariable("email") String email){
		Administrador p= service.listarUser(email);
		return p;
	}
}
