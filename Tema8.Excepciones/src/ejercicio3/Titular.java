package ejercicio3;

public class Titular {

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
