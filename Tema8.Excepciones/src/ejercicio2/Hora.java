package ejercicio2;

public class Hora {

	protected int hora;
	protected int minuto;

	public Hora() {

	}

	public Hora(int hora, int minuto) throws NegativeHourException, NegativeMinuteException {
		if (hora < 0) {
			throw new NegativeHourException();
		} else if (hora > 24) {
			System.err.println("Error: Hora fuera de rango");
		} else {
			this.hora = hora;
		}

		if (minuto < 0) {
			throw new NegativeMinuteException();
		} else if (minuto > 60) {
			System.err.println("Error: Minutos fuera de rango");
		} else {
			this.minuto = minuto;
		}

	}

	public boolean setMinutos(int valor) throws NegativeMinuteException {
		boolean res = false;

		if (minuto < 0) {
			throw new NegativeMinuteException();
		} else if (minuto > 60) {
			System.err.println("Error: Minutos fuera de rango");
		} else {
			this.minuto = valor;
			res = true;
		}

		return res;

	}

	public boolean setHoras(int valor) throws NegativeHourException {
		boolean res = false;

		if (hora < 0) {
			throw new NegativeHourException();
		} else if (hora > 24) {
			System.err.println("Error: Hora fuera de rango");
		} else {
			this.hora = valor;
			res = true;
		}

		return res;
	}

	@Override
	public String toString() {
		String res = "";

		if (hora < 10) {
			res += "0" + this.hora;
			if (minuto < 10) {
				res += ":0" + this.minuto;
			} else {
				res += ":" + this.minuto;
			}
		} else {
			res += this.hora;
			if (minuto < 10) {
				res += ":0" + this.minuto;
			} else {
				res += ":" + this.minuto;
			}
		}

		return res;
	}

}
