package condicionales;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		//variable
		int num, calculo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		calculo = num >= 0 ? num : num * -1;
		
		System.out.println(calculo);
		
	sc.close();
	}

}
