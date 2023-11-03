package condicionales;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		//variable
		double cantComidaComp, klComida, racion;
		int numAnimales;
		double comidarestatnte;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de comida que has comprado: ");
		cantComidaComp = sc.nextDouble();
		
		System.out.println("Introduce cuantos animales tienes: ");
		numAnimales = sc.nextInt();
		
		comidarestatnte = cantComidaComp - klComida;
		racion = comidarestante / numAnimales;

	}

}
