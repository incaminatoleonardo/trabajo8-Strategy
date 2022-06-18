package tp8.ejercicio1.modelo;

public class ViaCargo implements FormaEnvio {

	private double costo;

	public ViaCargo(double costo) {

		this.costo = costo;
	}

	@Override
	public double costo() {

		return this.costo;
	}

}
