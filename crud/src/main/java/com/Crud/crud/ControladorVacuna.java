package com.Crud.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
}
