import org.testng.Assert;
import org.testng.annotations.Test;

public class MyArrayListTest {
	MyArrayList<Integer> list;
	public void before(){
		list = new MyArrayList<Integer>();
	}
	
	@Test(expectedExceptions = IndexOutOfBoundsException.class )
	public void test(){
		list = new MyArrayList<Integer>();
		list.add(10);
		list.add(10);
		list.add(10);
		Assert.assertTrue(list.get(4)==4);
		Assert.assertEquals((Integer)list.get(1),new Integer(10));
		
	}
	public void after(){
		// release resources
	}
}
