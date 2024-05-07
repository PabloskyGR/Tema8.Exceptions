package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {

	public static double readDouble(Scanner sc) {
		double res = 0;

		try {
			res = sc.nextDouble();

		} catch (InputMismatchException e) {
			System.err.println("El valor no es de tipo Double");
		}

		return res;
	}

	public static int readInt(Scanner sc) {
		int res = 0;

		try {
			res = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("El valor introducido no es de tipo Int");
		}

		return res;
	}

}
