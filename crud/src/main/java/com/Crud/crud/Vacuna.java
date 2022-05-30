package com.Crud.crud;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vacunaspacientes")
public class Vacuna {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private int id_vacuna;
	
	@Column
	private int id_usuario;
	
	@Column
	private LocalDate fecha_aplicacion;
	
	@Column
	private int dosis;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_vacuna() {
		return id_vacuna;
	}

	public void setId_vacuna(int id_vacuna) {
		this.id_vacuna = id_vacuna;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public LocalDate getFecha_aplicacion() {
		return fecha_aplicacion;
	}

	public void setFecha_aplicacion(LocalDate fecha_aplicacion) {
		this.fecha_aplicacion = fecha_aplicacion;
	}

	public int getDosis() {
		return dosis;
	}

	public void setDosis(int dosis) {
		this.dosis = dosis;
	}

}
