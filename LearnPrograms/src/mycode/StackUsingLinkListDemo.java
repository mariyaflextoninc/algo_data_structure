package mycode;

public class StackUsingLinkListDemo {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack();
		st.push(12);
		st.push(3);
		st.push(4);
		st.push(7);
		st.display();
		System.out.println("Removed ="+ st.pop());
		System.out.println("Removed ="+ st.pop());
		System.out.println("Removed ="+ st.pop());
		System.out.println("Removed ="+ st.pop());
		System.out.println("Removed ="+ st.pop());

	}

}
class Stack<T>{
	NodeS<T> top;
	
	public Stack(){
		top= null;
	}
	public void push(T data){
		if(data == null){
			return;
		}
		NodeS<T> node = new NodeS(data);
		node.next = top;
		top = node;
		
	}
	
	public T pop(){
		if(top == null){
			System.out.println("Stack is empty");
			return null;
		}
		NodeS<T> temp = top;
		top = top.next;
		return temp.data;
	}
	public void display(){
		NodeS curr = top;
		while(curr != null){
			System.out.println(curr.data+" , ");
			curr = curr.next;
		}
	}
}
class NodeS<T>{
	T data;
	NodeS next;
	
	public NodeS(T data){
		this.data = data;
		this.next = null;
	}
}
