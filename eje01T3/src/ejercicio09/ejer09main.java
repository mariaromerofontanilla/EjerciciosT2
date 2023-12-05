package ejercicio09;

import java.util.Scanner;

public class ejer09main {

	public static void main(String[] args) {
		// variable
		int num1, num2;
		int opcion;
		int resultado;
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Introduzca dos numero: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		
		System.out.println("Eliga una opción: ");
		
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		opcion = sc.nextInt();
		
		resultado = ejer09class.calculadora(num1, num2, opcion);
		System.out.println(resultado);
		
		sc.close();
	
	}

}
