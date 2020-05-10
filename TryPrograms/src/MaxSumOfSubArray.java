
public class MaxSumOfSubArray {

	public static void main(String[] args) {
		maxSumOfSubArray(new int[]{1,2,-3,4,6,-1,-9,7,8,4},11);
	}
	
	public static int maxSumOfSubArray(int[] arr, int k ){
		int sumso_far = arr[0];
		int result =arr[0];
		int start = 0;
		int prev_st = start;
		int end = 0;
		for(int i =1 ; i < arr.length;i++){
		    if(sumso_far> k || sumso_far<=0){
		    	sumso_far = arr[i];
		    	start = i;
		    }else{
		    	sumso_far += arr[i];
		    }
			if((k - sumso_far < k-result) && (k - sumso_far >=0)){
				prev_st = start;
				result = sumso_far;
				end = i;
			}
		}
		for(int i = prev_st ; i <= end; i ++){
			System.out.println(arr[i]);
		}
		System.out.println(result);
		return result;
	}

}
