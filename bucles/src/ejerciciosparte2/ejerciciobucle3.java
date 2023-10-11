package ejerciciosparte2;

import java.util.Scanner;

public class ejerciciobucle3 {

	public static void main(String[] args) {
		//variables
		int valor = 0;
		int num;
		int contador = 0;
		int media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		num = sc.nextInt();
		
		while (num >= 0) {
			System.out.println(num);
			valor += num;
			num = sc.nextInt();
			contador++;
		}
		//System.out.println(contador);
		//System.out.println(valor);
		media = (valor / contador);
		System.out.println(media);

	}

}
