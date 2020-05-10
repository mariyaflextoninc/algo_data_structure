
public class PyramidOfStar {

	public static void main(String[] args) {
		printStar(6);
		printStar2(6);
	}
	
	public static void printStar(int num){
		for(int i =0; i < num; i ++){
			for(int k =0; k <num - i -1; k++){
				System.out.print(" ");
			}
			for(int j = 0;j < i+1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void printStar2(int num){
		for(int i =0; i < num; i ++){
			
			for(int j = 0;j < i+1; j++){
				System.out.print("*");
			}
			for(int k =0; k <num - i -1; k++){
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	

}
