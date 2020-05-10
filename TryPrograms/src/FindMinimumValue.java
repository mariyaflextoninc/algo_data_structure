/**
 * Given two sorted arrays and a number x, find the pair whose sum is closest to x and the pair has an element from each array.
 * @author Mariya
 *
 */
public class FindMinimumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMinimumValuepair(new int[]{1,4,5,7},new int[]{10,20,30,40}, 15);
	}
	
	public static int[] getMinimumValuepair(int[] inut1, int[] inut2, int x) {
		int[] result = new int[2];
		int res_i = 0;
		int res_j = 0;
		int i = 0;
		int j = inut2.length - 1; 
		int diff = Integer.MAX_VALUE;
		
		while(i < inut1.length && j >= 0){
			int sum = inut1[i]+inut2[j];
			if(Math.abs((sum - x )) < diff){
				diff = Math.abs((sum) -x);
				res_i = i;
				res_j = j;
				System.out.println(diff);
			}
			if(sum > x){
				j--;
			}else{
				i++;
			}
		}
		
		result[0] = res_i;
		result[1] = res_j;
		System.out.println(result[0]+","+result[1]);
		return result;
	}
}
