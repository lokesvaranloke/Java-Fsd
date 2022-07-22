package ThrowThrowsFinally;

public class finallytest {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		try {
			System.out.println("Array index 3 : " + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");
		} finally {
			System.out.println("Array size is : "+a.length);
		}

	}
}
