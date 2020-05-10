
public class MiddleElementLinkedList {
	public static void main(String args[]){
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		myList.add(21);
		myList.add(22);
		myList.add(2);
		myList.add(12);
		myList.add(10);
		myList.add(99);
		//while my
	}
	
}

class MyLinkedList<T>{
	Node<T> head;
	Node<T> tail;
	public MyLinkedList(){
		this.head = null;
		this.tail = head;
	}
	public void add(T obj){
		Node<T> newNode = new Node<T>(obj);
		if(tail == null &&  head == null){
			head = newNode;
			tail = head;
		}
		else{
			newNode.next = tail;
			head = newNode;
			return;
		}
		
	}
}
class  Node<T>{
	public Node<T> next;
	public T data;
	public Node(T data){
		this.data = data;
		this.next = null;
	}
}