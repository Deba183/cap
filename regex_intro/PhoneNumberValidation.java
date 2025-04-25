package regex_intro;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
	public static void main(String[] args) {
		String regex = "^[789]\\d{9}";
		String text = "9538203920, 8896543256";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group()+"  "+matcher.start());
		}
		System.out.println("hi");
		
//		if(matcher.find()) {
//			System.out.println(matcher.group()+"  "+matcher.start());
//		
//			
//		}
//		else {
//			System.out.println("match not found");
//		}
				
	}

}
