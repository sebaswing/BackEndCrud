package com.Crud.crud;

import java.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@RestController
@RequestMapping({"/users"})
@CrossOrigin(origins="http://localhost:4200")
public class Controladorusers {
	
	@Autowired
	UserService service;
	
	@GetMapping("/usersLogin/{email}")
	public Paciente listarTodos(@PathVariable("email") String email){
		Paciente p= service.listarUser(email);
		return p;
	}
	
	@GetMapping("/userExist/{email}")
	public Paciente buscarUser(@PathVariable("email") String email){
		Paciente p= service.listarUser(email);
		return p;
	}
	
	@GetMapping("/recuperarClave/{email}")
	public void mandarClave (@PathVariable("email") String email) {
		Paciente p= service.listarUser(email);
		if(p!=null) {
			Mails m = new Mails();
			m.mandarMaildeRecuperarClave(p);
		}
	}
	
	@PostMapping
	public Paciente agregar(@RequestBody Paciente u) {
		//agregar logica de generación del token.
		return service.add(u);
	}

}
