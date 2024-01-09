package EjerciciosArray;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int tabla[] = new int[10];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Introduce 10 numeros enteros: ");
			tabla[i] = sc.nextInt();
		}

		System.out.println("Los numeros en orden inversos son: ");
		int j=9;
		while (j>=0) {
			System.out.println(tabla[j]);
			j--;
		}
		System.out.println();
		sc.close();
	}

}