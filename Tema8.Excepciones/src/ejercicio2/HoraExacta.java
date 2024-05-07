package ejercicio2;

public class HoraExacta extends Hora {

	private int segundo;

	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		if (segundo >= 0 && segundo < 60) {
			this.segundo = segundo;
		}
	}

	public boolean setSegundos(int valor) {
		boolean res = false;

		if (valor >= 0 && valor < 60) {
			this.segundo = valor;
			res = true;
		}

		return res;
	}

	public void inc() {
		segundo++;
		if (segundo > 59) {
			segundo = 0;
			minuto++;
			if (minuto > 59) {
				minuto = 0;
				hora++;
				if (hora > 23) {
					hora = 0;
				}
			}
		}
	}

	@Override
	public String toString() {
		String res = "";

		if (segundo < 10) {
			res += super.toString() + ":0" + this.segundo;
		} else {
			res += super.toString() + ":" + this.segundo;
		}

		return res;
	}

}
