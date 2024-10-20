package dsa;

import java.util.Scanner;

public class pro_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		double decrement = ((b*b)-(4*a*c));
		double x_1 = ((-b+Math.sqrt(decrement))/2*a);
		double x_2 = ((-b-Math.sqrt(decrement))/2*a);
		if (x_1 == x_2) {
			System.out.println("The roots are Equal");
			System.out.println("The roots are :- "+x_1);
		}
		else {
		System.out.println("The roots are :- "+x_1);
		System.out.println("The roots are :- "+x_2);
		}
		input.close();

	}

}
