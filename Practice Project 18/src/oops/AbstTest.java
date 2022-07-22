package oops;

public class AbstTest {

	public static void main(String[] args) {
		
		AbstBenz b = new AbstBenz();
		b.accelerate();
		b.same();
		System.out.println();
		AbstAudi a = new AbstAudi();
		a.accelerate();
		a.same();
	}
}
