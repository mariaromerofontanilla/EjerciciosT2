package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Este ejercicio va de calcular el máximo común divisor de dos numero
 * CASO 1: Usuario introduce 15 y 9 || Resultado: 3
 * CASO 2: Usuario introduce 3 y 22 || Resultado: 1
 * CASO 3: Usuario introduce -15 y -9 || Resultado: Error debes introducir un numero positivo
 * CASO 4: Usuario introduce 0 y 0 || Resultado: 0
 */

public class ejercicio04 {

	public static void main(String[] args) {
				// variable
				// crear la variable a, b menor y por ultimo la variable i todas numeros enteros
				int a = 0, b = 0, menor, i=0;
				// Crear Scanner
				Scanner sc = new Scanner(System.in);
				
				do {
					try {
						// Imprime por pantalla de que introduzcas un numero
						System.out.println("Introduce un numero: ");
						// Scanner de la variable a
						a = sc.nextInt();
						// Imprime por pantalla de que introduzcas un numero
						System.out.println("Introduce un numeros: ");
						// Scanner de la variable b
						b = sc.nextInt();
					}catch(InputMismatchException e) {
						System.out.println("Tipo de valor incorrecto");
						sc.nextLine();
					}
				}while(a<0 && b<0);
				
				
				// if de que si a es menor que b que haga lo siguiente
				if (a >= 0 && b >= 0) {
					
				if (a<b) {
					// la variable menor sea igual a la variable a
					menor = a;
				// de lo contrario
				} else {
					// la variable menor sera la variable b
					menor = b;
				}
				// for de que si la variable i es igual a menor y de que i sea mayor o igual a dos i se ira restando
				for(i = menor; i >= 2;i--) {
					// if de que si el modulo de la variable a%i es igual a 0 y de que si el moduelo de b%i es igual a 0 haga lo siguiente
					if (a%i==0 && b%i==0){
						// break para que se salga del tiron del bucle
						break;
					}
				}
				} else {
					System.out.println("Error debes introducir un numero positivo");
				}
				// Imprime el resultado el cual es la variable i que te dira cual es menor de los dos numero introducidos
				System.out.println(i);
				// Cierre del Scanner
				sc.close();
			}

		}