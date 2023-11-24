package ejercicio04;

import java.util.Scanner;

public class ejercicio04main {

	public static void main(String[] args) {
		String car;
		Boolean esVocal;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un carácter");
		car = sc.next();
		
		esVocal = ejercicio04.compruebaVocal(car);
		
		if(esVocal) {
			System.out.println("Es vocal");
		}else {
			System.out.println("No es vocal");
		}

	}

}
