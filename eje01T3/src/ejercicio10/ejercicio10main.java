package ejercicio10;

import java.util.Scanner;

public class ejercicio10main {

	public static void main(String[] args) {
		int dia, mes, año;
		boolean fecha;
		
		boolean esCorrecta;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el dia");
		dia = sc.nextInt();
		
		System.out.println("Introduce un mes");
		mes = sc.nextInt();
		
		System.out.println("Introduce el año");
		año = sc.nextInt();
		
		fecha = ejercici10class.esFechaCorrecta(dia, mes, año);
		
		if(fecha) {
			System.out.println("Es correcto");
		}else {
			System.out.println("No es correcto");
		}
		
		sc.close();
	}

}
