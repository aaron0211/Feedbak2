package com.sanvalero.feedback.model;

public class Jugador extends Usuario{
	private String equipo;
	private int numero;
	
	public Jugador(String nombre, String apellidos, String contrasena, String email, String dni, String direccion, 
			String equipo, int numero) {
		super(nombre, apellidos, contrasena, email, dni, direccion);
		this.equipo = equipo;
		this.numero = numero;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
