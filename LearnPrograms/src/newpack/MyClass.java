package newpack;

public class MyClass {

	public static void main(String[] args) {
		CopyConstru a = new CopyConstru();
		a.myMethod(12);
		CopyConstru b = new CopyConstru(a);
		System.out.println("result = "+b.abc());
	}

}
