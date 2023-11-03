package condicionales;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		//variable
		double cant= 0, klC= 0, racion;
		int numA= 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de comida que has comprado: ");
		cant = sc.nextDouble();
		
		System.out.println("Introduce cuantos animales tienes: ");
		numA = sc.nextInt();
		
		System.out.println("Introduce el kilo de comida que come cada animal: ");
		klC = sc.nextDouble();
		
		if (cant >= numA) {
			System.out.println("Si ahi comida suficiente");
		} else {
			racion= klC * (cant/numA);
			System.out.println("La cantidad para cada uso es de : " + racion);
			
		}
		sc.close();
	}

}
