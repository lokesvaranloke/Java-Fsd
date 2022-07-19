package methods;

public class overload {
	
	public int add(int a,int b,int c) {
		int res=a+b+c;
		return res;
	}
	
	public int add(int a, int b) {
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		
		overload l = new overload();
		int ans1=l.add(5, 5, 5);
		int ans2=l.add(8, 9);
		System.out.println("Ans 1 :"+ans1);
		System.out.println("Ans 2 :"+ans2);
	}

}
