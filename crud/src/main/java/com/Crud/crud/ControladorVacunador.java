package com.Crud.crud;

import java.util.List;

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
	public Vacunador mandarClave (@PathVariable("email") String email) {
		Vacunador p= service.listarUser(email);
		if(p!=null) {
			Mails m = new Mails();
			m.mandarMaildeRecuperarClave(p);
		}
		return p;
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
	
	
	@GetMapping("/listar")
	public List<Vacunador> listar() {
		List<Vacunador> vacunadores = service.listarTodos();
		return vacunadores;
	}
	
	@GetMapping("/VacunadorPorZona/{idZona}")
	public int cantVacunadoresporZona(@PathVariable("idZona") int id ) {
		return service.cantVacunadoresZona(id);
	}

	@PostMapping("/crearVacunador")
	public Vacunador crearVacunador(@RequestBody Vacunador v) {
		return service.add(v);
	}
	
	@GetMapping("/existeDNI/{dni}")
	public Vacunador buscarxDni(@PathVariable("dni") int dni ) {
		Vacunador v = service.buscarDni(dni);
		return v;
	}
	

}
