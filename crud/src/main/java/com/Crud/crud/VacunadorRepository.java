package com.Crud.crud;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VacunadorRepository extends JpaRepository<Vacunador, Integer>{
	
	@Query(value="SELECT * FROM vacunadores u WHERE u.email like ?1"
			, nativeQuery = true
			)
	Vacunador listarUser(String email);
	
	@Query(value="SELECT * FROM vacunadores u WHERE u.email = ?1"
			, nativeQuery = true
			)
	Vacunador buscarUser(String vacunador);
	
	
	
}
