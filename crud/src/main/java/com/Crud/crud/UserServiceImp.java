package com.Crud.crud;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserRepository repositorio;
	
	@Override
	public Paciente listarUser(String email) {
		return repositorio.listarUser(email);
	}

	@Override
	public Paciente edit(Paciente u) {
		return repositorio.save(u);
	}

	@Override
	public Paciente add(Paciente u) {
		double token = (Math.random())*10000;
		int guardar= (int) token;
		u.setToken(guardar);
		Mails m= new Mails();
		m.mandarMaildeLogin(u);
		return repositorio.save(u);
	}

	@Override
	public Paciente buscarUserDni(int dni) {
		
		return repositorio.buscarUserDni(dni);
	}
	
	@Override
	public Paciente buscarUserID(int id) {
		
		return repositorio.buscarUserID(id);
	}
	
	public void mandarNotificaciones (VacunasService vacunaService) {
		List<Vacuna> v = vacunaService.traerTodas();
		for (Iterator iterator = v.iterator(); iterator.hasNext();) {
			Vacuna vacuna = (Vacuna) iterator.next();
			Paciente actual= this.buscarUserID(vacuna.getId_usuario());
			vacuna.mandarNotificación(actual.getEmail(), actual.getZona());
		}
		
	}

}
