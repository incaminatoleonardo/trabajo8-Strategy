package tp8.ejercicio1.modelo;

public class ColectivosSur implements FormaEnvio {

	private double costo;

	public ColectivosSur(double costo) {

		this.costo = costo;
	}

	@Override
	public double costo() {

		return this.costo;
	}

}
