package ejercicio10;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 System.out.print("Introduce el día: ");
	        int dia = sc.nextInt();

	        System.out.print("Introduce el mes: ");
	        int mes = sc.nextInt();

	        System.out.print("Introduce el año: ");
	        int año = sc.nextInt();

	        if (esFechaValida(dia, mes, año)) {
	            System.out.println("La fecha introducida es válida.");
	        } else {
	            System.out.println("La fecha introducida NO es válida.");
	        }
	        sc.close();
	    }

	    public static boolean esFechaValida(int dia, int mes, int año) {
	    	
	    	boolean esCorrecta = false;
	    	boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);

	        switch (mes) {
	            case 1: // Enero
	            case 3: // Marzo
	            case 5: // Mayo
	            case 7: // Julio
	            case 8: // Agosto
	            case 10: // Octubre
	            case 12: // Diciembre
	            	if (dia >= 1 && dia <= 31) {
	            		esCorrecta = true;
	            	}
	                //return (dia >= 1 && dia <= 31);
	            case 4: // Abril
	            case 6: // Junio
	            case 9: // Septiembre
	            case 11: // Noviembre
	            	if (dia >= 1 && dia <= 30) {
	            		esCorrecta = true;
	            	}
	                //return (dia >= 1 && dia <= 30);
	            case 2: // Febrero
	                if (esBisiesto) {
	                    return (dia >= 1 && dia <= 29);
	                } else {
	                    return (dia >= 1 && dia <= 28);
	                }
	            default:
	                return false; // Mes inválido
	        }
	    }
	}