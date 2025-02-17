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

	
	@Test
	void mayorDeEdadtest2() {
		// Arrange, Act, Assert

		// Arrange
		Persona p = new Persona("Ana", 30);

		// Act
		boolean esMayorDeEdad = p.esMayorDeEdad();

		// Assert
		assertTrue(esMayorDeEdad);
	}
	
	
	@Test
	void mayorDeEdadtest3() {
		// Arrange, Act, Assert

		// Arrange
		Persona p = new Persona("Juan", 25);

		// Act
		boolean esMayorDeEdad = p.esMayorDeEdad();

		// Assert
		assertTrue(esMayorDeEdad);
	}
	
	
	@Test
	void mayorDeEdadtest4() {
		// Arrange, Act, Assert

		// Arrange
		Persona p = new Persona("Rosa", 80);

		// Act
		boolean esMayorDeEdad = p.esMayorDeEdad();

		// Assert
		assertTrue(esMayorDeEdad);
	}
	
}
