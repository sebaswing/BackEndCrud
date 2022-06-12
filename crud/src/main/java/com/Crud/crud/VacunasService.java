package com.Crud.crud;

import java.util.List;

public interface VacunasService {
	List<Vacuna> listarVacunas(int id);
	Vacuna add(Vacuna p);
	List<Vacuna> buscarFecha();
}
