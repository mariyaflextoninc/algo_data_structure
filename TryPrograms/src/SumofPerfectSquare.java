import java.util.ArrayList;
import java.util.List;

public class SumofPerfectSquare {
	private static ArrayList<Integer> alist ;
	public static void main(String[] args) {
		alist = new ArrayList<Integer>();
		getResult(200);
		
		System.out.println(alist.toString()+","+alist.size());
	}
	public static void getResult(int k ){
		getleastSumofPSquare(k);
	}
	public static void getleastSumofPSquare( int k ){
		int temp = 0;
		do{
			int sq = (int) Math.sqrt(k);
			temp = k - (sq*sq);
			System.out.println(temp);
			
			alist.add(Integer.valueOf(sq * sq));
			if(temp != 0){
				k= temp;
			}

		}while(temp>0);
		 
	}
}
