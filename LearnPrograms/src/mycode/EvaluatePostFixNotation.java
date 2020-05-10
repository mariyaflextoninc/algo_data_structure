package mycode;

import java.util.HashSet;
import java.util.Stack;

public class EvaluatePostFixNotation {
	private static Stack<Integer> temp ;
	private static HashSet<String> validator;
	
	public EvaluatePostFixNotation(){
		validator = new HashSet();
		validator.add("+");
		validator.add("-");
		validator.add("*");
		validator.add("/");
		validator.add("%");
	}
	public static void main(String[] args) {
		EvaluatePostFixNotation obj = new EvaluatePostFixNotation();
		System.out.println(obj.evaluatePostFix(new String[]{"2","3","+","4","*","5","-"}));
	}
	
	public  Integer evaluatePostFix(String arr[]){
		temp = new Stack();
		Integer result = 0;
		for(int i =0; i < arr.length;i++){
			if(!validator.contains(arr[i])){
				temp.push(Integer.parseInt(arr[i]));
			}
			else{
				result = getSum(arr[i]);
				if(result!= null){
					temp.push(result);
				}
			}
		}
		if(!temp.isEmpty() && temp.size() == 1){
			result = temp.pop();
		}else{
			result = null;
		}
		return result;
	}
	
	public Integer getSum(String str){
		int a = temp.pop();
		int b = temp.pop();
		Integer sum = 0;
		switch(str){
			case "+":sum = a+b;
			break;
			case "-":sum = b-a;
			break;
			case "*":sum = a*b;
			break;
			case "/":sum = b/a;
			break;
		default:
			System.out.println("Invalid input");
			sum = null;
			break;
			
		}
		return sum;
	}

}
