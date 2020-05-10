import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		System.out.println(findSum(new Integer[]{1,0,2,1,0,3,0,2,1,1,1,1}, 3).toString());
	}
	
	public static List<ArrayList<Integer>> findSum(Integer arr[],int sum){
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr));
		List<ArrayList<Integer>> list2 = new LinkedList<ArrayList<Integer>>();
		int start = 0;
		int result = arr[start];
		int p = 0;
		for(int i = 1 ; i < arr.length;i++){
			
			while(result > sum && start < i ){
				result = result - arr[start];
				start = start+1;
			}
			int temp = result;
			p = start;
			while(result == sum && p < i){
				list2.add(new ArrayList<Integer>(list1.subList(p, i)));
				result -= arr[p];
				p = p + 1;
			}
			result = temp;
			result = result+arr[i];
		}
		return list2;
	}

}
