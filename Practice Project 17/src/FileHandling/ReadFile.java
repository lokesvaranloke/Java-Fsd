<<<<<<< HEAD
package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		
		try {
			File f = new File("C:\\Javafd\\Java fsd\\Java-fsd\\Practice Project 17\\FileStored\\TestFile2");
			Scanner s = new Scanner(f);
			while(s.hasNextLine()) {
				String data = s.nextLine();
				System.out.println(data);
			}
			s.close();
		}catch(FileNotFoundException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}
=======
package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		
		try {
			File f = new File("C:\\Javafd\\Java fsd\\Java-fsd\\Practice Project 17\\FileStored\\TestFile2");
			Scanner s = new Scanner(f);
			while(s.hasNextLine()) {
				String data = s.nextLine();
				System.out.println(data);
			}
			s.close();
		}catch(FileNotFoundException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}
>>>>>>> origin
}