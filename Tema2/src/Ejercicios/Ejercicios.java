package Ejercicios;

//Importación de Scanner
import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		//variables
		//variable de numero
		int numero;
		//crear Scanner
		Scanner sc = new Scanner (System.in);
		
		//Se lee por consola de que introduzca un numero
		System.out.println("Introduce un numero: ");
		//Scanner de la variable
		numero = sc.nextInt();
		
		//if calculo parasaber si es par
		if (numero % 2 == 0) {
			//Se lee por pantalla y dice que es par
			System.out.println("El numero es par");
		//else lo contrario del if	
		} else {
			//Se lee por pantalla y dice que es impar
			System.out.println("El numero es impar");
		}
		//cierre del Scanner
		sc.close();
	}
}
