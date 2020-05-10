package mycode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZipcodeValidation {

	public static void main(String[] args) {
		ZipcodeRestrict test = new ZipcodeRestrict();
		List<Range> list = new ArrayList();
		/*list.add(new Range(94600,94699));
		list.add(new Range(94133,94133));
		list.add(new Range(94200,94299));*/
		//= [94133,94133] [94200,94299] [94226,94399] 
		list.add(new Range(94226,94399));
		list.add(new Range(94133,94133));
		list.add(new Range(94200,94299));
		List<Range> result = test.getMergedZipcode(list);
		for(int i =0;i<result.size();i++){
			
			System.out.println("Result = "+result.get(i).getLoweRange()+", "+
			result.get(i).getUpperRange());
		}
	}
}

class ZipcodeRestrict {
	private List<Range> merged;
	
	public ZipcodeRestrict(){
		merged = new ArrayList<>();
	}
	/**
	 * 
	 * @param input - list of zip code restriction ranges
	 * @return sorted list of merged ranges
	 */
	public List<Range> getMergedZipcode(List<Range> input){
		Collections.sort(input);
		merged.add(input.get(0));
		int i =0;
		Range prev = input.get(0);
		boolean isRangeWithin = false;
		
		for(i =1;i <input.size();i++){
			Range curr = input.get(i);
			if(curr.getLoweRange() > prev.getUpperRange()){
				ifExistRemove(prev);
				merged.add(prev);
				prev = curr;
				isRangeWithin = false;
			}
			else{
				Range obj = new Range(prev.getLoweRange(),Math.max(prev.getUpperRange(), curr.getUpperRange()));
				ifExistRemove(obj);
				merged.add(obj);
				prev = obj;
				isRangeWithin = true;
			}
			curr= prev;
		}
		if(!isRangeWithin){
			merged.add(input.get(i-1));
		}
		return merged;
	}
	/**
	 * Remove last entry , if the zip code range is present in the mergedlist.
	 * @param newRange
	 */
	public void ifExistRemove(Range newRange){
		if(merged.size() >0){
			Range test = merged.get(merged.size() -1);
			if(newRange.getLoweRange() == test.getLoweRange()){
				merged.remove(test);
			}
		}
	}
}

class Range implements Comparable<Range>{
	private int upperRange;
	private int loweRange;
	public Range(int lowrRange, int uprRange){
		this.loweRange = lowrRange;
		this.upperRange = uprRange;
	}
	
	public int getUpperRange() {
		return upperRange;
	}
	public void setUpperRange(int upperRange) {
		this.upperRange = upperRange;
	}
	public int getLoweRange() {
		return loweRange;
	}
	public void setLoweRange(int loweRange) {
		this.loweRange = loweRange;
	}
	public int compareTo(Range obj1) {
		if(this.loweRange != obj1.loweRange){
			return this.loweRange - obj1.loweRange;
		}else{
			return this.upperRange - obj1.upperRange;
		}
	}
	
	@Override
	public int hashCode(){
		return  loweRange + upperRange;
	}
	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Range ){
			Range range = (Range)obj;
			if(this.loweRange == range.loweRange
					&& this.upperRange == range.upperRange){
				return true;
			}
			else{
				return false;
			}
		}
		return false;
	}
}
