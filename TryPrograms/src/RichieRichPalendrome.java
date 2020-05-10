import java.math.BigInteger;
import java.util.ArrayList;

public class RichieRichPalendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int getPalendrom(int num, int n){
		String str = String.valueOf(num);
		int pSt =0;
		int pEn = str.length() -1;
		ArrayList<Integer> list = new ArrayList<>();
		char max =str.charAt(0);
		while(pSt<pEn){
			if(str.charAt(pSt) != str.charAt(pEn)){
				list.add(pSt);
			}
			if(max < Integer.valueOf(str.charAt(pSt))){
				max = str.charAt(pSt);
			}
			else if(max < Integer.valueOf(str.charAt(pEn))){
				max = str.charAt(pEn);
			}
		}
		int k =n;
		pSt =0;
		int j =0;
	    pEn = str.length() -1;
		StringBuffer sb = new StringBuffer(num);
		while(k>0){
			
			int i = list.get(j);
			if(list.size() < k){//2,5 - 2,3,2,1
				while(sb.charAt(pSt)!= max){
					sb.setCharAt(pSt, max);
					pSt = pEn ;
					if(i == pSt){
						j++;
					}
					k--;
					
				}
				pSt++;
				pEn--;
			}
			else if(k>0 && j<list.size()){
				max = sb.charAt(j) > sb.charAt(sb.length() -j -1)?sb.charAt(j):sb.charAt(sb.length() -j -1);
				int j = 
				sb.setCharAt(i, ch);
			}
			
		}
		
	}

}
