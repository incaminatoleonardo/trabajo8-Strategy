package tp8.ejercicio1.modelo;

public class CorreoArgentino implements FormaEnvio {

	private double costo;

	public CorreoArgentino(double costo) {

		this.costo = costo;
	}

	@Override
	public double costo() {

		return this.costo;
	}
}
