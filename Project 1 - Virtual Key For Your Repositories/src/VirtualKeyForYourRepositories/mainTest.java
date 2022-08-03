package VirtualKeyForYourRepositories;

import java.util.Scanner;

public class mainTest {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			BusinessOperations bo = new BusinessOperations();
			
			System.out.println("\n\tWelcome to Virtual Key Repository\n");
			System.out.println("\t    Developer : Lokesvaran V");
			System.out.println("\t    Company   : XYZ Pvt Ltd");
			System.out.println("________________________________________________________");
			while(true) {
				int ch;
				
				System.out.println("\n Choose any one of the following\n");
				System.out.println(" 1. To list the files in the directory");
				System.out.println(" 2. To do Business level Operations");
				System.out.println(" 3. To close the application");
				ch = sc.nextInt();
				switch(ch) {
				
				case 1:
					bo.ListFiles();
					break;
					
				case 2:
					System.out.println("\n Choose any one of the following\n");
					System.out.println(" 1. Add a file in the directory");
					System.out.println(" 2. Delete a file in the directory");
					System.out.println(" 3. Search a file in the directory");
					int ch1;
					ch1=sc.nextInt();
					switch(ch1) {	
					case 1:
						System.out.println("Enter filename to create :");
						String createFile = sc.next();
						bo.AddFiles(createFile);
						break;
						
					case 2:
						System.out.println("Enter filename to delete :");
						String deleteFile = sc.next();
						bo.DeleteFiles(deleteFile);
						break;
							
					case 3:
						System.out.println("Enter filename to search :");
						String searchFile = sc.next();
						bo.SearchFiles(searchFile);
						break;
					
					default:
						System.out.println("Invalid Input - Give range from 1 - 3");
					}
					break;
					
				case 3:
					sc.close();
					System.out.println("\nApplication Closed - Thanks For Using");
					System.exit(1);
					break;
					
				default:
					System.out.println("Invalid Input - Give range from 1 - 3");
				}
			}
		}
}
