package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//variable
		Scanner sc = new Scanner(System.in);
		int cadena1;
		int cadena2;
		
		System.out.println("Usiario 1, elije: 1.piedra 2.papel 3.tijeras");
		cadena1 = sc.nextInt();
		
		System.out.println("Usuario 2, elije: 1.piedra 2.papel 3.tijeras");
		cadena2 = sc.nextInt();
		
		if (cadena1 == 1 && cadena2 == 1) {
			System.out.println("Empate");
		} else if (cadena1 == 2 && cadena2 == 2) {
			System.out.println("Emapete");
		} else if (cadena1 == 3 && cadena2 == 3) {
			System.out.println("Empate");
		} else if (cadena1 == 1 && cadena2 == 2) {
			System.out.println("Gana papel usuario2");
		} else if (cadena1 == 2 && cadena2 == 3) {
			System.out.println("Gana tijeras usuario2");
		} else if (cadena1 == 3 && cadena2 == 1) {
			System.out.println("Gana piedra usuario2");
		} else if (cadena1 == 2 && cadena2 == 1) {
			System.out.println("Gana papel usuairo1");
		} else if (cadena1 == 3 && cadena2 == 2) {
			System.out.println("Gana tijeras usuario1");
		} else if (cadena1 == 1 && cadena2 == 3) {
			System.out.println("Gana piedra usuario1");
		} else {
			System.out.println("Error");
		}
		
		sc.close();

	}

}
