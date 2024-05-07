package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double valorDouble;

		int valorInt;

		System.out.println("Dime un número entero:");
		valorInt = Utils.readInt(sc);
		sc.nextLine();
		System.out.println(valorInt);

		System.out.println("Dime un número double:");
		valorDouble = Utils.readDouble(sc);
		System.out.println(valorDouble);

	}

}
