package com.sanvalero.feedback.model;

import java.time.LocalDate;
import java.util.*;

public class Partido {
	private String equipo1;
	private String equipo2;
	private LocalDate fecha;
	private String campo;
	private String arbitro;
	
	private List<DetallePartido> detalles;
	
	public Partido(String equipo1, String equipo2, LocalDate fecha, String campo, String arbitro) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.fecha = fecha;
		this.campo = campo;
		this.arbitro = arbitro;
		
		detalles = new ArrayList<>();
	}

	public String getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}

	public String getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getArbitro() {
		return arbitro;
	}

	public void setArbitro(String arbitro) {
		this.arbitro = arbitro;
	}
}
