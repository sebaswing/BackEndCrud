package com.Crud.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({"/vacunadores"})
@CrossOrigin(origins="http://localhost:4200")
public class ControladorVacunador {
	
	@Autowired
	VacunadorService service;
	
	@GetMapping("/usersLogin/{email}")
	public Vacunador listarTodos(@PathVariable("email") String email){
		Vacunador p= service.listarUser(email);
		return p;
	}
	
	@GetMapping("/recuperarClave/{email}")
	public void mandarClave (@PathVariable("email") String email) {
		Vacunador p= service.listarUser(email);
		if(p!=null) {
			Mails m = new Mails();
			m.mandarMaildeRecuperarClave(p);
		}
	}
	
	@GetMapping("/userExist/{email}")
	public Vacunador buscarUser(@PathVariable("email") String email){
		Vacunador p= service.listarUser(email);
		return p;
	}
	
	@PutMapping(path = {"/{id}"})
	public Vacunador editar (@RequestBody Vacunador p,@PathVariable("id") int id) {
		p.setId(id);
		return service.edit(p);
	}

}
