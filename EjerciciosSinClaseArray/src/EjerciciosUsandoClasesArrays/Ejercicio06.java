package EjerciciosUsandoClasesArrays;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cuenta=0;
		
		int n;
		
		int tabla[] = new int[1000];
		
		for(int i=0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random()*100);
			
		}
		
		System.out.print("Introduce un valor: ");
		n = sc.nextInt();
		
		for(int num : tabla) {
			if (num ==n) {
				cuenta++;
			}
			
		}
		System.out.println("Hay: " + cuenta + " numeros repetidos");
	}

}
