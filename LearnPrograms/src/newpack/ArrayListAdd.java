package newpack;

import java.util.ArrayList;

class ArrayListA {
	ArrayList<Integer> list ;
	
	public ArrayListA(){
		list = new ArrayList<Integer>();
	}
	synchronized public boolean add(Integer i) {
		
		if (list.isEmpty()) {
			if (i == 0) {
			    list.add(i);
			    print();
				return true;
			}
			
		} else if ((list.get(list.size()-1) + 1) == i) {
		    list.add(i);
		    print();
		    return true;
		}
		
		print();
		return false;
		
	}
	public void print(){
		System.out.println(list.toString());
	}
}

class TestR extends Thread{
	public ArrayListA aobj;
	private boolean odd;
	
	public TestR(ArrayListA tobj, boolean odd){
		this.aobj = tobj;
		this.odd = odd;
	}
	
	public void run(){
		
		for(int i = (odd ? 1 : 0); i < 10;){
			if (aobj.add(i)) {
				i += 2;
				notify();
			}else{
				try{
					wait();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			try{ 
				Thread.sleep(500);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

public class ArrayListAdd{
	
	public static void main(String args[]){
		ArrayListA obj = new ArrayListA();
		TestR t1 = new TestR(obj, true);
		TestR t2 = new TestR(obj, false);
		t1.setName("Mariya");
		t2.setName("Unni");
			t1.start();
			t2.start();
		
	
	}
}