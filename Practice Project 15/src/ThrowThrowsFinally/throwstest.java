package ThrowThrowsFinally;

import java.io.*;

public class throwstest {

	public static void main(String[] args) {

		throwstest t = new throwstest();
		try {
			t.readFromFile();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}

	}

	void readFromFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("C:\\java\\example.txt");
	}
}
