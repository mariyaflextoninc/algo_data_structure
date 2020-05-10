import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;


public class MergeIntervals {
	/**
	 * Merge intervals
	 * @return
	 */
	public static List<Interval> mergeIntervals(List<Interval> intervals){
		if(intervals.size() < 2){
			return intervals;
		}
		List<Interval> merged = new ArrayList();
		Collections.sort(intervals , new Comparator<Interval>() {
			public int compare(Interval i1, Interval i2){
				if(i1.start != i2.start){
					return i1.start - i2.start;
				}else{
					return i1.end - i2.end;
				}
			}
		});
		System.out.println("Resultant"+intervals.toString());
		Interval prev = intervals.get(0);
		for(int i = 1 ; i <intervals.size() ; i++){
			Interval curr = intervals.get(i);
			if(curr.start > prev.end){
				isExistRemove(merged, prev);
				merged.add(prev);
				prev = curr;
			}
			else{
				Interval obj = new Interval(prev.start,Math.max(prev.end, curr.end));
				isExistRemove(merged, obj);
				merged.add(obj);
				prev = obj;
			}
			//curr = prev;
		}
		return merged;
	}
	public static void isExistRemove(List<Interval> merged, Interval prev){
		if( merged.size()> 0){
			Interval test = merged.get(merged.size() -1);
			if(test.start == prev.start){
				merged.remove(merged.get(merged.size() -1));
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<Interval> list = new ArrayList<Interval>();
		/*list.add(new Interval(1,3));
		list.add(new Interval(2,4));
		list.add(new Interval(6,8));
		list.add(new Interval(7,10));
		list.add(new Interval(5,6));*/
		list.add(new Interval(94600,94699));
		list.add(new Interval(94133,94133));
		list.add(new Interval(94200,94299));
		System.out.println("Result =" +mergeIntervals(list).toString());
	}

}
class Interval {
	Integer start;
	Integer end;
	
	public Interval(Integer start, Integer end){
		this.start = start;
		this.end = end;
	}
	
	@Override
	public String toString(){
		return "["+start+","+end+"]";
	}
	
}
