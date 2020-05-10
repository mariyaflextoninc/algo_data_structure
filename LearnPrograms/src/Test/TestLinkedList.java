package Test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.experimental.theories.DataPoint;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mycode.MLinkList;

public class TestLinkedList {
	MLinkList<Integer> list ;
	
	@BeforeTest
	public void allocateResources(){
		list = new MLinkList();
		System.out.println("allocate resources");
	}
	@DataProvider(name = "dbAdd")
	public Object[][] dPforAdd(){
		return new Object[][]{{11,1},{13,2}};
	}
	
	@Test(dataProvider="dbAdd" )
	public void testAdd(int i1, int i2){
		list.add(i1);
		Assert.assertEquals(list.getSize(), i2);
		System.out.println("this is my test");
	}
	
	@AfterClass
	public void after(){
		System.out.println("Leave resources");
	}

}
