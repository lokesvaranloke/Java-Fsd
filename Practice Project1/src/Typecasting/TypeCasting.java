package Typecasting;

public class TypeCasting {

	public static void main(String[] args) {		
		System.out.println("Implicit TypeCasting");		
		
		byte b = 10;
		System.out.println("Byte : "+b);
		
		short s = b;
		System.out.println("Short : "+s);	
		
		char a = 'A';
		int i = a;
		System.out.println("Int : "+i);		
		
		long l = a;
		System.out.println("Long : "+l);
		
		float f = a;
		System.out.println("Float : "+f);	
		
		double d = a;
		System.out.println("Double : "+d);
		
		System.out.println("Explicit TypeCasting");
		int i1 = 97;
		System.out.println("Int : "+i1);
		
		char c1 = (char)i1;
		System.out.println("Char : "+c1);
		
		byte b1 = (byte)i1;
		System.out.println("Byte : "+b1);
		
		double d1 = 88.0d;
		System.out.println("Double : "+d1);
		
		int n = (int)d1;
		System.out.println("int : "+n);
	}

}
