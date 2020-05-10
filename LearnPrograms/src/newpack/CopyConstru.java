package newpack;

public class CopyConstru {
	
	private int ab;
	public CopyConstru(){
		
	}
	public CopyConstru(CopyConstru obj2){
		this.ab = obj2.ab;
	}
	
	public int myMethod(int o){
		return ( ab += 12);
	}
	public int abc(){
		return ab;
	}

}
