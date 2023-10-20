package aprendeprogamar;

import java.util.Scanner;

public class aprende2 {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if (num1 > 10 || num2 > 10 || num3 > 10) {
			System.out.println("ALGUNO MAYOR QUE 10");
		} else {
			System.out.println("NINGUNO MAYOR QUE 10");
		}
			
		sc.close();
		
	}

}
