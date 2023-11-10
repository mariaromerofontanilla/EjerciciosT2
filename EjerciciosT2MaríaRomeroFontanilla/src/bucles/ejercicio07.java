package bucles;

import java.util.Scanner;
/*
 * Este programa trata de que el usuario introduce un numero y este llega hasta el valor del numero de 1 hasta el numero
 * y luego se descrementa
 * CASO 1: Usuario introduce: 4 || Resultado: 
 * 1
 * 121
 * 12321
 * 1234321
 * CASO 2: Usuario introduce: 0 || Resultado: Introduce un numero que sea mayor a 0
 * CASO 3: Usuario introduce: -24 || Resultado: Introduce un numero que sea mayor a 0
 */

public class ejercicio07 {

	public static void main(String[] args) {
				// variable
				// crear la variable n
				int n;
				// crear Scanner
				Scanner sc = new Scanner(System.in);
				// Imprime por pantalla de que introduzcas un numero
				System.out.print("Introduce un numero: ");
				// Scanner de la variable n
				n = sc.nextInt();
				// if de que si n es mayor a 0 que haga lo siguiente
				if (n > 0) {
				// for donde se crea la variabe i y se dice de que si i nes menor o igual a n, i se invcrementa
				for (int i = 1; i <= n; i++) {
					// for donde se crea j donde se iguala a 1 y se dice de que si j es menor o igual a i j se incrementa
					for (int j = 1; j <= i; j++) {
					// Imprime por pantalla el resultado de la variable j	
					System.out.print(j);
					}
					// For donde se crea la varibe a donde se iguala a i y se le resta 1 ademas a debera se mayor o igual a 1 y a se ira restando
					for (int a = i-1; a >= 1; a--) {
						// Imprime resultado de la variable a
						System.out.print(a);
					}
						// salto de línea
						System.out.println();
					}
				// De lo contrario que diga lo siguiente
				} else {
					// Imprima por pantalla de que el numero debe de ser mayor a 0
					System.out.println("Introduce un numero que sea mayor a 0");
				}
				// Cierre del Scanner
				sc.close();
			}

		}