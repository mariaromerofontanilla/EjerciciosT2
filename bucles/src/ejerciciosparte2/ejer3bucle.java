package ejerciciosparte2;

import java.util.Scanner;

public class ejer3bucle {

	public static void main(String[] args) {
		//variable
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		num = sc.nextInt();
		
		while (num > 0) {
			if (num % 2 == 0)
				System.out.println("Par");
			else
				System.out.println("Impar");;
			num = sc.nextInt();
		}
		System.out.println("Fin");
		
		sc.close();
	}

}
