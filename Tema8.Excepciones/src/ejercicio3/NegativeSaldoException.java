package ejercicio3;

public class NegativeSaldoException extends Exception {

	public String getMessage() {
		return "NegativeSaldoException: Saldo negativo";
	}

}
