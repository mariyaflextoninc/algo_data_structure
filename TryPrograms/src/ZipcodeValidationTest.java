import mycode.Range;

public class ZipcodeValidationTest {
	
	
	public void before(){
		
	}
	@DataProvider(name = "positiveTest")
	public Object[][] dataProvider_pt(){
		return new Object[][]{{new Range(94226,94399)},
			{new Range(94133,94133),new Range(94200,94299)}};
	}
	public void test(){
		
	}
	public void after(){
		
	}

}
