package Ejercicios;

//importación del Scanner
import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
	//variables
	//variable de un numero
	int numero1;
	//variable de un numero
	int numero2;
	//crear Scanner
	Scanner sc = new Scanner (System.in);
	
	//Se lee por pantalla y dice que introduzca un numero
	System.out.println("Introduce un numero: ");
	//Scanner de la variable numero1
	numero1 = sc.nextInt();
	
	//Se lee por pantalla y dice que introduzca un numero
	System.out.println("Introduzca un numero: ");
	//Scanner de la variable numero2
	numero2 =sc.nextInt();
	
	//if calculo de las variables 
	if (numero1 == numero2) {
		//Se lee por pantalla y te dice que los numeros son iguales
		System.out.println("Los numeros son iguales");
	// else te dice lo contrario del if y dice los numeros no son iguales
	} else {
		//Se lee por pantalla y te dice que los numeros no son iguales
		System.out.println("Los numeros no son iguales");
		}
	
	//cierre del Scanner
	sc.close();
	}
}
