package com.epn;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		
		Object opc = JOptionPane.showInputDialog(null,"Seleccione un parametro",
				   "PARÁMETROS", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Seleccione","Materia", "Alumno", "Profesor" },"Seleccione");

		Materia materias= new Materia();
		String opcion= (String) opc;
		if(opcion.equals("Materia")){
			
				materias= llenarMateriasDisc();
				JOptionPane.showMessageDialog(null, materias);		
		}
	}
		public static Profesor[] llenarProfesorIndic(String m){
				
			Profesor profesores2[]= new Profesor[4];
			if(m.equals("Estructuras")){
			Profesor profesores[]= new Profesor[1];
			profesores[0]= new Profesor();
			profesores[0].setId(11);
			profesores[0].setNombre("Carlos");
			profesores2=profesores;
			}
			else if(m.equals("Fisica")){
				Profesor profesores[]= new Profesor[2];
			profesores[0]= new Profesor();
			profesores[0].setId(12);
			profesores[0].setNombre("David");
			
			profesores[1]= new Profesor();
			profesores[1].setId(13);
			profesores[1].setNombre("Luis");
			profesores2=profesores;
			}
			else if (m.equals("Calculo")){
				Profesor profesores[]= new Profesor[1];
			profesores[0]= new Profesor();
			profesores[0].setId(12);
			profesores[0].setNombre("Pablo");
			profesores2=profesores;
			}
			
			return profesores2;
		}
		
		public static Alumno[] llenarAlumno(String m){
			
			Alumno alumnos[]= new Alumno[4];
			alumnos[0]= new Alumno();
			alumnos[0].setId(21);
			alumnos[0].setNombre("Andrea");
			
			alumnos[1]= new Alumno();
			alumnos[1].setId(22);
			alumnos[1].setNombre("Jorge");
			
			alumnos[2]= new Alumno();
			alumnos[2].setId(23);
			alumnos[2].setNombre("Richard");
			
			alumnos[3]= new Alumno();
			alumnos[3].setId(24);
			alumnos[3].setNombre("Andrés");
			
			
			if(m.equals("Calculo")){
				Alumno aux[]= new Alumno[2];
				aux[0]=alumnos[0];
				aux[1]=alumnos[1];
				return aux;
			}
			
			else if(m.equals("Fisica")){
				Alumno aux[]= new Alumno[3];
				aux[0]=alumnos[0];
				aux[1]=alumnos[1];
				aux[2]=alumnos[2];
				return aux;
			}
			else{
			
			return alumnos;
			}
			
		}
		
		public static Materia llenarMateriasDisc(){
			
			Materia materia = new Materia();
			Object opc = JOptionPane.showInputDialog(null,"Seleccione una materia",
					   "MATERIA", JOptionPane.QUESTION_MESSAGE, null,
					  new Object[] { "Seleccione","Fisica", "Estructuras", "Calculo" },"Seleccione");
			String nombre= (String) opc;
			materia.setNombremateria(nombre);
			materia.setProfesor(llenarProfesorIndic(materia.getNombremateria()));
			materia.setCod(31);
			materia.setAsistentes(llenarAlumno(materia.getNombremateria()));
			
			return materia;
		}
		public static Profesor[] llenarProfesorTotal(String m){
			
			Profesor profesores[]= new Profesor[4];
			profesores[0]= new Profesor();
			profesores[0].setId(11);
			profesores[0].setNombre("Carlos");
			
			profesores[1]= new Profesor();
			profesores[1].setId(12);
			profesores[1].setNombre("David");
			
			profesores[2]= new Profesor();
			profesores[2].setId(13);
			profesores[2].setNombre("Luis");
			
			profesores[3]= new Profesor();
			profesores[3].setId(12);
			profesores[3].setNombre("Pablo");
			
			return profesores;
			
		}
}
