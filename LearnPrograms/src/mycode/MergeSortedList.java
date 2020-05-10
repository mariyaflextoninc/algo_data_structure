package mycode;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedList {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list1.add(2);
		list1.add(4);
		list1.add(5);
		list1.add(9);
		list1.add(11);
		list1.add(12);
		
		list2.add(1);
		list2.add(3);
		list2.add(6);
		list2.add(7);
		list2.add(10);
		System.out.println(meregeList(list1, list2).toString());

	}
	
	public static List<Integer> meregeList(List<Integer> l1, List<Integer> l2){
		ArrayList<Integer> list = new ArrayList();
		int i = 0;
		int j = 0;
		while((i<l1.size())&&(j < l2.size())){
			if(l1.get(i) > l2.get(j)){
				list.add(l2.get(j++));
			}else{
				list.add(l1.get(i++));
			}
		}
		for(;i < l1.size();i++){
			list.add(l1.get(i));
		}
		for(;j<l2.size();j++){
			list.add(l2.get(j));
		}
		return list;
	}

}
