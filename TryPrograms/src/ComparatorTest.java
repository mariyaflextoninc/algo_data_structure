import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ComparatorTest {
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		Player playerArr[] = new Player[n];
		int i = 0 ;
		StringTokenizer st ;
		String str;
		while(i < n ){
			
			str = br.readLine().trim();
			st = new StringTokenizer(str);
			playerArr[i] = new Player();
			playerArr[i].name = st.nextToken();
			playerArr[i].score = Integer.parseInt(st.nextToken());
			i++;
		}
		Arrays.sort(playerArr,ComparatorDesc.desc);
		for(int j=0;j<playerArr.length;j++)
		  {
				System.out.println(playerArr[j].name+" "+playerArr[j].score);
		  }
		  
	}

}
class Player{
	public String name;
	public int score;
}

class ComparatorDesc{
	
	public static Comparator<Player> desc = new Comparator<Player>() {
	
		public int compare(Player obj1, Player obj2){
			int result = 0;
			if(obj1.score == obj2.score){
				result = obj1.name.compareTo(obj2.name);
			}
			else{
				result = obj2.score - obj1.score ;
			}
			return result;
		}
	};
}
