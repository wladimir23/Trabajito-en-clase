package com.epn;

import java.util.Arrays;

public class Materia {
	
	private String nombremateria;
	private Profesor[] profesor;
	private int cod;
	private Alumno[] asistentes;
	
	public Materia() {
		super();
	}

	public Materia(String nombremateria, Profesor[] profesor, int cod,
			Alumno[] asistentes) {
		super();
		this.nombremateria = nombremateria;
		this.profesor = profesor;
		this.cod = cod;
		this.asistentes = asistentes;
	}

	public String getNombremateria() {
		return nombremateria;
	}

	public void setNombremateria(String nombremateria) {
		this.nombremateria = nombremateria;
	}

	public Profesor[] getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor[] profesor) {
		this.profesor = profesor;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public Alumno[] getAsistentes() {
		return asistentes;
	}

	public void setAsistentes(Alumno[] asistentes) {
		this.asistentes = asistentes;
	}

	@Override
	public String toString() {
		return "Materia: "+ nombremateria + "\n Profesor/es: "
				+ Arrays.toString(profesor) + "\n Codigo Materia: " + cod + "\n Asistentes: "
				+ Arrays.toString(asistentes) ;
	}
}
