package Ejercicios;

//importación del Scanner
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//variable
		//variable de un numero decimal
		double numero;
		//crear Scanner
		Scanner sc = new Scanner(System.in);
		
		//Se lee por pantalla de que introduzcas un numero
		System.out.println("Introduce un numero: ");
		//Scannear la variable numero
		numero = sc.nextDouble();
		
		//if calculo de la vaariable numero es mayor que  -1 y de que numero es menor que 1
		if (numero > -1 && numero < 1 ){
			//se lee por pantalla de que es un casi 0
			System.out.println("Es un casi 0");
		//else if calculo del numero == 0	
		} else if (numero == 0){
			//Se lee por pantalla de que no es casi 0
			System.out.println("No es casi 0");
		// else te dice lo contrario de if	
		} else {
			//Se lee por pantalla de que no es casi 0
			System.out.println("No es casi 0");
		}
		
		//Cierre del Scanner
		sc.close();

	}

}
