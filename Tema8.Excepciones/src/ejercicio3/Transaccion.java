package ejercicio3;

public class Transaccion {

	enum TipoMovimiento {
		BIZUM, RECIBOS, TRANSFERENCIAS, IMPUESTOS
	}

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
