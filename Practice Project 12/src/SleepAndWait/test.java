package SleepAndWait;

public class test {

	public static void main(String[] args) throws InterruptedException {
		String tname = Thread.currentThread().getName();
		System.out.println(tname+" : Main starts");
		
		sleepandwait sw = new sleepandwait();
		Thread th = new Thread(sw);
		th.setName("SW");
		th.start();
		
		synchronized(th) {
			try {
				th.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Thread.sleep(1500);
			System.out.println(tname+" : value = "+sw.getvalue());
		}
		
		System.out.println(tname+" : Main ends");
	}

}
