
public class Recurse7To3 {
	
	public static void main(String args[]){
		printNum(3, 7);
	}
	/**
	 * Recursive function to print numbers
	 * @param num1
	 * @param num2
	 */
	public static void printNum(int num1, int num2){
		
		System.out.println(num1);
		
		if (num1 == num2) return;
		
		printNum(num1 + 1, num2);
		
		System.out.println(num1);
		
	}
	
	
	

}
