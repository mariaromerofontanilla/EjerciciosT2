package bucles;

import java.util.Scanner;
/*
 * Este ejercicio va de calcular el mínimo común multiplo de dos numero
 * CASO 1: Usuario introduce 15 y 9 || Resultado: 45
 * CASO 2: Usuario introduce 3 y 22 || Resultado: 66
 * CASO 3: Usuario introduce -15 y -9 || Resultado: Error debes introducir un numero positivo
 * CASO 4: Usuario introduce 0 y 0 || Resultado: 0
 */

public class ejercicio05 {

	public static void main(String[] args) {
				// variable
				// crear las variables a , b y mayor
				int a,b, mayor=0;
				// crear Scanner
				Scanner sc = new Scanner(System.in);
				// Imprime por pantalla de que introduzca un numero
				System.out.println("Introduce un numero: ");
				// Scanner de la variabe a
				a = sc.nextInt();
				// Imprime por pantalla de que introduzcas un numero
				System.out.println("Introduce un numero: ");
				// Scanner de la variable b
				b = sc.nextInt();
				
				// if de que si a es mayor que b que haga lo siguiente
				if (a >= 0 && b >= 0) {
				if (a>b) {
					// la variable mayor sea igual para la variable a
					mayor = a;
				// de lo contrario hara lo siguiente
				} else {
					// la variable mayor sera igual que la variable b
					mayor = b;
				}
				// while de que si el moduelo de mayor%a es lo contrario a 0 o de que moduelo de mayor%b es lo contrario a 0 haga lo siguiente
				while (mayor%a!=0 || mayor%b!=0) {
					// incremento de la variable mayor
					mayor++;
				}
				// Imprime por pantalla cual de los dos numeros introducidos es mayor
				System.out.println(mayor);
				} else {
					System.out.println("Error debes introducir un numero positivo");
				}
				// cierre del Scanner
				sc.close();
		}
		}