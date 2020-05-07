package com.sanvalero.feedback.model;

public class Usuario {
	private String nombre;
	private String apellidos;
	private String contrasena;
	private String email;
	private String dni;
	private String direccion;
	
	public Usuario(String nombre, String apellidos, String contrasena, String email, String dni, String direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.contrasena = contrasena;
		this.email = email;
		this.dni = dni;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
