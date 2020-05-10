import java.util.Stack;

public class EvaluateMathExpression {

	public void calculate(String expression){
		Stack<Character> ops = new Stack();
		Stack<Integer> values = new Stack();
		
		for(int i =0; i < expression.length();i++){
			char ch = expression.charAt(i);
			StringBuilder sb = new StringBuilder();
			if(ch >= '0' || ch <= '9' ){
				while(!(ch == ' ')){
					
					sb.append(ch);
					ch = expression.charAt(i);
				}
				values.push(evaluate(String.valueOf(ch), values.pop(), values.pop())z);
			}
			else{
				evaluate(); 
			}
		}
	}
	
	public int evaluate(String opr, int a , int b){
		int result = 0;
		switch(opr){
		case "+": 
			result  = a + b;
			break;
		
		case "-" :
			result = a - b;
			break;
			
		case "*" : 
			result = a * b;
			break;
		case "/" :
			result = a / b;
			break;
		default : 
			System.out.println("test ");
		}
		return result;
	}
	
	
	public static void main(String args[]){
		
	}
}
