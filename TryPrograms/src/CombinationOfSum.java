import java.util.ArrayList;
import java.util.List;

public class CombinationOfSum {

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList();
		List<Integer> curr = new ArrayList<Integer>();
		int k = 3;
		int n = 7;
		combinationSum(list,curr,3,0 ,9);
		for(int i = 0;i <list.size();i++){
			
			System.out.println(list.get(i).toString());
		}
	}
	public static void combinationSum(List<List<Integer>> list,List<Integer> tempList, int k, int start, int remain){
		if(tempList.size() > k){
			return;	
		}
		else if(remain ==0 && tempList.size() == k){
			list.add(new ArrayList<Integer>(tempList));
			return;
		}
		else{
			for(int i= start; i <9;i++){
				tempList.add(i);
				combinationSum(list, tempList, k, i+1, remain-i);
				tempList.remove(tempList.size() -1);
			}
		}
	}

}
