<<<<<<< HEAD
package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		try {
			File obj = new File("C:\\Javafd\\Java fsd\\Java-fsd\\FileHandling\\FilesStored\\TestFile1");
			if(obj.createNewFile()) {
				System.out.println("File created : "+obj.getName());
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}
=======
package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		try {
			File obj = new File("C:\\Javafd\\Java fsd\\Java-fsd\\FileHandling\\FilesStored\\TestFile1");
			if(obj.createNewFile()) {
				System.out.println("File created : "+obj.getName());
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}
>>>>>>> origin
