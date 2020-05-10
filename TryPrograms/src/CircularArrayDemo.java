
public class CircularArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  , l = 7 , low = 0 , high = 6, mid = 
		System.out.println(getIndex(new int[]{7,8,-1,1,2,3,4,5,6}));
		System.out.println(getIndex(new int[]{2,3,4,5,6}));
	}
	public static int getIndex(int[] arr){
		int low = 0;
		int high = arr.length -1;
		if(arr[low] > arr[high]){
			return findMinMummuSol(arr, low , high);
		}
		else{
			return arr[0];
		}
	}
	public static int findMin(int arr[],int low , int high){
		
		if(low == high){
			return arr[low];
		}
		int mid = ((low + high) - low) / 2;//4
		if(low < mid && arr[mid] > arr[mid +1]){
			return arr[mid +1];
		}                                         //7,8,1,2,3,4,5,6
		if( mid < high && arr[mid]< arr[mid -1]){
			return arr[mid];
		}
		if(arr[high] < arr[mid]){
			return findMin(arr,mid+1, high);
		}
		return findMin(arr,low , mid -1);
	}
	
	public static int findMinMummuSol(int arr[],int low , int high){
		
		if(high == low +1){
			return Math.min(arr[low], arr[high]);
		}
		int mid = ((low + high) - low) / 2;//4
		
		if(arr[mid] < arr[low]){
			return findMin(arr,low, mid);
		}
		return findMin(arr,mid+1 , high);
	}

}
