package ejercicio2;

public class NegativeSecondException extends Exception {

	@Override
	public String getMessage() {

		return "NegativeSecondException: Los segundos son negativos";
	}

}
