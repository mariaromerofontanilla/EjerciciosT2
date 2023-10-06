package ejerciciosparte2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {	
		//variariable
		int nota;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nota: ");
		nota = sc.nextInt();
		
			switch (nota) {
			case 0,1,2,3,4:
				System.out.println("Insuficiente");
				break;
			case 5:
				System.out.println("Suficiente");
				break;	
			case 6:
				System.out.println("Bien");
				break;
			case 7,8:
				System.out.println("Notable");
				break;
			case 9,10:
				System.out.println("Sobresaliente");
				break;
			default:
				System.out.println("La noata introducida es incorrecta, no esta en el sistema");
				break;
		}
			sc.close();
	}
	
}
