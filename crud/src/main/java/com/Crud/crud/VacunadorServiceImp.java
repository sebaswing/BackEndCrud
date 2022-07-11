package com.Crud.crud;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacunadorServiceImp implements VacunadorService{

	@Autowired
	private VacunadorRepository repositorio;
	
	@Override
	public Vacunador listarUser(String email) {
		return repositorio.listarUser(email);
	}

	@Override
	public Vacunador edit(Vacunador u) {
		// TODO Auto-generated method stub
		return repositorio.save(u);
	}

	@Override
	public Vacunador add(Vacunador v) {
		
		return repositorio.save(v);
	}

	@Override
	public Vacunador buscarUser(String username) {
		
		return repositorio.buscarUser(username);
	}
	
	@Override
	public  List<Vacunador> listarTodos(){
		return (List<Vacunador>) repositorio.listarTodas();
	}
	
	@Override
	public int cantVacunadoresZona(int id) {
		return repositorio.cantVacunadoresZona(id);
	}
	
	@Override
	public Vacunador buscarDni(int dni){
		return repositorio.dniVacunador(dni);
	}
	

}
