import java.awt.AlphaComposite;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinationPhoneNumber {
	private String[] alphaNums = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetterCombinationPhoneNumber obj = new LetterCombinationPhoneNumber();
		System.out.println(obj.letterCombinations("2").toString());
	}
	public List<String> letterCombinations(String digits) {
	    LinkedList<String> ans = new LinkedList<String>();
	    
	    if(digits.length() == 0  || digits == null){
            return ans;
        }
	    
	    ans.add("");
	    for(int i = 0; i <digits.length();i++){
	    	//System.out.println(Integer.valueOf(String.valueOf(digits.charAt(i)));
            int index = Integer.valueOf(String.valueOf(digits.charAt(i)));
            if(ans.peek().length() == i){
                for(int j = 0; j <alphaNums[index].length();j++){
                   String t = ans.remove();
                   ans.add(t+alphaNums[index].charAt(j));
                }
            }
        }
	    return ans;
	}

}
