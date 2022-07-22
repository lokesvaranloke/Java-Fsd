package TryCatch;

public class tryAndCatch {

	public static void main(String[] args) {

		int[] a = {1,2,3};
		try {
			System.out.println("Array index 3 : "+a[3]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of bound");
		}
		
	}
}
