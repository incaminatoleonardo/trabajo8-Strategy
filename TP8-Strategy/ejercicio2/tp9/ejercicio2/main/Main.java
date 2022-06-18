package tp9.ejercicio2.main;

import java.time.LocalDate;

import tp8.ejercicio2.modelo.FechaNacimiento;
import tp8.ejercicio2.modelo.FormatoCorto;
import tp8.ejercicio2.modelo.FormatoLargo;
import tp8.ejercicio2.modelo.Persona;

public class Main {

	public static void main(String[] args) {

		FechaNacimiento fechaNacPablo = new FormatoCorto(LocalDate.of(1993, 10, 1));
		FechaNacimiento fechaNacAna = new FormatoLargo(LocalDate.of(1992, 6, 12));

		Persona pablo = new Persona("Pablo", fechaNacPablo);
		Persona ana = new Persona("Ana", fechaNacAna);

		System.out.println(pablo.fechaNacimiento());
		System.out.println(ana.fechaNacimiento());

	}

}
