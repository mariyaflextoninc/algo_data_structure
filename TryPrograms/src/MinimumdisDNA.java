import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumdisDNA {

	public static void main(String[] args) {
		minMutation("AACCGGTT","AACCCCCC",new String[]{"AACCGGTT","TACCGGTT","TTCCGGTT","TTCCGGTT","AACCCCCC"});
	}
	
	public static int minMutation(String start, String end,String[] bank){
		char[] chars={'A','C','G','T'};
		HashSet<String> set = new HashSet();
		Queue<Container> q = new LinkedList();
		q.add(new Container(start,0));
		
		while(q.isEmpty()){
			Container con = q.poll();
			char []str = con.word.toCharArray();
			
			for(int i =0;i<str.length;i++){
				char ch = str[i];
				for(char c : chars){
					if(c != str[i]){
						str[i] = c;
						String str2 = String.valueOf(str);
						if(str2.equals(end)){
							return con.steps++;
						}
						if(set.contains(str2)){
							q.add(new Container(str2, con.steps++));
						}
					}
				}
				str[i] = ch;
			}
		}
		return 0;
		
	}

}
class Container{
	String word;
	int steps;
	public Container(String word,int steps){
		this.word = word;
		this.steps = steps;
	}
}
