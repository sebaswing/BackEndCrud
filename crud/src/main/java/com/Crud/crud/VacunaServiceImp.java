package com.Crud.crud;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacunaServiceImp implements VacunasService{
	
	@Autowired
	private VacunaRepository repository;
	
	@Autowired
	private UserService user;

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
	public Optional<Vacuna> borrar(int id) {
		Optional<Vacuna> v =repository.findById(id);
		if(v!=null) {
			repository.deleteById(id);
		}
		return v;
	}

	@Override
	public Vacuna add(Vacuna v) {
		LocalDate hoy = LocalDate.now();
		Mails m = new Mails();
		Paciente p = user.buscarUserID(v.getId_usuario());		
		if(v.getFecha_aplicacion().isAfter(hoy))
			m.mailFechaDeInscripcionVacuna(v.getNombreVacuna(), p.getEmail() , p.getZona(), v.getDosis(), v.getFecha_aplicacion());
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
