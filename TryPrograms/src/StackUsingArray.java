
public class StackUsingArray<E> {
	private E[] arr;
	private int cap;
	private int top = -1;
	private int size = 0;
	
	public StackUsingArray(int cap){
		this.cap = cap;
		this.arr = (E[])new Object[cap];
	}
	
	public boolean push(E elem ){
		if(!isFull()){
			return false;
		}
		arr[++top] = elem;
		this.size++;
		return true;
	}
	
	public E pop(){
		if(top == -1){
			return null;
		}
		E elem = arr[top];
		this.arr[top] = null;
		this.top--;
		this.size--;
		return elem;
	}
	
	public boolean isFull(){
		if(size == cap){
			return true;
		}
		return false;
	}

}
