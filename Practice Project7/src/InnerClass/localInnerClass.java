package InnerClass;

class outer1{
	void outerMethod() {
		int n = 2;
		System.out.println("Inside Outer Method");
		class inner1{
			void innerMethod() {
				System.out.println("Inside Inner Method");
				System.out.println("n : "+n);
			}
		}
		inner1 in = new inner1();
		in.innerMethod();
	}
}

public class localInnerClass {

	public static void main(String[] args) {
		
		outer1 ot = new outer1();
		ot.outerMethod();

	}

}
