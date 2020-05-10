package mycode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagram {
	private static HashMap<String,ArrayList<Integer>> hMap;
	private static List<String> result;
	public static void main(String[] args) {
		Anagram test = new Anagram();
		System.out.println("Result = "+test.getAnagramList(new String[]{"ram","car" ,"pot","tac","rac","mar","top","cat"}));
		
	}
	
	public List<String> getAnagramList(String strs[]){
		System.out.println("Reached here");
		if(strs == null || strs.length == 0){
			return null;
		}
		hMap = new HashMap<>();
		for(int i =0; i < strs.length;i++){
			char chArr[] = strs[i].toCharArray();
			Arrays.sort(chArr);
			String s = String.valueOf(chArr);
			ArrayList<Integer> list = new ArrayList(); 
			if(!hMap.containsKey(s)){
				list.add(i);
				hMap.put(s, list);
			}else{
				hMap.get(s).add(i);
			}
		}
		result = new ArrayList<>();
		for(List<Integer> l : hMap.values()){
			if(l.size() > 1){
				for(Integer k : l){
					result.add(strs[k]);
				}
			}	
		}
		return result;
	}

}
