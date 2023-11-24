package ejercicio06;

import java.util.Scanner;

public class ejer06main {

	public static void main(String[] args) {
		int opc;
		double resultado;
		
		double radio, altura;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el calculo: ");
		opc = sc.nextInt();
		
		System.out.println("Introduzca radio: ");
		radio = sc.nextDouble();
		
		System.out.println("Introduzca la altura: ");
		altura = sc.nextDouble();
		
		System.out.println();
		resultado = eje06class.areaVolumen(opc, radio, altura);
		
		
				
		
		
		sc.close();

	}

}
