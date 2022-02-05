package com.Crud.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/personas"})
@CrossOrigin(origins="http://localhost:4200")
public class Controlador {
	@Autowired
	PersonaService service;
	
	@GetMapping("/listar")
	public List<Persona> listar(){
		return service.listar();
	}
	
	@GetMapping("/listarTodos/{id}")
	public List<Persona> listarTodos(@PathVariable("id") String id){
		return service.findAllActiveUsers(id);
	}
	
	@PostMapping
	public Persona agregar(@RequestBody Persona p) {
		return service.add(p);
	}
	
	@GetMapping(path= {"/{id}"})
	public Optional<Persona> listarId(@PathVariable("id") int id) {
		return service.listarId(id);
	}
	@PutMapping(path = {"/{id}"})
	public Persona editar (@RequestBody Persona p,@PathVariable("id") int id) {
		p.setId(id);
		return service.edit(p);
	}
	@DeleteMapping(path= {"/{id}"})
	public Optional<Persona> Delete(@PathVariable("id") int id) {
		return service.delete(id);
	}

}
