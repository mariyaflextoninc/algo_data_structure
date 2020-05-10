
public class MinLengthUnSortedArray {

	public static void main(String[] args) {
		
		minLengthUnSubSortedArray(new int[]{2,4,3,1,7,8,9});
	}
	
	public static void minLengthUnSubSortedArray(int num[] ){
		int s = 0 ; 
		int e = 0;
		for(int i = 0 ; i < num.length;i++){
			if(num[i] > num[i+1]){
				s =i;
				break;
			}
		}
		if(s== num.length -1){
			System.out.println("Entire array is sorted");
			return;
		}
			
		for(int j = num.length -1; j >0;j--){
			if(num[j]<num[j-1]){
				e = j;
				break;
			}
		}
		int max = num[s];
		int min  = num[s];
		for(int i = s ; i < e+1;i++){
			if(num[i]> max){
				max = num[i];
			}
			if(num[i] < min){
				min = num[i];
			}
		}
		
		for(int i = 0;i < s;i++){
			if(num[i]> min){
				s = i;
				break;
			}
		}
		for(int j = num.length-1; j >e +1; j--){
			if(num[j] < max){
				e = j;
				break;
			}
		}
		System.out.println("Starting and ending index = "+s+","+e);
	}

}
