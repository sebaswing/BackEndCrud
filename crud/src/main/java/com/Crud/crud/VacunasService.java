package com.Crud.crud;

import java.util.List;

public interface VacunasService {
	List<Vacuna> listarVacunas(int id);
	Vacuna add(Vacuna p);
	List<Vacuna> buscarFecha(int zona);
	Vacuna editar(Vacuna v);
}
