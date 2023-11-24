package ejercicio08;

import java.util.Scanner;

public class ejer08main {

	public static void main(String[] args) {
		int num;
		boolean primo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		primo = ejer08class.numerosPrimos(num);
		
		if(primo) {
			System.out.println("El numero es primo");
		} else {
			System.out.println("El numero no es primo");
		}
		
		sc.close();

	}

}
