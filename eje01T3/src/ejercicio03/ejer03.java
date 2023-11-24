package ejercicio03;

import java.util.Scanner;

public class ejer03 {

	public static void main(String[] args) {
		int n1, n2;
		int resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca dos numero: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		resultado = ejer03class.numeroMax(n1, n2);

	}

}
