package mycode;

public class PrintLessThanGReatThanPattern {

	public static void main(String[] args) {
		PrintLessThanGReatThanPattern obj = new PrintLessThanGReatThanPattern();
		obj.recursion(3,7);
	}
	
	public void recursion(int less,int greatr){
		
		if(less == greatr){
			return;
		}
		System.out.println(less);
		recursion(less+1,greatr);
		System.out.println(less -1);
	}

}
