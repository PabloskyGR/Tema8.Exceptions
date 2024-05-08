package ejercicio3;

public class CuentaBancaria {

	private String numCuenta;
	private double saldo;
	private Titular[] titulares;

	public CuentaBancaria(String numCuenta, double saldo, Titular[] titulares) throws NegativeSaldoException {
		if (numCuenta != null && !numCuenta.equals("")) {
			this.numCuenta = numCuenta;
		}

		if (saldo < 0) {
			throw new NegativeSaldoException();
		} else {
			this.saldo = saldo;
		}
		this.titulares = titulares;
	}

	public boolean ingresar(double cantidad) {
		boolean res = false;

		if (cantidad > 0) {
			this.saldo += cantidad;
			res = true;
		}

		return res;
	}

	public boolean retirar(double cantidad) {
		boolean res = false;

		if (saldo >= cantidad) {
			this.saldo -= cantidad;
		}

		return res;
	}

	public boolean addTitular(Titular t) {
		boolean res = false;

		for (int i = 0; i < titulares.length; i++) {
			if (titulares[i] == null) {
				titulares[i] = t;
				res = true;
			}
		}
		return res;
	}

	public boolean borraTitular(Titular t) {
		boolean res = false;

		for (int i = 0; i < titulares.length; i++) {
			if (titulares[i] != null && titulares[i].equals(t)) {
				titulares[i] = null;
				res = true;
			}
		}
		return res;
	}

}
