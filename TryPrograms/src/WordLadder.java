import java.util.LinkedList;
import java.util.Set;

public class WordLadder {

	public static void main(String[] args) {
		
	}
	
	public static int findWordLadder(String beginWord, String endWord, Set<String> wordDict){
		LinkedList<WordNode> queue = new LinkedList<>();
		queue.add(new WordNode(beginWord ,1));
		
		// add to dictionary
		wordDict.add(endWord);
		
		while(!queue.isEmpty()){
			WordNode word = queue.remove();
			String top = word.word;
			char arr[] = top.toCharArray();
			for(int i =0;i<arr.length;i++){
				
				for(char c = 'a';c<'z';c++){
					char temp = arr[i];
					if(arr[i]!= c){
						arr[i] =c;
					}
					String newWord = arr.toString();
					if(wordDict.contains(newWord)){
						queue.add(new WordNode(newWord, word.steps+1));
						wordDict.remove(newWord);
					}
					arr[i] = temp;
				}
			}
		}
		return 0;
	}

}
class WordNode{
	String word;
	int steps;
	public WordNode(String word, int steps){
		this.word = word;
		this.steps = steps;
	}
}
