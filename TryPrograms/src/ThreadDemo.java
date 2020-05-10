import java.util.LinkedList;
import java.util.Queue;

public class ThreadDemo {

	public static void main(String[] args) {
		Queue<Integer> temp = new LinkedList(); 
		TestMyArr obj= new TestMyArr();
		TestThreadList t1 = new TestThreadList(temp, 0);
		TestThreadList t2 = new TestThreadList(temp, 1);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		for(; temp.size() != 0;){
			System.out.println("value = " + temp.poll() + " Sz: " + temp.size());
		}
		
		//int arr[] = obj.getArr();
		//for(int i =0; i < arr.length; i++){
		//	System.out.println("value = "+arr[i]);
		//}
	}

}
class TestMyArr{
	private static int[] arr = new int[10];
	
	public void updateArr(int id, int i){
		arr[i] = id;
		//System.out.println("result = " + arr[i-1]);
	}
	
	public int[] getArr(){
		return arr;
	}
	
}
class TestThreadList extends Thread{
	private int id ;
	private static int prev = 0;
	private boolean do_run = true;
	private Queue<Integer> q;
	public TestThreadList(Queue<Integer> q1, int id){
		this.q = q1;
		this.id = id;
	}
	
	public void run(){
		while (true) {
			if (q.size() == 10) break;
			
			if (q.size() % 2 == (id % 2)) {
				pushList();
			}else{
				try{
				wait();
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
			
			
		}
		
		
	}
	private synchronized boolean pushList(){
		if (q.size() == 10) return false;
		
		if (q.size() % 2 == (id % 2)) {
			System.out.println("Excecuting thread " + id);
			
			System.out.println("Thread " + id + " Sz: " + q.size());
			q.offer(id);
				notifyAll();
		}else{
			try{
			wait();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		return true;
}

class TestThread extends Thread {
	
	private TestMyArr obj;
	private Integer id;
	
	public TestThread (TestMyArr obj, Integer id){
		this.obj = obj;
		this.id = id;
	}
	
	public void run(){
		for(int i = id; i < 10; i += 2){
			System.out.println("thread " + id + " @ " + i);
			obj.updateArr(id, i);
		}
	}
}
