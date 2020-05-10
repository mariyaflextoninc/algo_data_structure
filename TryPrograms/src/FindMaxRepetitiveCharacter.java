
public class FindMaxRepetitiveCharacter {

	public static void main(String[] args) {
		FindMaxRepetitiveCharacter obj  = new FindMaxRepetitiveCharacter();
		obj.getMaxRepetitiveChar("abcdddddddeefffffgiiikk");
	}
	
	public char getMaxRepetitiveChar(String input){
		int max = 0;
		char prev = input.charAt(0);
		char count =0;
	    char resultant = input.charAt(0);
		for(int i =1; i < input.length();i++){
			char ch = input.charAt(i);
			if(prev == ch){
				count++;
			}else{
				count = 1;
			}
			if(count > max){
				max = count;
				resultant = ch;
			}
			prev = ch;
		}
		System.out.println(resultant);
		return resultant;
	}

}
