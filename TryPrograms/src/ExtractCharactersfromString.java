import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCharactersfromString {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("(.*)(\\d+)([+-]?\\d+)");
		Matcher m = p.matcher("231abc-378abj@03n");
		int result =0;
		while(m.find()){
			result = result + Integer.parseInt((m.group(3)));
			System.out.println(m.group(1));
			System.out.println(m.group(2));
			System.out.println(m.group(3));
		}
		System.out.println("Result ="+result);
	}
	
}
