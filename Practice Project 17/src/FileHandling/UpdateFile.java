
package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateFile{
	
	public static void write(String s, File f) throws IOException{
		FileWriter fw = new FileWriter(f);
		fw.write(s);
		fw.close();
	}
	
	public static void main(String[] args) {
		
		try {
			File f = new File("C:\\Javafd\\Java fsd\\Java-fsd\\Practice Project 17\\FileStored\\TestFile3Update");
			write("File Handling . Now this new string has been successfully Updated",f);
			System.out.println("Update successful");
		} catch (IOException e){
			System.out.println("Error occured");
		}
	}
}


