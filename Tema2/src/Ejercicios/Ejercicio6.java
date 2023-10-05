package Ejercicios;

//Importacion del Scanner
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//variables
		//variable a
		int a;
		//variable b
		int b;
		//variable c
		int c;
		//variable calculo
		double calculo;
		//variable de calculo1
		double calculo1;
		//variable de calculofinal1
		double calculofinal1;
		//variable de calculofinal2
		double calculofinal2;
		//crear Scanner
		Scanner sc = new Scanner(System.in);
		
		//Se lee por pantalla de que introduzcas un numero
		System.out.println("ntroduce el primer numero: ");
		//Se Scannear la variable a
		a = sc.nextInt();
		
		//Se lee por pantalla de que introduzcas un numero
		System.out.println("ntroduce el segundo numero: ");
		//Se Scannea la variable b
		b = sc.nextInt();
		
		//Se lee por pantalla de que introduzcas un numero
		System.out.println("ntroduce el tercer numero: ");
		//Se Scannea la variable c
		c = sc.nextInt();
		
		//calculos de las variables calculo variables calculo1, calculofinal1 y calculofinal2
		calculo = (Math.pow(b, 2)-4*a*c);
		calculo1 = (Math.sqrt(calculo));
		calculofinal1 = (-b +calculo1)/(2*a);
		calculofinal2 = (-b -calculo1)/(2*a);
		
		//calculo del if de que multiplicas 2*a y es == 0
		if (2*a == 0) {
			//Se lee por pantalla de que el calculo no se puede hacer
			System.out.println("El calculo no se puede hacer");
		//calculo del else if de la variable calculo es menor igual que 0	
		} else if (calculo <= 0) {
			//Se lee por pantaa de que el calculo no se puede hacer
			System.out.println("El calculo no se puede hacer");	
		//calculo del else
		} else {
			//Se lee por pantalla de que la variable calculofinal1 y calculofinal2
			System.out.println(calculofinal1 + " y " + calculofinal2);
		}
		
		//cierre de Scanner
		sc. close();
	}

}
