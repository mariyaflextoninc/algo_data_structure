import java.io.*;
import java.util.*;

public class StairCase {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	       int d = sc.nextInt();
	       int arr[] = new int[n];
	       int i =0;
	       while(i<n){
	           if(sc.hasNext()){
	             arr[i++] = sc.nextInt();
	           }
	       }
	        shiftArray(arr,d);
	    }
	    
	    public static void shiftArray(int[] arr, int d){
	        
	        for(int i =0;i<d;i++){
	            int k = arr.length -2;
	            int j =arr.length -3;
	             int temp = arr[k];
	          while(j>0){
	        	   arr[k] = arr[k -1];
	        	   arr[j] = temp;
	               j--;
	               temp  = arr[j];
	               
	               
	              k--;
	           }
	           arr[arr.length -1] = temp;
	            
	        }
	        for(int i =0;i<arr.length;i++){
	                System.out.print(arr[i]+" ");
	        }
	    }
}