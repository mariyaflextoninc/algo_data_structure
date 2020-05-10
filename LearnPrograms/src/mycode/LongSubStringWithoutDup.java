package mycode;

import java.util.HashSet;

public class LongSubStringWithoutDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longSubString("abkblsyhb"));
	}
	
	public static String longSubString(String input){
		int start = 0;
		HashSet<Character> set = new HashSet();
		StringBuilder st = new StringBuilder();
		int max = 0;
		for(int i = 0; i < input.length();i++){
			char c = input.charAt(i);
			if(set.contains(c)){
				for(int j = start;j<i;j++){
					set.remove(st.charAt(j));
					st.deleteCharAt(j);
					if(input.charAt(j) == c){
						start = j+1;
						break;
					}
				}
				set.add(c);
				st.append(c);
			}else{
				set.add(c);
				st.append(c);
				max = Math.max(max, i - start +1);
				
			}
		}
		System.out.println(max);
		return st.toString();
		
	}

}
