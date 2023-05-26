package officeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegExp {
	
	
public static void main(String[] args) {
	
	String email = "raja_Lakshmi1983.mahalin@gmail.com";
	
	String regexp= "[a-zA-Z0-9_]+.[a-zA-Z]+@[a-zA-Z]+.[a-z]{2,3}";
	
	Pattern compile = Pattern.compile(regexp);
	Matcher matcher = compile.matcher(email);
	boolean matches = Pattern.matches(regexp, email);
	System.out.println(matcher.matches());
	System.out.println(matches);
	
	String compInfo = "Amazon has 5000 employees in more than 18 states in India";
	String pattern ="\\d+";
	
    Pattern compile2 = Pattern.compile(pattern);
    Matcher matcher2 = compile2.matcher(compInfo);
    
    while(matcher2.find()) {
    	System.out.println(matcher2.group());
    	
    }
	
	
}
	
	
}
