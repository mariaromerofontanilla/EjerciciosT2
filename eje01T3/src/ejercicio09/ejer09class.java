package ejercicio09;

public class ejer09class {

	public static int calculadora(int  num1, int num2, int opcion) {
		int resultado=0;
		
		try {
			switch(opcion) {
			case 1 -> resultado = num1 + num2;
			case 2 -> resultado = num1 - num2;
			case 3 -> resultado = num1 * num2;
			case 4 -> resultado = num1 / num2;
			}
		} catch (ArithmeticException e) {
			System.out.println("Error al introducir un valor");
		}
		
		
		return resultado;
	}

}
