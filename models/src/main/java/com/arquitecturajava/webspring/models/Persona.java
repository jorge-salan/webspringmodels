package com.arquitecturajava.webspring.models;

public class Persona {

	private String nombre;
	private int edad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Persona() {
		super();
	}
	
	public boolean esMayorDeEdad() {
		return edad >= 18;
	}
}
