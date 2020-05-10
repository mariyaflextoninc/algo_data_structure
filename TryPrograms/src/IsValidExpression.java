import java.util.HashMap;
import java.util.Stack;

/**
 * How to verify the string which contains alpha-bates,parenthesis and signglle/double quote 
 * 
Ex: AB(CD{"GH"}) is valid 
"A()B' is invalid
 * @author Mariya
 *
 */
public class IsValidExpression {
	private HashMap<Character, Character> hMap;
	
	public IsValidExpression(){
		 hMap = new HashMap<>();
		hMap.put('{', '}');
		hMap.put('(', ')');
		hMap.put('[', ']');
	}

	public static void main(String[] args) {
		String input = "AB(CD{\'GH\"})";
		IsValidExpression obj = new IsValidExpression();
		System.out.println(obj.isValidString(input));
	}
	
	public boolean isValidString(String input){
		Stack<Character> tempStack = new Stack<Character>();
		boolean isAlphaNum = false;
		boolean doubleQFlag = false;
		boolean singleQFlag = false;
		for(int i = 0 ; i < input.length(); i++){
			char ch = input.charAt(i);
			if(hMap.containsKey(ch)){
				tempStack.push(ch);
				isAlphaNum = false;
			}
			else if( Character.isAlphabetic(ch) || Character.isDigit(ch)){
				isAlphaNum = true;
			}
			else if(ch == '\'' && !singleQFlag){
				tempStack.push(ch);
				singleQFlag = true;
			}else if( ch == '\"' && !doubleQFlag){
				tempStack.push(ch);
				doubleQFlag = true;
			}
			else if(!tempStack.isEmpty()){
				if(ch == tempStack.peek()){
					if(ch == '\''){
						singleQFlag = false;
					}
					else if(ch == '\"' ){
						doubleQFlag = false;
					}
					tempStack.pop();
				}else{
					char recntChar = hMap.get(tempStack.pop());
				    if(recntChar != ch && isAlphaNum == true){
				    	return false;
				    }
				}
				isAlphaNum = false;
			}
			else{
				return false;
			}
		}
		if(tempStack.isEmpty() && !singleQFlag && !doubleQFlag){
			return true;
		}
		
		return false;
	}

}
