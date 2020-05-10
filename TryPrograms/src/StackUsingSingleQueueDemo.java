import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueueDemo {

	public static void main(String[] args) {
		StackQueue<Integer> st = new StackQueue();
		st.push(23);
		st.push(-24);
		st.push(56);
		st.push(1);
		System.out.println("stack = "+st.toString());
		System.out.println("top element "+st.getTopElement());
		st.pop();
		st.pop();
		System.out.println("top element "+st.getTopElement());
		st.pop();
		//st.pop();
		//st.pop();
		System.out.println("top element "+st.getTopElement());
		System.out.println("size "+st.getSize());
		System.out.println("Stack = "+st.toString());
		
	}
}
class StackQueue<T>{
	private Queue<T> q;
	private T topElement;
	int size ;
	
	public StackQueue(){
		size = 0;
		q = new LinkedList<T>();
	}
	
	public void push(T data){
		if(data != null){ // O(1);
			q.add(data);
			topElement = q.peek();
		}
	}
	
	public void pop(){
		if(q.isEmpty()){
			System.out.println("q is empty");
			topElement = null;
			return;
		}
		if(q.size() == 1){
			q.remove();
			topElement = null;
			return;
		}
		int i =0;
		int s = q.size();
		while(i<( s -1)){
			T data = q.remove();
			q.add(data);
			i++;
			if(i == 1){
				topElement = q.peek();
			}
		}
		q.remove();	
	}
	
	public T getTopElement(){
		return topElement;
	}
	public int getSize(){
		return q.size();
	}
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer();
		for(T i : q){
			sb.append(i+" , ");
		}
		return sb.toString();
	}
	
}
