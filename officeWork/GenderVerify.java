package officeWork;
//Given some words of Gender, the task is to check if they are valid or not using regular expressions. The correct responses can be as given below:
//
//Male / male / MALE / M / m
//Female / female / FEMALE / F / f
//Not prefer to say
//Input: M
//Output: True
//
//Input: S
//Output: False



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenderVerify {

	public static void main(String[] args) {
		String input = "d";
		String regex = "(?:m|M|Male|male|MALE|f|F|Female|female|FEMALE|Not prefer to say)$";
		
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(input);
		
		System.out.println("Output:"+matcher.matches());

	}

}
