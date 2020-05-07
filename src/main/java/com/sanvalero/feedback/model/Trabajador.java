package com.sanvalero.feedback.model;

public class Trabajador extends Usuario{
	private String perfil;
	private String departamento;
	public Trabajador(String nombre, String apellidos, String contrasena, String email, String dni, String direccion, 
			String perfil, String departamento) {
		super(nombre, apellidos, contrasena, email, dni, direccion);
		this.perfil = perfil;
		this.departamento = departamento;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public void anadirEquipo(Equipo e,Campeonato c) {
		//Añade equipo a la competición
	}
	
	public void anadirJugador(Jugador j,Equipo e) {
		//Añade jugador a un equipo
	}
}
