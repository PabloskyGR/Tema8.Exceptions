package ejemplo;

public class FFfffFF {

import java.util.ArrayList;
import java.util.List;

// Enum for transaction types
enum TipoMovimiento {
	BIZUM, RECIBOS, TRANSFERENCIAS, IMPUESTOS
}

// Transaction class
class Transaccion {
	private double porcentaje;
	private int dia;
	private int mes;
	private int anyo;
	private String concepto;
	private double importe;
	private TipoMovimiento tipo;

	public Transaccion(double porcentaje, int dia, int mes, int anyo, String concepto, double importe,
			TipoMovimiento tipo) {
		this.porcentaje = porcentaje;
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
		this.concepto = concepto;
		this.importe = importe;
		this.tipo = tipo;
	}
}

// Account Holder class
class Titular {
	private String DNI;
	private String nombre;
	private String apellidos;
	private String telefono;

	public Titular(String DNI, String nombre, String apellidos, String telefono) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Titular titular = (Titular) o;
		return DNI.equals(titular.DNI);
	}
}

// Bank Account class
class CuentaBancaria {
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

// Savings Account class
class CuentaAhorro extends CuentaBancaria {
	private double mantenimiento;
	private double interes;

	public CuentaAhorro(String numCuenta, double saldo, Titular[] titulares, double mantenimiento, double interes) {
		super(numCuenta, saldo, titulares);
		this.mantenimiento = mantenimiento;
		this.interes = interes;
	}

	public void aplicaInteres() {
		// Implement logic to apply interest
	}

	public void aplicaMantenimiento() {
		// Implement logic to apply maintenance fee
	}
}

// Checking Account class
class CuentaCorriente extends CuentaBancaria {
	private List<Transaccion> transacciones;

	public CuentaCorriente(String numCuenta, double saldo, Titular[] titulares) {
		super(numCuenta, saldo, titulares);
		this.transacciones = new ArrayList<>();
	}
}

}
