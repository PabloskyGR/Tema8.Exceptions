package ejemplo;

public class Main {

	public static void main(String[] args) {

		Persona p = new Persona("pablo", 20, 2);

		try {
			p.setEdad(-5);

		} catch (EdadNegativaException e) {
			System.err.println(e);
		}

	}

}
