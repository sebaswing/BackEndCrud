package com.Crud.crud;

import java.util.List;
import java.util.Optional;

public interface VacunasService {
	List<Vacuna> listarVacunas(int id);
	Vacuna add(Vacuna p);
	Vacuna traer(int id);
	Optional<Vacuna> borrar(int id);
	public List<Vacuna> traerTodas();
	List<Vacuna> buscarFecha(int zona);
	Vacuna editar(Vacuna v);
}
