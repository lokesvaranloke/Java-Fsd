package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("C:\\Javafd\\Java fsd\\Java-fsd\\FileHandling\\FilesStored\\TestFile1");
			fw.write("File Handling - Write operation successfuly completed");
			fw.close();
			System.out.println("Write is successfully completed");
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}
