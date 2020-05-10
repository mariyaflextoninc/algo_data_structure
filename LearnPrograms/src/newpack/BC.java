package newpack;

import mycode.SuperA;
class C extends SuperA{
	public C(){
		super();
	}
	@Override
	protected int getA(){
		System.out.println("This is childC' A()s method");
		return a+2;
	}
}
public class BC {
	public BC(){
		
	}
	public static void main(String[] args) {
		SuperA obj = new C();
		//System.out.println(obj.getA());
	}
}