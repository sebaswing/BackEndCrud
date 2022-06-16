package com.Crud.crud;

import javax.persistence.*;

@Entity
@Table(name="vacunadores")
public class Vacunador {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column
	private int dni;
	
	@Column
	private String email;
	
	@Column
	private int centro_vacunatorio;
	
	public int getCentro_vacunatorio() {
		return centro_vacunatorio;
	}

	public void setCentro_vacunatorio(int centro_vacunatorio) {
		this.centro_vacunatorio = centro_vacunatorio;
	}

	@Column
	private String clave;
	
	@Column
	private int token;
	
	@Column
	private boolean borrado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getToken() {
		return token;
	}

	public void setToken(int token) {
		this.token = token;
	}

	public boolean isBorrado() {
		return borrado;
	}

	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}
	
}
