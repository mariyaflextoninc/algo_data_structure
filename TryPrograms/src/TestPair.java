import java.util.HashMap;
import java.util.Scanner;

public class TestPair {
	public static int getMaxList(int[] arr, int n, int[][] matr){
        int max =0;
        for(int i = 0; i <n;i++){
           
         arr[matr[i][0] -1]  += matr[i][2];
         arr[matr[i][1] -1]  += matr[i][2];
            
        }
        max = arr[0];
        for(int k = 0; k < arr.length;k++){
           if(max < arr[k]){
              max = arr[k]; 
           } 
        }
        return max;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int m =0;
        int n = 0;
        m = sc.nextInt();
        n = sc.nextInt();
        int arr[] = new int[m];
        int matr[][] = new int[n][3];
      for(int i = 0 ; i < matr.length; i++){
          for(int j = 0; j <3;j++){
             if(sc.hasNext()){
                  matr[i][j] = sc.nextInt();
              }
               
          }
         
      }
        System.out.println(getMaxList(arr,n,matr));
    }

}
