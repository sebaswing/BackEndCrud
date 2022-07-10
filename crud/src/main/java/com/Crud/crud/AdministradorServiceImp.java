package com.Crud.crud;

import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorServiceImp implements AdministradorService{

	@Autowired
	private AdministradorRepository repositorio;
	
	@Override
	public Administrador listarUser(String email) {
		return repositorio.listarUser(email);
	}

	@Override
	public Administrador edit(Administrador u) {
		return repositorio.save(u);
	}

	@Override
	public Administrador add(Administrador u) {
		return null;
	}

	@Override
	public Administrador buscarUser(String username) {
		
		return repositorio.buscarUser(username);
	}

}
