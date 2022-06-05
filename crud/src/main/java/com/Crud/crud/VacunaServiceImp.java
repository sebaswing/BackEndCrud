package com.Crud.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacunaServiceImp implements VacunasService{
	
	@Autowired
	private VacunaRepository repository;

	@Override
	public List<Vacuna> listarVacunas(int id){
		return (List<Vacuna>) repository.listarVacunas(id);
	}

	@Override
	public Vacuna add(Vacuna v) {
		// TODO Auto-generated method stub
		return repository.save(v);
	}


}
