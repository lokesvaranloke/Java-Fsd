package methods;

public class methods {

	public int addition(int x, int y) {
		int res = x+y;
		return res;
	}
	
	public static void main(String[] args) {
		
		methods m = new methods();
		int result = m.addition(10, 20);
		System.out.println("The addition is "+result);
	}
}
