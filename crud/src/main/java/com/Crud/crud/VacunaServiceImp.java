package com.Crud.crud;

import java.time.LocalDate;
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
	public List<Vacuna> traerTodas(){
		return (List<Vacuna>) repository.listarTodas();
	}
	
	@Override
	public Vacuna traer(int id){
		return repository.traer(id);
	}
	
	@Override
	public void borrar(int id) {
		repository.borrar(id);
	}

	@Override
	public Vacuna add(Vacuna v) {
		// TODO Auto-generated method stub
		return repository.save(v);
	}
	
	@Override
	public Vacuna editar(Vacuna v) {
		// TODO Auto-generated method stub
		return repository.save(v);
	}

	@Override
	public List<Vacuna> buscarFecha(int zona) {
		LocalDate fecha=LocalDate.now();
		return (List<Vacuna>) repository.buscarFecha(fecha,zona);
	}

}
