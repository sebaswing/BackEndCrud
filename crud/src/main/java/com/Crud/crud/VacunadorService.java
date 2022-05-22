package com.Crud.crud;

public interface VacunadorService {
	
	Vacunador listarUser(String email);
	Vacunador edit(Vacunador u);
	Vacunador add(Vacunador u);
	Vacunador buscarUser(String username);
}
