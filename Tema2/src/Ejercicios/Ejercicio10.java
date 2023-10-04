package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//variable
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Introduzca un numero: ");
		n1 = sc.nextInt();
		
		System.out.println("Introduzca un numero: ");
		n2 = sc.nextInt();
		
		System.out.println("Introduzca un numero: ");
		n3 = sc.nextInt();
		
		if (n1 + n2 == n3) {
			System.out.println("la suma de numero1: " +n1+ " y numero2: " +n2+ " es igual a numero3:" +n3);
		} else if (n1 + n3 == n2) {
			System.out.println("la suma de numero1: " +n1+ " y numero3: " +n3+ " es igual a numero2:" +n2);
		} else if (n2 + n3 == n1) {
			System.out.println("la suma de numero2: " +n2+ " y numero3: " +n3+ " es igual a numero1:" +n1);
		} else {
			System.out.println("La suma de cualquier numero no es igual a ninguno");
		}
		
		sc.close();
	}

}
