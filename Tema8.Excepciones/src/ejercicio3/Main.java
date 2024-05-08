package ejercicio3;

public class Main {

	public static void main(String[] args) {

		try {
			Titular t = new Titular("fe", "fdfd", null, 0);
			CuentaBancaria c = new CuentaBancaria(null, -4, null);

		} catch (NegativeSaldoException e) {
			System.err.println(e.getMessage());
		} catch (DniInvalidoException e) {
			System.err.println(e.getMessage());
		} catch (NombreInvalidoException e) {
			System.err.println(e.getMessage());
		}

	}

}
