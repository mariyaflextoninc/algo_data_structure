
public class LinkedListLastNthElement<T> {
	Node<T>  head;
	Node<T>  tail;
	private static class Node<T>{
		T data ; 
		Node<T> next;
		
		public Node(T data ){
			this.data = data;
		}
	}
	
	public void add(T data){
		if(head == null ){
			head = tail = new Node(data);
		}
		else{
			Node node = new Node(data);
			tail.next = node;
			tail = node;
		}
	}
	
	public Node<T> lastNthElement(int n){
		Node<T> first = head;
		Node<T> second = head;
		for(int i = 0 ; i < n ; i++){
			first = first.next;
		}
		while(first != null){
			first = first.next ;
			second = second.next;
		}
		
		return second;
	}
	
	public static void main(String args[]){
		LinkedListLastNthElement<Integer> llist = new LinkedListLastNthElement();
		llist.add(1);
		llist.add(2);
		llist.add(3);
		llist.add(4);
		llist.add(5);
		System.out.println(llist.lastNthElement(3).data);
	}
}
