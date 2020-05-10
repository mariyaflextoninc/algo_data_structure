import java.util.Scanner;

class MinMaxSubString {

	public static void main(String[] args) {
		MinMaxSubString obj = new MinMaxSubString();
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = sc.nextInt();
      String[] strs =obj.getSubStrings(input,n);
      if(strs.length >1){
         System.out.println(strs[0]);
         System.out.println(strs[1]);
      }
	}
	public String[] getSubStrings(String input,int n){
        if(input.length() == 0 || input == null || (n > input.length())){
            return new String[]{};
        }
        String NewInput = input.replaceAll("\\s+","");
        int maxP = 0;
        int minP = 0;
        Character maxPrev = input.charAt(0);
        Character minPrev = input.charAt(0);
       
        for(int i =0; i <NewInput.length();i++){
           Character ch = input.charAt(i);
           if( (NewInput.length() - i ) < n){
        	   System.out.println("length ="+(NewInput.length() -i));
            	break;
            }
            if(minPrev.compareTo(ch) > 0){
                minP =i;
                minPrev = ch;
            }
            if(maxPrev.compareTo(ch) < 0){
                maxP  = i; 
                maxPrev = ch;
             }
           
        }
        return new String[]{NewInput.substring(minP,minP+n),NewInput.substring(maxP,maxP+n)};
    }


}
