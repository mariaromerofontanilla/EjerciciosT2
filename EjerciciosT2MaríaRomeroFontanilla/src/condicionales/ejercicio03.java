package condicionales;

import java.util.Scanner;
/*
 * Este ejercicio trata de una granja, en la cual te piden la cantidad de comida comprada
 * los kilos de comida que comen cada animal y el numero de animales que tiene
 * CASO 1: 
 */

public class ejercicio03 {

	public static void main(String[] args) {
		//variable
				// Variable para almacenar la cantidad de comida comprada, kilos de comida y racion
				double cantComidaComp, klComida=0, racion=0;
				// Variable para almacenar el número de animales
				int numAnimales;
				// Variable para calcular la comida restante
				double comidarestante;
				//Creacion del Scanner
				Scanner sc = new Scanner(System.in);
				// Solicitar al usuario que ingrese la cantidad de comida comprada
				System.out.println("Introduce la cantidad de comida que has comprado: ");
				//Scanner de la variable cantidad de comida comprada
				cantComidaComp = sc.nextDouble();
				// Solicitar al usuario que ingrese cuántos animales tiene
				System.out.println("Introduce cuantos animales tienes: ");

				//Scanner de la variable numero de Animales
				numAnimales = sc.nextInt();
				
				// Calcular la comida restante restando la comida ya consumida (klComida) a la cantidad comprada

				comidarestante = cantComidaComp - klComida;
				// Calcular la ración de comida para cada animal dividiendo la comida restante entre el número de animales
				if ( numAnimales > 0) {
				racion = comidarestante / numAnimales;
				} else {
					System.out.println("No se puede dividir por 0");
				}
				System.out.println(racion);
				//cierre del Scanner
				sc.close();
				}
			}
			
