package com.Crud.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VacunaRepository extends JpaRepository<Vacuna, Integer>{
	
	@Query(value="SELECT * FROM vacunaspacientes u WHERE u.email like ?1"
			, nativeQuery = true
			)
	Paciente listarVacunas(int idPaciente);
}
