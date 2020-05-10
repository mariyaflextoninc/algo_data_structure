
public class ReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getReducedString("aaabccddd"));
	}
	public static String getReducedString(String input){
		if(input.length() ==0 || input == null){
			// throw new RuntimeException
			return null;
		}
		StringBuffer sb = new StringBuffer();
		sb.append(input);
		for(int i=1;i< sb.length(); i++){
			if(sb.charAt(i) == sb.charAt(i-1)){
				sb.delete(i-1,i+1);
				i =1;
			}
		}
		return (sb.toString().equals("")?"Empty String":sb.toString());
	}
}
