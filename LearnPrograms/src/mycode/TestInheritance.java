package mycode;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import newpack.MySuper;

public class TestInheritance {

	public static void main(String[] args) {
		 FileReader fr = null;		
	      try {
	         System.out.println("tesll me if finally works");// prints the characters one by one
	      }catch(Exception e) {
	         e.printStackTrace();
	      }finally {
	         try {
	           System.out.println("here ");
	         }catch(Exception ex) {		
	            ex.printStackTrace();
	         }
	      }
	}

}
