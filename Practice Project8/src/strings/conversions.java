package strings;

public class conversions {

	public static void main(String[] args) {
		System.out.println("String to strinBuffer");
		String s = "Java Program";
		StringBuffer sb = new StringBuffer(s);
		sb.append(" is my World");
		System.out.println(sb);
		
		System.out.println("String to stringbuilder");
		String s1 = "Python Program";
		StringBuilder sb1 = new StringBuilder(s1);
		sb1.reverse();
		System.out.println(sb1);
		

	}

}
