import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Giving a string and an string dictionary, find the longest string in dictionary which can formed by deleting some characters of the giving string. 
eg:S = abpcplea, Dict = {ale, apple, monkey, plea}, the return "apple"
 * @author Mariya
 *
 */
public class FindCharactersTobeDeleted {

	public static void main(String[] args) {
		System.out.println("Resultant string = "+getLongestString("abpcplea", new String[]{"ale", "apple", "monkey", "plea"}));
	}
	
	public static String getLongestString(String input, String[] dictionary){
		TreeSet<String> dict_set = (TreeSet<String>) convertHashSet(new HashSet<String>(Arrays.asList(dictionary)));
		
		Iterator<String> itr = dict_set.descendingIterator();
		while(itr.hasNext()){
			int k = 0;
			int j = 0;
			String s = itr.next();
			System.out.println("String = "+s);
			if(input.length() == s.length()){
				if(input.equals(s)){
					return input;
				}
			}
			else if(input.length() > s.length()){
				
				for(int i = 0;i<input.length();i++){
					if((input.length() - i)< (s.length() - k) || (k == s.length() -1)){
						break;
					}
					else if(input.charAt(i) == s.charAt(k)){
						k++;
					}
					
				}
				if(k == s.length() -1){
					return s;
				}
			}
		}
		return null;
	}
	// convert hash set to tree set 
	
	public static Set<String> convertHashSet(Set<String> set){
		TreeSet<String> treeSet = new TreeSet<>( new Comparator<String>() {
			public int compare(String o1, String o2){
				if(o1.length() > o2.length()){
					return 1;
				}else{
					return -1;
				}
			}
		});
		for(String s : set){
			treeSet.add(s);
		}
		return treeSet;
	}
}
