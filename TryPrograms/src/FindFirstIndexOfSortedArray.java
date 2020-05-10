import javax.management.RuntimeErrorException;

public class FindFirstIndexOfSortedArray {

	public static void main(String[] args) {
		FindFirstIndexOfSortedArray obj = new FindFirstIndexOfSortedArray();
		System.out.println(obj.getFirstIndex(new int[]{-2,4,8,56,90,100},90));
	}
	/**
	 * Being a QA/QE - Conditions to be noted 
	 * 1.Array length should be greater than 0.
	 * 2.If first element is equal to key then no need to run the loop
	 * 3.if K > last element of array , that means element is not in the array
	 * 4.Loop -
	 *	4.1. low , high and mid are indexes not elements , but compare key with array[mid]
	 * 5.when exit from the loop low will be equal to high , ie. means 
	 * 		5.1 we have found the element / not found
	 * 		5.2 Hence check if array[low] || array[high] ==  key
	 *      5.3 else return -1 
	 * @param arr
	 * @param k
	 * @return
	 */
	public int getFirstIndex(int arr[] , int k){
		if(arr.length == 0 ){
			//throw new RuntimeErrorException(null,"array is null");
			return -1;
		}
		if(arr[0] == k){
			return 1;
		}
		else if (k > arr[arr.length -1]){
			return -1;
		}
		int result = -1;
		int low = 0;
		int high = arr.length - 1;// 2
		while(low < high){
			int mid = (low + high - low)/2;//(2/2)
			if(k< arr[mid]){
				high = mid -1;
			}
			else if(k > arr[mid]){
				low = mid + 1;
			}
			else{
				low = mid;
				high = low;
				break;
			}
		}
		if(arr[low] == k){
			result = low +1;
			int j = low -1;
			while((j > -1) && (arr[low]== arr[j])  ){
				j--;
				result = j +1;
			}
			System.out.println(result);
		}
		return result;
	}
}
