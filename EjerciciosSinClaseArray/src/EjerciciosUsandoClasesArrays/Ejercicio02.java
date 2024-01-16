package EjerciciosUsandoClasesArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int tabla[] = new int[55];
		Scanner sc = new Scanner(System.in);
		int x =0;
		int y;
		for (int i = 1; i <= 10; i++) {
			y = x+i;
			Arrays.fill(tabla,x,y,i);
			x=y;
		}
		
		Arrays.fill(tabla, 0, 1, 1);
		Arrays.fill(tabla, 1, 3, 2);
		Arrays.fill(tabla, 3, 6, 3);
		Arrays.fill(tabla, 6, 10, 4);
		
		System.out.println(Arrays.toString(tabla));

	}

}
