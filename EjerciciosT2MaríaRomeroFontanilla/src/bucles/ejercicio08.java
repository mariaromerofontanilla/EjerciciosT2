package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Este programa lee y acepta únicamente aquellos que sean mayores que el último numero dado por el usuario, el 0 lo saca y los espacio los cuenta como fallo.
 * CASO 1: Usuario pone 20 || Usuario pone 8 -> fallo es menor || usuario pone 0 -> se sale y te sale el resultado: Total de numeros introducidos: 2 || Total numeros fallados: 1
 * Cuenta los numeros introducidos excluyendo el 0 y te dice cuales son los fallos, es decir los numeros pequeños al numero anterior dado
 * CASO 2: Usuario pone 10 || usuario pone 30 || usuario pone 1 -> fallo es menor || usuario pone 0 || Resultado: Total de numeros introducidos: 3 || Total numeros fallados: 1
 */

public class ejercicio08 {

	public static void main(String[] args) {
				// variables
				// Crear la variable num
				int num = 0;
				// Crear la variable contador y se iguala a cero
				int contC=0;
				// Crear la variable contador final y se iguala a cero
				int contF=0;
				// Crear la variabele auxiliar
				int aux;
				// Crear Scanner
				Scanner sc = new Scanner(System.in);
				do {
					try {
				// Imprime por pantalla de que introduzca un numero inicial
				System.out.println("Introduce un numero inicial: ");
				// Scanner de la variable num
				num = sc.nextInt();
					}catch(InputMismatchException e) {
						System.out.println("Tipo de valor incorrecto");
						sc.nextLine();
					}
				}while(num==0);
				// do donde se hara un calculo de lo siguiente
				do {
					// Incremento de la variable contador
					contC++;
					// igualar la variable auxiliar a la variable numero
					aux = num;
					do {
						try {
							// Imprime por pantalla de que diga un numero
							System.out.println("Dime un numero: ");
							// Scanner de la variable num
							num = sc.nextInt();
						}catch(InputMismatchException e) {
							System.out.println("Tipo de valor incorrecto");
							sc.nextLine();
							contC--;
						}
					
					// if de que si numero es menor a la variable auxiliar y de que si numero es mayor a sero o menor que cero que haga lo siguiente
					if (num < aux && (num > 0 || num < 0)) {
						// Imprime por pantalla de que fallo es menor
						System.out.println("Fallo es menor.");
						// Incremento de la variable final
						contF++;
					}
					}while(num<0||num>0);
				// while donde dice si numero es mayor a 0 o menor a cero se salga del bucle
				} while (num > 0 || num < 0);
				if(num==0) {
				// Imprime por pantalla el totala de numero introducidos
				System.out.println("Total de numeros introducidos: " + contC);
				// Imprime por pantalla el total de numeros fallados
				System.out.println("Total numeros fallados: " + contF);
				}
				// Cierre del Scanner
				sc.close();
			}

		}