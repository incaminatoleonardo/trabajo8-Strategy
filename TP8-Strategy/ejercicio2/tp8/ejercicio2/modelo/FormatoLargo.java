package tp8.ejercicio2.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatoLargo implements FechaNacimiento {

	private LocalDate fecha;

	public FormatoLargo(LocalDate fecha) {

		this.fecha = fecha;
	}

	@Override
	public String fecha() {

		return DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(this.fecha);
	}

}
