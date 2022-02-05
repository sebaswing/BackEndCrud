package com.Crud.crud;

import java.util.List;
import java.util.Optional;

public interface PersonaService {
	List<Persona> listar();
	List<Persona> findAllActiveUsers(String j);
	Persona add(Persona p);
	Optional<Persona> listarId(int id);
	Persona edit(Persona p);
	Optional<Persona> delete(int id);
}
