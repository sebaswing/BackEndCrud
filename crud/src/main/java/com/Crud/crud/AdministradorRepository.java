package com.Crud.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdministradorRepository extends JpaRepository<Administrador, Integer>{
	
	@Query(value="SELECT * FROM administradores u WHERE u.email like ?1"
			, nativeQuery = true
			)
	Administrador listarUser(String email);
	
	@Query(value="SELECT * FROM administradores u WHERE u.email = ?1"
			, nativeQuery = true
			)
	Administrador buscarUser(String administrador);
}
