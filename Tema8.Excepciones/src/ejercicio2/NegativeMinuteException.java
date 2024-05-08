package ejercicio2;

public class NegativeMinuteException extends Exception {

	@Override
	public String getMessage() {

		return "NegativeMinuteException: Los minutos son negativos";

	}

}
