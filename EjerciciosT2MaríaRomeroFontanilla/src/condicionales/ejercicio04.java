package condicionales;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		//variable
		int num;
		int unidades=0, decenas=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero del 1 al 99: ");
		num=sc.nextInt();
		
		unidades = num % 10;
		decenas = num / 10;
		
		if (num >= 1 && num <= 99) {
			switch (num) {
			case 1: unidades = "uno";
			break;
			
			case 2: unidades = "dos";
			break;
			
			case 3: unidades = "tres";
			break;
			
			case 4: unidades = "cuatro";
			break;
			
			case 5: unidades = "cinco";
			break;
			
			case 6: unidades = "seis";
			break;
			
			}
				
		}
	}

}
