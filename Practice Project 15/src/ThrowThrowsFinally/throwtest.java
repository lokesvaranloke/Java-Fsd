package ThrowThrowsFinally;

public class throwtest {

	public static void main(String[] args) {

		int a = 10, b = 0, res;

		try {
			if (b == 0) {
				throw new ArithmeticException("Cant divide by zero");
			} else {
				res = a / b;
				System.out.println("Res : " + res);
			}
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
