package EjerciciosArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		ArrayList<Integer> pares = new ArrayList<>();
	    ArrayList<Integer> inpares = new ArrayList<>();
	    int tabla[] = new int[8];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Introduce 8 numeros enteros: ");
			tabla[i] = sc.nextInt();
			if (tabla[i] % 2 == 0) {
	            pares.add(tabla[i]);
	        } else {
	            inpares.add(tabla[i]);
	        }
	    }
	    System.out.println("Los numeros pares son: ");
	    for(Integer n : pares){ 
	    	System.out.print(n); 
	    }
	    System.out.println();
	    System.out.println("Los numeros inpares pares son: ");
	    for(Integer n : inpares){ 
	    	System.out.print(n); 
	    }
	}

}
