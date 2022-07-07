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
	private int zona;
	
	@Column
	private int dosis;
	
	@Column
	private int asistio;
	
	@Column
	private String observacion;
	

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public int getAsistio() {
		return asistio;
	}

	public void setAsistio(int asistio) {
		this.asistio = asistio;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

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
	
	public String getNombreVacuna() {
		String nombre = "";
		switch(this.id_vacuna) {
			case 1: nombre = "Gripe Común" ;
					break;
			case 2:nombre = "Covid";
					break;
			case 3:nombre = "fiebre Amarilla";			
					break;
		}
		return nombre;
	}
	
	public void mandarNotificación(String mail,int zona) {
		LocalDate hoy = LocalDate.now();
		Mails m = new Mails();
		if(this.getFecha_aplicacion().getMonthValue()-1==hoy.getMonthValue() && this.getFecha_aplicacion().getDayOfMonth()==hoy.getDayOfMonth()) {
			m.mailRecordatorioDeMesAntes(this.getNombreVacuna(), mail, zona,this.getDosis());
		}
		if(this.getFecha_aplicacion().getMonthValue()==hoy.getMonthValue() && this.getFecha_aplicacion().getDayOfMonth()-1==hoy.getDayOfMonth()) {
			m.mailRecordatorioDeDiaAntes(this.getNombreVacuna(), mail, zona,this.getDosis());
		}
	}

}
