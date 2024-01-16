package EjerciciosUsandoClasesArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tabla[] = new int[8];
		
		int tabla2[] = new int[8];
		
		int num;
		
		int aux;
		
		int jugador = 0;
		
		for (int i =0; i< tabla.length; i++) {
			jugador ++;
			System.out.println("Introduce las puntuaciones del jugador " + jugador + " :");
			num = sc.nextInt();
			tabla[i] = num;
		}
		
		Arrays.sort(tabla);
		
		for(int i= 0; i < tabla.length;i++) {
			aux = tabla.length -i - 1;
			tabla2[aux] = tabla[i];
		}
		
		System.out.println(Arrays.toString(tabla2));

	}

}
