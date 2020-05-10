import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
abstract class B{
	protected int a =0;
	public static void main(String args[]){
		System.out.println("test123");
	}
}
public class TryP  {
	static int total =10;
	
	public static void test(){
		int total = 5;
		int  a = 9; 
		int b = 2;
		float f;
		f = a/b;
		Integer n = new Integer(500);
		//int n1 == 1;
		//System.out.println(n1);
		System.out.println("f ="+f);
		f = f/2;
		System.out.println("f ="+f);
		f = a+b/f;
		System.out.println("f ="+f);
	}
	private int data;
	public static void main(String[] args) {
		int data = 0;
		switch(1){
		 default:System.out.println("default");
		 case 1:System.out.println(1);
		 case 2:System.out.println(2);
		}
		StringBuilder sb = new StringBuilder("buffering");
		sb.replace(2, 7, "BUFFER");
		sb.delete(2, 4);
		String  s= sb.substring(1, 5);
		String string = null;
		int i = 1 ;
		int a = i = 5;
		System.out.println(a+"nnnn");
		if(1>2)
				if(1>2)
					System.out.println("nn2");
				else if(2>3)
					System.out.println("nn3");
				else if(3>4)
					System.out.println("nn4");
				else
					System.out.println("nnelse");
		TryP p = new TryP();
		p.test();
		Set<String> set = new LinkedHashSet<String>();
		set.add("3");
		set.add("1");
		set.add("3");
		set.add("2");
		set.add("3");
		set.add("1");
		for(String str:set)
		System.out.println(str+" ");
		int x = 5;
		x = x>>1;
		x = ~x;
		//x = !x;
		
		
		
		

	}

}
