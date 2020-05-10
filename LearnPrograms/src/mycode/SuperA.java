package mycode;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

abstract public class SuperA {
	public SuperA(){
		System.out.println("Constructor");
	}
	protected int a = 2;
	
	protected int getA(){
		System.out.println("This is SuperA' s A() method");
		return a++;
	}
	public int getC(){
		System.out.println("This is SuperA' s C() method");
		return a+2;
	}
}
