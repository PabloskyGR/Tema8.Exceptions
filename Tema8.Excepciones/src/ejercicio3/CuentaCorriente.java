package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class CuentaCorriente extends CuentaBancaria {
	private List<Transaccion> transacciones;

	public CuentaCorriente(String numCuenta, double saldo, Titular[] titulares) {
		super(numCuenta, saldo, titulares);
		this.transacciones = new ArrayList<>();
	}
}
