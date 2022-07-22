package synchronize;

public class test {

	public static void main(String[] args) {

		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": main begin");

		display d = new display();

		Thread t1 = new Thread(new display2(d, "Sam"));
		t1.setName("t1");

		Thread t2 = new Thread(new display2(d, "Ram"));
		t2.setName("t2");

		Thread t3 = new Thread(new display2(d, "John"));
		t3.setName("t3");

		t1.start();
		t2.start();
		t3.start();
		System.out.println(tname + ": main end");
	}
}
