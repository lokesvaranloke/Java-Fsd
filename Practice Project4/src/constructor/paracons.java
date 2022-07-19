package constructor;

public class paracons {
	int n;
	paracons(int a){
		n=a;
		System.out.println("The no is "+n);
	}

	public static void main(String[] args) {
		
		paracons p1 = new paracons(10);
		paracons p2 = new paracons(20);
		paracons p3 = new paracons(30);
	}

}
