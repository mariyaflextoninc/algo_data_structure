import java.util.Scanner;
import java.util.Stack;

public class PatternDemo {

	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		while(scn.hasNext()){
			String pattern = "(({{}}))";
			System.out.println(isValid(pattern));
		//}
	}
	public static boolean isValid(String word){
		boolean done  = true;
		Stack<Character> patternStack = new Stack<>();
		int length = word.length();
		int i =0;
		while(i<length){
			char chStart = word.charAt(i);
			if((chStart == '(')||( chStart == '{')||(chStart == '[')){
				patternStack.push(chStart);
			}else if(!(patternStack.isEmpty())){
				char chEnd = patternStack.pop();
				if((chEnd ==')' && chStart != '(' )||(chEnd == '{' && chStart != '}')||(chEnd == '[' && chStart != ']')){
					done = false;
					return false;
				}
			}
			else{
				done = false ; 
				return false;
			}
			if(done && patternStack.isEmpty()){
				return true;
			}
			i++;	
		}	
		return true;
	}

}
