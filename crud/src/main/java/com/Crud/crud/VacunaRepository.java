package com.Crud.crud;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VacunaRepository extends JpaRepository<Vacuna, Integer>{
	
	@Query(value="SELECT * FROM vacunaspacientes u WHERE u.id_usuario = ?1 order by u.id_vacuna,u.fecha_aplicacion desc"
			, nativeQuery = true
			)
	List<Vacuna> listarVacunas(int idPaciente);
}
