package com.Crud.crud;

public interface UserService {
	
	User listarUser(String user);
	User edit(User u);
	User add(User u);
	User buscarUser(String username);
}
