/**
 * Write a program to print the common elements of two sorted arrays
 * @author Mariya
 *
 */
public class TwoSortedArrays {
	
	
	public static void main(String[] args) {
		int a[] = new int[]{3,5,7,8,9,12,23};
		int b[] = new int[]{4,6,10,11,12,13,14,18};
	 new TwoSortedArrays().findCommonElement(a, b);
	}
	public void findCommonElement(int[] a, int[] b){
		int i = 0;
		int j = 0;
		while(i < a.length && j< b.length){
			if(a[i] > b[j]){
				j++;
			}
			else if(b[j] > a[i]){
				i++;
			}
			else{
				System.out.println(" common element found is "+a[i]);
				i++;
				j++;
			}
			
		}
	}

}
