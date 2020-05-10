package mycode;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> list =subsets(new int[]{1,2,3,4,5});
		for(ArrayList<Integer> l : list){
			System.out.println(l.toString());
		}
	}
	public static ArrayList<ArrayList<Integer>> subsets(int[] S) {
		if (S == null)
			return null;
	 
		Arrays.sort(S);
	 
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	 
		for (int i = 0; i < S.length; i++) {
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
	 
			//get sets that are already in result
			for (ArrayList<Integer> a : result) {
				temp.add(new ArrayList<Integer>(a));
			}
	 
			//add S[i] to existing sets
			for (ArrayList<Integer> a : temp) {
				a.add(S[i]);
			}
	 
			//add S[i] only as a set
			ArrayList<Integer> single = new ArrayList<Integer>();//
			single.add(S[i]);//1
			temp.add(single);//1
	 
			result.addAll(temp);
		}
	 
		//add empty set
		result.add(new ArrayList<Integer>());
	 
		return result;
	}

}
