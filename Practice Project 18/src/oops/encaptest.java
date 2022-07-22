package oops;

public class encaptest {

	public static void main(String[] args) {
		
		encapsulation e = new encapsulation(25000);
		e.setdetails(101, "John");
		e.deposit(3000);
		e.withdraw(5000);
		e.printdetails();
		encapsulation e1 = new encapsulation(15000);
		e1.setdetails(102, "Sri");
		e1.deposit(3000);
		e1.withdraw(5000);
		e1.printdetails();
	}
}
