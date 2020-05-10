
public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean jumpGame(int arr[]){
		int max = arr[0];
		if(arr.length == 0){
			return true;
		}
		for(int i = 0; i < arr.length;i++){
			if(max <= i && arr[i] == 0 ){
				return false;
			}
			if(i+arr[i]> max){
				max = i+ arr[i];
			}
			if(max >= arr.length -1){
				return true;
			}
		}
		return false;
		
	}

}
