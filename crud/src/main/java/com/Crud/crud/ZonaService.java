package com.Crud.crud;

import java.util.List;

public interface ZonaService {
	
	List<Zona> listarZonas();

	String getNombreZona(int id);
	
	Zona edit(Zona z);
	
	
}
