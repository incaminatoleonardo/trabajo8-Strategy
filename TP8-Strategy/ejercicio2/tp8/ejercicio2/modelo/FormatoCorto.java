package tp8.ejercicio2.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatoCorto implements FechaNacimiento {

	private LocalDate fecha;

	public FormatoCorto(LocalDate fecha) {

		this.fecha = fecha;
	}

	@Override
	public String fecha() {

		return DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(this.fecha);
	}

}
