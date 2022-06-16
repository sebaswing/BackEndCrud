package com.Crud.crud;

import java.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/users"})
@CrossOrigin(origins="http://localhost:4200")
public class Controladorusers {
	
	@Autowired
	UserService service;
	
	@GetMapping("/userExistdni/{dni}")
	public Paciente listarTodos(@PathVariable("dni") int dni){
		Paciente p= service.buscarUserDni(dni);
		return p;
	}
	
	@GetMapping("/userID/{id}")
	public Paciente listarPaciente(@PathVariable("id") int id){
		Paciente p= service.buscarUserID(id);
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
		return service.add(u);
	}
	
	@PutMapping(path = {"/{id}"})
	public Paciente editar (@RequestBody Paciente p,@PathVariable("id") int id) {
		p.setId(id);
		return service.edit(p);
	}

}
