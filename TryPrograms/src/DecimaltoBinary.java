import java.util.Stack;

public class DecimaltoBinary {

	public static void main(String[] args) {
		DecimaltoBinary obj  = new DecimaltoBinary();
		obj.printDecimal(24);
	}
	
	public void printDecimal(int number){
		Stack<Integer> stack = new Stack<Integer>();
		while(number > 0){
			int d = number %2;
			stack.push(d);
			number = number/2;
		}
		while(!stack.isEmpty()){
			System.out.print(stack.pop());
		}
	}

}
