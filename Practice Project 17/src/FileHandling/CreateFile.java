package FileHandling;

import java.io.File;
import java.io.IOException;

class CreateFile {
	public static void main(String args[]) {
		try {
			File f = new File("C:\\Javafd\\Java fsd\\Java-fsd\\Practice Project 17\\FileStored\\TestFile");
			if (f.createNewFile()) {
				System.out.println("File " + f.getName() + " is created successfully.");
			} else {
				System.out.println("File is already exist");
			}
		} catch (IOException exception) {
			System.out.println("An unexpected error is occurred.");
			exception.printStackTrace();
		}
	}
}