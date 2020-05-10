import java.util.Stack;

import javax.swing.text.Position;

public class PotfixEvaluate {
	private static int n1;
	private static String str[] = new String[]{"3","4","+","3","5","*","-"};
	
	public static void main( String args[]){
		PotfixEvaluate obj = new PotfixEvaluate();
		System.out.println(obj.evaluate(str));
		
	}
	public int postfixEval(int num1, int num2,String str) throws NumberFormatException{
		int result = 0;
		switch(str){
		case "+" :
			result =  num1+ num2;
			System.out.println(num1+" + "+num2);
			break;
		case "-" :
			result = num2-num1;
			System.out.println(num2+" - "+num1);
			break;
		case "*" :
			result = num1 * num2;
			System.out.println(num1+" * "+num2);
			break;
		case "/" :
			result = num2/num1;
			System.out.println(num2+" / "+num1);
			break;
			
		}
		return result;
	}
    public int evaluate(String strArr[]){
    	Stack<Integer> stck = new Stack<Integer>();
    	int result = 0;
		for(int i = 0; i < strArr.length; i++){
			if(isInteger(strArr[i])){
				stck.push(n1);
			}
			else{
				if(!(stck.isEmpty())){
					result = postfixEval(stck.pop(),stck.pop(),strArr[i]);
					if(i != strArr.length -1){
						stck.push(result);
						
					}else{
						return result;
					}
				}
			}
		}
		return result;
    }
    public boolean isInteger(String str){
    	try{
    		n1 = Integer.parseInt(str);
    	}
    	catch(NumberFormatException e){
    		return false;
    	}
    	return true;
    }
}
