package EjerciciosArray;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int tabla[] = new int[100];
		Scanner sc = new Scanner(System.in);
		int num;
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (1+ Math.random()* 10);
		}
		
		for (int i = 0; i < tabla.length;i++) {
			System.out.println("En la posición " + i + " se encuentra el numero: " + tabla[i]);
		}
		
		System.out.print("Escribe la posicion que deseas ver: ");
		num = sc.nextInt();
		
		for (int i = 0; i < tabla.length; i++) {
			if (num == tabla[i]) {
				System.out.println("El numero " + num + " está en la posición: " + i);
			}
		}
		
	}

}