package DiamondProblem;

public class test implements interface1,interface2{

	public void display() {
		interface1.super.display();
		interface2.super.display();
	}
	
	public static void main(String[] args) {
		
		test t = new test();
		t.display();
	}

}
