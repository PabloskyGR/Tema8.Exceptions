package ejercicio2;

public class NegativeHourException extends Exception {

	@Override
	public String getMessage() {

		return "NegativeHourException: La hora no puede ser negativa";

	}

}
