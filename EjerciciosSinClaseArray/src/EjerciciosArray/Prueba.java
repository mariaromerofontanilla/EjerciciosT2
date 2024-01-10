package EjerciciosArray;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		int num;
		int aux;
		int calculo=0;
		String numero;
		int pares = 0;
		int impares = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una secuencia de numeros: ");
		num = sc.nextInt();
		aux = num;
		
		numero = String.valueOf(num);
		
		for (int i = 0; i < num; i++) {
			System.out.println(num);
		}
		
	}

}
