package com.arquitecturajava.webspring.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.webspring.models.Persona;

class PersonaTest {

	@Test
	void mayorDeEdadtest() {
		// Arrange, Act, Assert

		// Arrange
		Persona p = new Persona("Pepe", 20);

		// Act
		boolean esMayorDeEdad = p.esMayorDeEdad();

		// Assert
		assertTrue(esMayorDeEdad);
	}

}
