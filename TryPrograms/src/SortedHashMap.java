import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortedHashMap {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hMap = new HashMap<Integer,Integer>();
		hMap.put(20, 12);
		hMap.put(12, 10);
		hMap.put(3, 5);
		
		List<Map.Entry<Integer, Integer>> hList = new LinkedList(hMap.entrySet());
		Collections.sort(hList,new Comparator(){
			public int compare(Object obj1, Object obj2){
				return ((Comparable)((Map.Entry)obj1).getValue()).compareTo(((Map.Entry)obj2).getValue()));
			}
		});
	}

}
