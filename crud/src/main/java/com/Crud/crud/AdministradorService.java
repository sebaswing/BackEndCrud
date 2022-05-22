package com.Crud.crud;

public interface AdministradorService {
	
	Administrador listarUser(String email);
	Administrador edit(Administrador u);
	Administrador add(Administrador u);
	Administrador buscarUser(String username);
}
