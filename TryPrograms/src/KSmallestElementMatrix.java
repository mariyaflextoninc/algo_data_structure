public class KSmallestElementMatrix {

	public static void main(String[] args) {
		System.out.println(kthSmallest(new int[][]{{ 1, 5, 9},
			{10, 11, 13},
			{12, 13, 15}}, 3));
	}
	
	public static int kthSmallest(int[][] matrix, int k) {
	    int m=matrix.length;
	 
	    int lower = matrix[0][0];
	    int upper = matrix[m-1][m-1];
	 
	    while(lower<upper){
	        int mid = lower + ((upper-lower))/2;
	        int count = count(matrix, mid);
	        if(count<k){
	            lower=mid+1;
	        }else{
	            upper=mid;
	        }
	    }
	 
	    return upper;
	}
	 
	private static int count(int[][] matrix, int target){
	    int m=matrix.length;
	    int i=m-1;
	    int j=0;
	    int count = 0;
	 
	    while(i>=0&&j<m){
	        if(matrix[i][j]<=target){
	            count += i+1;
	            j++;
	        }else{
	            i--;
	        }
	    }
	 
	    return count;
	}

}
