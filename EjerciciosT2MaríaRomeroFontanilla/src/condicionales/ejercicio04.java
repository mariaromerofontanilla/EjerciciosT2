package condicionales;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		//variable
		int num, decena, unidad;
		String uni = null, deci = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		num= sc.nextInt();
		
		decena = num/10;
		unidad = num%10;
		
		if (num >= 1 && num <= 99){
			switch (unidad) {
			case 1: uni= "uno";
			break;
			case 2: uni= "dos";
			break;
			case 3: uni= "tres";
			break;
			case 4: uni= "cuatro";
			break;
			case 5: uni= "cinco";
			break;
			case 6: uni= "seis";
			break;
			case 7: uni= "siete";
			break;
			case 8: uni= "ocho";
			break;
			case 9: uni= "nueve";
			break;
			default: uni =" ";
			break;
			};
			switch (decena) {
			case 1: switch (unidad) {
					case 0: uni= "diez";
					break;
					case 1: uni= "once";
					break;
					case 2: uni= "doce";
					break;
					case 3: uni= "trece";
					break;
					case 4: uni= "catorce";
					break;
					case 5: uni= "quince";
					break;
					default: deci= "dieci";
					break;
			};
			break;
			case 2: switch (unidad) {
				case 0: deci= "veinte";
				break;
				default: deci= "veinti";
				break;
			};
			break;
			case 3: deci = "treinta";
			break;
			case 4: deci = "cuarenta";
			break;
			case 5: deci = "cincuenta";
			break;
			case 6: deci = "sesenta";
			break;
			case 7: deci = "setenta";
			break;
			case 8: deci = "ochenta";
			break;
			case 9: deci = "noventa";
			break;
			};
	}
		if(num < 16) {
			System.out.println(uni);
		}else if (num > 15 && num < 20) {
			System.out.println(deci+uni);
		}else if(num==20) {
			System.out.println(deci);
		}else if (num==21){
			System.out.println(deci+uni);
		}else {
			System.out.println(deci + " y " + uni);
		}
		sc.close();
}
}
