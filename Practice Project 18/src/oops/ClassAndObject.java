package oops;

public class ClassAndObject {

	int id;
	String name;
	
	public static void main(String[] args) {
		
		ClassAndObject a = new ClassAndObject();
		a.getdetails(10, "John");
		a.getdetails(20, "Sri");
	}
	
	void getdetails(int id, String name) {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
	}
}
