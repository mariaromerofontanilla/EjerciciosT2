package EjerciciosUsandoClasesArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		
		System.out.println("Introduce el numero de filas: ");
		n = sc.nextInt();
		
		System.out.println("Introduce la longitud de array: ");
		m = sc.nextInt();
		
		int[] tabla = new int[n];
		Arrays.fill(tabla,0,n,m);
		
		System.out.println(Arrays.toString(tabla));
		

	}

}
