package Ejercicios;

//Importacion del Scanner
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//variables
		//variable de numero
		int numero;
		//crear Scanner
		Scanner sc = new Scanner(System.in);
		
		//Se lee por pantalla de que introduzcas un numero
		System.out.println("Introduce un numero: ");
		//Scanner de la variable numero
		numero = sc.nextInt();
		
		//calculo de if, else if y else de si numero es mayor o = a numero 9 que diga tu numero tiene una cifra y asi hasta el numero 99999
		if (numero >= 0 && numero <=9) {
			System.out.println("Tu numero " + numero + " tiene una cifra" );
			
		} else if (numero >=10 && numero <=99) {
			System.out.println("Tu numero " + numero + " tiene dos cifra" );
			
		} else if (numero >= 100 && numero <= 999) {
			System.out.println("Tu numero " + numero + " tiene tres cifra");
			
		} else if (numero >= 1000 && numero <= 9999) {
			System.out.println("Tu numero " + numero + " tiene cuatro cifra");
			
		} else if (numero >= 10000 && numero <= 99999) {
			System.out.println("Tu numero " + numero + " tiene cinco cifra");
		} else {
			System.out.println("el numero no esta registrado");
		}
			
		//Cierre del Scanner
		sc.close();
	}

}
