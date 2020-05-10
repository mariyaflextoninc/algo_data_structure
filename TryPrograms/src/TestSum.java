import java.util.ArrayList;
import java.util.List;

public class TestSum {
	public static List reverseList(List<Integer> list){
		if(list == null ){
			return null;
		}
		if(list.size() ==0){
			return new ArrayList<Integer>();
		}
		
		ArrayList<Integer> reversed = (ArrayList<Integer>) reverseList(list.subList(1, list.size()));
		reversed.add(list.get(0));
		return reversed;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(43);
		list.add(34);
		list.add(12);
		list.add(10);
		System.out.println(reverseList(list).toString());

	}

}
