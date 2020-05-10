import java.util.Scanner;

public class Shift3DArray {
	static int arr[][] = new int[4][4];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < 4; i++){
			for(int j = 0; j < 4;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0 ; i < 4; i++){
			
			for(int j = 0; j < 4;j++){
				System.out.println(arr[i][j]+"  ");
			}
			System.out.println("\n");
		}
		chiftElementsInArray(arr);
	}
	
	public static int[][] chiftElementsInArray(int[][] arr){
		System.out.println("test ");
		for(int layer = 0; layer <4/2; layer++  ){
			int first = 0;
			int last = 4 - layer;
			for(int j = first ; j < last ; j++){
				int offset = j - first;
				// save top 
				int top = arr[first][j];
				
				// top to left
				arr[first][j] = arr[j][first];
			}
		}
		
		return arr;
	}
	

}
