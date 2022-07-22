package SleepAndWait;

public class sleepandwait implements Runnable {

	private int sum;

	public int getvalue() {
		return sum;
	}

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + " : Method starts");
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				
				sum += i;
			}
			
		}

		System.out.println(tname + " : Method ends");
	}

}
