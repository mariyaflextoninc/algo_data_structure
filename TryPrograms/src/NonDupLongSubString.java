import java.util.HashMap;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class NonDupLongSubString {
	static StringBuilder longSubStr;
	static int maxLength;
	static HashMap<Character, Integer> hMap;
		
		public static void main(String args[]){
			longSubString("java2jnoice");
			System.out.println(longSubStr);
		}
		
		public static void longSubString(String input){
			int j =0;
			hMap = new HashMap<>();
			for(int i = 0 ; i <input.length();i++){
				Character c = input.charAt(i);
				if(i == input.length()-1){
					getSubString(input,j, i+1,j);
				}
				else if(hMap.containsKey(c)){
					getSubString(input,j, i,hMap.get(c));
					j = hMap.get(c) + 1;
					
				}
				else{
					hMap.put(c, i);
				}
			}
			
		}
		public static  void getSubString(String str1,int x , int j ,int index){
			StringBuilder str = new StringBuilder();
			for(int i = x ; i <j ; i++){
				str.append(str1.charAt(i));
				if(i<= index){
					hMap.remove(str.charAt(i));
				}
			}
			if(maxLength < str.length()){
				maxLength = str.length();
				longSubStr = str;
			}
			
		}

}
