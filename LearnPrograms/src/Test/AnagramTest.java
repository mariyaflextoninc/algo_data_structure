package Test;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mycode.Anagram;

public class AnagramTest {
	private Anagram anagramObj;
	
	@DataProvider(name ="testAnagram")
	public Object[][] dataProvider(){
		return new Object[][]{{new String[]{"ram","car" ,"pot","tac","rac","mar","top","cat"},new String[]{"ram","mar","car","rac" ,"pot","top","tac","cat"}}};
	}
	
	@BeforeMethod
	public void beforeTest(){
		anagramObj = new Anagram();
	}
	
	@Test(dataProvider = "testAnagram")
	public void test(String[] strs, String[] output){
		//anagramObj = new Anagram();
		//System.out.println(anagramObj.getAnagramList(null));
		Assert.assertEquals(anagramObj.getAnagramList(strs).toArray(), output);
	}
	
	@AfterClass
	public void afterTest(){
		
	}

}
