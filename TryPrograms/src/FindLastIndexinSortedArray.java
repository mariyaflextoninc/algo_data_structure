
public class FindLastIndexinSortedArray {

	public static void main(String[] args){
		System.out.println(getLastIndex(new int[]{2,4,6,8,9,9,9,10,20,20,20,50}, 20));
	}
	public static int getLastIndex(int arr[], int elem ){
		int j = 0 ;
		int i = arr.length -1;
		
		while(j<i){
			int mid = j + (i -j)/2;
			if(elem == arr[mid]){
				i = j = mid;
				break;
			}
			else if(elem < arr[mid]){
				i = mid - 1;
			}
			else{
				j = mid +1;
			}
		}
		while( i < arr.length){
			if(arr[i] == arr[j]){
				j = i;
				i++;
			}else{
				break;
			}
		}
		
		return i-1;
	}

}
