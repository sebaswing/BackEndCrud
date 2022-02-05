package com.Crud.crud;

import javax.persistence.*;


@Entity
@Table(name="usuarios")
public class User {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private int dni;
	
	@Column
	private String username;
	
	@Column
	private String email;
	
	@Column
	private String password;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
}
