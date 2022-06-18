package tp8.ejercicio1.main;

import java.util.ArrayList;

import tp8.ejercicio1.modelo.Andreani;
import tp8.ejercicio1.modelo.Carrito;
import tp8.ejercicio1.modelo.FormaEnvio;
import tp8.ejercicio1.modelo.OCA;
import tp8.ejercicio1.modelo.Producto;
import tp8.ejercicio1.modelo.Sistema;

public class Main {

	public static void main(String[] args) {

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
		FormaEnvio oca = new OCA(5);

		Sistema compra = new Sistema(oca, carro);
		double costo = compra.calcularCosto();
		System.out.println(costo);

	}

}
