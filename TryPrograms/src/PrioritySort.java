
public class PrioritySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductCode[] arr = sortArray(new ProductCode[]{
				new ProductCode("ABCD1", 2),
				new ProductCode("ABCD2", 3),
				new ProductCode("ABCD3", 1),
				new ProductCode("ABCD4", 1),
				new ProductCode("ABCD5", 3)
				,new ProductCode("ABCD6", 2),
				new ProductCode("ABCD7", 1)});
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getCode()+", "+
		arr[i].getPriority());
			
		}
	}
	
	public static ProductCode[] sortArray(ProductCode prodCodes[]){
		int plow = -1;
		int phigh = -1;
		int prio = -1;
		for(int i =0; i < prodCodes.length;i++){
			prio = prodCodes[i].getPriority();
			if(prio == 3 && plow == -1){
				plow = i;
			}
			else if(prio == 1 ){
				phigh++;
				ProductCode temp = prodCodes[i];
				prodCodes[i] = prodCodes[phigh];
				prodCodes[phigh] = temp;
				
			}
			if(prodCodes[i].getPriority() == 2 && plow >= 0){
				ProductCode temp =  prodCodes[i];
				prodCodes[i] = prodCodes[plow];
				prodCodes[plow] = temp;
				plow++;
			}
		}
		
		return prodCodes;
	}
	

}


class ProductCode{
	private String code;
	private int priority;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
    public ProductCode(String code , int priority){
    	this.code = code;
    	this.priority = priority;
    }
}