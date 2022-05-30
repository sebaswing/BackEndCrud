package com.Crud.crud;

import java.util.List;

public interface VacunasService {
	List<Vacuna> listarId(int id);
	Vacuna add(Vacuna p);
}
