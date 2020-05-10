/**
 * Given an unsorted of distinct integers, find the largest pair sum in it.
 * For example, the largest pair sum in {12, 34, 10, 6, 40} is 74.
 * @author Mariya
 *
 */
public class MaxSumofArray {

	public static void main(String[] args) {
		findMaxpairSum(new int[]{6,50,10,4,1,5,3,2,50});

	}
	public static int[] findMaxpairSum(int inut[]){
		int result[] =   new int[2];
		int first = 0;
		int second = 0;
		if(inut.length<=2 ){
			return inut;
		}
		if(inut[0]>inut[1]){
			first = inut[0];
			second = inut[1];
		}
		else{
			first = inut[1];
			second = inut[0];
		}
		int i = 2;
		while(i < inut.length){
			if(inut[i]>first){
				second = first;
				first = inut[i];
				System.out.println(first+","+second);
			}
			else if(inut[i] > second){
				second = inut[i];
			}
			i++;
		}
		result[0]= first;
		result[1] = second;
		System.out.println(first+","+second);
 		return result;
	}

}
