package mycode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
/**
 * Reverse word in a statement.
 * @author Mariya
 *
 */
public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		String arr = obj.revWordsInAGo("I am a human being");
		System.out.println(arr);
		
	}
	public String revWordsInAGo(String s) {
        if(s == null || s.isEmpty() || s.length() == 1) return s;
        String r = "", w = "";
        char[] c = s.toCharArray();
        int i = 0;
        for(; i < c.length; i++) {
            char ch = c[i];
            if(ch == ' ') {
                r = r + w + ch;//""+I+" "
                w = "";
            } else {
                w = ch + w;
            }
        }
        if(c[i - 1] != ' ') { // In case last character is not space
            r = r + w;
        }
        return r;
    }
		

}
class User{
	String username;
	int count;
	 
	 public User(String username, int count){
	     this.username = username;
	     this.count = count;
	 }
}
