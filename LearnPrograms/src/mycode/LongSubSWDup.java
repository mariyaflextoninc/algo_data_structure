package mycode;

import java.util.HashSet;

public class LongSubSWDup{
	  
	  public static void main(String args[]){
	    
	    getLongSubStrWOutDup("Character.toLowerCase(input.charAt(j)");
	  }
	  
	  public static int getLongSubStrWOutDup(String str){
	  	String input = str.replaceAll("\\s+", "");
	  	System.out.println("inpiut is = "+input);
	    int start = 0;
	    int startInd = 0;
	    int endInd = 0;
	    int result =0;
	    int length = input.length();
	    HashSet<Character> set = new HashSet();
	    for(int i =0; i < length; i++){
	      char ch = Character.toLowerCase(input.charAt(i));
	      if(!(set.contains(ch))){
	        set.add(ch);
	      }else{
	        for(int j = start; j <i ; j++){
	           char newCh = Character.toLowerCase(input.charAt(j));
	           set.remove(newCh);
	           if(ch == newCh){
	            start = j+1;
	            break;
	          }
	        }
	        set.add(ch);
	      }
	      if(result < (i - start) +1){
	    	  result = (i - start) +1;
	    	  startInd = start;
	    	  endInd = i;
		   }
	    }
	    System.out.println("result is "+result+" Sub String = "+input.substring(startInd,endInd+1));
	    return result;
	    
	  }  
	}