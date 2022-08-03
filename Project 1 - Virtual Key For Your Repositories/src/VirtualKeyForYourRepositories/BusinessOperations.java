package VirtualKeyForYourRepositories;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class BusinessOperations {

	public String[] FileSort(String[] s, int n) {
		String temp = "";
		for(int i=0; i<n; i++){
			for(int j=1; j<(n-i); j++){
				if(s[j-1].compareToIgnoreCase(s[j])>0){
					temp = s[j-1];
					s[j-1]=s[j];
					s[j]=temp;
				}
			}
		}
		return s;
	}

	public void ListFiles() {
		int filecount = 0;
		ArrayList<String> filenames = new ArrayList<>();
		
		File f = new File("C:\\Javafd\\Java fsd\\Java-fsd\\Project 1 - Virtual Key For Your Repositories\\StoreFiles");
		File[] AllFiles = f.listFiles();
		filecount=AllFiles.length;
		
		System.out.println("Files In Ascending Order : ");
		for(int i=0;i<filecount;i++) {
			if(AllFiles[i].isFile()) {
				filenames.add(AllFiles[i].getName());
			}
		}
		
		String[] str = new String[filenames.size()];
		
		for(int i=0;i<filenames.size();i++) {
			str[i]=filenames.get(i);
		}
		
		String[] sorted_names = FileSort(str, str.length);
		
		for(String i:sorted_names) {
			System.out.println(i);
		}
	}
	
	
	public void AddFiles(String newFile) {
		File f = new File(("C:\\Javafd\\Java fsd\\Java-fsd\\Project 1 - Virtual Key For Your Repositories\\StoreFiles")+"\\"+(newFile));
		
		try {
			if(f.createNewFile()) {
				System.out.println("File Created ");
			} else {
				System.out.println("File Already Exists ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void DeleteFiles(String deleteFile) {
		File f = new File(("C:\\Javafd\\Java fsd\\Java-fsd\\Project 1 - Virtual Key For Your Repositories\\StoreFiles")+"\\"+(deleteFile));
		if(f.exists()) {
			if(f.delete()) {
				System.out.println("File Deleted Successfully ");
			} else {
				System.out.println("File Not Found");
			}
		}
	}
	
	public void SearchFiles(String searchFile) {
		File f = new File(("C:\\Javafd\\Java fsd\\Java-fsd\\Project 1 - Virtual Key For Your Repositories\\StoreFiles")+"\\"+(searchFile));
		if(f.exists()) {
			System.out.println("File Found");
		} else {
			System.out.println("File Not Found");
		}
	}
}
