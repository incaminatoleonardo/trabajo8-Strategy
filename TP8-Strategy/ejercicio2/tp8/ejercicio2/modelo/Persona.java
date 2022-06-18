package tp8.ejercicio2.modelo;

public class Persona {

	private String nombre;
	private FechaNacimiento fechaNac;

	public Persona(String nombre, FechaNacimiento fechaNac) {

		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	public String fechaNacimiento() {
		return fechaNac.fecha();
	}

}
