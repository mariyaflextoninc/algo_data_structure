import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class InsertIntervalsMerge {
	private static List<Interval> intervals;
	private List<Interval> merged;
	public static void main(String[] args) {
		
		
	}
	
	public static boolean insert(int s, int e){
		intervals.add(new Interval(s, e));
		Collections.sort(intervals,new Comparator<Interval>() {
			public int compare(Interval i1, Interval i2){
				if(i1.start != i2.start){
					return i1.start - i2.start;
				}else{
					return i1.end - i2.end;
				}
			}
		});
	}
	
	public static void merge(){
		HashSet set = new HashSet<Integer>();
		for(int i =0;i<intervals.size();i++){
			if(intervals.){
				
			}
		}
		
	}
}
