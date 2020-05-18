package com.sanvalero.feedback.model;

import java.util.*;

public class Campeonato {
	private String nombre;
	private String categoria;
	private int n_equipos;
	
	private List<Partido> partidos;
	private List<Equipo> equipos;
	
	public Campeonato(String nombre, String categoria, int n_equipos) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.n_equipos = n_equipos;
		
		partidos = new ArrayList<>();
		equipos = new ArrayList<>();
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

	public int getN_equipos() {
		return n_equipos;
	}

	public void setN_equipos(int n_equipos) {
		this.n_equipos = n_equipos;
	}
}
