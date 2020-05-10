import java.util.HashSet;

public class LongSubStringWithoutDup {

	public static void main(String[] args) {
		System.out.println(getLongSub("abkblsyhb"));
	}
	
	public static int getLongSub(String s){
		HashSet<Character> hSet = new HashSet<Character>();
		int start =0;
		int max =0;
		for(int i =0;i<s.length();i++){
			char c = s.charAt(i);
			if(hSet.contains(c)){
				for(int j= start;j<i;j++){
					hSet.remove(s.charAt(j));
					if(s.charAt(j) == c){
						start = j+1;
						break;
					}
					
				}
				hSet.add(c);
			}
			else{
				hSet.add(c);
				max = Math.max(max, i-start+1);
			}
		}
		return max;
	}
	

}
