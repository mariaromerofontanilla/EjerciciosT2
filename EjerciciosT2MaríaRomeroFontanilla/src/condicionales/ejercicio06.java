package condicionales;

import java.util.Random;
import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		//variable
		int num;
		int n1;
		int n2;
		int suma;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		n1= r.nextInt(1,100);
		n2= r.nextInt(1,100);
		
		suma= n1+n2;
		
		System.out.println("Introduce la suma de los dos numeros: ");
		num = sc.nextInt();
		
		
		

	}

}
