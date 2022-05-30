package com.Crud.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	
}
