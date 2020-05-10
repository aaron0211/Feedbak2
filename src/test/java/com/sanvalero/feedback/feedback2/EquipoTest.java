package com.sanvalero.feedback.feedback2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.sanvalero.feedback.model.Equipo;
import com.sanvalero.feedback.model.Jugador;

public class EquipoTest {

	Equipo espana = new Equipo("España", "Primera División", "Rojo", "Blanco");
	
	@Test
	public void comprobarNumJugador() {
		Jugador jugador1 = new Jugador("Iker","Casillas",null,null,null,null,"España",1);
		Jugador jugador2 = new Jugador("Sergio","Ramos",null,null,null,null,"España",15);
		
		assertEquals(true,espana.comprobarNumJugador(jugador1));
		assertEquals(true,espana.comprobarNumJugador(jugador2));
	}
	
	@Test
	public void cantidadJugadores() {
		assertEquals(true,espana.cantidadJugadores());
	}
}
