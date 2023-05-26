package officeWork;
//Given some Loan Account Number(LAN), the task is to check if they are valid or not using regular expressions. Rules for the valid Loan Account Number are:
//
//LAN is an alphanumeric string i.e., contains only digits (0-9) and uppercase alphabet characters.
//It does not allow whitespaces in it.
//It does not contain special characters.
//It starts with Uppercase alphabets and ends with digits.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoanAccountNo {

	public static void main(String[] args) {
		String input = "4A";
		String regex = "(?=.*[A-Z])"+"(?=.*[0-9])"+"(?=\\S+$).{1,}";
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(input);
		System.out.println("output:"+matcher.matches());
		
	
		
		
	}

}
