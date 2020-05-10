package mycode;

import java.util.ArrayList;
import java.util.List;
/**
 * Reverse an array list
 * @author Mariya
 *
 */
public class ReverseList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(9);
		list.add(12);
		list.add(13);
		System.out.println(getReversedList(list));
	}
	
	public static List<Integer> getReversedList(List<Integer> list){
		if(list.size() == 0){
			return new ArrayList();
		}
		
		List<Integer> reversed = getReversedList(list.subList(1, list.size()));
		reversed.add(list.get(0));
		return reversed;
	}

}
