package aprendeprogamar;

import java.util.Scanner;

public class Aprende3 {

	public static void main(String[] args) {
		//variable
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 == 25 && num2 == 12) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}

}
