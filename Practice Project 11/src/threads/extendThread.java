package threads;

public class extendThread extends Thread {
	
	public static void main(String[] args) {
		
		extendThread th = new extendThread();
		th.start();
		for(int j=1;j<=10;j++) {
			System.out.println("j : "+j);
		}
	}

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println("i : "+i);
		}
	}
}
