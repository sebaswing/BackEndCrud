package com.Crud.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacunaServiceImp implements VacunasService{
	
	@Autowired
	private VacunaRepository repository;

	@Override
	public List<Vacuna> listarId(int id){
		return null;
	}

	@Override
	public Vacuna add(Vacuna v) {
		// TODO Auto-generated method stub
		return repository.save(v);
	}


}
