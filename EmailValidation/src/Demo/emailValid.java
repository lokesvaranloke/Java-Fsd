package Demo;
import java.util.regex.Pattern;

public class emailValid {

	public static String validateId(String email) {
    	if(email == null || email.isEmpty()) {
    		return "Invalid";
    	}
    	String emailRegex = "^[a-zA-Z0-9_+&*-]+"+ "(?:\\\\.[a-zA-Z0-9_+&*-]+"+ ")*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,7}$";
    	
    	Pattern p = Pattern.compile(emailRegex);
    	if(p.matcher(email).matches()) {
    		return "Valid";
    	} else {
    		return "Invalid";
    	}
    }
	public static void main(String[] args) {
        
        String email1 = "hello@gmail.com";
        String email2 = "worldgmail.com";
       
        System.out.println("Email1 = "+validateId(email1));
        System.out.println("Email2 = "+validateId(email2));
 
	}

}
