package Ejercicios;

import java.util.Scanner;


public class Ejercicio3 {

	public static void main(String[] args) {
		//variable
		double numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		numero = sc.nextDouble();
		
		if (numero > -1 && numero < 1 ){
			System.out.println("Es un casi 0");
		} else if (numero == 0){
			System.out.println("No es casi 0");
		} else {
			System.out.println("No es casi 0");
		}
		sc.close();

	}

}
