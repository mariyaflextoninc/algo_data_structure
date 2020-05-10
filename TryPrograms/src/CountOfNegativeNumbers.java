import java.util.HashMap;
import java.util.Map;

public class CountOfNegativeNumbers {
	//sorted matrix
	public static void main(String[] args) {
		int matrix[][] = new int[][]{{-4,-3,-2,3},{-3,-2,1,4},{-2,-1,2,5},{-1,0,3,6}};
		
		HashMap<Integer, Integer> hMap = new HashMap<>();
		hMap = negativeNumberCount(matrix, 4, 4);
		for(Map.Entry<Integer, Integer> entry : hMap.entrySet()){
			System.out.println(" row = "+entry.getKey()+" count of negative numbers in row = "+entry.getValue());
		}
	}
	public static HashMap<Integer,Integer> negativeNumberCount(int matrx[][] , int m , int n){
		HashMap<Integer, Integer> hMap = new HashMap<>();
		int i = 0 ; 
		int j = n-1;
		int count = 0;
		while(i<m && j<n){
			count = 0;
			if(matrx[i][j]<0){
				count= count+ j+1;
				hMap.put(i, count);
				i++;
			}
			else{
				j--;
			}
			
		}
		return hMap;
	}
	
}
