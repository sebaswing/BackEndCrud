package com.Crud.crud;

import java.time.LocalDate;
import java.util.List;

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
	
	@Query(value="SELECT * FROM vacunadores u where borrado = 0"
			,nativeQuery = true
			)
	List<Vacunador> listarTodas();
	
	@Query(value="SELECT COUNT(*) FROM vacunadores WHERE centro_vacunatorio = ?1 and borrado = 0",
			nativeQuery = true)
		int cantVacunadoresZona(int id);
	
	@Query(value="SELECT * FROM vacunadores u WHERE u.dni = ?1 and borrado = 0",
			nativeQuery = true)
	Vacunador dniVacunador(int dni);
}
