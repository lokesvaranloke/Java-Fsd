package oops;

public class MultInheriTest {

	public static void main(String[] args) {
		
		MultInheriCar c = new MultInheriCar();
		c.car();
		c.Vehicle();
		System.out.println();
		
		MultInheriBus b = new MultInheriBus();
		b.bus();
		b.Vehicle();
	}
}
