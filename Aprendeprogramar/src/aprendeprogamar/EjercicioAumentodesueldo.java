package aprendeprogamar;

//Importación del scanner
import java.util.Scanner;

public class EjercicioAumentodesueldo {

	public static void main(String[] args) {
		//Crear Scanner
		Scanner sc = new Scanner(System.in);
		//Variable
		int años;
		int sueldo;
		
		//Lo que el usuario lee por pantalla
		System.out.println("Introduzca tu sueldo actualmente: ");
		//Scanner de la variable sueldo
		sueldo = sc.nextInt();
		//Lo que el usuario lee por pantalla
		System.out.println("Introduzca los años que lleva en la empresa: ");
		//Scanner de la variable años
		años = sc.nextInt();
		
		//Comienzo del if
		if (sueldo > 500 && años >= 10) {
			sueldo = sueldo * 3;
			System.out.println("Su sueldo se triplica actualmente es: " +sueldo);
		} else if (sueldo < 500 && años < 10) {
			sueldo = sueldo * 2;
			System.out.println("Su sueldo se duplico actualmente es: " +sueldo);
		} else if (sueldo >= 500 && años <= 0) {
			System.out.println("Su sueldo se mantiene sin cambios: " +sueldo);
		}
		
		//cierre del Scanner
		sc.close();
	}
	
}
