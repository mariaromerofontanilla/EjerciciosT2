package Ejercicios;

//importacion del Scanner
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//crear Scanner
		Scanner sc = new Scanner(System.in);
		//costante
		//costante PIERDA
		final String PIEDRA = "piedra";
		//costante PAPEL
		final String PAPEL = "papel";
		//costante TIJERA
		final String TIJERA = "tijera";
		//variable
		//variable cadena1
		String cadena1;
		//variable cadena2
		String cadena2;
		
		//Se lee por pantalla de que el usuario1 elija entra papel tijeras o piedra
		System.out.println("Usuario 1, elije: 1.piedra 2.papel 3.tijeras");
		//Scanner de la variable cadena1
		cadena1 = sc.next();
		
		//Se lee por pantalla de que el usuario2 elija entra papel tijeras o piedra
		System.out.println("Usuario 2, elije: 1.piedra 2.papel 3.tijeras");
		//Scanner de la variable cadena2
		cadena2 = sc.next();
		
		//if de si es tijera usuario1 y piedra usario2 que diga usuario2 gana, etc
		if (cadena1.equals(TIJERA)&& cadena2.equals(TIJERA) || cadena1.equals(PIEDRA)&& cadena2.equals(PIEDRA) || cadena1.equals(PAPEL)&& cadena2.equals(PAPEL)) {
			System.out.println("Empate");
		} else if (cadena1.equals (PIEDRA) && cadena2.equals(PAPEL) || cadena1.equals(PAPEL) && cadena2.equals(TIJERA) || cadena1.equals(TIJERA) && cadena2.equals(PIEDRA)) {
			System.out.println("Gana usuario2");
		} else if (cadena1.equals(PAPEL) && cadena2.equals(PIEDRA) || cadena1.equals(TIJERA) && cadena2.equals(PAPEL)  || cadena1.equals(PIEDRA) && cadena2.equals(TIJERA)) {
			System.out.println("Gana usuairo1");
		} else {
			System.out.println("Error");
		}
		
		//Cierre del Scanner
		sc.close();

	}

}
