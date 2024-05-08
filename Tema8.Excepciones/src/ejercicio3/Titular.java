package ejercicio3;

public class Titular {

	private String DNI;
	private String nombre;
	private String apellidos;
	private int telefono;

	public Titular(String DNI, String nombre, String apellidos, int telefono)
			throws DniInvalidoException, NombreInvalidoException {
		if (DNI == null || DNI.equals("")) {
			throw new DniInvalidoException();
		} else {
			this.DNI = DNI;
		}

		if (nombre == null || nombre.equals("")) {
			throw new NombreInvalidoException();
		} else {
			this.nombre = nombre;
		}

		if (apellidos != null && !apellidos.equals("")) {
			this.apellidos = apellidos;
		}

		if (telefono > 0) {
			this.telefono = telefono;
		}
	}

	@Override
	public boolean equals(Object o) {
		boolean res = false;

		Titular t = (Titular) o;

		if (this.DNI.equals(t.DNI)) {
			res = true;
		}

		return res;
	}

}
