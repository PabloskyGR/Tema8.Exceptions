package ejercicio2;

public class HoraExacta extends Hora {

	private int segundo;

	public HoraExacta() {

	}

	public HoraExacta(int hora, int minuto, int segundo)
			throws NegativeHourException, NegativeMinuteException, NegativeSecondException {

		super(hora, minuto);

		if (segundo < 0) {
			throw new NegativeSecondException();
		} else if (segundo > 60) {
			System.err.println("Error: Segundos fuera de rango");
		} else {
			this.segundo = segundo;
		}
	}

	public boolean setSegundos(int valor) throws NegativeSecondException {
		boolean res = false;

		if (segundo < 0) {
			throw new NegativeSecondException();
		} else if (segundo > 60) {
			System.err.println("Error: Segundos fuera de rango");
		} else {
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
