package com.sanvalero.feedback.model;

public class Arbritro extends Usuario{
	private String categoria;

	public Arbritro(String nombre, String apellidos, String contrasena, String email, String dni, String direccion, String categoria) {
		super(nombre, apellidos, contrasena, email, dni, direccion);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
