package InnerClass;

class outer{
	 class inner{
		 public void show() {
			 System.out.println("Nested class");
		 }
	 }
}

public class nestedInnerClass {

	public static void main(String[] args) {
		
		outer.inner a = new outer().new inner();
		a.show();

	}

}
