<<<<<<< HEAD
package filehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void write(String s, File f) throws IOException{
		FileWriter fw = new FileWriter(f, true);
		fw.write(s);
		fw.close();
	}
	
	public static void main(String[] args) {
		
		try {
			File f = new File("C:\\Javafd\\Java fsd\\Java-fsd\\FileHandling\\FilesStored\\TestFile3ForAppend");
			write("File Handling . Now this new string has been successfully appended",f);
		} catch (IOException e){
			System.out.println("Error occured");
		}
	}
	
}
=======
package filehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void write(String s, File f) throws IOException{
		FileWriter fw = new FileWriter(f, true);
		fw.write(s);
		fw.close();
	}
	
	public static void main(String[] args) {
		
		try {
			File f = new File("C:\\Javafd\\Java fsd\\Java-fsd\\FileHandling\\FilesStored\\TestFile3ForAppend");
			write("File Handling . Now this new string has been successfully appended",f);
		} catch (IOException e){
			System.out.println("Error occured");
		}
	}
	
}
>>>>>>> origin
