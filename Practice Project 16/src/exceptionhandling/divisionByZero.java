package exceptionhandling;

import java.util.Scanner;

public class divisionByZero {

	public static void main(String[] args) {
		
		int a,b,c,d;
		System.out.println("Enter 2 num");
		
		try {
			Scanner sc = new Scanner(System.in);
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			d=a%b;
			System.out.println(a+" / "+b+" = "+c);
		} catch(ArithmeticException e) {
			System.out.println("Division by zero not possible");
		}
		System.out.println();
		System.out.println("Other logics continued");
	}

}
