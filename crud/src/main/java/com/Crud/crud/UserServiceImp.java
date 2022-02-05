package com.Crud.crud;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserRepository repositorio;
	
	@Override
	public User listarUser(String user) {
		return repositorio.listarUser(user);
	}

	@Override
	public User edit(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User add(User u) {
		return repositorio.save(u);
	}

	@Override
	public User buscarUser(String username) {
		return repositorio.buscarUser(username);
	}

}
