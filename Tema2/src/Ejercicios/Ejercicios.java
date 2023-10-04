package Ejercicios;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		//variables
		int numero;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un numero: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
		sc.close();
	}
}
