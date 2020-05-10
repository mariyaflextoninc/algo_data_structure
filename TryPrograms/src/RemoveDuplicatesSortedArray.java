import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		int[] arr = new int[]{1,1,2,3,4,4,5,6,7,7};
		int test[] = removeDuplicates(arr);
		for(int i = 0; i < test.length;i++){
			System.out.println(test[i]);
		}
	}
	public static int[] removeDuplicates(int[] arr){
		int k =0;
		for(int  i=1; i < arr.length;i++){
			if(arr[k] != arr[i]){
				k++;
				arr[k] = arr[i];
			}
		}
		return Arrays.copyOf(arr, k +1);
	}

}
