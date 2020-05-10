
public class GroupElemntsInanArray {

	public static void main(String[] args) {
		//int arr[] = goupArray(new int[]{1,-2,3,-4,0,-9,5});
		//int arr2[] =goupArray(new int[]{1,0,1,0,-2,-3,-4,5});
		int arr3[] =goupArray(new int[]{0,1,0,-2,-3,5});
		
	}
	public static int[] goupArray(int arr[]){
		int pp = -1;
		int pn = -1;
	    for(int i = 0; i <arr.length;i++){
	    	if((arr[i]>0) && ( pp == -1)){
	    		pp = i;
	    	}
	    	else if((arr[i] < 0 )&& (pn <= i)){
	    		pn++;
	    		int temp = arr[i];
	    		arr[i] = arr[pn];
	    		arr[pn] = temp;
	    	}
	    	if(arr[i] == 0 && pp >= 0){
	    		if(arr[pp]>0){
	    			arr[i] = arr[pp];
	    			arr[pp] = 0;
	    			pp++;
	    		}
	    	}
	    }
		for(int i =0; i < arr.length;i++){
			System.out.println(arr[i]);
		}
		return arr;
	}
}
