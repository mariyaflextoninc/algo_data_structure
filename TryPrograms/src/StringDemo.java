
public class StringDemo {
	
	public static void main( String args[]){
		
		String s = "Sachin";
		//String temp = "Sachin";
		String ab = s;
		
		if(s == ab){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	
	 s = s+" Hello";
	 System.out.println(s);
	 System.out.println(ab);
		
	}

}
