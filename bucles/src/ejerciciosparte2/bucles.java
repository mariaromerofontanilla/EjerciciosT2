package ejerciciosparte2;

import java.util.Scanner;

public class bucles {

	public static void main(String[] args) {
		//variables
		int suma = 0;
		int numero;
		//
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		numero = sc.nextInt();
		
		while (numero >= 0) {
			suma += numero; // suma = suma + numero
			System.out.println("Continua introduciendo un numero positivo");
			numero = sc.nextInt();
		}
		System.out.println("Fin");
		System.out.println(suma);
		
		sc.close();
	}

}
