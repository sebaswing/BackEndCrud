package com.Crud.crud;

import javax.persistence.*;

@Entity
@Table(name="personas")
public class Persona {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String Nombre;
	@Column 
	private String apellido;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nNombre) {
		this.Nombre = nNombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
