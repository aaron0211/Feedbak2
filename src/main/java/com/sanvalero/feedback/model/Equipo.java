package com.sanvalero.feedback.model;

public class Equipo {
	private String nombre;
	private String categoria;
	private String equipacion1;
	private String equipacion2;
	
	public Equipo(String nombre, String categoria, String equipacion1, String equipacion2) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.equipacion1 = equipacion1;
		this.equipacion2 = equipacion2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getEquipacion1() {
		return equipacion1;
	}

	public void setEquipacion1(String equipacion1) {
		this.equipacion1 = equipacion1;
	}

	public String getEquipacion2() {
		return equipacion2;
	}

	public void setEquipacion2(String equipacion2) {
		this.equipacion2 = equipacion2;
	}
}
