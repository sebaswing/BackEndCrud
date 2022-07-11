package com.Crud.crud;

import java.time.LocalDate;
import java.util.List;

public interface VacunadorService {
	
	Vacunador listarUser(String email);
	Vacunador edit(Vacunador u);
	Vacunador add(Vacunador u);
	Vacunador buscarUser(String username);
	List<Vacunador> listarTodos();
	int cantVacunadoresZona(int id);
	Vacunador buscarDni(int dni);
	
}
