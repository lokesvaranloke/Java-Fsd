package synchronize;

public class display2 implements Runnable{

	display d;
	String name;
	
	display2(display d, String name){
		this.d=d;
		this.name=name;
	}
	@Override
	public void run() {
		d.sayhello(name);
		
	}
}
