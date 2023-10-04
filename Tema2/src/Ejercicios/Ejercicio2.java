package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
	//variables
	int numero1;
	int numero2;
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Introduce un numero: ");
	numero1 = sc.nextInt();
	
	System.out.println("Introduzca un numero: ");
	numero2 =sc.nextInt();
	
	if (numero1 == numero2) {
		System.out.println("Los numeros son iguales");
	
	} else {
		System.out.println("Los numeros no son iguales");
		}
	sc.close();
	}
}
