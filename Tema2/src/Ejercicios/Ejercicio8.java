package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//variable
		double nota;
		double calculo;
		double calculo1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nota: ");
		nota = sc.nextInt();
		
		calculo = (nota + 0.5);
		calculo1 = (int) nota;
		
		if (nota < 5) {
			System.out.println("Su nota es INSUFICIENTE");
		} else if (nota == 5) {
			System.out.println("Su nota es SUFICIENTE");	
		} else if (nota == 6) {
			System.out.println("Su nota es BIEN");
		} else if (nota == 7) {
			System.out.println("Su nota es NOTABLE");
		} else if (nota == 8) {
			System.out.println("Su nota es NOTABLE");
		} else if (nota == 9) {
			System.out.println("Su nota es SOBRESALIENTE");
		} else if (nota == 10) {
			System.out.println("Su nota es SOBRESALIENTE");
		} else {
			System.out.println("Ese numero no esta registrado");
		}
			
		sc.close();
	}

}
