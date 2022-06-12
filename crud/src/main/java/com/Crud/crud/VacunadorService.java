package com.Crud.crud;

import java.time.LocalDate;

public interface VacunadorService {
	
	Vacunador listarUser(String email);
	Vacunador edit(Vacunador u);
	Vacunador add(Vacunador u);
	Vacunador buscarUser(String username);
	
}
