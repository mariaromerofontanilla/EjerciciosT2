package EjerciciosUsandoClasesArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tabla[] = new int[30];
		
		for(int i=0; i< tabla.length;i++) {
			tabla[i] = (int) (Math.random()*10);
		}
		
		Arrays.sort(tabla);
		
		System.out.println(Arrays.toString(tabla));
		

	}

}
