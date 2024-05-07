package ejercicio2;

public class Hora {

	protected int hora;
	protected int minuto;

	public Hora(int hora, int minuto) {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		}
		if (minuto > 0 && minuto < 60) {
			this.minuto = minuto;
		}

	}

	public boolean setMinutos(int valor) {
		boolean res = false;

		if (valor >= 0 && valor < 60) {
			this.minuto = valor;
			res = true;
		}

		return res;
	}

	public boolean setHoras(int valor) {
		boolean res = false;

		if (valor >= 0 && valor < 24) {
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
