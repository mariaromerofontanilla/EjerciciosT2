package Ejercicios;

//importacion del Scanner
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//variable
		//variable de nota
		double nota;
		//Crear Scanner
		Scanner sc = new Scanner(System.in);
		
		//Se lee por pantalla de que introduzcas tu nota
		System.out.println("Introduce tu nota: ");
		//Scanner de la variable nota
		nota = sc.nextDouble();
		
		//if de si tu nota es 4 te diga insuficiente si tu nota es 5 te diga suficiente, etc
		if (nota < 5) {
			System.out.println("Su nota es INSUFICIENTE");
		} else if (nota >= 5 && nota < 6) {
			System.out.println("Su nota es SUFICIENTE");	
		} else if (nota  >= 6 && nota < 7) {
			System.out.println("Su nota es BIEN");
		} else if (nota  >= 7 && nota < 8) {
			System.out.println("Su nota es NOTABLE");
		} else if (nota  >= 9 && nota <= 10) {
			System.out.println("Su nota es SOBRESALIENTE");
		} else {
			System.out.println("Ese numero no esta registrado");
		}
		
		//cierre del Scanner
		sc.close();
	}

}
