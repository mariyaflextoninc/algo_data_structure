import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample {

	public static void main(String[] args) {
	
		hasMatching("iwiw72h@#$^^%$#hjhs");
		
	}
	
	public static void hasMatching(String word){
		Pattern p = Pattern.compile("^[(A-z)(/D)]");
		Matcher m = p.matcher(word);
		while(m.find()){
			System.out.println(m.group());
			
		}
		
	}

}
