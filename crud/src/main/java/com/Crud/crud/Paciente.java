package com.Crud.crud;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name="Pacientes")
public class Paciente {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private int dni;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@Column
	private LocalDate fecha_nacimiento;
	
	@Column
	private int token;
	
	@Column
	private int completo_vacunas;

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

	public LocalDate getFechaNacimiento() {
		return fecha_nacimiento;
	}

	public void setFechaNacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public int getToken() {
		return token;
	}

	public void setToken(int token) {
		this.token = token;
	}
	
	public int getCompleto_vacunas() {
		return completo_vacunas;
	}

	public void setCompleto_vacunas(int completo_vacunas) {
		this.completo_vacunas = completo_vacunas;
	}
	
}
