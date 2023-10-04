package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//variables
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		numero = sc.nextInt();
		
		if (numero >= 0 && numero <=9) {
			System.out.println("Tu numero " + numero + " tiene una cifra" );
			
		} else if (numero >=10 && numero <=99) {
			System.out.println("Tu numero " + numero + " tiene dos cifra" );
			
		} else if (numero >= 100 && numero <= 999) {
			System.out.println("Tu numero " + numero + " tiene tres cifra");
			
		} else if (numero >= 1000 && numero <= 9999) {
			System.out.println("Tu numero " + numero + " tiene cuatro cifra");
			
		} else if (numero >= 10000 && numero <= 99999) {
			System.out.println("Tu numero " + numero + " tiene cinco cifra");
		} else {
			System.out.println("el numero no esta registrado");
		}
			
		
		sc.close();
	}

}
