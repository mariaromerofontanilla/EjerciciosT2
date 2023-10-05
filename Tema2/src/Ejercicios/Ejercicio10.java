package Ejercicios;

//importacion de Scanner
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//variable
		//crear Scanner
		Scanner sc = new Scanner(System.in);
		//variable n1,n2,n3
		int n1, n2, n3;
		
		//Se lee por pantalla de que introduzcas un numero
		System.out.println("Introduzca un numero: ");
		//Scannea variable n1
		n1 = sc.nextInt();
		
		//Se lee por pantalla de que introduzcas un numero
		System.out.println("Introduzca un numero: ");
		//Scanea variable n2
		n2 = sc.nextInt();
		
		//Se lee por pantalla de que introduzcas un numero
		System.out.println("Introduzca un numero: ");
		//Scannea variable n3
		n3 = sc.nextInt();
		
		//calculo de if de que si suma de n1 y n2 es = a n3, etc
		if (n1 + n2 == n3) {
			System.out.println("la suma de numero1: " +n1+ " y numero2: " +n2+ " es igual a numero3:" +n3);
		} else if (n1 + n3 == n2) {
			System.out.println("la suma de numero1: " +n1+ " y numero3: " +n3+ " es igual a numero2:" +n2);
		} else if (n2 + n3 == n1) {
			System.out.println("la suma de numero2: " +n2+ " y numero3: " +n3+ " es igual a numero1:" +n1);
		} else {
			System.out.println("La suma de cualquier numero no es igual a ninguno");
		}
		
		//Cierre del Scanner
		sc.close();
	}

}
