package tp8.ejercicio1.modelo;

public class OCA implements FormaEnvio {

	private double costo;

	public OCA(double costo) {

		this.costo = costo;
	}

	@Override
	public double costo() {

		return this.costo;
	}

}
