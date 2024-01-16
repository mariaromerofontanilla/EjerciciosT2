package EjerciciosUsandoClasesArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tabla1[] = new int[10];
		
		int tabla2[] = new int[10];
		
		int num;
		
		for (int i =0; i < tabla1.length; i++) {
			System.out.print("Introduce 10 numeros enteros: ");
			num = sc.nextInt();
			tabla1[i] = num;
		}
		
		for (int i =0; i < tabla2.length; i++) {
			System.out.print("Introduce 10 numeros enteros: ");
			num = sc.nextInt();
			tabla2[i] = num;
		}
		
		System.out.println();
		
		if (Arrays.equals(tabla1, tabla2)) {
			System.out.println("Los numeros de las tablas son iguales");
		} else {
			System.out.println("Los numeros de la tabla no son iguales");
		}
		
		// System.out.println(Arrays.toString(tabla1));
		// System.out.println(Arrays.toString(tabla2));

	}

}
