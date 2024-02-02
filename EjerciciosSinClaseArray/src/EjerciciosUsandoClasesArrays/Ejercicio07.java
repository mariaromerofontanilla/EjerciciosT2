package EjerciciosUsandoClasesArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		int ganadora[] = {8,45,24,3,6,49};
		
		int apuesta[] = new int[6];
		
		int cuenta = 0;
		
		//int num;
		
		for(int i=0; i < apuesta.length; i++) {
			apuesta[i] = r.nextInt(1,50);		
		}
		Arrays.sort(apuesta);
		Arrays.sort(ganadora);
		System.out.println(Arrays.toString(apuesta));
		System.out.println(Arrays.toString(ganadora));
		
		System.out.println();
		
		if(apuesta == ganadora) {
			System.out.println("Combinación perfecta");
		} else {
			System.out.println("Convinación erronea");
		}
		
		for(int i = 0; i < apuesta.length;i++) {
			int indice = Arrays.binarySearch(ganadora, apuesta[i]);
			
			if (indice >= 0) {
				cuenta++;
			}
		}
		System.out.println("Acertatste un total de " + cuenta + " numeros");
		
	}

}
