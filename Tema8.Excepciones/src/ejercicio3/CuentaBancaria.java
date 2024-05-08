package ejercicio3;

public class CuentaBancaria {
	private String numCuenta;
	private double saldo;
	private Titular[] titulares;

	public CuentaBancaria(String numCuenta, double saldo, Titular[] titulares) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.titulares = titulares;
	}

	public boolean ingresar(double cantidad) {
		saldo += cantidad;
		return true; // Assuming successful operation
	}

	public boolean retirar(double cantidad) {
		if (cantidad > saldo) {
			return false; // Insufficient funds
		}
		saldo -= cantidad;
		return true; // Successful operation
	}

	public boolean addTitular(Titular t) {
		for (int i = 0; i < titulares.length; i++) {
			if (titulares[i] == null) {
				titulares[i] = t;
				return true; // Successfully added
			}
		}
		return false; // No space available
	}

	public boolean borraTitular(Titular t) {
		for (int i = 0; i < titulares.length; i++) {
			if (titulares[i] != null && titulares[i].equals(t)) {
				titulares[i] = null;
				return true; // Successfully removed
			}
		}
		return false; // Titular not found
	}

}
