package methods;

public class callByValue {

	int multipy(int a, int b) {
		int res = a*b;
		return res;
	}
	
	public static void main(String[] args) {
		
		int res;
		callByValue c = new callByValue();
		res=c.multipy(2, 9);
		System.out.println("Before change "+res);
		
	}
}
