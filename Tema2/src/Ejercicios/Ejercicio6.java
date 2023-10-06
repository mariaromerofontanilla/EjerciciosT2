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
		//variable calculos
		//variable donde queda el discriminante
		double calculo;
		//variable de calculofinal1
		double x1;
		//variable de calculofinal2
		double x2;
		//crear Scanner
		Scanner sc = new Scanner(System.in);
		
		//Se lee por pantalla de que introduzcas un numero
		System.out.println("introduce el primer numero: ");
		//Se Scannear la variable a
		a = sc.nextInt();
		
		//Se lee por pantalla de que introduzcas un numero
		System.out.println("introduce el segundo numero: ");
		//Se Scannea la variable b
		b = sc.nextInt();
		
		//Se lee por pantalla de que introduzcas un numero
		System.out.println("introduce el tercer numero: ");
		//Se Scannea la variable c
		c = sc.nextInt();
		
		//calculos de las variables calculo, calculofinal1 y calculofinal2
		calculo = (Math.pow(b, 2)-4*a*c);
		
		//calculo del if de que multiplicas 2*a y es == 0
		if (a == 0) {
			//Se lee por pantalla de que el calculo no se puede hacer
			x1 = (double) -c / b;
			System.out.println("El resultado es: " + x1);
		//calculo del else if de la variable calculo es menor igual que 0	
		} else if (calculo < 0) {
			//Se lee por pantaa de que el calculo no se puede hacer
			System.out.println("El calculo no se puede hacer");	
		//calculo del else
		} else {
			//Se lee por pantalla de que la variable calculofinal1 y calculofinal2
			x1 = (-b + Math.sqrt (calculo))/(2*a);
			x2 = (-b -Math.sqrt (calculo))/(2*a);
			System.out.println(x1 + " y " + x2);
		}
		
		//cierre de Scanner
		sc. close();
	}

}
