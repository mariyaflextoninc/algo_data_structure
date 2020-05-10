package mycode;

public class FakeGold {

	public static void main(String[] args) {
		findFakeGold(new int[]{10,10,7,10,10,10,10,10});

	}
	
	public static void findFakeGold(int arr[]){
		int low = 0;
		int mid = arr.length/2;
		int high = arr.length;
		while(low < high){
			mid = low + (high -low)/2;
			boolean first = findSum(low, mid, arr);
			boolean second = findSum(mid, high, arr);
			if(first){
				high = mid;
			}else{
				low = mid;
			}
		}
		if(low == high){
			System.out.println("index ="+ low );
		}
	}
	
	public static boolean  findSum(int start, int end , int arr[]){
		int sum = 0;
		int fakeSum = (end - start) *10;
		for(int i = start; i < end;i++){
			sum += arr[i];
		}
		return sum != fakeSum? true:false;
	}

}
