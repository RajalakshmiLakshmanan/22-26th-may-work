package officeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNumbers {
	public static long ExtractNumber(String S){
	
		String num ="";
		String pat= "[0-8]";
		Pattern compile = Pattern.compile(pat);
		Matcher matcher = compile.matcher(S);
		while(matcher.find()) {
			
			num= num + matcher.group();
		}
		
		long output= Long.parseLong(num);
       return output;
    }
	
	
	
	
	public static void main(String[] args) {
		
		String s ="Another input 9007";
		System.out.println(ExtractNumber(s));
		
	}

}
