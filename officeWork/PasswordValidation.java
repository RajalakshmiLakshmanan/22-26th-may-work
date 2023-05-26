package officeWork;
//Given a password, the task is to validate the password with the help of Regular Expression. A password is considered valid if all the following constraints are satisfied:
//
//It contains at least 8 characters and at most 20 characters.
//It contains at least one digit.
//It contains at least one upper case alphabet.
//It contains at least one lower case alphabet.
//It contains at least one special character which includes !@#$%&*()-+=^.
//It doesn’t contain any white space.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {
		String Regex = "(?=.*[0-9])"+ "(?=.*[a-z])"+"(?=.*[A-Z])"+"(?=.*[!@#$%^&*()+_])"+"(?=\\S+$).{8,20}";
		String input = "Kuttima@700_";
		
		Pattern compile = Pattern.compile(Regex);
		Matcher matcher = compile.matcher(input);
		System.out.println(matcher.matches());
		
		
	}

}
