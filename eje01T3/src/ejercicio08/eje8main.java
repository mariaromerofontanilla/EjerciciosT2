package ejercicio08;

import java.util.Scanner;

public class eje8main {

	public static void main(String[] args) {
		int num;
		int divisores;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		divisores = eje8class.CunetaDivisores(num);
		
		System.out.println("Numero de divisores: " + divisores);
		
		sc.close();

	}

}