package ejerciciosparte2;

import java.util.Scanner;

public class ejer5bucle {

	public static void main(String[] args) {
		//variable
		int num;
		int contador = 0;
		int suma = 0;
		int contador0 = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca numeros: ");
		num = sc.nextInt();
		
		while (num == 0) {
			contador++;
			if (contador == 10) {
				System.out.println(suma += num);
			}else {
				System.out.println("No puedes introducir mas de 10 numeros");
				
			}
		}

	}

}
