package ejercicio3;

public class CuentaAhorro extends CuentaBancaria {
	private double mantenimiento;
	private double interes;

	public CuentaAhorro(String numCuenta, double saldo, Titular[] titulares, double mantenimiento, double interes) {
		super(numCuenta, saldo, titulares);
		this.mantenimiento = mantenimiento;
		this.interes = interes;
	}

	public void aplicaInteres() {
		
	}

	public void aplicaMantenimiento() {
		
	}
}
