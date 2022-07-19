package strings;

public class stringbuffer {

	public static void main(String[] args) {
		System.out.println("String Buffer");
		
		StringBuffer s=new StringBuffer("Learning Java");
		s.append("Enjoy your learning");
		System.out.println(s);
		
		s.insert(0, 'i');
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer("java");
		sb.replace(0, 2, "MYL");
		System.out.println(sb);
		
		sb.delete(0, 1);
		System.out.println(sb);

	}

}
