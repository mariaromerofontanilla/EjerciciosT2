package EjerciciosArray;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		double tabla[] = new double[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Introduce 5 numeros decimales: ");
			tabla[i] = sc.nextDouble();
		}

		for (int i = 0; i < tabla.length; i++) {
			System.out.println(tabla[i]);
		}

		System.out.println();
		sc.close();
	}

}
