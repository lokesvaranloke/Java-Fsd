package strings;

public class stringmethods {

	public static void main(String[] args) {

		System.out.println("String Methods");
		String s=new String("Java Learning");
		System.out.println(s.length());
	
		String sub=new String("Welcome");
		System.out.println(sub.substring(3));
	
		String s1="Hello";
		String s2="Heldo";
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s.isEmpty());

		System.out.println(s.toUpperCase());
		
		
		String x="Welcome to Java";
		String y="WeLcOmE tO JaVa";
		System.out.println(x.equals(y));
	}

}
