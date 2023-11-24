package ejercicio02;

import java.util.Scanner;

public class ejer02main {

	public static void main(String[] args) {
		int n1, n2;
		int resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca dos numeros: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		resultado = ejer02class.numerosComprendidos(n1, n2);
		
		sc.close();
	}

}
