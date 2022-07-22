package threads;

public class runnable implements Runnable {

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname +": Runnable implementing");
		
	}

}
