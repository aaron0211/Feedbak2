package com.sanvalero.feedback.model;

public class DetallePartido {
	private String resultado;
	private String incidencias;
	
	public DetallePartido(String resultado, String incidencias) {
		super();
		this.resultado = resultado;
		this.incidencias = incidencias;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getIncidencias() {
		return incidencias;
	}

	public void setIncidencias(String incidencias) {
		this.incidencias = incidencias;
	}
}
