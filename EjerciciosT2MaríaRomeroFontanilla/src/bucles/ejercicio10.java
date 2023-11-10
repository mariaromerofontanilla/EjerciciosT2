package bucles;

import java.util.Scanner;
/* Este ejercicio trata, en comprobar si es capicua o no el numero que introduzca el usuario
 * Introduce -4 | Resultado: No Capicua
 * Introduce 5 | Resultado: Capícua
 * Introduce 11 | Resultado: Capicua
 * Introduce 14 | Resultado: No Capicua
 * Introduce 202 | Resultado: Capicua
 * Introduce 210 | Resultado: No Capicua
 * Introduce 1221 | Resultado: Capicua
 * Introduce 5486 | Resultado: No Capicua
 */

public class ejercicio10 {

	public static void main(String[] args) {
				//variables
				// Crear la variable n, num cal e igualarla a 0 y calculo
				int n, num, cal=0,calculo;
				// Crear el Scanner
				Scanner sc = new Scanner(System.in);
				
				// Imprime por pantalla de que introduzcas un numero
				System.out.println("Introduzca un numero: ");
				// Scanner de la variable n
				n = sc.nextInt();
				// igualamos la variable num a la variable n
				num = n;
				// while de que si el numero es mayor a cero que haga llo siguiente
				while (num > 0) {
					// calculo de la variable calculo donde dice que tiene que hacer el modulo de la variable numero modulo 10
					calculo = num % 10;
					// calculo de la variable cal donde dice que se multiplica por 10 la variable 10 y seguidamente se suma por el resultado del calculo anterior
					cal = cal * 10 + calculo;
					// calculo de la variable num donde dice que se divide num entre 10
					num = num /10;
				}
				// if de que si la variable cal es igual igual a la variable n que diga lo sguiente
				if (cal == n) {
					// Imprime por pantalla de que el numero es capicua
					System.out.println("Es capicua");
				// De lo contrario que diga lo siguiente
				} else {
					// Imprime por pantalla de que el numero no es capicua
					System.out.println("No es capicua");
				}
				// Cierre del Scanner
				sc.close();
		}
		}