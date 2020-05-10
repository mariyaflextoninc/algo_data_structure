
public class MaxJump {

	public static void main(String[] args) {
		System.out.println(maxJump(new int[]{2,1,3,1,4}));
	}
	
	public static int maxJump(int arr[]){
		int reach = 0;
		int lastReach = 0;
		int step = 0;
		for(int i =0; i < arr.length && i <= reach;i++){
			if(i > lastReach){
				lastReach = reach;
				step++;
			}
			reach = Math.max(reach,i+arr[i]);
		}
		if(reach < arr.length -1 ){
			return 0;
		}
		return step;
	}

}
