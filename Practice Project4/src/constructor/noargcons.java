package constructor;

public class noargcons {
	
	String name;
	noargcons(){
		System.out.println("No arg Constructor");
		name = "Hello World";
	}

	public static void main(String[] args) {
		noargcons n = new noargcons();
		System.out.println("Name :"+n.name);

	}

}
