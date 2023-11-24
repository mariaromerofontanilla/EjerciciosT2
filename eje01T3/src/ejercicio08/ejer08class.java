package ejercicio08;

public class ejer08class {

	public static boolean numerosPrimos(int num) {
		boolean primo = true;
		int div = 2;
		
		if (num == 1) {
			primo = false;
		} else {
//			for(int i = 2; i<=Math.sqrt(num) && primo; i++) {
//				if (num%i == 0) {
//					primo = false;
//				}
//				
//			}
			while (div <= Math.sqrt(num)&& primo) {
				if (num%div==0) {
					primo = false;
				}
				div++;
			}
		}
		return primo;
		
	}

}
