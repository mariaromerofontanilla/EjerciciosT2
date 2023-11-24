package ejercicio10;

public class ejercici10class {

	public static boolean esFechaCorrecta(int dia, int mes, int año) {
		boolean esCorrecta = false;
		
		if (dia > 0 && dia < 31 && mes > 0 && mes < 31) {
			esCorrecta = true;
		}
		
		return esCorrecta;

	}

}
