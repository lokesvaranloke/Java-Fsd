package synchronize;

public class display {

	public synchronized void sayhello(String name) {

		String tname = Thread.currentThread().getName();

		for (int i = 1; i <= 5; i++) {
			System.out.println(tname + ": " + i + " How are you " + name);
		}

	}
}
