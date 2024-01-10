package EjerciciosArray;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int tabla[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		int suma=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Introduce 10 numeros enteros: ");
			tabla[i] = sc.nextInt();
		}
		
		for(int i= 0; i < tabla.length;i++) {
			suma = suma + tabla[i];
		}
		for(int i= 0; i < tabla.length;i++) {
			if (max < tabla[i]) {
				max = tabla[i];
			}
			if (min > tabla[i]) {
				min = tabla[i];
			}
		}
		System.out.println("El maximo es: " + max);
		System.out.println("El minimo es: " + min);
		System.out.println("La suma de los numeros es: " + suma);
		
		sc.close();
	}

}
