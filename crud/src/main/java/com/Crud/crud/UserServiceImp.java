package com.Crud.crud;

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
		// TODO Auto-generated method stub
		return null;
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
	public Paciente buscarUser(String username) {
		
		return repositorio.buscarUser(username);
	}

}
