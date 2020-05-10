package mycode;

import newpack.MySuper;

public class ChildOfSuper extends MySuper {

	@Override
    public void thisIsMyMethod(){
    	System.out.println("I am in child");
    }
	
	public void myOwnMethod(){
		System.out.println("This is childs method");
	}

}
