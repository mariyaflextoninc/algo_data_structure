
public class SumOfArray {

	public static void main(String[] args) {
		System.out.println(findSum(new long[]{20,27,30,409}));
	}
	public static long findSum(long arr[]){
		long sum1 = 0;
		long sum2 = 0;
		int k = arr.length;
		for(int i =0; i<k/2;i++){
			sum1 += arr[i];
			sum2 += arr[k -i -1];
		}
		if(k % 2 != 0){
			sum1+= arr[k/2];
		}
		sum1+= sum2;
		return sum1;
	}

}
