package com.Crud.crud;

public interface UserService {
	
	Paciente listarUser(String email);
	Paciente edit(Paciente u);
	Paciente add(Paciente u);
	Paciente buscarUser(String username);
}
