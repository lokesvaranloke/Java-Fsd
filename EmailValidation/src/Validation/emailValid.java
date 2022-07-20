package Validation;
import java.util.Scanner;
import java.util.regex.Pattern;

public class emailValid {

	public static void validateId(String email) {
    	if(email == null || email.isEmpty()) {
    		System.out.println(email+" = This is Invalid");
    	}
    	String emailRegex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}"; 
    	
    	Pattern p = Pattern.compile(emailRegex);
    	if(p.matcher(email).matches()) {
    		System.out.println(email+" = This is valid");
    	} else {
    		System.out.println(email+" = This is Invalid");
    	}
    }
	public static void main(String[] args) {
        
		System.out.println("Enter Email Id");
		Scanner n = new Scanner(System.in);
		String id = n.next();

		validateId(id);

 
	}

}
