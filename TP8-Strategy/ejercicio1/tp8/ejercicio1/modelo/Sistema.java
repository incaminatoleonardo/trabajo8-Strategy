package tp8.ejercicio1.modelo;

public class Sistema {

	private FormaEnvio envio;
	private Carrito carro;

	public Sistema(FormaEnvio envio, Carrito carro) {

		this.envio = envio;
		this.carro = carro;
	}

	public double calcularCosto() {
		return envio.costo() + carro.costo();
	}

}
