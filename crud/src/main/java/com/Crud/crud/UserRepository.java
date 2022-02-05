package com.Crud.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query(value="SELECT * FROM usuarios u WHERE u.username like ?1"
			, nativeQuery = true
			)
	User listarUser(String user);
	
	@Query(value="SELECT * FROM usuarios u WHERE u.username = ?1"
			, nativeQuery = true
			)
	User buscarUser(String user);
}
