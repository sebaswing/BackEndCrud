package com.Crud.crud;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ZonaRepository extends JpaRepository<Zona, Integer>{
	@Query(value="SELECT * FROM zona"
			, nativeQuery = true
			)
	List<Zona> listarZonas();
	
	@Query(value="SELECT u.ubicacion FROM zona u WHERE u.id=?1"
			, nativeQuery = true
			)
	String traerNombreDeZona(int id);
	
}
