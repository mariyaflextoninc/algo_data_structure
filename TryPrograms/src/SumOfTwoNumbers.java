
public class SumOfTwoNumbers {

	public static void main(String[] args) {
		addSum(0 , 5);
		addSum(-1 , 3);
		addSum(-2 , -9);
		addSum(0 , -9);
		addSum(3, 2);
	}
	
	public static int addSum(int a , int b){
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		int count =0;
		for(int i = 0; i < Math.abs(min);i++){		
			if(a>0 && b>0){
				max++;
			}else{
				max--;
			}
		}
		System.out.println(max);
		return max;
	}

}
