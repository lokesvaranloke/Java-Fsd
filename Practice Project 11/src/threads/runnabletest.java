package threads;

public class runnabletest {
	
	public static void main(String[] args) throws InterruptedException {
		
		String tname = Thread.currentThread().getName();
		System.out.println(tname+" : Main method starts");
		runnable r = new runnable();
		Thread t = new Thread(r);
		t.setName("t1");
		t.start();
		t.join();
		System.out.println(tname+" : Main method stops");
		
	}

}
