package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//variables
		int a;
		int b;
		int c;
		double calculo;
		double calculo1;
		double calculofinal1;
		double calculofinal2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ntroduce el primer numero: ");
		a = sc.nextInt();
		
		System.out.println("ntroduce el segundo numero: ");
		b = sc.nextInt();
		
		System.out.println("ntroduce el tercer numero: ");
		c = sc.nextInt();
		
		calculo = (Math.pow(b, 2)-4*a*c);
		calculo1 = (Math.sqrt(calculo));
		calculofinal1 = (-b +calculo1)/(2*a);
		calculofinal2 = (-b -calculo1)/(2*a);
		
		if (2*a == 0) {
			System.out.println("El calculo no se puede hacer");
		} else if (calculo <= 0) {
			System.out.println("El calculo no se puede hacer");	
		} else {
			System.out.println(calculofinal1 + " y " + calculofinal2);
		}
		
		sc. close();
	}

}
