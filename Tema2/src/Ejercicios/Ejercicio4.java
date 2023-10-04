package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//variables
		int numero1;
		int numero2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		numero1 = sc.nextInt();
		
		System.out.println("Introduce un numero: ");
		numero2 = sc.nextInt();
		
		if (numero1 < numero2) {
			System.out.println(numero1  + " < " + numero2);
			
		} else if (numero1 == numero2) {
			System.out.println(numero1 + " = " + numero2);
		
		} else {
			System.out.println(numero2 + " < " + numero1);
		}
		sc.close();
	}

}
