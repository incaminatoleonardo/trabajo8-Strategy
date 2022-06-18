package tp8.ejercicio1.modelo;

import java.util.List;

public class Carrito {

	private List<Producto> productos;

	public Carrito(List<Producto> productos) {

		this.productos = productos;
	}

	public void añadirProducto(Producto producto) {
		productos.add(producto);
	}

	public double costo() {
		double costo = 0;
		for (Producto producto : productos) {
			costo = costo + producto.costo();
		}
		return costo;
	}

}
