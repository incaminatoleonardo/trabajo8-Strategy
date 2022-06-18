package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import tp8.ejercicio1.modelo.Andreani;
import tp8.ejercicio1.modelo.Carrito;
import tp8.ejercicio1.modelo.FormaEnvio;
import tp8.ejercicio1.modelo.OCA;
import tp8.ejercicio1.modelo.Producto;
import tp8.ejercicio1.modelo.Sistema;

class ejercicio1 {

	@Test
	void testOCA() {

		// SET UP
		Producto leche = new Producto("Leche", 10);
		Producto huevos = new Producto("Huevos", 20);
		Producto carne = new Producto("Carne", 50);
		Producto pollo = new Producto("Pollo", 35);
		Producto manteca = new Producto("Manteca", 10);

		Carrito carro = new Carrito(new ArrayList<Producto>());
		carro.añadirProducto(manteca);
		carro.añadirProducto(pollo);
		carro.añadirProducto(carne);
		carro.añadirProducto(huevos);
		carro.añadirProducto(leche);

		FormaEnvio oca = new OCA(5);

		Sistema compra = new Sistema(oca, carro);

		double resultadoEsperado = 130;

		// EXERCISE
		double resultado = compra.calcularCosto();

		// VERIFY
		assertEquals(resultadoEsperado, resultado, 0.01);

	}

	@Test
	void testAndreani() {
		// SET UP
		Producto leche = new Producto("Leche", 10);
		Producto huevos = new Producto("Huevos", 20);
		Producto carne = new Producto("Carne", 50);
		Producto pollo = new Producto("Pollo", 35);
		Producto manteca = new Producto("Manteca", 10);

		Carrito carro = new Carrito(new ArrayList<Producto>());
		carro.añadirProducto(manteca);
		carro.añadirProducto(pollo);
		carro.añadirProducto(carne);
		carro.añadirProducto(huevos);
		carro.añadirProducto(leche);

		FormaEnvio andreani = new Andreani(7);

		Sistema compra = new Sistema(andreani, carro);

		double resultadoEsperado = 132;

		// EXERCISE
		double resultado = compra.calcularCosto();

		// VERIFY
		assertEquals(resultadoEsperado, resultado, 0.01);
	}

}
