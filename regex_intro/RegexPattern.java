package regex_intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
	public static void main(String[] args) {
		
		
//				String str = "Hello World\ntoday is 22";
//				String regex = ".";
//				Pattern pattern = Pattern.compile(regex);
//				Matcher matcher = pattern.matcher(str);
//				
//				while(matcher.find()) {
//					System.out.print(matcher.group());
//				}

		
		
		//String str1 = "This is a good day, be good CACEY 17";
		String s = "adam plucked the apple and gave it to aaron";
		String s1 = "this is rom";
		
		//String regex = "[a-z\\d]";
		//String regex = "[\\w\\s,]";
		
		String str = "aaaa a aa aaa";
		String regex ="a{3}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);

		if(matcher.find()) {
			System.out.print(matcher.group());
		}

	}

}
