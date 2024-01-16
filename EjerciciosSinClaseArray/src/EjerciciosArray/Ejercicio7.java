package EjerciciosArray;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final String MESES[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiempre", "Octuble", "Noviembre", "Diciembre"};
		int temperatura[] = new int[MESES.length];
		
		for (int i = 0; i < temperatura.length; i++) {
			System.out.print("Introduce temperatura para cada mes de " + MESES[i] + ": ");
			temperatura[i] = sc.nextInt();
		}

		for (int i = 0; i < MESES.length; i++) {
			System.out.print(MESES[i] + "    \t");
			for (int j=1;j<= temperatura[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
