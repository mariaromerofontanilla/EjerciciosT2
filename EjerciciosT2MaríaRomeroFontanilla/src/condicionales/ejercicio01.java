package condicionales;

import java.util.Scanner;
/* Este ejercicio trata, en comprobar si es capicua o no el numero que introduzca el usuario
 * Introduce -4 | Resultado: Error no esta dentro delímite
 * Introduce 500000 | Resultado: Error no esta dentro delímite
 * Introduce 5 | Resultado: Capícua
 * Introduce 11 | Resultado: Capicua
 * Introduce 14 | Resultado: No Capicua
 * Introduce 202 | Resultado: Capicua
 * Introduce 210 | Resultado: No Capicua
 * Introduce 1221 | Resultado: Capicua
 * Introduce 5486 | Resultado: No Capicua
 */
public class ejercicio01 {

	public static void main(String[] args) {
				
		//variables
		int num;
		int unidad = 0,decena = 0,centenas = 0,mil = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		if (num > 0 && num < 10) {
			System.out.println("Es capicúa");
		} else if (num > 9 && num < 100) {
			unidad = num % 10;
			decena = num / 10;
			if (unidad == decena) {
				System.out.println("Numero es capicua");
			} else {
				System.out.println("Numero no es capicua");
			}
		} else if (num > 99 && num < 1000) {
			unidad = num % 10;
			centenas = num / 100;
			if (unidad == centenas) {
				System.out.println("Numero es capicua");
			} else {
				System.out.println("Numero no es capicua");
			}
		} else if (num > 999 && num < 10000) {
			unidad = num % 10;
			mil = num/1000;
			decena = num / 100;
			centenas = num/100;
			
			if (unidad == mil && decena == centenas) {
				System.out.println("Numero es capicua");
			} else {
				System.out.println("Numero no es capicua");
			}
		} 
		else {
			System.out.println("Error e sobre pasaste del limite");
		}
		
		
		sc.close();
	}

}
