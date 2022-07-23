<<<<<<< HEAD
package FileHandling;

import java.io.File;

class DeleteFile {
	public static void main(String[] args) {
		File f = new File("C:\\Javafd\\Java fsd\\Java-fsd\\Practice Project 17\\FileStored\\TestFileDelete");
		if (f.delete()) {
			System.out.println(f.getName() + " file is deleted successfully");
		} else {
			System.out.println("Unexpected error found");
		}
	}
=======
package FileHandling;

import java.io.File;

class DeleteFile {
	public static void main(String[] args) {
		File f = new File("C:\\Javafd\\Java fsd\\Java-fsd\\Practice Project 17\\FileStored\\TestFileDelete");
		if (f.delete()) {
			System.out.println(f.getName() + " file is deleted successfully");
		} else {
			System.out.println("Unexpected error found");
		}
	}
>>>>>>> origin
}