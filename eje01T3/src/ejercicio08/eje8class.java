package ejercicio08;

public class eje8class {

	public static int CunetaDivisores(int num) {
		int contador = 0;
		//boolean primo;
		
		for(int i=2;i<=num; i++) {
			boolean primo = ejer08class.numerosPrimos(i);
			if (num%i==0 && primo) {
				contador++;
			}
		}
		
		return contador;

	}

}
