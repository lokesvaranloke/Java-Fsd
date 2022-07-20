package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("programming");
		Matcher matcher = p.matcher("programming language");
		boolean found = matcher.find();
		if(found) {
			System.out.println("Matching");
		} else {
			System.out.println("Not Matching");
		}

	}

}
