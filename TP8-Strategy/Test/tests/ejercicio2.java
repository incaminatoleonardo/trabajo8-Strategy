package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import tp8.ejercicio2.modelo.FechaNacimiento;
import tp8.ejercicio2.modelo.FormatoCorto;
import tp8.ejercicio2.modelo.FormatoLargo;
import tp8.ejercicio2.modelo.Persona;

class ejercicio2 {

	@Test
	void testFormatoCorto() {
		// SET UP
		FechaNacimiento fechaNacPablo = new FormatoCorto(LocalDate.of(1993, 10, 1));

		Persona pablo = new Persona("Pablo", fechaNacPablo);

		String resultadoEsperado = "1/10/93";

		// EXERCISE
		String resultado = pablo.fechaNacimiento();

		// VERIFY
		assertEquals(resultadoEsperado, resultado);

	}

	@Test
	void testFormatoLargo() {
		// SET UP
		FechaNacimiento fechaNacAna = new FormatoLargo(LocalDate.of(1992, 6, 12));

		Persona ana = new Persona("Ana", fechaNacAna);

		String resultadoEsperado = "viernes, 12 de junio de 1992";

		// EXERCISE
		String resultado = ana.fechaNacimiento();

		// VERIFY
		assertEquals(resultadoEsperado, resultado);

	}

}
