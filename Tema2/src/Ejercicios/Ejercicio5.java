package Ejercicios;

//importación de Scanner
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//variables
		//variable de numero entero se llama numero1
		int numero1;
		//variable de numero entero se llama numero2
		int numero2;
		//variable de numero entero se llama numero3
		int numero3;
		//crear Scanner
		Scanner sc = new Scanner(System.in);
		
		//Se lee por pantalla de que introduzcas un numero
		System.out.println("Introduce un numero: ");
		//Scannear la variable de numero1
		numero1 = sc.nextInt();
		
		//Se lee por pantalla de que introduzcas un numero
		System.out.println("Introduce un numero: ");
		//Scannear la variable del numero2
		numero2 = sc.nextInt();
		
		//Se lee por pantalla de que introduzcas un numero
		System.out.println("Introduce un numero: ");
		//Scanner de la variable numero3
		numero3 = sc.nextInt();
		
		//calculo del if de que numero 1 es mayor que numero2 y que numero1 es mayor que numero3 y que numero2 es mayor que numero3
		if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
			//Se lee por pantalla de que numero1 es mayor que numero2 y que numero3 es menor que numero2 y numero1
			System.out.println(numero1  + " > " + numero2 + " > "  + numero3);
		
		//Calculo del else if de que numero1 es mayor que numro2 y que numero1 es mayor que numero3 y que numero3 es mayor a numero2	
		} else if (numero1 > numero2 && numero1 > numero3 && numero3 > numero2) {
			//Se lee por pantalla de que numero1 es mayor que numero3 y que numero3 es mayor que numero2
			System.out.println(numero1 + " > " + numero3 + " > " + numero2);
			
		//calculo del else if de que numero2 es mayor a numero1 y que numero1 es mayor a numero3 y que numero3 es menor que numero2	
		}else if (numero2 > numero1 && numero1 > numero3 && numero3 < numero2) {
			//Se lee por pantalla de que numero2 es mayor  que numero1 y que numero1 es mayor que numero3
			System.out.println(numero2 + " > " + numero1 + " > " + numero3);	
		}
		
		//calculo de que numero2 es mayor que numero1 y de que numero3 es mayor que numero1 y de que numero3 es mayor que numero2
		else if (numero2 > numero1 && numero3 > numero1 && numero3 < numero2) {
			//Se lee por pantalla de que numero2 es mayor que numero3 y que numero3 es mayor que numero2
			System.out.println(numero2 + " > " + numero3 + " > " + numero2);	
		}
		
		//calculo de que numero3 es mayor que numero1 y que numero1 mayor que numero2 y que nnumero3 es mayor que numero2
		else if (numero3 > numero1 && numero1 > numero2 && numero3 > numero2) {
			//Se lee por pantalla de que numero3 es mayor que numrto1 y que numero1 es mayor que numero2
			System.out.println(numero3 + " > " + numero1 + " > " + numero2);	
		}
		
		//calculo de que numero3 es mayor que numero1 y de que numero2 es mayor que numero1 y de que numero3 es mayor que numero2
		else if (numero3 > numero1 && numero2 > numero1 && numero3 > numero2) {
			//Se lee por pantalla de que numero3 es mayor que numero2 y que numero2 es mayor que numero1
			System.out.println(numero3 + " > " + numero2 + " > " + numero1);	
		}
		
		//cierre del Scaneer
		sc.close();

	}

}
