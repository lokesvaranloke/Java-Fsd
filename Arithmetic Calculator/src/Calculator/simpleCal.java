package Calculator;

import java.util.Scanner;


public class simpleCal {

	public static void main(String[] args) {
		System.out.println("Arithmetic Calculator");
		System.out.println();
		Scanner n = new Scanner(System.in);
		
		char op;
		System.out.println("Choose any one of the following: + , - , * , / ");
		op=n.next().charAt(0);
		
		double n1,n2,res;
		System.out.println("Enter 1st number");
		n1=n.nextDouble();
		System.out.println("Enter 2nd number");
		n2=n.nextDouble();
		
		switch(op) {
		case '+':
			res=n1+n2;
			System.out.println("Number1 + Number2 = "+res);
			break;
		
		case '-':
			res=n1-n2;
			System.out.println("Number1 - Number2 = "+res);
			break;
		case '*':
			res=n1*n2;
			System.out.println("Number1 * Number2 = "+res);
			break;
		case '/':
			res=n1/n2;
			System.out.println("Number1 / Number2 = "+res);
			break;
		default:
			System.out.println("Invalid Operator");
			break;
		}

	}

}
