package com.Crud.crud;

public interface UserService {
	
	Paciente listarUser(String email);
	Paciente edit(Paciente u);
	Paciente add(Paciente u);
	Paciente buscarUserDni(int dni);
	Paciente buscarUserID(int id);
	void mandarNotificaciones(VacunasService vacunaService);
}
