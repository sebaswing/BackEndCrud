package com.Crud.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZonaServiceImp implements ZonaService{
	@Autowired
	private ZonaRepository repository;
	
	@Override
	public List<Zona> listarZonas(){
		return (List<Zona>) repository.listarZonas();
	}
	
	@Override
	public String getNombreZona(int id){
		return repository.traerNombreDeZona(id);
	}
	
	@Override
	public Zona edit(Zona z){
		return repository.save(z) ;
	}
}
