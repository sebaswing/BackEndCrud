package com.Crud.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<Paciente, Integer>{
	
	@Query(value="SELECT * FROM pacientes u WHERE u.email like ?1"
			, nativeQuery = true
			)
	Paciente listarUser(String email);
	
	@Query(value="SELECT * FROM pacientes u WHERE u.email = ?1"
			, nativeQuery = true
			)
	Paciente buscarUser(String paciente);
}
