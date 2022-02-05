package com.Crud.crud;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface PersonaRepository extends JpaRepository<Persona, Integer>{
	
	@Query(
			value = "SELECT * FROM personas p WHERE p.Nombre like ?1%"
			,nativeQuery = true
			)
	List<Persona> findAllActiveUsers(String j);
	
		
}
