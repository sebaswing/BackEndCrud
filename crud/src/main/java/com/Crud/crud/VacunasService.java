package com.Crud.crud;

import java.util.List;

public interface VacunasService {
	List<Vacuna> listarVacunas(int id);
	Vacuna add(Vacuna p);
	public List<Vacuna> traerTodas();
	List<Vacuna> buscarFecha(int zona);
	Vacuna editar(Vacuna v);
}
