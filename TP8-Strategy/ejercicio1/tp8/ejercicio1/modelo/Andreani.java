package tp8.ejercicio1.modelo;

public class Andreani implements FormaEnvio {

	private double costo;

	public Andreani(double costo) {

		this.costo = costo;
	}

	@Override
	public double costo() {

		return this.costo;
	}

}
