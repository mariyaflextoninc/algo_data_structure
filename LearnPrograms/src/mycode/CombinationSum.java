package mycode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		ArrayList<Integer> curr = new ArrayList();
		combinationSum(list, curr,3, 0,9);
		System.out.println("resu;t= "+list.toString());
	}
	
	public static void combinationSum(List<List<Integer>> list , List<Integer> tempList ,int k, int start, int remain ){
		if(tempList.size() > k){
			return;
		}
		if(remain == 0 && tempList.size() == k){
			list.add(new ArrayList<Integer>(tempList));
			return;
		}
		for(int i =start;i <9 ; i++){
			tempList.add(i);
			combinationSum(list, tempList, k, i+1, remain-i);
			//sSystem.out.println(tempList.toString());
			tempList.remove(tempList.size() -1);
		}
		
	}

}
