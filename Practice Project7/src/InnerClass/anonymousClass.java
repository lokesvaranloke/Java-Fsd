package InnerClass;

public class anonymousClass {
	
	static anonymousClass1 a = new anonymousClass1() {
	
	void show() {
		super.show();
		System.out.println("Base class");
	}
};


	public static void main(String[] args) {
		a.show();
		
	}

}
