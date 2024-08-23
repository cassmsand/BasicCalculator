package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter left: ");
		double left = scan.nextDouble();
		
		System.out.print("Enter +,-,*,/,%: ");
		String operand = scan.next();
		
		System.out.print("Enter Right: ");
		double right = scan.nextDouble();
		
		switch (operand) {
			case "+" : System.out.println(left+right);
				break;
			case "-" : System.out.println(left-right);
				break;
			case "*" : System.out.println(left*right);
				break;
			case "/" : System.out.println(left/right);
				break;
			case "%" : System.out.println(left%right);
				break;
		}

	}

}
