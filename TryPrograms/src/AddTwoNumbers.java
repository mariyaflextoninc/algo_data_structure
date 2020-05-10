
public class AddTwoNumbers {

	public static void main(String[] args) {
		System.out.println("Sum = "+ bitAdd(10, 15));
		System.out.println("Sum = "+ iterateAdd(10, 15));
	}
	
	public static int bitAdd(int a , int b){
		while(b != 0){
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;	
		}
		return a;
		
	}
	public static int iterateAdd(int a , int b){
		if(b == 0)
			return a;
		int carry = a & b;
		a = a ^ b;
		b = carry << 1;
		return iterateAdd(a,b);
	}

}
