package ejemplo;

public class Persona {

	private String nombre = "";
	private int edad = 0;
	private double altura = 0;

	public Persona(String nombre, int edad, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	public void setEdad(int edad) throws EdadNegativaException {
		if (edad > 0) {
			this.edad = edad;
		} else {
			throw new EdadNegativaException();
		}
	}

}
