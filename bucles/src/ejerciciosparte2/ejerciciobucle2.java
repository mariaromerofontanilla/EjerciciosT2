package ejerciciosparte2;

import java.util.Scanner;

public class ejerciciobucle2 {

	public static void main(String[] args) {
		//variable
		int numero;
		int valor = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca numero: ");
		numero = sc.nextInt();
		
		while (numero >= 0) {
			System.out.println(numero);
			numero = sc.nextInt();
			valor++;
		}
		System.out.println("Fin");
		System.out.println(valor);
		sc.close();
	}

}
