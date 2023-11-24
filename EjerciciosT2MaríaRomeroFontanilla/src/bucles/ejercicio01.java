package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Este pograma trata de  incremente la hora de un reloj. Se pedirán por teclado:
 *Hora
 *Minutos
 *Segundos
 *Cantidad de segundos a incrementar
 * CASO 1: Usuario introduce horas minutos y segundos: 12:12:12 y ahora introduce el incremento: 12 || Resultado: La hora actual es: 12 : 12 : 24
 * CASO 2: Usuario introduce horas minutos y segundos: 23:59:59 y ahora introduce el incremento: 10 || Resultado: La hora actual es: 0 : 0 : 10
 * CASO 3: Usuario introduce horas minutos y segundos: 20:40:30 y ahora introduce el incremento: 40 || Resultado: La hora actual es: 20 : 41 : 10
 * CASO 4: Usuario introduce horas minutos y segundos: 70:70:70 y ahora introduce el incremento: 80 || Resultado: Error
 * Si el usuario introduce un numero mayor que 60 dara error ya que esa hora no existiria
 */

public class ejercicio01 {

	public static void main(String[] args) {
				// Variables
				// Variable de las horas
				int hora =-1;
				// variable de los minutos
				int minutos = -1;
				// variable de los segundos
				int segundos = -1;
				// Variable de cuantos segundos quiere añadir
				int cantSegundos = -1;

				// creacion del Scanner
				Scanner sc = new Scanner(System.in);
				do {
					try {
				// Imprime por pantalla de que introduzca la hora
				System.out.println(" Introduzca la hora: ");
				// Scanner de la variable hora
				hora = sc.nextInt();
					}catch(InputMismatchException e) {
						System.out.println("Tipo de valor incorrecto");
						sc.nextLine();
					}
				}while(hora<0||hora>23);
				do {
					try {
				// Imprime por pantalla de que introduzca los minutos
				System.out.println(" Introduzca los minutos: ");
				// Scanner de la variable minutos
				minutos = sc.nextInt();
					}catch(InputMismatchException e) {
						System.out.println("Tipo de valor incorrecto");
						sc.nextLine();
					}
				}while(minutos<0||minutos>59);
				do {
					try {
						// Imprime por pantalla de que introduzcas los segundos
						System.out.println(" Introduzca los segundos: ");
						// Scanner de la variable segundos
						segundos = sc.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Tipo de valor incorrecto");
						sc.nextLine();
					}
				}while (segundos<0||segundos>59);
				
				do {
					try {
						// Imprime por pantalla de que introduzcas el incremento de segundos
						System.out.println(" Introduzca los segundos que quieres sumarle: ");
						// Scanner de la variable cantidad de segundos
						cantSegundos = sc.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Tipo de valor incorrecto");
						sc.nextLine();
					}
				}while (segundos<0);
				
				// if de que si la hora es menor o igual a 23 y los minutos son menor o igual a 59 y los segundops son menor o igual a 59 que haga lo siguiente 
				if (hora <= 23 && minutos <= 59 && segundos <= 59) {
					// for donde se crea la variable contador que diremos si contador es igual a 0 y contador es menor a la cantidad de segundos introducida contador se incrementa
					for (int cont = 0; cont < cantSegundos; cont++) {
						// incrementacion de los segundos
						segundos++;
						// if de que si los segundos son mayores o iguales a 60 que haga lo siguiente
						if (segundos >= 60) {
							// iguales los segundos a 0
							segundos = 0;
							// incremente uno en los minutos
							minutos = minutos + 1;
							// if de que si los minutos son mayores o iguales a 60 que haga lo siguiente
							if (minutos >= 60) {
								// minutos iguales a 0
								minutos = 0;
								// incrementacion de las horas mas 1
								hora = hora + 1;
								// if de que si la hora es mayor o igual a 24 que haga lo siguiente
								if (hora >= 24) {
									// iguale las horasa 0
									hora = 0;
									// incremento de los segundos mas 1
									segundos = segundos + 1;
								}
							}
						}
						// Imprime por pantalla el resultado con la incrementacion y la hora que seria, ya con la incrementacion
						System.out.println("La hora actual es: " + hora + " : " + minutos + " : " + segundos);
					}
					// de lo contrario erro por no introducir bien la hora
				} else {
					System.out.println("Error");
				}
				
				
			// Cierre del Scanner
			sc.close();
			}
	}