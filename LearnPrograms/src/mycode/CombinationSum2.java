package mycode;

import java.util.ArrayList;
import java.util.List;

class CombinationSum2 {
	public static void main(String[] args) {
		List<ArrayList<Integer>> list =getCombinationSum(new int[]{1,2,3,4,0,5,6,-1},5);
		for(ArrayList l : list){
			System.out.println(l.toString());
		}
	}
	public static List<ArrayList<Integer>> getCombinationSum(int arr[],int k){
		if(arr.length == 0){
			return null;
		}
		List<ArrayList<Integer>> list = new ArrayList();
		ArrayList<Integer> tempList = new ArrayList();
		combinationSum(arr,list,tempList,0,k);
		return list;
	}
	
	public static void combinationSum(int arr[],List<ArrayList<Integer>> list,ArrayList<Integer> tempList, int start, int remain){
		//if we uncomment this then it will work for positive chars
//		if(remain <0){
//			return;
//		}
		if((remain == 0) && (tempList.size()<arr.length)){
			 list.add(new ArrayList<Integer>(tempList));
			 return;
		}
	    for(int i = start; i < arr.length;i++){
	    	tempList.add(arr[i]);
			combinationSum(arr, list, tempList, i+1, remain - arr[i]);
			tempList.remove(tempList.size() -1);
		}
			
			
	}

}
