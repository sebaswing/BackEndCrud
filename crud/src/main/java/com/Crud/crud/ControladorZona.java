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
@RequestMapping({"/zona"})
@CrossOrigin(origins="http://localhost:4200")

public class ControladorZona {
	@Autowired
	ZonaService service;
	
	@GetMapping("/traerZonas")
	public List<Zona>listarZonas(){
		return service.listarZonas();
		 
	}
	
	@PostMapping(path = {"edit/{id}"})
	public Zona editar(@RequestBody Zona z,@PathVariable("id") int id) {
		z.setId(id);
		return service.edit(z);
	}
}
