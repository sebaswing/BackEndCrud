package com.Crud.crud;

import java.time.LocalDate;
import java.util.Iterator;
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
@RequestMapping({"/vacunas"})
@CrossOrigin(origins="http://localhost:4200")
public class ControladorVacuna {

	@Autowired
	VacunasService service;
	
	@PostMapping
	public Vacuna agregar(@RequestBody Vacuna v) {
		return service.add(v);
	}
	
	@GetMapping ("listarVacunas/{idUser}")
	public List<Vacuna> vacunas(@PathVariable ("idUser") int idUser){
		return service.listarVacunas(idUser);
	}
	
	@GetMapping("traerTodas")
	public List<Vacuna> traerTodas(){
		List<Vacuna> todas = service.traerTodas();
		return todas;
	}
	
	@GetMapping("traerTurnos/{zona}")
	public List<Vacuna> buscarFecha (@PathVariable ("zona") int zona) {
		return service.buscarFecha(zona);
	}
	
	@PutMapping(path={"/{id}"})
	public Vacuna editar (@RequestBody Vacuna p,@PathVariable("id") int id) {
		p.setId(id);
		return service.editar(p);
	}
	
}
