package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HoraExacta horaConcreta;

		int hora;
		int minuto;
		int segundo;

		System.out.println("Dime la hora:");
		hora = sc.nextInt();
		System.out.println("Dime los minutos:");
		minuto = sc.nextInt();
		System.out.println("Dime los segundos:");
		segundo = sc.nextInt();

		horaConcreta = new HoraExacta(hora, minuto, segundo);

		System.out.println();
		System.out.println("Hora exacta: " + horaConcreta);
		System.out.println();

		horaConcreta.inc();
		System.out.println("*Hora despues de sumar 1 segundo*");

		System.out.println();
		System.out.println("Hora exacta: " + horaConcreta);
		System.out.println();

		sc.close();

	}

}
