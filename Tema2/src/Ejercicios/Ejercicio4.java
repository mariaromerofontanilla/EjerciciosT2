package Ejercicios;

//importacion de Scanner 
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//variables
		//variable numero1
		int numero1;
		//variable numero2
		int numero2;
		//Crea el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Se lee por pantalla de que introduzcas un numero
		System.out.println("Introduce un numero: ");
		//Scanner de la variable numero1
		numero1 = sc.nextInt();
		
		//Se lee por pantalla de que introduzcas un numero
		System.out.println("Introduce un numero: ");
		//Scanner de la variable numero2
		numero2 = sc.nextInt();
		
		//if calculo de las variables y te dice que numero1 es menor que numero2
		if (numero1 < numero2) {
			//Se lee por pantalla de que la variable numero1 es menor que la variables numero2
			System.out.println(numero1  + " < " + numero2);
		
		//else if te hace el calculo de las variables y te dice que la variable numero1 es igual a la variable numero2	
		} else if (numero1 == numero2) {
			//Se lee por pantalla de que la variable numero1 y variables numero2 son iguales
			System.out.println(numero1 + " = " + numero2);
		
		// else te dice lo contrario del if	
		} else {
			//Se lee por pantalla de que la variable nuero1 es mayor que la variabe numero2
			System.out.println(numero2 + " < " + numero1);
		}
		
		//cierre del Scanner
		sc.close();
	}

}
