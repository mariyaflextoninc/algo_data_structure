
public class Replace0byNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replace0s(102056,5));
	}
	
	public static int replace0s(int num,int k){
		System.out.println(num +", "+k);
		int result = 0;
		int temp =1;
		int rem =0;
		do{//2030
			rem = num %10;
			result += (rem ==0?5:rem)*temp;
			num = num/10;
			temp = temp*10;
			
		}while(num!=0);
		//System.out.println(result);
		return result;
	}

}
