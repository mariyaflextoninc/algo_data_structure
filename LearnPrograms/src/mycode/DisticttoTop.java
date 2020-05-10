package mycode;

import java.util.Arrays;
/**
 * Write a program to find unique numbers from a sorted array
 * @author Mariya
 *
 */

public class DisticttoTop {

	public static void main(String[] args) {
		int[] arr = removeDuplicates(new int[]{1,1,2,3,4,4,5,6,6});
	}
	
	public static int[] removeDuplicates(int arr[]){
		int p1=0;
		for(int i =1; i < arr.length;i++){
			if(arr[p1] != arr[i]){
				p1++;
				arr[p1] = arr[i];
			}
		}
		for(int j =0;j<p1+1;j++){
			System.out.println(arr[j]);
		}
		return Arrays.copyOf(arr,p1);
	}

}
